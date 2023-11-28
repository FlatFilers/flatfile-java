/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.auth.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetApiKeysRequest.Builder.class)
public final class GetApiKeysRequest {
    private final EnvironmentId environmentId;

    private final Map<String, Object> additionalProperties;

    private GetApiKeysRequest(EnvironmentId environmentId, Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ID of environment to search
     */
    @JsonProperty("environmentId")
    public EnvironmentId getEnvironmentId() {
        return environmentId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetApiKeysRequest && equalTo((GetApiKeysRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetApiKeysRequest other) {
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
        _FinalStage environmentId(EnvironmentId environmentId);

        Builder from(GetApiKeysRequest other);
    }

    public interface _FinalStage {
        GetApiKeysRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EnvironmentIdStage, _FinalStage {
        private EnvironmentId environmentId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GetApiKeysRequest other) {
            environmentId(other.getEnvironmentId());
            return this;
        }

        /**
         * <p>ID of environment to search</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("environmentId")
        public _FinalStage environmentId(EnvironmentId environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public GetApiKeysRequest build() {
            return new GetApiKeysRequest(environmentId, additionalProperties);
        }
    }
}
