/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.MappingId;
import com.flatfile.api.resources.commons.types.UserId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MappingRuleOrConfig.Builder.class)
public final class MappingRuleOrConfig implements IMappingRuleConfig {
    private final String name;

    private final String type;

    private final Optional<Object> config;

    private final Optional<Integer> confidence;

    private final Optional<UserId> contributor;

    private final Optional<MappingId> id;

    private final Optional<UserId> createdBy;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> updatedAt;

    private final Optional<OffsetDateTime> deletedAt;

    private final Map<String, Object> additionalProperties;

    private MappingRuleOrConfig(
            String name,
            String type,
            Optional<Object> config,
            Optional<Integer> confidence,
            Optional<UserId> contributor,
            Optional<MappingId> id,
            Optional<UserId> createdBy,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> updatedAt,
            Optional<OffsetDateTime> deletedAt,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.type = type;
        this.config = config;
        this.confidence = confidence;
        this.contributor = contributor;
        this.id = id;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Name of the mapping rule
     */
    @JsonProperty("name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty("type")
    @Override
    public String getType() {
        return type;
    }

    @JsonProperty("config")
    @Override
    public Optional<Object> getConfig() {
        return config;
    }

    /**
     * @return Confidence of the mapping rule
     */
    @JsonProperty("confidence")
    @Override
    public Optional<Integer> getConfidence() {
        return confidence;
    }

    /**
     * @return User ID of the contributor of the mapping rule
     */
    @JsonProperty("contributor")
    @Override
    public Optional<UserId> getContributor() {
        return contributor;
    }

    /**
     * @return ID of the mapping rule
     */
    @JsonProperty("id")
    public Optional<MappingId> getId() {
        return id;
    }

    /**
     * @return User ID of the creator of the mapping rule
     */
    @JsonProperty("createdBy")
    public Optional<UserId> getCreatedBy() {
        return createdBy;
    }

    /**
     * @return Time the mapping rule was created
     */
    @JsonProperty("createdAt")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Time the mapping rule was last updated
     */
    @JsonProperty("updatedAt")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Time the mapping rule was deleted
     */
    @JsonProperty("deletedAt")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MappingRuleOrConfig && equalTo((MappingRuleOrConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MappingRuleOrConfig other) {
        return name.equals(other.name)
                && type.equals(other.type)
                && config.equals(other.config)
                && confidence.equals(other.confidence)
                && contributor.equals(other.contributor)
                && id.equals(other.id)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && deletedAt.equals(other.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.type,
                this.config,
                this.confidence,
                this.contributor,
                this.id,
                this.createdBy,
                this.createdAt,
                this.updatedAt,
                this.deletedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        TypeStage name(String name);

        Builder from(MappingRuleOrConfig other);
    }

    public interface TypeStage {
        _FinalStage type(String type);
    }

    public interface _FinalStage {
        MappingRuleOrConfig build();

        _FinalStage config(Optional<Object> config);

        _FinalStage config(Object config);

        _FinalStage confidence(Optional<Integer> confidence);

        _FinalStage confidence(Integer confidence);

        _FinalStage contributor(Optional<UserId> contributor);

        _FinalStage contributor(UserId contributor);

        _FinalStage id(Optional<MappingId> id);

        _FinalStage id(MappingId id);

        _FinalStage createdBy(Optional<UserId> createdBy);

        _FinalStage createdBy(UserId createdBy);

        _FinalStage createdAt(Optional<OffsetDateTime> createdAt);

        _FinalStage createdAt(OffsetDateTime createdAt);

        _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt);

        _FinalStage updatedAt(OffsetDateTime updatedAt);

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, TypeStage, _FinalStage {
        private String name;

        private String type;

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<UserId> createdBy = Optional.empty();

        private Optional<MappingId> id = Optional.empty();

        private Optional<UserId> contributor = Optional.empty();

        private Optional<Integer> confidence = Optional.empty();

        private Optional<Object> config = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(MappingRuleOrConfig other) {
            name(other.getName());
            type(other.getType());
            config(other.getConfig());
            confidence(other.getConfidence());
            contributor(other.getContributor());
            id(other.getId());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            deletedAt(other.getDeletedAt());
            return this;
        }

        /**
         * <p>Name of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public TypeStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("type")
        public _FinalStage type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>Time the mapping rule was deleted</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage deletedAt(OffsetDateTime deletedAt) {
            this.deletedAt = Optional.of(deletedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "deletedAt", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * <p>Time the mapping rule was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Optional.of(updatedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "updatedAt", nulls = Nulls.SKIP)
        public _FinalStage updatedAt(Optional<OffsetDateTime> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Time the mapping rule was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @Override
        @JsonSetter(value = "createdAt", nulls = Nulls.SKIP)
        public _FinalStage createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>User ID of the creator of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage createdBy(UserId createdBy) {
            this.createdBy = Optional.of(createdBy);
            return this;
        }

        @Override
        @JsonSetter(value = "createdBy", nulls = Nulls.SKIP)
        public _FinalStage createdBy(Optional<UserId> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>ID of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage id(MappingId id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<MappingId> id) {
            this.id = id;
            return this;
        }

        /**
         * <p>User ID of the contributor of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage contributor(UserId contributor) {
            this.contributor = Optional.of(contributor);
            return this;
        }

        @Override
        @JsonSetter(value = "contributor", nulls = Nulls.SKIP)
        public _FinalStage contributor(Optional<UserId> contributor) {
            this.contributor = contributor;
            return this;
        }

        /**
         * <p>Confidence of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage confidence(Integer confidence) {
            this.confidence = Optional.of(confidence);
            return this;
        }

        @Override
        @JsonSetter(value = "confidence", nulls = Nulls.SKIP)
        public _FinalStage confidence(Optional<Integer> confidence) {
            this.confidence = confidence;
            return this;
        }

        @Override
        public _FinalStage config(Object config) {
            this.config = Optional.of(config);
            return this;
        }

        @Override
        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public _FinalStage config(Optional<Object> config) {
            this.config = config;
            return this;
        }

        @Override
        public MappingRuleOrConfig build() {
            return new MappingRuleOrConfig(
                    name,
                    type,
                    config,
                    confidence,
                    contributor,
                    id,
                    createdBy,
                    createdAt,
                    updatedAt,
                    deletedAt,
                    additionalProperties);
        }
    }
}
