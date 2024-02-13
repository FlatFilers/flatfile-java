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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CategoryMapping.Builder.class)
public final class CategoryMapping {
    private final Optional<EnumValue> sourceValue;

    private final Optional<EnumValue> destinationValue;

    private final Map<String, Object> additionalProperties;

    private CategoryMapping(
            Optional<EnumValue> sourceValue,
            Optional<EnumValue> destinationValue,
            Map<String, Object> additionalProperties) {
        this.sourceValue = sourceValue;
        this.destinationValue = destinationValue;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The source value to map from
     */
    @JsonProperty("sourceValue")
    public Optional<EnumValue> getSourceValue() {
        return sourceValue;
    }

    /**
     * @return The destination value to map to
     */
    @JsonProperty("destinationValue")
    public Optional<EnumValue> getDestinationValue() {
        return destinationValue;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CategoryMapping && equalTo((CategoryMapping) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CategoryMapping other) {
        return sourceValue.equals(other.sourceValue) && destinationValue.equals(other.destinationValue);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sourceValue, this.destinationValue);
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
        private Optional<EnumValue> sourceValue = Optional.empty();

        private Optional<EnumValue> destinationValue = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CategoryMapping other) {
            sourceValue(other.getSourceValue());
            destinationValue(other.getDestinationValue());
            return this;
        }

        @JsonSetter(value = "sourceValue", nulls = Nulls.SKIP)
        public Builder sourceValue(Optional<EnumValue> sourceValue) {
            this.sourceValue = sourceValue;
            return this;
        }

        public Builder sourceValue(EnumValue sourceValue) {
            this.sourceValue = Optional.of(sourceValue);
            return this;
        }

        @JsonSetter(value = "destinationValue", nulls = Nulls.SKIP)
        public Builder destinationValue(Optional<EnumValue> destinationValue) {
            this.destinationValue = destinationValue;
            return this;
        }

        public Builder destinationValue(EnumValue destinationValue) {
            this.destinationValue = Optional.of(destinationValue);
            return this;
        }

        public CategoryMapping build() {
            return new CategoryMapping(sourceValue, destinationValue, additionalProperties);
        }
    }
}
