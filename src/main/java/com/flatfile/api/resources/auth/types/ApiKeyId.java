/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.auth.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class ApiKeyId {
    private final String value;

    private ApiKeyId(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof ApiKeyId && this.value.equals(((ApiKeyId) other).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ApiKeyId of(String value) {
        return new ApiKeyId(value);
    }

    public static ApiKeyId valueOf(String value) {
        return of(value);
    }
}
