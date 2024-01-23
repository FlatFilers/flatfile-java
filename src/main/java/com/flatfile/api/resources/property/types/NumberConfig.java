/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.property.types;

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
@JsonDeserialize(builder = NumberConfig.Builder.class)
public final class NumberConfig {
    private final Optional<Integer> decimalPlaces;

    private final Map<String, Object> additionalProperties;

    private NumberConfig(Optional<Integer> decimalPlaces, Map<String, Object> additionalProperties) {
        this.decimalPlaces = decimalPlaces;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of decimal places to round data to
     */
    @JsonProperty("decimalPlaces")
    public Optional<Integer> getDecimalPlaces() {
        return decimalPlaces;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NumberConfig && equalTo((NumberConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NumberConfig other) {
        return decimalPlaces.equals(other.decimalPlaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.decimalPlaces);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Integer> decimalPlaces = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(NumberConfig other) {
            decimalPlaces(other.getDecimalPlaces());
            return this;
        }

        @JsonSetter(value = "decimalPlaces", nulls = Nulls.SKIP)
        public Builder decimalPlaces(Optional<Integer> decimalPlaces) {
            this.decimalPlaces = decimalPlaces;
            return this;
        }

        public Builder decimalPlaces(Integer decimalPlaces) {
            this.decimalPlaces = Optional.of(decimalPlaces);
            return this;
        }

        public NumberConfig build() {
            return new NumberConfig(decimalPlaces, additionalProperties);
        }
    }
}
