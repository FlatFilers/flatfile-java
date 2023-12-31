/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnumDetails.Builder.class)
public final class EnumDetails {
    private final Optional<List<CategoryMapping>> mapping;

    private final Optional<List<EnumValue>> unusedSourceValues;

    private final Optional<List<EnumValue>> unusedDestinationValues;

    private final Map<String, Object> additionalProperties;

    private EnumDetails(
            Optional<List<CategoryMapping>> mapping,
            Optional<List<EnumValue>> unusedSourceValues,
            Optional<List<EnumValue>> unusedDestinationValues,
            Map<String, Object> additionalProperties) {
        this.mapping = mapping;
        this.unusedSourceValues = unusedSourceValues;
        this.unusedDestinationValues = unusedDestinationValues;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The mapping of source values to destination values
     */
    @JsonProperty("mapping")
    public Optional<List<CategoryMapping>> getMapping() {
        return mapping;
    }

    /**
     * @return A list of source values that are not mapped from
     */
    @JsonProperty("unusedSourceValues")
    public Optional<List<EnumValue>> getUnusedSourceValues() {
        return unusedSourceValues;
    }

    /**
     * @return A list of destination values that are not mapped to
     */
    @JsonProperty("unusedDestinationValues")
    public Optional<List<EnumValue>> getUnusedDestinationValues() {
        return unusedDestinationValues;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnumDetails && equalTo((EnumDetails) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnumDetails other) {
        return mapping.equals(other.mapping)
                && unusedSourceValues.equals(other.unusedSourceValues)
                && unusedDestinationValues.equals(other.unusedDestinationValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.mapping, this.unusedSourceValues, this.unusedDestinationValues);
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
        private Optional<List<CategoryMapping>> mapping = Optional.empty();

        private Optional<List<EnumValue>> unusedSourceValues = Optional.empty();

        private Optional<List<EnumValue>> unusedDestinationValues = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EnumDetails other) {
            mapping(other.getMapping());
            unusedSourceValues(other.getUnusedSourceValues());
            unusedDestinationValues(other.getUnusedDestinationValues());
            return this;
        }

        @JsonSetter(value = "mapping", nulls = Nulls.SKIP)
        public Builder mapping(Optional<List<CategoryMapping>> mapping) {
            this.mapping = mapping;
            return this;
        }

        public Builder mapping(List<CategoryMapping> mapping) {
            this.mapping = Optional.of(mapping);
            return this;
        }

        @JsonSetter(value = "unusedSourceValues", nulls = Nulls.SKIP)
        public Builder unusedSourceValues(Optional<List<EnumValue>> unusedSourceValues) {
            this.unusedSourceValues = unusedSourceValues;
            return this;
        }

        public Builder unusedSourceValues(List<EnumValue> unusedSourceValues) {
            this.unusedSourceValues = Optional.of(unusedSourceValues);
            return this;
        }

        @JsonSetter(value = "unusedDestinationValues", nulls = Nulls.SKIP)
        public Builder unusedDestinationValues(Optional<List<EnumValue>> unusedDestinationValues) {
            this.unusedDestinationValues = unusedDestinationValues;
            return this;
        }

        public Builder unusedDestinationValues(List<EnumValue> unusedDestinationValues) {
            this.unusedDestinationValues = Optional.of(unusedDestinationValues);
            return this;
        }

        public EnumDetails build() {
            return new EnumDetails(mapping, unusedSourceValues, unusedDestinationValues, additionalProperties);
        }
    }
}
