/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.property.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EnumPropertySortBy {
    LABEL("label"),

    VALUE("value"),

    ORDINAL("ordinal");

    private final String value;

    EnumPropertySortBy(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
