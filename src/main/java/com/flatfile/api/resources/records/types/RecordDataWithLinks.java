/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Map;

public final class RecordDataWithLinks {
    private final Map<String, CellValueWithLinks> value;

    private RecordDataWithLinks(Map<String, CellValueWithLinks> value) {
        this.value = value;
    }

    @JsonValue
    public Map<String, CellValueWithLinks> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof RecordDataWithLinks && this.value.equals(((RecordDataWithLinks) other).value));
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
    public static RecordDataWithLinks of(Map<String, CellValueWithLinks> value) {
        return new RecordDataWithLinks(value);
    }
}
