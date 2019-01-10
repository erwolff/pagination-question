package com.erwolff.data;

import java.util.Optional;

/**
 * Helper class to convert between an ArchivedDrive and a LiveDrive
 */
public class Translator {

    public static Optional<LiveDrive> translate(ArchivedDrive archivedDrive) {
        if (archivedDrive == null) {
            return Optional.empty();
        }

        return Optional.of(new LiveDrive(archivedDrive.getTimestamp()));
    }

    public static Optional<ArchivedDrive> translate(LiveDrive liveDrive) {
        if (liveDrive == null) {
            return Optional.empty();
        }

        return Optional.of(new ArchivedDrive(liveDrive.getTimestamp()));
    }
}
