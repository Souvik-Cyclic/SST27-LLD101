package com.example.report;

import java.util.Map;
import java.util.Objects;
import java.nio.file.Path;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade(JsonWriter jsonWriter, Zipper zipper, AuditLog auditLog) {
        this.jsonWriter = Objects.requireNonNull(jsonWriter);
        this.zipper = Objects.requireNonNull(zipper);
        this.auditLog = Objects.requireNonNull(auditLog);
    }

    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data);
        Objects.requireNonNull(outDir);
        Objects.requireNonNull(baseName);
        Path json = jsonWriter.write(data, outDir, baseName);
        Path zip = zipper.zip(json, outDir.resolve(baseName + ".zip"));
        auditLog.log("exported " + zip);
        return zip;
    }
}
