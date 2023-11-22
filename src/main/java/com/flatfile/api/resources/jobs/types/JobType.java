/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JobType {
    FILE("file"),

    WORKBOOK("workbook"),

    SHEET("sheet");

    private final String value;

    JobType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
