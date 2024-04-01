/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.users.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.roles.types.AssignActorRoleRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserCreateAndInviteRequest.Builder.class)
public final class UserCreateAndInviteRequest {
    private final String email;

    private final String name;

    private final List<AssignActorRoleRequest> actorRoles;

    private final Map<String, Object> additionalProperties;

    private UserCreateAndInviteRequest(
            String email,
            String name,
            List<AssignActorRoleRequest> actorRoles,
            Map<String, Object> additionalProperties) {
        this.email = email;
        this.name = name;
        this.actorRoles = actorRoles;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("actorRoles")
    public List<AssignActorRoleRequest> getActorRoles() {
        return actorRoles;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserCreateAndInviteRequest && equalTo((UserCreateAndInviteRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserCreateAndInviteRequest other) {
        return email.equals(other.email) && name.equals(other.name) && actorRoles.equals(other.actorRoles);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.email, this.name, this.actorRoles);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        NameStage email(String email);

        Builder from(UserCreateAndInviteRequest other);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        UserCreateAndInviteRequest build();

        _FinalStage actorRoles(List<AssignActorRoleRequest> actorRoles);

        _FinalStage addActorRoles(AssignActorRoleRequest actorRoles);

        _FinalStage addAllActorRoles(List<AssignActorRoleRequest> actorRoles);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, NameStage, _FinalStage {
        private String email;

        private String name;

        private List<AssignActorRoleRequest> actorRoles = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserCreateAndInviteRequest other) {
            email(other.getEmail());
            name(other.getName());
            actorRoles(other.getActorRoles());
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public NameStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllActorRoles(List<AssignActorRoleRequest> actorRoles) {
            this.actorRoles.addAll(actorRoles);
            return this;
        }

        @java.lang.Override
        public _FinalStage addActorRoles(AssignActorRoleRequest actorRoles) {
            this.actorRoles.add(actorRoles);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "actorRoles", nulls = Nulls.SKIP)
        public _FinalStage actorRoles(List<AssignActorRoleRequest> actorRoles) {
            this.actorRoles.clear();
            this.actorRoles.addAll(actorRoles);
            return this;
        }

        @java.lang.Override
        public UserCreateAndInviteRequest build() {
            return new UserCreateAndInviteRequest(email, name, actorRoles, additionalProperties);
        }
    }
}