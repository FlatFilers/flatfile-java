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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetAgentLogRequest.Builder.class)
public final class GetAgentLogRequest {
    private final String environmentId;

    private final Map<String, Object> additionalProperties;

    private GetAgentLogRequest(String environmentId, Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    public String getEnvironmentId() {
        return environmentId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetAgentLogRequest && equalTo((GetAgentLogRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetAgentLogRequest other) {
        return environmentId.equals(other.environmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.environmentId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EnvironmentIdStage builder() {
        return new Builder();
    }

    public interface EnvironmentIdStage {
        _FinalStage environmentId(String environmentId);

        Builder from(GetAgentLogRequest other);
    }

    public interface _FinalStage {
        GetAgentLogRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EnvironmentIdStage, _FinalStage {
        private String environmentId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GetAgentLogRequest other) {
            environmentId(other.getEnvironmentId());
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public _FinalStage environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public GetAgentLogRequest build() {
            return new GetAgentLogRequest(environmentId, additionalProperties);
        }
    }
}