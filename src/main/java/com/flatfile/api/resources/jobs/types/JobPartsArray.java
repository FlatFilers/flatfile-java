/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import java.util.Map;

public final class JobPartsArray {
    private final List<Map<String, Object>> value;

    private JobPartsArray(List<Map<String, Object>> value) {
        this.value = value;
    }

    @JsonValue
    public List<Map<String, Object>> get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof JobPartsArray && this.value.equals(((JobPartsArray) other).value));
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
    public static JobPartsArray of(List<Map<String, Object>> value) {
        return new JobPartsArray(value);
    }
}