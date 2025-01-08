/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InputConstraint.Builder.class)
public final class InputConstraint {
    private final InputConstraintType type;

    private final Map<String, Object> additionalProperties;

    private InputConstraint(InputConstraintType type, Map<String, Object> additionalProperties) {
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public InputConstraintType getType() {
        return type;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InputConstraint && equalTo((InputConstraint) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InputConstraint other) {
        return type.equals(other.type);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        _FinalStage type(@NotNull InputConstraintType type);

        Builder from(InputConstraint other);
    }

    public interface _FinalStage {
        InputConstraint build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, _FinalStage {
        private InputConstraintType type;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InputConstraint other) {
            type(other.getType());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public _FinalStage type(@NotNull InputConstraintType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        @java.lang.Override
        public InputConstraint build() {
            return new InputConstraint(type, additionalProperties);
        }
    }
}
