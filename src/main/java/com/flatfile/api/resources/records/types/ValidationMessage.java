/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.JsonPathString;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ValidationMessage.Builder.class)
public final class ValidationMessage {
    private final Optional<String> field;

    private final Optional<ValidationType> type;

    private final Optional<ValidationSource> source;

    private final Optional<String> message;

    private final Optional<JsonPathString> path;

    private final Map<String, Object> additionalProperties;

    private ValidationMessage(
            Optional<String> field,
            Optional<ValidationType> type,
            Optional<ValidationSource> source,
            Optional<String> message,
            Optional<JsonPathString> path,
            Map<String, Object> additionalProperties) {
        this.field = field;
        this.type = type;
        this.source = source;
        this.message = message;
        this.path = path;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("field")
    public Optional<String> getField() {
        return field;
    }

    @JsonProperty("type")
    public Optional<ValidationType> getType() {
        return type;
    }

    @JsonProperty("source")
    public Optional<ValidationSource> getSource() {
        return source;
    }

    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    /**
     * @return This JSONPath is based on the root of mapped cell object.
     */
    @JsonProperty("path")
    public Optional<JsonPathString> getPath() {
        return path;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ValidationMessage && equalTo((ValidationMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ValidationMessage other) {
        return field.equals(other.field)
                && type.equals(other.type)
                && source.equals(other.source)
                && message.equals(other.message)
                && path.equals(other.path);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.field, this.type, this.source, this.message, this.path);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> field = Optional.empty();

        private Optional<ValidationType> type = Optional.empty();

        private Optional<ValidationSource> source = Optional.empty();

        private Optional<String> message = Optional.empty();

        private Optional<JsonPathString> path = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ValidationMessage other) {
            field(other.getField());
            type(other.getType());
            source(other.getSource());
            message(other.getMessage());
            path(other.getPath());
            return this;
        }

        @JsonSetter(value = "field", nulls = Nulls.SKIP)
        public Builder field(Optional<String> field) {
            this.field = field;
            return this;
        }

        public Builder field(String field) {
            this.field = Optional.ofNullable(field);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<ValidationType> type) {
            this.type = type;
            return this;
        }

        public Builder type(ValidationType type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        @JsonSetter(value = "source", nulls = Nulls.SKIP)
        public Builder source(Optional<ValidationSource> source) {
            this.source = source;
            return this;
        }

        public Builder source(ValidationSource source) {
            this.source = Optional.ofNullable(source);
            return this;
        }

        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public Builder message(Optional<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(String message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        @JsonSetter(value = "path", nulls = Nulls.SKIP)
        public Builder path(Optional<JsonPathString> path) {
            this.path = path;
            return this;
        }

        public Builder path(JsonPathString path) {
            this.path = Optional.ofNullable(path);
            return this;
        }

        public ValidationMessage build() {
            return new ValidationMessage(field, type, source, message, path, additionalProperties);
        }
    }
}
