/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.workbooks.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkbookTreatments {
    EXTRACTED_FROM_SOURCE("EXTRACTED_FROM_SOURCE");

    private final String value;

    WorkbookTreatments(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
