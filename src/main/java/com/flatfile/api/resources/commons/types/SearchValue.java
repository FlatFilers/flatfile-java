/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class SearchValue {
    private final String value;

    private SearchValue(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SearchValue && this.value.equals(((SearchValue) other).value));
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
    public static SearchValue of(String value) {
        return new SearchValue(value);
    }

    public static SearchValue valueOf(String value) {
        return of(value);
    }
}