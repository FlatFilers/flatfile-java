/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetAgentRequest.Builder.class)
public final class GetAgentRequest {
    private final Optional<EnvironmentId> environmentId;

    private final Map<String, Object> additionalProperties;

    private GetAgentRequest(Optional<EnvironmentId> environmentId, Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetAgentRequest && equalTo((GetAgentRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetAgentRequest other) {
        return environmentId.equals(other.environmentId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.environmentId);
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
        private Optional<EnvironmentId> environmentId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetAgentRequest other) {
            environmentId(other.getEnvironmentId());
            return this;
        }

        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public Builder environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.of(environmentId);
            return this;
        }

        public GetAgentRequest build() {
            return new GetAgentRequest(environmentId, additionalProperties);
        }
    }
}
