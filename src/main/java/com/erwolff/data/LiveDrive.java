package com.erwolff.data;

/**
 * Simple class representing an "ongoing" drive
 */
public class LiveDrive {

    private long timestamp;

    public LiveDrive() {
    }

    public LiveDrive(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
