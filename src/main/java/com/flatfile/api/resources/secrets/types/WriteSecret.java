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
import com.flatfile.api.resources.commons.types.ActorIdUnion;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = WriteSecret.Builder.class)
public final class WriteSecret implements IWriteSecret {
    private final SecretName name;

    private final SecretValue value;

    private final Optional<EnvironmentId> environmentId;

    private final Optional<SpaceId> spaceId;

    private final Optional<ActorIdUnion> actorId;

    private final Map<String, Object> additionalProperties;

    private WriteSecret(
            SecretName name,
            SecretValue value,
            Optional<EnvironmentId> environmentId,
            Optional<SpaceId> spaceId,
            Optional<ActorIdUnion> actorId,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.value = value;
        this.environmentId = environmentId;
        this.spaceId = spaceId;
        this.actorId = actorId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The reference name for a secret.
     */
    @JsonProperty("name")
    @java.lang.Override
    public SecretName getName() {
        return name;
    }

    /**
     * @return The secret value. This is hidden in the UI.
     */
    @JsonProperty("value")
    @java.lang.Override
    public SecretValue getValue() {
        return value;
    }

    /**
     * @return The Environment of the secret.
     */
    @JsonProperty("environmentId")
    @java.lang.Override
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    /**
     * @return The Space of the secret.
     */
    @JsonProperty("spaceId")
    @java.lang.Override
    public Optional<SpaceId> getSpaceId() {
        return spaceId;
    }

    /**
     * @return The Actor of the secret.
     */
    @JsonProperty("actorId")
    @java.lang.Override
    public Optional<ActorIdUnion> getActorId() {
        return actorId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WriteSecret && equalTo((WriteSecret) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WriteSecret other) {
        return name.equals(other.name)
                && value.equals(other.value)
                && environmentId.equals(other.environmentId)
                && spaceId.equals(other.spaceId)
                && actorId.equals(other.actorId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.value, this.environmentId, this.spaceId, this.actorId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        ValueStage name(@NotNull SecretName name);

        Builder from(WriteSecret other);
    }

    public interface ValueStage {
        _FinalStage value(@NotNull SecretValue value);
    }

    public interface _FinalStage {
        WriteSecret build();

        _FinalStage environmentId(Optional<EnvironmentId> environmentId);

        _FinalStage environmentId(EnvironmentId environmentId);

        _FinalStage spaceId(Optional<SpaceId> spaceId);

        _FinalStage spaceId(SpaceId spaceId);

        _FinalStage actorId(Optional<ActorIdUnion> actorId);

        _FinalStage actorId(ActorIdUnion actorId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, ValueStage, _FinalStage {
        private SecretName name;

        private SecretValue value;

        private Optional<ActorIdUnion> actorId = Optional.empty();

        private Optional<SpaceId> spaceId = Optional.empty();

        private Optional<EnvironmentId> environmentId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(WriteSecret other) {
            name(other.getName());
            value(other.getValue());
            environmentId(other.getEnvironmentId());
            spaceId(other.getSpaceId());
            actorId(other.getActorId());
            return this;
        }

        /**
         * <p>The reference name for a secret.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public ValueStage name(@NotNull SecretName name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The secret value. This is hidden in the UI.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(@NotNull SecretValue value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        /**
         * <p>The Actor of the secret.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage actorId(ActorIdUnion actorId) {
            this.actorId = Optional.ofNullable(actorId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "actorId", nulls = Nulls.SKIP)
        public _FinalStage actorId(Optional<ActorIdUnion> actorId) {
            this.actorId = actorId;
            return this;
        }

        /**
         * <p>The Space of the secret.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage spaceId(SpaceId spaceId) {
            this.spaceId = Optional.ofNullable(spaceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public _FinalStage spaceId(Optional<SpaceId> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * <p>The Environment of the secret.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.ofNullable(environmentId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public _FinalStage environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @java.lang.Override
        public WriteSecret build() {
            return new WriteSecret(name, value, environmentId, spaceId, actorId, additionalProperties);
        }
    }
}
