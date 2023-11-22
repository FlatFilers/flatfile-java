/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.secrets.types;

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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Secret.Builder.class)
public final class Secret implements IWriteSecret {
    private final String name;

    private final String value;

    private final String environmentId;

    private final Optional<String> spaceId;

    private final String id;

    private final Map<String, Object> additionalProperties;

    private Secret(
            String name,
            String value,
            String environmentId,
            Optional<String> spaceId,
            String id,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.value = value;
        this.environmentId = environmentId;
        this.spaceId = spaceId;
        this.id = id;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty("value")
    @Override
    public String getValue() {
        return value;
    }

    @JsonProperty("environmentId")
    @Override
    public String getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("spaceId")
    @Override
    public Optional<String> getSpaceId() {
        return spaceId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Secret && equalTo((Secret) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Secret other) {
        return name.equals(other.name)
                && value.equals(other.value)
                && environmentId.equals(other.environmentId)
                && spaceId.equals(other.spaceId)
                && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.value, this.environmentId, this.spaceId, this.id);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        ValueStage name(String name);

        Builder from(Secret other);
    }

    public interface ValueStage {
        EnvironmentIdStage value(String value);
    }

    public interface EnvironmentIdStage {
        IdStage environmentId(String environmentId);
    }

    public interface IdStage {
        _FinalStage id(String id);
    }

    public interface _FinalStage {
        Secret build();

        _FinalStage spaceId(Optional<String> spaceId);

        _FinalStage spaceId(String spaceId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, ValueStage, EnvironmentIdStage, IdStage, _FinalStage {
        private String name;

        private String value;

        private String environmentId;

        private String id;

        private Optional<String> spaceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Secret other) {
            name(other.getName());
            value(other.getValue());
            environmentId(other.getEnvironmentId());
            spaceId(other.getSpaceId());
            id(other.getId());
            return this;
        }

        @Override
        @JsonSetter("name")
        public ValueStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("value")
        public EnvironmentIdStage value(String value) {
            this.value = value;
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public IdStage environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        public _FinalStage spaceId(String spaceId) {
            this.spaceId = Optional.of(spaceId);
            return this;
        }

        @Override
        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public _FinalStage spaceId(Optional<String> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public Secret build() {
            return new Secret(name, value, environmentId, spaceId, id, additionalProperties);
        }
    }
}