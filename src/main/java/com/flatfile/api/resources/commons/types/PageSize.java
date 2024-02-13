/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class PageSize {
    private final int value;

    private PageSize(int value) {
        this.value = value;
    }

    @JsonValue
    public int get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof PageSize && this.value == ((PageSize) other).value);
    }

    @java.lang.Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @java.lang.Override
    public String toString() {
        return Integer.toString(value);
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static PageSize of(int value) {
        return new PageSize(value);
    }

    public static PageSize valueOf(String value) {
        return of(Integer.parseInt(value));
    }
}
