/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.snapshots.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChangeType {
    CREATED_SINCE("createdSince"),

    UPDATED_SINCE("updatedSince"),

    DELETED_SINCE("deletedSince");

    private final String value;

    ChangeType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
