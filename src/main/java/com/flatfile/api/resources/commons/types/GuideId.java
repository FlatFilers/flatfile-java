/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class GuideId {
    private final String value;

    private GuideId(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof GuideId && this.value.equals(((GuideId) other).value));
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
    public static GuideId of(String value) {
        return new GuideId(value);
    }

    public static GuideId valueOf(String value) {
        return of(value);
    }
}
