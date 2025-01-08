/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.assistant.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PromptTypeEnum {
    AI_ASSIST("AI_ASSIST"),

    CONSTRAINT_GENERATION("CONSTRAINT_GENERATION");

    private final String value;

    PromptTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}