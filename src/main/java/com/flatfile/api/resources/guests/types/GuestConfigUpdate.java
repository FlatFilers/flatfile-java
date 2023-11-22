/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.guests.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GuestConfigUpdate.Builder.class)
public final class GuestConfigUpdate {
    private final Optional<String> environmentId;

    private final Optional<String> email;

    private final Optional<String> name;

    private final Optional<List<GuestSpace>> spaces;

    private final Map<String, Object> additionalProperties;

    private GuestConfigUpdate(
            Optional<String> environmentId,
            Optional<String> email,
            Optional<String> name,
            Optional<List<GuestSpace>> spaces,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.email = email;
        this.name = name;
        this.spaces = spaces;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    public Optional<String> getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("spaces")
    public Optional<List<GuestSpace>> getSpaces() {
        return spaces;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GuestConfigUpdate && equalTo((GuestConfigUpdate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GuestConfigUpdate other) {
        return environmentId.equals(other.environmentId)
                && email.equals(other.email)
                && name.equals(other.name)
                && spaces.equals(other.spaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.environmentId, this.email, this.name, this.spaces);
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
        private Optional<String> environmentId = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<List<GuestSpace>> spaces = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GuestConfigUpdate other) {
            environmentId(other.getEnvironmentId());
            email(other.getEmail());
            name(other.getName());
            spaces(other.getSpaces());
            return this;
        }

        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public Builder environmentId(Optional<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Optional.of(environmentId);
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = Optional.of(email);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "spaces", nulls = Nulls.SKIP)
        public Builder spaces(Optional<List<GuestSpace>> spaces) {
            this.spaces = spaces;
            return this;
        }

        public Builder spaces(List<GuestSpace> spaces) {
            this.spaces = Optional.of(spaces);
            return this;
        }

        public GuestConfigUpdate build() {
            return new GuestConfigUpdate(environmentId, email, name, spaces, additionalProperties);
        }
    }
}