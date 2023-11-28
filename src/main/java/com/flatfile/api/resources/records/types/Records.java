/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public final class Records {
    private final List<Record> value;

    private Records(List<Record> value) {
        this.value = value;
    }

    @JsonValue
    public List<Record> get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Records && this.value.equals(((Records) other).value));
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
    public static Records of(List<Record> value) {
        return new Records(value);
    }
}
