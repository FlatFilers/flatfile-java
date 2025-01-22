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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EnumPropertyConfig.Builder.class)
public final class EnumPropertyConfig {
    private final Optional<Boolean> allowCustom;

    private final List<EnumPropertyOption> options;

    private final Optional<EnumPropertySortBy> sortBy;

    private final Map<String, Object> additionalProperties;

    private EnumPropertyConfig(
            Optional<Boolean> allowCustom,
            List<EnumPropertyOption> options,
            Optional<EnumPropertySortBy> sortBy,
            Map<String, Object> additionalProperties) {
        this.allowCustom = allowCustom;
        this.options = options;
        this.sortBy = sortBy;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Permit the user to create new options for this specific field.
     */
    @JsonProperty("allowCustom")
    public Optional<Boolean> getAllowCustom() {
        return allowCustom;
    }

    @JsonProperty("options")
    public List<EnumPropertyOption> getOptions() {
        return options;
    }

    /**
     * @return Sort the options by the value of this property. Defaults to <code>label</code>.
     */
    @JsonProperty("sortBy")
    public Optional<EnumPropertySortBy> getSortBy() {
        return sortBy;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnumPropertyConfig && equalTo((EnumPropertyConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnumPropertyConfig other) {
        return allowCustom.equals(other.allowCustom) && options.equals(other.options) && sortBy.equals(other.sortBy);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.allowCustom, this.options, this.sortBy);
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
        private Optional<Boolean> allowCustom = Optional.empty();

        private List<EnumPropertyOption> options = new ArrayList<>();

        private Optional<EnumPropertySortBy> sortBy = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EnumPropertyConfig other) {
            allowCustom(other.getAllowCustom());
            options(other.getOptions());
            sortBy(other.getSortBy());
            return this;
        }

        @JsonSetter(value = "allowCustom", nulls = Nulls.SKIP)
        public Builder allowCustom(Optional<Boolean> allowCustom) {
            this.allowCustom = allowCustom;
            return this;
        }

        public Builder allowCustom(Boolean allowCustom) {
            this.allowCustom = Optional.ofNullable(allowCustom);
            return this;
        }

        @JsonSetter(value = "options", nulls = Nulls.SKIP)
        public Builder options(List<EnumPropertyOption> options) {
            this.options.clear();
            this.options.addAll(options);
            return this;
        }

        public Builder addOptions(EnumPropertyOption options) {
            this.options.add(options);
            return this;
        }

        public Builder addAllOptions(List<EnumPropertyOption> options) {
            this.options.addAll(options);
            return this;
        }

        @JsonSetter(value = "sortBy", nulls = Nulls.SKIP)
        public Builder sortBy(Optional<EnumPropertySortBy> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public Builder sortBy(EnumPropertySortBy sortBy) {
            this.sortBy = Optional.ofNullable(sortBy);
            return this;
        }

        public EnumPropertyConfig build() {
            return new EnumPropertyConfig(allowCustom, options, sortBy, additionalProperties);
        }
    }
}
