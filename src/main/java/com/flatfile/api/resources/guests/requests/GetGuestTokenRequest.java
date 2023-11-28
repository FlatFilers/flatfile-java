/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.guests.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetGuestTokenRequest.Builder.class)
public final class GetGuestTokenRequest {
    private final Optional<SpaceId> spaceId;

    private final Map<String, Object> additionalProperties;

    private GetGuestTokenRequest(Optional<SpaceId> spaceId, Map<String, Object> additionalProperties) {
        this.spaceId = spaceId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ID of space to return
     */
    @JsonProperty("spaceId")
    public Optional<SpaceId> getSpaceId() {
        return spaceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetGuestTokenRequest && equalTo((GetGuestTokenRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetGuestTokenRequest other) {
        return spaceId.equals(other.spaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.spaceId);
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
        private Optional<SpaceId> spaceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetGuestTokenRequest other) {
            spaceId(other.getSpaceId());
            return this;
        }

        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public Builder spaceId(Optional<SpaceId> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        public Builder spaceId(SpaceId spaceId) {
            this.spaceId = Optional.of(spaceId);
            return this;
        }

        public GetGuestTokenRequest build() {
            return new GetGuestTokenRequest(spaceId, additionalProperties);
        }
    }
}
