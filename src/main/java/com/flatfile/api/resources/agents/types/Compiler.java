/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Compiler {
    JS("js");

    private final String value;

    Compiler(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}