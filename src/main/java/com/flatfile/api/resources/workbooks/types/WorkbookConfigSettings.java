/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.workbooks.types;

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
@JsonDeserialize(builder = WorkbookConfigSettings.Builder.class)
public final class WorkbookConfigSettings {
    private final Optional<Boolean> trackChanges;

    private final Map<String, Object> additionalProperties;

    private WorkbookConfigSettings(Optional<Boolean> trackChanges, Map<String, Object> additionalProperties) {
        this.trackChanges = trackChanges;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Whether to track changes for this workbook. Defaults to false. Tracking changes on a workbook allows for disabling workbook and sheet actions while data in the workbook is still being processed. You must run a recordHook listener if you enable this feature.
     */
    @JsonProperty("trackChanges")
    public Optional<Boolean> getTrackChanges() {
        return trackChanges;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkbookConfigSettings && equalTo((WorkbookConfigSettings) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WorkbookConfigSettings other) {
        return trackChanges.equals(other.trackChanges);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.trackChanges);
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
        private Optional<Boolean> trackChanges = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(WorkbookConfigSettings other) {
            trackChanges(other.getTrackChanges());
            return this;
        }

        @JsonSetter(value = "trackChanges", nulls = Nulls.SKIP)
        public Builder trackChanges(Optional<Boolean> trackChanges) {
            this.trackChanges = trackChanges;
            return this;
        }

        public Builder trackChanges(Boolean trackChanges) {
            this.trackChanges = Optional.of(trackChanges);
            return this;
        }

        public WorkbookConfigSettings build() {
            return new WorkbookConfigSettings(trackChanges, additionalProperties);
        }
    }
}
