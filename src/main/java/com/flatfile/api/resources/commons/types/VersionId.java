/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class VersionId {
    private final String value;

    private VersionId(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof VersionId && this.value.equals(((VersionId) other).value));
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
    public static VersionId of(String value) {
        return new VersionId(value);
    }

    public static VersionId valueOf(String value) {
        return of(value);
    }
}
