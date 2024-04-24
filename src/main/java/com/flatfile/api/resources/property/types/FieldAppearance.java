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
@JsonDeserialize(builder = FieldAppearance.Builder.class)
public final class FieldAppearance {
    private final Optional<FieldSize> size;

    private final Map<String, Object> additionalProperties;

    private FieldAppearance(Optional<FieldSize> size, Map<String, Object> additionalProperties) {
        this.size = size;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("size")
    public Optional<FieldSize> getSize() {
        return size;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldAppearance && equalTo((FieldAppearance) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldAppearance other) {
        return size.equals(other.size);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.size);
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
        private Optional<FieldSize> size = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FieldAppearance other) {
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<FieldSize> size) {
            this.size = size;
            return this;
        }

        public Builder size(FieldSize size) {
            this.size = Optional.of(size);
            return this;
        }

        public FieldAppearance build() {
            return new FieldAppearance(size, additionalProperties);
        }
    }
}