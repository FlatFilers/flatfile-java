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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnumPropertyOption.Builder.class)
public final class EnumPropertyOption {
    private final Optional<String> label;

    private final Optional<String> description;

    private final Optional<String> color;

    private final Optional<String> icon;

    private final Optional<Map<String, Object>> meta;

    private final Object value;

    private final Optional<List<String>> alternativeNames;

    private final Map<String, Object> additionalProperties;

    private EnumPropertyOption(
            Optional<String> label,
            Optional<String> description,
            Optional<String> color,
            Optional<String> icon,
            Optional<Map<String, Object>> meta,
            Object value,
            Optional<List<String>> alternativeNames,
            Map<String, Object> additionalProperties) {
        this.label = label;
        this.description = description;
        this.color = color;
        this.icon = icon;
        this.meta = meta;
        this.value = value;
        this.alternativeNames = alternativeNames;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A visual label for this option, defaults to value if not provided
     */
    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    /**
     * @return A short description for this option
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return An optional color to assign this option
     */
    @JsonProperty("color")
    public Optional<String> getColor() {
        return color;
    }

    /**
     * @return A reference pointer to a previously registered icon
     */
    @JsonProperty("icon")
    public Optional<String> getIcon() {
        return icon;
    }

    /**
     * @return An arbitrary JSON object to be associated with this option and made available to hooks
     */
    @JsonProperty("meta")
    public Optional<Map<String, Object>> getMeta() {
        return meta;
    }

    /**
     * @return The value or ID of this option. This value will be sent in egress.  The type is a string | integer | boolean.
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * @return Alternative names to match this enum option to
     */
    @JsonProperty("alternativeNames")
    public Optional<List<String>> getAlternativeNames() {
        return alternativeNames;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnumPropertyOption && equalTo((EnumPropertyOption) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnumPropertyOption other) {
        return label.equals(other.label)
                && description.equals(other.description)
                && color.equals(other.color)
                && icon.equals(other.icon)
                && meta.equals(other.meta)
                && value.equals(other.value)
                && alternativeNames.equals(other.alternativeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.label, this.description, this.color, this.icon, this.meta, this.value, this.alternativeNames);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValueStage builder() {
        return new Builder();
    }

    public interface ValueStage {
        _FinalStage value(Object value);

        Builder from(EnumPropertyOption other);
    }

    public interface _FinalStage {
        EnumPropertyOption build();

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage color(Optional<String> color);

        _FinalStage color(String color);

        _FinalStage icon(Optional<String> icon);

        _FinalStage icon(String icon);

        _FinalStage meta(Optional<Map<String, Object>> meta);

        _FinalStage meta(Map<String, Object> meta);

        _FinalStage alternativeNames(Optional<List<String>> alternativeNames);

        _FinalStage alternativeNames(List<String> alternativeNames);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValueStage, _FinalStage {
        private Object value;

        private Optional<List<String>> alternativeNames = Optional.empty();

        private Optional<Map<String, Object>> meta = Optional.empty();

        private Optional<String> icon = Optional.empty();

        private Optional<String> color = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> label = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EnumPropertyOption other) {
            label(other.getLabel());
            description(other.getDescription());
            color(other.getColor());
            icon(other.getIcon());
            meta(other.getMeta());
            value(other.getValue());
            alternativeNames(other.getAlternativeNames());
            return this;
        }

        /**
         * <p>The value or ID of this option. This value will be sent in egress.  The type is a string | integer | boolean.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("value")
        public _FinalStage value(Object value) {
            this.value = value;
            return this;
        }

        /**
         * <p>Alternative names to match this enum option to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage alternativeNames(List<String> alternativeNames) {
            this.alternativeNames = Optional.of(alternativeNames);
            return this;
        }

        @Override
        @JsonSetter(value = "alternativeNames", nulls = Nulls.SKIP)
        public _FinalStage alternativeNames(Optional<List<String>> alternativeNames) {
            this.alternativeNames = alternativeNames;
            return this;
        }

        /**
         * <p>An arbitrary JSON object to be associated with this option and made available to hooks</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage meta(Map<String, Object> meta) {
            this.meta = Optional.of(meta);
            return this;
        }

        @Override
        @JsonSetter(value = "meta", nulls = Nulls.SKIP)
        public _FinalStage meta(Optional<Map<String, Object>> meta) {
            this.meta = meta;
            return this;
        }

        /**
         * <p>A reference pointer to a previously registered icon</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage icon(String icon) {
            this.icon = Optional.of(icon);
            return this;
        }

        @Override
        @JsonSetter(value = "icon", nulls = Nulls.SKIP)
        public _FinalStage icon(Optional<String> icon) {
            this.icon = icon;
            return this;
        }

        /**
         * <p>An optional color to assign this option</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage color(String color) {
            this.color = Optional.of(color);
            return this;
        }

        @Override
        @JsonSetter(value = "color", nulls = Nulls.SKIP)
        public _FinalStage color(Optional<String> color) {
            this.color = color;
            return this;
        }

        /**
         * <p>A short description for this option</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * <p>A visual label for this option, defaults to value if not provided</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage label(String label) {
            this.label = Optional.of(label);
            return this;
        }

        @Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        @Override
        public EnumPropertyOption build() {
            return new EnumPropertyOption(
                    label, description, color, icon, meta, value, alternativeNames, additionalProperties);
        }
    }
}
