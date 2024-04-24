/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.property.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FieldSize {
    XS("xs"),

    S("s"),

    M("m"),

    L("l"),

    XL("xl");

    private final String value;

    FieldSize(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
