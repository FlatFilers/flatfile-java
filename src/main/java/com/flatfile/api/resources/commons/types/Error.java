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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Error.Builder.class)
public final class Error {
    private final Optional<String> key;

    private final String message;

    private final Map<String, Object> additionalProperties;

    private Error(Optional<String> key, String message, Map<String, Object> additionalProperties) {
        this.key = key;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    public Optional<String> getKey() {
        return key;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Error && equalTo((Error) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Error other) {
        return key.equals(other.key) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.key, this.message);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MessageStage builder() {
        return new Builder();
    }

    public interface MessageStage {
        _FinalStage message(String message);

        Builder from(Error other);
    }

    public interface _FinalStage {
        Error build();

        _FinalStage key(Optional<String> key);

        _FinalStage key(String key);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageStage, _FinalStage {
        private String message;

        private Optional<String> key = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Error other) {
            key(other.getKey());
            message(other.getMessage());
            return this;
        }

        @java.lang.Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public _FinalStage key(String key) {
            this.key = Optional.of(key);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "key", nulls = Nulls.SKIP)
        public _FinalStage key(Optional<String> key) {
            this.key = key;
            return this;
        }

        @java.lang.Override
        public Error build() {
            return new Error(key, message, additionalProperties);
        }
    }
}
