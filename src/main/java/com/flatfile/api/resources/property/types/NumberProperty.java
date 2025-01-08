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
import com.flatfile.api.resources.commons.types.Action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = NumberProperty.Builder.class)
public final class NumberProperty implements IBaseProperty, IArrayableProperty {
    private final String key;

    private final Optional<String> label;

    private final Optional<String> description;

    private final Optional<List<Constraint>> constraints;

    private final Optional<Boolean> readonly;

    private final Optional<FieldAppearance> appearance;

    private final Optional<List<Action>> actions;

    private final Optional<Object> metadata;

    private final Optional<List<String>> treatments;

    private final Optional<List<String>> alternativeNames;

    private final Optional<Boolean> isArray;

    private final Optional<NumberConfig> config;

    private final Map<String, Object> additionalProperties;

    private NumberProperty(
            String key,
            Optional<String> label,
            Optional<String> description,
            Optional<List<Constraint>> constraints,
            Optional<Boolean> readonly,
            Optional<FieldAppearance> appearance,
            Optional<List<Action>> actions,
            Optional<Object> metadata,
            Optional<List<String>> treatments,
            Optional<List<String>> alternativeNames,
            Optional<Boolean> isArray,
            Optional<NumberConfig> config,
            Map<String, Object> additionalProperties) {
        this.key = key;
        this.label = label;
        this.description = description;
        this.constraints = constraints;
        this.readonly = readonly;
        this.appearance = appearance;
        this.actions = actions;
        this.metadata = metadata;
        this.treatments = treatments;
        this.alternativeNames = alternativeNames;
        this.isArray = isArray;
        this.config = config;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("key")
    @java.lang.Override
    public String getKey() {
        return key;
    }

    /**
     * @return User friendly field name
     */
    @JsonProperty("label")
    @java.lang.Override
    public Optional<String> getLabel() {
        return label;
    }

    /**
     * @return A short description of the field. Markdown syntax is supported.
     */
    @JsonProperty("description")
    @java.lang.Override
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return A list of constraints that should be applied to this field. This is limited to a maximum of 10 constraints and all external and stored constraints must have unique validator values.
     */
    @JsonProperty("constraints")
    @java.lang.Override
    public Optional<List<Constraint>> getConstraints() {
        return constraints;
    }

    @JsonProperty("readonly")
    @java.lang.Override
    public Optional<Boolean> getReadonly() {
        return readonly;
    }

    @JsonProperty("appearance")
    @java.lang.Override
    public Optional<FieldAppearance> getAppearance() {
        return appearance;
    }

    /**
     * @return An array of actions that end users can perform on this Column.
     */
    @JsonProperty("actions")
    @java.lang.Override
    public Optional<List<Action>> getActions() {
        return actions;
    }

    /**
     * @return Useful for any contextual metadata regarding the schema. Store any valid json here.
     */
    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Object> getMetadata() {
        return metadata;
    }

    /**
     * @return A unique presentation for a field in the UI.
     */
    @JsonProperty("treatments")
    @java.lang.Override
    public Optional<List<String>> getTreatments() {
        return treatments;
    }

    @JsonProperty("alternativeNames")
    @java.lang.Override
    public Optional<List<String>> getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * @return Will allow multiple values and store as an array
     */
    @JsonProperty("isArray")
    @java.lang.Override
    public Optional<Boolean> getIsArray() {
        return isArray;
    }

    @JsonProperty("config")
    public Optional<NumberConfig> getConfig() {
        return config;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NumberProperty && equalTo((NumberProperty) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NumberProperty other) {
        return key.equals(other.key)
                && label.equals(other.label)
                && description.equals(other.description)
                && constraints.equals(other.constraints)
                && readonly.equals(other.readonly)
                && appearance.equals(other.appearance)
                && actions.equals(other.actions)
                && metadata.equals(other.metadata)
                && treatments.equals(other.treatments)
                && alternativeNames.equals(other.alternativeNames)
                && isArray.equals(other.isArray)
                && config.equals(other.config);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.key,
                this.label,
                this.description,
                this.constraints,
                this.readonly,
                this.appearance,
                this.actions,
                this.metadata,
                this.treatments,
                this.alternativeNames,
                this.isArray,
                this.config);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        _FinalStage key(@NotNull String key);

        Builder from(NumberProperty other);
    }

    public interface _FinalStage {
        NumberProperty build();

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage constraints(Optional<List<Constraint>> constraints);

        _FinalStage constraints(List<Constraint> constraints);

        _FinalStage readonly(Optional<Boolean> readonly);

        _FinalStage readonly(Boolean readonly);

        _FinalStage appearance(Optional<FieldAppearance> appearance);

        _FinalStage appearance(FieldAppearance appearance);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage treatments(Optional<List<String>> treatments);

        _FinalStage treatments(List<String> treatments);

        _FinalStage alternativeNames(Optional<List<String>> alternativeNames);

        _FinalStage alternativeNames(List<String> alternativeNames);

        _FinalStage isArray(Optional<Boolean> isArray);

        _FinalStage isArray(Boolean isArray);

        _FinalStage config(Optional<NumberConfig> config);

        _FinalStage config(NumberConfig config);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, _FinalStage {
        private String key;

        private Optional<NumberConfig> config = Optional.empty();

        private Optional<Boolean> isArray = Optional.empty();

        private Optional<List<String>> alternativeNames = Optional.empty();

        private Optional<List<String>> treatments = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<FieldAppearance> appearance = Optional.empty();

        private Optional<Boolean> readonly = Optional.empty();

        private Optional<List<Constraint>> constraints = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> label = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NumberProperty other) {
            key(other.getKey());
            label(other.getLabel());
            description(other.getDescription());
            constraints(other.getConstraints());
            readonly(other.getReadonly());
            appearance(other.getAppearance());
            actions(other.getActions());
            metadata(other.getMetadata());
            treatments(other.getTreatments());
            alternativeNames(other.getAlternativeNames());
            isArray(other.getIsArray());
            config(other.getConfig());
            return this;
        }

        @java.lang.Override
        @JsonSetter("key")
        public _FinalStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage config(NumberConfig config) {
            this.config = Optional.ofNullable(config);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public _FinalStage config(Optional<NumberConfig> config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Will allow multiple values and store as an array</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage isArray(Boolean isArray) {
            this.isArray = Optional.ofNullable(isArray);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "isArray", nulls = Nulls.SKIP)
        public _FinalStage isArray(Optional<Boolean> isArray) {
            this.isArray = isArray;
            return this;
        }

        @java.lang.Override
        public _FinalStage alternativeNames(List<String> alternativeNames) {
            this.alternativeNames = Optional.ofNullable(alternativeNames);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "alternativeNames", nulls = Nulls.SKIP)
        public _FinalStage alternativeNames(Optional<List<String>> alternativeNames) {
            this.alternativeNames = alternativeNames;
            return this;
        }

        /**
         * <p>A unique presentation for a field in the UI.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage treatments(List<String> treatments) {
            this.treatments = Optional.ofNullable(treatments);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "treatments", nulls = Nulls.SKIP)
        public _FinalStage treatments(Optional<List<String>> treatments) {
            this.treatments = treatments;
            return this;
        }

        /**
         * <p>Useful for any contextual metadata regarding the schema. Store any valid json here.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage metadata(Object metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>An array of actions that end users can perform on this Column.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage actions(List<Action> actions) {
            this.actions = Optional.ofNullable(actions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public _FinalStage actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        @java.lang.Override
        public _FinalStage appearance(FieldAppearance appearance) {
            this.appearance = Optional.ofNullable(appearance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "appearance", nulls = Nulls.SKIP)
        public _FinalStage appearance(Optional<FieldAppearance> appearance) {
            this.appearance = appearance;
            return this;
        }

        @java.lang.Override
        public _FinalStage readonly(Boolean readonly) {
            this.readonly = Optional.ofNullable(readonly);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "readonly", nulls = Nulls.SKIP)
        public _FinalStage readonly(Optional<Boolean> readonly) {
            this.readonly = readonly;
            return this;
        }

        /**
         * <p>A list of constraints that should be applied to this field. This is limited to a maximum of 10 constraints and all external and stored constraints must have unique validator values.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage constraints(List<Constraint> constraints) {
            this.constraints = Optional.ofNullable(constraints);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "constraints", nulls = Nulls.SKIP)
        public _FinalStage constraints(Optional<List<Constraint>> constraints) {
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>A short description of the field. Markdown syntax is supported.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * <p>User friendly field name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage label(String label) {
            this.label = Optional.ofNullable(label);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        @java.lang.Override
        public NumberProperty build() {
            return new NumberProperty(
                    key,
                    label,
                    description,
                    constraints,
                    readonly,
                    appearance,
                    actions,
                    metadata,
                    treatments,
                    alternativeNames,
                    isArray,
                    config,
                    additionalProperties);
        }
    }
}
