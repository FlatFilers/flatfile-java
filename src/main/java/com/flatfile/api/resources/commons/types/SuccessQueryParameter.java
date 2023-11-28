/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class SuccessQueryParameter {
    private final boolean value;

    private SuccessQueryParameter(boolean value) {
        this.value = value;
    }

    @JsonValue
    public boolean get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof SuccessQueryParameter && this.value == ((SuccessQueryParameter) other).value);
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static SuccessQueryParameter of(boolean value) {
        return new SuccessQueryParameter(value);
    }

    public static SuccessQueryParameter valueOf(String value) {
        return of(Boolean.parseBoolean(value));
    }
}