/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.snapshots.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Map;

public final class SchemaDiffData {
    private final Map<String, SchemaDiffEnum> value;

    private SchemaDiffData(Map<String, SchemaDiffEnum> value) {
        this.value = value;
    }

    @JsonValue
    public Map<String, SchemaDiffEnum> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SchemaDiffData && this.value.equals(((SchemaDiffData) other).value));
    }

    @java.lang.Override
    public int hashCode() {
        return value.hashCode();
    }

    @java.lang.Override
    public String toString() {
        return value.toString();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static SchemaDiffData of(Map<String, SchemaDiffEnum> value) {
        return new SchemaDiffData(value);
    }
}
