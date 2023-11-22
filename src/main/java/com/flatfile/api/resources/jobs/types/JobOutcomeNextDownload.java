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
@JsonDeserialize(builder = JobOutcomeNextDownload.Builder.class)
public final class JobOutcomeNextDownload {
    private final String url;

    private final Optional<String> label;

    private final Optional<String> fileName;

    private final Map<String, Object> additionalProperties;

    private JobOutcomeNextDownload(
            String url, Optional<String> label, Optional<String> fileName, Map<String, Object> additionalProperties) {
        this.url = url;
        this.label = label;
        this.fileName = fileName;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    @JsonProperty("fileName")
    public Optional<String> getFileName() {
        return fileName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcomeNextDownload && equalTo((JobOutcomeNextDownload) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcomeNextDownload other) {
        return url.equals(other.url) && label.equals(other.label) && fileName.equals(other.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.url, this.label, this.fileName);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UrlStage builder() {
        return new Builder();
    }

    public interface UrlStage {
        _FinalStage url(String url);

        Builder from(JobOutcomeNextDownload other);
    }

    public interface _FinalStage {
        JobOutcomeNextDownload build();

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage fileName(Optional<String> fileName);

        _FinalStage fileName(String fileName);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UrlStage, _FinalStage {
        private String url;

        private Optional<String> fileName = Optional.empty();

        private Optional<String> label = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(JobOutcomeNextDownload other) {
            url(other.getUrl());
            label(other.getLabel());
            fileName(other.getFileName());
            return this;
        }

        @Override
        @JsonSetter("url")
        public _FinalStage url(String url) {
            this.url = url;
            return this;
        }

        @Override
        public _FinalStage fileName(String fileName) {
            this.fileName = Optional.of(fileName);
            return this;
        }

        @Override
        @JsonSetter(value = "fileName", nulls = Nulls.SKIP)
        public _FinalStage fileName(Optional<String> fileName) {
            this.fileName = fileName;
            return this;
        }

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
        public JobOutcomeNextDownload build() {
            return new JobOutcomeNextDownload(url, label, fileName, additionalProperties);
        }
    }
}
