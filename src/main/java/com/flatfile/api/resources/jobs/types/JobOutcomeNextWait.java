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
@JsonDeserialize(builder = JobOutcomeNextWait.Builder.class)
public final class JobOutcomeNextWait {
    private final Optional<Boolean> fade;

    private final Optional<Boolean> confetti;

    private final Map<String, Object> additionalProperties;

    private JobOutcomeNextWait(
            Optional<Boolean> fade, Optional<Boolean> confetti, Map<String, Object> additionalProperties) {
        this.fade = fade;
        this.confetti = confetti;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("fade")
    public Optional<Boolean> getFade() {
        return fade;
    }

    @JsonProperty("confetti")
    public Optional<Boolean> getConfetti() {
        return confetti;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcomeNextWait && equalTo((JobOutcomeNextWait) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcomeNextWait other) {
        return fade.equals(other.fade) && confetti.equals(other.confetti);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.fade, this.confetti);
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
        private Optional<Boolean> fade = Optional.empty();

        private Optional<Boolean> confetti = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(JobOutcomeNextWait other) {
            fade(other.getFade());
            confetti(other.getConfetti());
            return this;
        }

        @JsonSetter(value = "fade", nulls = Nulls.SKIP)
        public Builder fade(Optional<Boolean> fade) {
            this.fade = fade;
            return this;
        }

        public Builder fade(Boolean fade) {
            this.fade = Optional.of(fade);
            return this;
        }

        @JsonSetter(value = "confetti", nulls = Nulls.SKIP)
        public Builder confetti(Optional<Boolean> confetti) {
            this.confetti = confetti;
            return this;
        }

        public Builder confetti(Boolean confetti) {
            this.confetti = Optional.of(confetti);
            return this;
        }

        public JobOutcomeNextWait build() {
            return new JobOutcomeNextWait(fade, confetti, additionalProperties);
        }
    }
}
