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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MappingRuleBase.Builder.class)
public final class MappingRuleBase implements IMappingRuleBase, IMappingRuleConfig {
    private final String id;

    private final Optional<Double> confidence;

    private final Optional<String> createdBy;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final String name;

    private final MappingRuleType type;

    private final Optional<Object> config;

    private final Map<String, Object> additionalProperties;

    private MappingRuleBase(
            String id,
            Optional<Double> confidence,
            Optional<String> createdBy,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String name,
            MappingRuleType type,
            Optional<Object> config,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.confidence = confidence;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.type = type;
        this.config = config;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ID of the mapping rule
     */
    @JsonProperty("id")
    @Override
    public String getId() {
        return id;
    }

    /**
     * @return Confidence of the mapping rule
     */
    @JsonProperty("confidence")
    @Override
    public Optional<Double> getConfidence() {
        return confidence;
    }

    /**
     * @return User ID of the creator of the mapping rule
     */
    @JsonProperty("createdBy")
    @Override
    public Optional<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * @return Creation time of the mapping rule
     */
    @JsonProperty("createdAt")
    @Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Last update time of the mapping rule
     */
    @JsonProperty("updatedAt")
    @Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
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
    public MappingRuleType getType() {
        return type;
    }

    @JsonProperty("config")
    @Override
    public Optional<Object> getConfig() {
        return config;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MappingRuleBase && equalTo((MappingRuleBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MappingRuleBase other) {
        return id.equals(other.id)
                && confidence.equals(other.confidence)
                && createdBy.equals(other.createdBy)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && name.equals(other.name)
                && type.equals(other.type)
                && config.equals(other.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.confidence,
                this.createdBy,
                this.createdAt,
                this.updatedAt,
                this.name,
                this.type,
                this.config);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        CreatedAtStage id(String id);

        Builder from(MappingRuleBase other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        NameStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface NameStage {
        TypeStage name(String name);
    }

    public interface TypeStage {
        _FinalStage type(MappingRuleType type);
    }

    public interface _FinalStage {
        MappingRuleBase build();

        _FinalStage confidence(Optional<Double> confidence);

        _FinalStage confidence(Double confidence);

        _FinalStage createdBy(Optional<String> createdBy);

        _FinalStage createdBy(String createdBy);

        _FinalStage config(Optional<Object> config);

        _FinalStage config(Object config);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, CreatedAtStage, UpdatedAtStage, NameStage, TypeStage, _FinalStage {
        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String name;

        private MappingRuleType type;

        private Optional<Object> config = Optional.empty();

        private Optional<String> createdBy = Optional.empty();

        private Optional<Double> confidence = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(MappingRuleBase other) {
            id(other.getId());
            confidence(other.getConfidence());
            createdBy(other.getCreatedBy());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            name(other.getName());
            type(other.getType());
            config(other.getConfig());
            return this;
        }

        /**
         * <p>ID of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Creation time of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Last update time of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public NameStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
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
        public _FinalStage type(MappingRuleType type) {
            this.type = type;
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

        /**
         * <p>User ID of the creator of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage createdBy(String createdBy) {
            this.createdBy = Optional.of(createdBy);
            return this;
        }

        @Override
        @JsonSetter(value = "createdBy", nulls = Nulls.SKIP)
        public _FinalStage createdBy(Optional<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>Confidence of the mapping rule</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage confidence(Double confidence) {
            this.confidence = Optional.of(confidence);
            return this;
        }

        @Override
        @JsonSetter(value = "confidence", nulls = Nulls.SKIP)
        public _FinalStage confidence(Optional<Double> confidence) {
            this.confidence = confidence;
            return this;
        }

        @Override
        public MappingRuleBase build() {
            return new MappingRuleBase(
                    id, confidence, createdBy, createdAt, updatedAt, name, type, config, additionalProperties);
        }
    }
}
