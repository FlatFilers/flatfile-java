/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CompositeUniqueConstraintStrategy {
    HASH("hash"),

    CONCAT("concat");

    private final String value;

    CompositeUniqueConstraintStrategy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
