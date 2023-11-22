/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.roles.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.roles.types.ActorIdUnion;
import com.flatfile.api.resources.roles.types.ResourceIdUnion;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AssignRoleRequest.Builder.class)
public final class AssignRoleRequest {
    private final ActorIdUnion actorId;

    private final ResourceIdUnion resourceId;

    private final Map<String, Object> additionalProperties;

    private AssignRoleRequest(
            ActorIdUnion actorId, ResourceIdUnion resourceId, Map<String, Object> additionalProperties) {
        this.actorId = actorId;
        this.resourceId = resourceId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The user, agent, or guest to assign the role to
     */
    @JsonProperty("actorId")
    public ActorIdUnion getActorId() {
        return actorId;
    }

    /**
     * @return The account, environment, or space context for the role assignment
     */
    @JsonProperty("resourceId")
    public ResourceIdUnion getResourceId() {
        return resourceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AssignRoleRequest && equalTo((AssignRoleRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AssignRoleRequest other) {
        return actorId.equals(other.actorId) && resourceId.equals(other.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actorId, this.resourceId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActorIdStage builder() {
        return new Builder();
    }

    public interface ActorIdStage {
        ResourceIdStage actorId(ActorIdUnion actorId);

        Builder from(AssignRoleRequest other);
    }

    public interface ResourceIdStage {
        _FinalStage resourceId(ResourceIdUnion resourceId);
    }

    public interface _FinalStage {
        AssignRoleRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActorIdStage, ResourceIdStage, _FinalStage {
        private ActorIdUnion actorId;

        private ResourceIdUnion resourceId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(AssignRoleRequest other) {
            actorId(other.getActorId());
            resourceId(other.getResourceId());
            return this;
        }

        /**
         * <p>The user, agent, or guest to assign the role to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("actorId")
        public ResourceIdStage actorId(ActorIdUnion actorId) {
            this.actorId = actorId;
            return this;
        }

        /**
         * <p>The account, environment, or space context for the role assignment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("resourceId")
        public _FinalStage resourceId(ResourceIdUnion resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public AssignRoleRequest build() {
            return new AssignRoleRequest(actorId, resourceId, additionalProperties);
        }
    }
}
