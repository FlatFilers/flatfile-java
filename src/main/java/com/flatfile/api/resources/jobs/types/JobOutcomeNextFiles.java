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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = JobOutcomeNextFiles.Builder.class)
public final class JobOutcomeNextFiles {
    private final List<JobOutcomeNextFileObject> files;

    private final Optional<String> label;

    private final Map<String, Object> additionalProperties;

    private JobOutcomeNextFiles(
            List<JobOutcomeNextFileObject> files, Optional<String> label, Map<String, Object> additionalProperties) {
        this.files = files;
        this.label = label;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("files")
    public List<JobOutcomeNextFileObject> getFiles() {
        return files;
    }

    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcomeNextFiles && equalTo((JobOutcomeNextFiles) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcomeNextFiles other) {
        return files.equals(other.files) && label.equals(other.label);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.files, this.label);
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
        private List<JobOutcomeNextFileObject> files = new ArrayList<>();

        private Optional<String> label = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(JobOutcomeNextFiles other) {
            files(other.getFiles());
            label(other.getLabel());
            return this;
        }

        @JsonSetter(value = "files", nulls = Nulls.SKIP)
        public Builder files(List<JobOutcomeNextFileObject> files) {
            this.files.clear();
            this.files.addAll(files);
            return this;
        }

        public Builder addFiles(JobOutcomeNextFileObject files) {
            this.files.add(files);
            return this;
        }

        public Builder addAllFiles(List<JobOutcomeNextFileObject> files) {
            this.files.addAll(files);
            return this;
        }

        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public Builder label(Optional<String> label) {
            this.label = label;
            return this;
        }

        public Builder label(String label) {
            this.label = Optional.of(label);
            return this;
        }

        public JobOutcomeNextFiles build() {
            return new JobOutcomeNextFiles(files, label, additionalProperties);
        }
    }
}