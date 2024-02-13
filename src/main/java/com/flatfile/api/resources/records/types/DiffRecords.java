/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public final class DiffRecords {
    private final List<DiffRecord> value;

    private DiffRecords(List<DiffRecord> value) {
        this.value = value;
    }

    @JsonValue
    public List<DiffRecord> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof DiffRecords && this.value.equals(((DiffRecords) other).value));
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
    public static DiffRecords of(List<DiffRecord> value) {
        return new DiffRecords(value);
    }
}
