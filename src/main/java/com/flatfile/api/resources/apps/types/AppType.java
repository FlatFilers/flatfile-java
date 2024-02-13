/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.apps.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AppType {
    PORTAL("PORTAL"),

    PROJECTS("PROJECTS"),

    MAPPING("MAPPING"),

    WORKBOOKS("WORKBOOKS"),

    CUSTOM("CUSTOM");

    private final String value;

    AppType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
