/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.environments.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GuestAuthenticationEnum {
    SHARED_LINK("shared_link"),

    MAGIC_LINK("magic_link");

    private final String value;

    GuestAuthenticationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
