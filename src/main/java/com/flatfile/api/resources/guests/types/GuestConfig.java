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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GuestConfig.Builder.class)
public final class GuestConfig implements IGuestConfig {
    private final String environmentId;

    private final String email;

    private final String name;

    private final List<GuestSpace> spaces;

    private final Map<String, Object> additionalProperties;

    private GuestConfig(
            String environmentId,
            String email,
            String name,
            List<GuestSpace> spaces,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.email = email;
        this.name = name;
        this.spaces = spaces;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    @Override
    public String getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("email")
    @Override
    public String getEmail() {
        return email;
    }

    @JsonProperty("name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty("spaces")
    @Override
    public List<GuestSpace> getSpaces() {
        return spaces;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GuestConfig && equalTo((GuestConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GuestConfig other) {
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

    public static EnvironmentIdStage builder() {
        return new Builder();
    }

    public interface EnvironmentIdStage {
        EmailStage environmentId(String environmentId);

        Builder from(GuestConfig other);
    }

    public interface EmailStage {
        NameStage email(String email);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        GuestConfig build();

        _FinalStage spaces(List<GuestSpace> spaces);

        _FinalStage addSpaces(GuestSpace spaces);

        _FinalStage addAllSpaces(List<GuestSpace> spaces);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EnvironmentIdStage, EmailStage, NameStage, _FinalStage {
        private String environmentId;

        private String email;

        private String name;

        private List<GuestSpace> spaces = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GuestConfig other) {
            environmentId(other.getEnvironmentId());
            email(other.getEmail());
            name(other.getName());
            spaces(other.getSpaces());
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public EmailStage environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        @JsonSetter("email")
        public NameStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage addAllSpaces(List<GuestSpace> spaces) {
            this.spaces.addAll(spaces);
            return this;
        }

        @Override
        public _FinalStage addSpaces(GuestSpace spaces) {
            this.spaces.add(spaces);
            return this;
        }

        @Override
        @JsonSetter(value = "spaces", nulls = Nulls.SKIP)
        public _FinalStage spaces(List<GuestSpace> spaces) {
            this.spaces.clear();
            this.spaces.addAll(spaces);
            return this;
        }

        @Override
        public GuestConfig build() {
            return new GuestConfig(environmentId, email, name, spaces, additionalProperties);
        }
    }
}
