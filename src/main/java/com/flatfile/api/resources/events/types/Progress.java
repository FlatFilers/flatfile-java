/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

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
@JsonDeserialize(builder = Progress.Builder.class)
public final class Progress {
    private final Optional<Integer> current;

    private final Optional<Integer> total;

    private final Optional<Integer> percent;

    private final Map<String, Object> additionalProperties;

    private Progress(
            Optional<Integer> current,
            Optional<Integer> total,
            Optional<Integer> percent,
            Map<String, Object> additionalProperties) {
        this.current = current;
        this.total = total;
        this.percent = percent;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The current progress of the event
     */
    @JsonProperty("current")
    public Optional<Integer> getCurrent() {
        return current;
    }

    /**
     * @return The total number of events in this group
     */
    @JsonProperty("total")
    public Optional<Integer> getTotal() {
        return total;
    }

    /**
     * @return The percent complete of the event group
     */
    @JsonProperty("percent")
    public Optional<Integer> getPercent() {
        return percent;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Progress && equalTo((Progress) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Progress other) {
        return current.equals(other.current) && total.equals(other.total) && percent.equals(other.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.current, this.total, this.percent);
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
        private Optional<Integer> current = Optional.empty();

        private Optional<Integer> total = Optional.empty();

        private Optional<Integer> percent = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Progress other) {
            current(other.getCurrent());
            total(other.getTotal());
            percent(other.getPercent());
            return this;
        }

        @JsonSetter(value = "current", nulls = Nulls.SKIP)
        public Builder current(Optional<Integer> current) {
            this.current = current;
            return this;
        }

        public Builder current(Integer current) {
            this.current = Optional.of(current);
            return this;
        }

        @JsonSetter(value = "total", nulls = Nulls.SKIP)
        public Builder total(Optional<Integer> total) {
            this.total = total;
            return this;
        }

        public Builder total(Integer total) {
            this.total = Optional.of(total);
            return this;
        }

        @JsonSetter(value = "percent", nulls = Nulls.SKIP)
        public Builder percent(Optional<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            this.percent = Optional.of(percent);
            return this;
        }

        public Progress build() {
            return new Progress(current, total, percent, additionalProperties);
        }
    }
}