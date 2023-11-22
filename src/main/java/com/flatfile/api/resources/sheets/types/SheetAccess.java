/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SheetAccess {
    ALL("*"),

    ADD("add"),

    EDIT("edit"),

    DELETE("delete"),

    IMPORT("import");

    private final String value;

    SheetAccess(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}