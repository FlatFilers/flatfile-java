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
import com.flatfile.api.resources.commons.types.RoleId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AssignActorRoleRequest.Builder.class)
public final class AssignActorRoleRequest {
    private final RoleId roleId;

    private final ResourceIdUnion resourceId;

    private final Map<String, Object> additionalProperties;

    private AssignActorRoleRequest(
            RoleId roleId, ResourceIdUnion resourceId, Map<String, Object> additionalProperties) {
        this.roleId = roleId;
        this.resourceId = resourceId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("roleId")
    public RoleId getRoleId() {
        return roleId;
    }

    @JsonProperty("resourceId")
    public ResourceIdUnion getResourceId() {
        return resourceId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AssignActorRoleRequest && equalTo((AssignActorRoleRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AssignActorRoleRequest other) {
        return roleId.equals(other.roleId) && resourceId.equals(other.resourceId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.roleId, this.resourceId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleIdStage builder() {
        return new Builder();
    }

    public interface RoleIdStage {
        ResourceIdStage roleId(RoleId roleId);

        Builder from(AssignActorRoleRequest other);
    }

    public interface ResourceIdStage {
        _FinalStage resourceId(ResourceIdUnion resourceId);
    }

    public interface _FinalStage {
        AssignActorRoleRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RoleIdStage, ResourceIdStage, _FinalStage {
        private RoleId roleId;

        private ResourceIdUnion resourceId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AssignActorRoleRequest other) {
            roleId(other.getRoleId());
            resourceId(other.getResourceId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("roleId")
        public ResourceIdStage roleId(RoleId roleId) {
            this.roleId = roleId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("resourceId")
        public _FinalStage resourceId(ResourceIdUnion resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        @java.lang.Override
        public AssignActorRoleRequest build() {
            return new AssignActorRoleRequest(roleId, resourceId, additionalProperties);
        }
    }
}
