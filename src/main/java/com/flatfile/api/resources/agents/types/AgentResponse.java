/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.types;

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
@JsonDeserialize(builder = AgentResponse.Builder.class)
public final class AgentResponse {
    private final Optional<Agent> data;

    private final Map<String, Object> additionalProperties;

    private AgentResponse(Optional<Agent> data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public Optional<Agent> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AgentResponse && equalTo((AgentResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AgentResponse other) {
        return data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data);
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
        private Optional<Agent> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AgentResponse other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(Optional<Agent> data) {
            this.data = data;
            return this;
        }

        public Builder data(Agent data) {
            this.data = Optional.ofNullable(data);
            return this;
        }

        public AgentResponse build() {
            return new AgentResponse(data, additionalProperties);
        }
    }
}
