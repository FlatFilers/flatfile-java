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
@JsonDeserialize(builder = DateProperty.Builder.class)
public final class DateProperty implements IBaseProperty {
    private final String key;

    private final Optional<String> label;

    private final Optional<String> description;

    private final Optional<List<Constraint>> constraints;

    private final Optional<Boolean> readonly;

    private final Optional<Object> metadata;

    private final Optional<List<String>> treatments;

    private final Optional<List<String>> alternativeNames;

    private final Map<String, Object> additionalProperties;

    private DateProperty(
            String key,
            Optional<String> label,
            Optional<String> description,
            Optional<List<Constraint>> constraints,
            Optional<Boolean> readonly,
            Optional<Object> metadata,
            Optional<List<String>> treatments,
            Optional<List<String>> alternativeNames,
            Map<String, Object> additionalProperties) {
        this.key = key;
        this.label = label;
        this.description = description;
        this.constraints = constraints;
        this.readonly = readonly;
        this.metadata = metadata;
        this.treatments = treatments;
        this.alternativeNames = alternativeNames;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DateProperty && equalTo((DateProperty) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DateProperty other) {
        return key.equals(other.key)
                && label.equals(other.label)
                && description.equals(other.description)
                && constraints.equals(other.constraints)
                && readonly.equals(other.readonly)
                && metadata.equals(other.metadata)
                && treatments.equals(other.treatments)
                && alternativeNames.equals(other.alternativeNames);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.key,
                this.label,
                this.description,
                this.constraints,
                this.readonly,
                this.metadata,
                this.treatments,
                this.alternativeNames);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        _FinalStage key(String key);

        Builder from(DateProperty other);
    }

    public interface _FinalStage {
        DateProperty build();

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage constraints(Optional<List<Constraint>> constraints);

        _FinalStage constraints(List<Constraint> constraints);

        _FinalStage readonly(Optional<Boolean> readonly);

        _FinalStage readonly(Boolean readonly);

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage treatments(Optional<List<String>> treatments);

        _FinalStage treatments(List<String> treatments);

        _FinalStage alternativeNames(Optional<List<String>> alternativeNames);

        _FinalStage alternativeNames(List<String> alternativeNames);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, _FinalStage {
        private String key;

        private Optional<List<String>> alternativeNames = Optional.empty();

        private Optional<List<String>> treatments = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<Boolean> readonly = Optional.empty();

        private Optional<List<Constraint>> constraints = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> label = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DateProperty other) {
            key(other.getKey());
            label(other.getLabel());
            description(other.getDescription());
            constraints(other.getConstraints());
            readonly(other.getReadonly());
            metadata(other.getMetadata());
            treatments(other.getTreatments());
            alternativeNames(other.getAlternativeNames());
            return this;
        }

        @java.lang.Override
        @JsonSetter("key")
        public _FinalStage key(String key) {
            this.key = key;
            return this;
        }

        @java.lang.Override
        public _FinalStage alternativeNames(List<String> alternativeNames) {
            this.alternativeNames = Optional.of(alternativeNames);
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
            this.treatments = Optional.of(treatments);
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
            this.metadata = Optional.of(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage readonly(Boolean readonly) {
            this.readonly = Optional.of(readonly);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "readonly", nulls = Nulls.SKIP)
        public _FinalStage readonly(Optional<Boolean> readonly) {
            this.readonly = readonly;
            return this;
        }

        @java.lang.Override
        public _FinalStage constraints(List<Constraint> constraints) {
            this.constraints = Optional.of(constraints);
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
            this.description = Optional.of(description);
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
            this.label = Optional.of(label);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        @java.lang.Override
        public DateProperty build() {
            return new DateProperty(
                    key,
                    label,
                    description,
                    constraints,
                    readonly,
                    metadata,
                    treatments,
                    alternativeNames,
                    additionalProperties);
        }
    }
}
