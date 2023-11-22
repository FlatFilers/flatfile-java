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
@JsonDeserialize(builder = JobOutcome.Builder.class)
public final class JobOutcome {
    private final Optional<Boolean> acknowledge;

    private final Optional<String> buttonText;

    private final Optional<JobOutcomeNext> next;

    private final Optional<String> heading;

    private final Optional<String> message;

    private final Map<String, Object> additionalProperties;

    private JobOutcome(
            Optional<Boolean> acknowledge,
            Optional<String> buttonText,
            Optional<JobOutcomeNext> next,
            Optional<String> heading,
            Optional<String> message,
            Map<String, Object> additionalProperties) {
        this.acknowledge = acknowledge;
        this.buttonText = buttonText;
        this.next = next;
        this.heading = heading;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acknowledge")
    public Optional<Boolean> getAcknowledge() {
        return acknowledge;
    }

    @JsonProperty("buttonText")
    public Optional<String> getButtonText() {
        return buttonText;
    }

    @JsonProperty("next")
    public Optional<JobOutcomeNext> getNext() {
        return next;
    }

    @JsonProperty("heading")
    public Optional<String> getHeading() {
        return heading;
    }

    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcome && equalTo((JobOutcome) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcome other) {
        return acknowledge.equals(other.acknowledge)
                && buttonText.equals(other.buttonText)
                && next.equals(other.next)
                && heading.equals(other.heading)
                && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.acknowledge, this.buttonText, this.next, this.heading, this.message);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> acknowledge = Optional.empty();

        private Optional<String> buttonText = Optional.empty();

        private Optional<JobOutcomeNext> next = Optional.empty();

        private Optional<String> heading = Optional.empty();

        private Optional<String> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(JobOutcome other) {
            acknowledge(other.getAcknowledge());
            buttonText(other.getButtonText());
            next(other.getNext());
            heading(other.getHeading());
            message(other.getMessage());
            return this;
        }

        @JsonSetter(value = "acknowledge", nulls = Nulls.SKIP)
        public Builder acknowledge(Optional<Boolean> acknowledge) {
            this.acknowledge = acknowledge;
            return this;
        }

        public Builder acknowledge(Boolean acknowledge) {
            this.acknowledge = Optional.of(acknowledge);
            return this;
        }

        @JsonSetter(value = "buttonText", nulls = Nulls.SKIP)
        public Builder buttonText(Optional<String> buttonText) {
            this.buttonText = buttonText;
            return this;
        }

        public Builder buttonText(String buttonText) {
            this.buttonText = Optional.of(buttonText);
            return this;
        }

        @JsonSetter(value = "next", nulls = Nulls.SKIP)
        public Builder next(Optional<JobOutcomeNext> next) {
            this.next = next;
            return this;
        }

        public Builder next(JobOutcomeNext next) {
            this.next = Optional.of(next);
            return this;
        }

        @JsonSetter(value = "heading", nulls = Nulls.SKIP)
        public Builder heading(Optional<String> heading) {
            this.heading = heading;
            return this;
        }

        public Builder heading(String heading) {
            this.heading = Optional.of(heading);
            return this;
        }

        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public Builder message(Optional<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(String message) {
            this.message = Optional.of(message);
            return this;
        }

        public JobOutcome build() {
            return new JobOutcome(acknowledge, buttonText, next, heading, message, additionalProperties);
        }
    }
}