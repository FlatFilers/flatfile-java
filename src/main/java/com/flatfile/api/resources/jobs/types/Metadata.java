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
@JsonDeserialize(builder = Metadata.Builder.class)
public final class Metadata {
    private final Optional<Certainty> certainty;

    private final Optional<Double> confidence;

    private final Optional<String> source;

    private final Map<String, Object> additionalProperties;

    private Metadata(
            Optional<Certainty> certainty,
            Optional<Double> confidence,
            Optional<String> source,
            Map<String, Object> additionalProperties) {
        this.certainty = certainty;
        this.confidence = confidence;
        this.source = source;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("certainty")
    public Optional<Certainty> getCertainty() {
        return certainty;
    }

    @JsonProperty("confidence")
    public Optional<Double> getConfidence() {
        return confidence;
    }

    @JsonProperty("source")
    public Optional<String> getSource() {
        return source;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Metadata && equalTo((Metadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Metadata other) {
        return certainty.equals(other.certainty) && confidence.equals(other.confidence) && source.equals(other.source);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.certainty, this.confidence, this.source);
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
        private Optional<Certainty> certainty = Optional.empty();

        private Optional<Double> confidence = Optional.empty();

        private Optional<String> source = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Metadata other) {
            certainty(other.getCertainty());
            confidence(other.getConfidence());
            source(other.getSource());
            return this;
        }

        @JsonSetter(value = "certainty", nulls = Nulls.SKIP)
        public Builder certainty(Optional<Certainty> certainty) {
            this.certainty = certainty;
            return this;
        }

        public Builder certainty(Certainty certainty) {
            this.certainty = Optional.of(certainty);
            return this;
        }

        @JsonSetter(value = "confidence", nulls = Nulls.SKIP)
        public Builder confidence(Optional<Double> confidence) {
            this.confidence = confidence;
            return this;
        }

        public Builder confidence(Double confidence) {
            this.confidence = Optional.of(confidence);
            return this;
        }

        @JsonSetter(value = "source", nulls = Nulls.SKIP)
        public Builder source(Optional<String> source) {
            this.source = source;
            return this;
        }

        public Builder source(String source) {
            this.source = Optional.of(source);
            return this;
        }

        public Metadata build() {
            return new Metadata(certainty, confidence, source, additionalProperties);
        }
    }
}
