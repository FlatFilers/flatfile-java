/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.roles.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.ActorRoleId;
import com.flatfile.api.resources.commons.types.RoleId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActorRoleResponse.Builder.class)
public final class ActorRoleResponse {
    private final ActorRoleId id;

    private final RoleId roleId;

    private final ActorIdUnion actorId;

    private final ResourceIdUnion resourceId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private ActorRoleResponse(
            ActorRoleId id,
            RoleId roleId,
            ActorIdUnion actorId,
            ResourceIdUnion resourceId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.roleId = roleId;
        this.actorId = actorId;
        this.resourceId = resourceId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public ActorRoleId getId() {
        return id;
    }

    @JsonProperty("roleId")
    public RoleId getRoleId() {
        return roleId;
    }

    @JsonProperty("actorId")
    public ActorIdUnion getActorId() {
        return actorId;
    }

    @JsonProperty("resourceId")
    public ResourceIdUnion getResourceId() {
        return resourceId;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActorRoleResponse && equalTo((ActorRoleResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActorRoleResponse other) {
        return id.equals(other.id)
                && roleId.equals(other.roleId)
                && actorId.equals(other.actorId)
                && resourceId.equals(other.resourceId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.roleId, this.actorId, this.resourceId, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        RoleIdStage id(ActorRoleId id);

        Builder from(ActorRoleResponse other);
    }

    public interface RoleIdStage {
        ActorIdStage roleId(RoleId roleId);
    }

    public interface ActorIdStage {
        ResourceIdStage actorId(ActorIdUnion actorId);
    }

    public interface ResourceIdStage {
        CreatedAtStage resourceId(ResourceIdUnion resourceId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ActorRoleResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    RoleIdStage,
                    ActorIdStage,
                    ResourceIdStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private ActorRoleId id;

        private RoleId roleId;

        private ActorIdUnion actorId;

        private ResourceIdUnion resourceId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActorRoleResponse other) {
            id(other.getId());
            roleId(other.getRoleId());
            actorId(other.getActorId());
            resourceId(other.getResourceId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public RoleIdStage id(ActorRoleId id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("roleId")
        public ActorIdStage roleId(RoleId roleId) {
            this.roleId = roleId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("actorId")
        public ResourceIdStage actorId(ActorIdUnion actorId) {
            this.actorId = actorId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("resourceId")
        public CreatedAtStage resourceId(ResourceIdUnion resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public ActorRoleResponse build() {
            return new ActorRoleResponse(id, roleId, actorId, resourceId, createdAt, updatedAt, additionalProperties);
        }
    }
}
