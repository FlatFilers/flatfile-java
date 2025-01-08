/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.actions.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.flatfile.api.resources.commons.types.Action;
import java.util.List;

public final class Actions {
    private final List<Action> value;

    private Actions(List<Action> value) {
        this.value = value;
    }

    @JsonValue
    public List<Action> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Actions && this.value.equals(((Actions) other).value));
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
    public static Actions of(List<Action> value) {
        return new Actions(value);
    }
}