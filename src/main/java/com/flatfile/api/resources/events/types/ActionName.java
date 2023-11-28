/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class ActionName {
    private final String value;

    private ActionName(String value) {
        this.value = value;
    }

    @JsonValue
    public String get() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof ActionName && this.value.equals(((ActionName) other).value));
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
    public static ActionName of(String value) {
        return new ActionName(value);
    }

    public static ActionName valueOf(String value) {
        return of(value);
    }
}