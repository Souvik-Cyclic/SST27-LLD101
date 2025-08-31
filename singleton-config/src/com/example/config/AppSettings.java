package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public final class AppSettings implements Serializable {
    private static final AppSettings instance = new AppSettings();
    private final Properties props = new Properties();

    // public AppSettings() { } // should not be public for true singleton
    private AppSettings() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static AppSettings getInstance() {
        // return new AppSettings(); // returns a fresh instance (bug)
        return instance;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.clear();
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    public Object readResolve() {
        return instance;
    }
}
