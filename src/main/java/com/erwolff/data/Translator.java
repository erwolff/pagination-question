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

        // create a new LiveDrive with type ARCHIVED - to represent that this was translated (for verification purposes)
        return Optional.of(new LiveDrive(DriveType.ARCHIVED, archivedDrive.getTimestamp()));
    }
}
