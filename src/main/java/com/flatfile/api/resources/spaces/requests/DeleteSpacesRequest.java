/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.spaces.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = DeleteSpacesRequest.Builder.class)
public final class DeleteSpacesRequest {
    private final SpaceId spaceIds;

    private final Map<String, Object> additionalProperties;

    private DeleteSpacesRequest(SpaceId spaceIds, Map<String, Object> additionalProperties) {
        this.spaceIds = spaceIds;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of ids for the spaces to be deleted
     */
    @JsonProperty("spaceIds")
    public SpaceId getSpaceIds() {
        return spaceIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeleteSpacesRequest && equalTo((DeleteSpacesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeleteSpacesRequest other) {
        return spaceIds.equals(other.spaceIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.spaceIds);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SpaceIdsStage builder() {
        return new Builder();
    }

    public interface SpaceIdsStage {
        _FinalStage spaceIds(@NotNull SpaceId spaceIds);

        Builder from(DeleteSpacesRequest other);
    }

    public interface _FinalStage {
        DeleteSpacesRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SpaceIdsStage, _FinalStage {
        private SpaceId spaceIds;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DeleteSpacesRequest other) {
            spaceIds(other.getSpaceIds());
            return this;
        }

        /**
         * <p>List of ids for the spaces to be deleted</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("spaceIds")
        public _FinalStage spaceIds(@NotNull SpaceId spaceIds) {
            this.spaceIds = Objects.requireNonNull(spaceIds, "spaceIds must not be null");
            return this;
        }

        @java.lang.Override
        public DeleteSpacesRequest build() {
            return new DeleteSpacesRequest(spaceIds, additionalProperties);
        }
    }
}
