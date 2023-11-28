/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Map;

public final class DiffData {
    private final Map<String, DiffValue> value;

    private DiffData(Map<String, DiffValue> value) {
        this.value = value;
    }

    @JsonValue
    public Map<String, DiffValue> get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof DiffData && this.value.equals(((DiffData) other).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static DiffData of(Map<String, DiffValue> value) {
        return new DiffData(value);
    }
}