/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class MappingId {
    private final String value;

    private MappingId(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof MappingId && this.value.equals(((MappingId) other).value));
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
    public static MappingId of(String value) {
        return new MappingId(value);
    }

    public static MappingId valueOf(String value) {
        return of(value);
    }
}