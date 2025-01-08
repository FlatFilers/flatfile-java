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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ActionConstraintHasAllValid.Builder.class)
public final class ActionConstraintHasAllValid {
    private final Optional<Boolean> ignoreSelection;

    private final Map<String, Object> additionalProperties;

    private ActionConstraintHasAllValid(Optional<Boolean> ignoreSelection, Map<String, Object> additionalProperties) {
        this.ignoreSelection = ignoreSelection;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("ignoreSelection")
    public Optional<Boolean> getIgnoreSelection() {
        return ignoreSelection;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionConstraintHasAllValid && equalTo((ActionConstraintHasAllValid) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionConstraintHasAllValid other) {
        return ignoreSelection.equals(other.ignoreSelection);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ignoreSelection);
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
        private Optional<Boolean> ignoreSelection = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ActionConstraintHasAllValid other) {
            ignoreSelection(other.getIgnoreSelection());
            return this;
        }

        @JsonSetter(value = "ignoreSelection", nulls = Nulls.SKIP)
        public Builder ignoreSelection(Optional<Boolean> ignoreSelection) {
            this.ignoreSelection = ignoreSelection;
            return this;
        }

        public Builder ignoreSelection(Boolean ignoreSelection) {
            this.ignoreSelection = Optional.ofNullable(ignoreSelection);
            return this;
        }

        public ActionConstraintHasAllValid build() {
            return new ActionConstraintHasAllValid(ignoreSelection, additionalProperties);
        }
    }
}
