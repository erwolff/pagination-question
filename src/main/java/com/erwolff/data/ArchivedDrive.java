package com.erwolff.data;

/**
 * Simple class representing a drive that has ended and been archived
 */
public class ArchivedDrive {

    private long timestamp;

    public ArchivedDrive() {
    }

    public ArchivedDrive(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
