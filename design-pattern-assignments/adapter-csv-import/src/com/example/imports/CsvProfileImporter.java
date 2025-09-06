package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader naiveCsvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService) {
        this.naiveCsvReader = Objects.requireNonNull(naiveCsvReader);
        this.profileService = Objects.requireNonNull(profileService);
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = naiveCsvReader.read(csvFile);
        int count = 0;
        for (int i=1; i<rows.size(); i++) {
            String[] row = rows.get(i);
            int rowNumber = i + 1;
            if (row.length < 3) {
                System.err.println("Skipping invalid row: " + rowNumber + " (not enough columns)");
                continue;
            }
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();

            if (isValidRow(rowNumber, id, email)) {
                profileService.createProfile(id, email, displayName);
                count++;
            }
        }
        return count;
    }

    private boolean isValidRow(int rowNumber, String id, String email) {
        if (id.isEmpty()) {
            System.err.println("Invalid row " + rowNumber + ": ID is missing");
            return false;
        }
        if (email.isEmpty()) {
            System.err.println("Invalid row " + rowNumber + ": Email is missing");
            return false;
        }
        if (!isEmailValid(email)) {
            System.err.println("Invalid row " + rowNumber + ": Email is invalid");
            return false;
        }
        return true;
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }
}
