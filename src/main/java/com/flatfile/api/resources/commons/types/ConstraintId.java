/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class ConstraintId {
    private final String value;

    private ConstraintId(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof ConstraintId && this.value.equals(((ConstraintId) other).value));
    }

    @java.lang.Override
    public int hashCode() {
        return value.hashCode();
    }

    @java.lang.Override
    public String toString() {
        return value;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ConstraintId of(String value) {
        return new ConstraintId(value);
    }

    public static ConstraintId valueOf(String value) {
        return of(value);
    }
}
