/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.apps.types;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AppPatch.Builder.class)
public final class AppPatch {
    private final Optional<String> name;

    private final Optional<String> namespace;

    private final Optional<String> entity;

    private final Optional<String> entityPlural;

    private final Optional<String> icon;

    private final Optional<Object> metadata;

    private final Optional<Object> environmentFilters;

    private final Optional<Object> blueprint;

    private final Optional<OffsetDateTime> activatedAt;

    private final Map<String, Object> additionalProperties;

    private AppPatch(
            Optional<String> name,
            Optional<String> namespace,
            Optional<String> entity,
            Optional<String> entityPlural,
            Optional<String> icon,
            Optional<Object> metadata,
            Optional<Object> environmentFilters,
            Optional<Object> blueprint,
            Optional<OffsetDateTime> activatedAt,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.namespace = namespace;
        this.entity = entity;
        this.entityPlural = entityPlural;
        this.icon = icon;
        this.metadata = metadata;
        this.environmentFilters = environmentFilters;
        this.blueprint = blueprint;
        this.activatedAt = activatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    @JsonProperty("entity")
    public Optional<String> getEntity() {
        return entity;
    }

    @JsonProperty("entityPlural")
    public Optional<String> getEntityPlural() {
        return entityPlural;
    }

    @JsonProperty("icon")
    public Optional<String> getIcon() {
        return icon;
    }

    @JsonProperty("metadata")
    public Optional<Object> getMetadata() {
        return metadata;
    }

    @JsonProperty("environmentFilters")
    public Optional<Object> getEnvironmentFilters() {
        return environmentFilters;
    }

    @JsonProperty("blueprint")
    public Optional<Object> getBlueprint() {
        return blueprint;
    }

    @JsonProperty("activatedAt")
    public Optional<OffsetDateTime> getActivatedAt() {
        return activatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppPatch && equalTo((AppPatch) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AppPatch other) {
        return name.equals(other.name)
                && namespace.equals(other.namespace)
                && entity.equals(other.entity)
                && entityPlural.equals(other.entityPlural)
                && icon.equals(other.icon)
                && metadata.equals(other.metadata)
                && environmentFilters.equals(other.environmentFilters)
                && blueprint.equals(other.blueprint)
                && activatedAt.equals(other.activatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.namespace,
                this.entity,
                this.entityPlural,
                this.icon,
                this.metadata,
                this.environmentFilters,
                this.blueprint,
                this.activatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<String> entity = Optional.empty();

        private Optional<String> entityPlural = Optional.empty();

        private Optional<String> icon = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<Object> environmentFilters = Optional.empty();

        private Optional<Object> blueprint = Optional.empty();

        private Optional<OffsetDateTime> activatedAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AppPatch other) {
            name(other.getName());
            namespace(other.getNamespace());
            entity(other.getEntity());
            entityPlural(other.getEntityPlural());
            icon(other.getIcon());
            metadata(other.getMetadata());
            environmentFilters(other.getEnvironmentFilters());
            blueprint(other.getBlueprint());
            activatedAt(other.getActivatedAt());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public Builder namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        @JsonSetter(value = "entity", nulls = Nulls.SKIP)
        public Builder entity(Optional<String> entity) {
            this.entity = entity;
            return this;
        }

        public Builder entity(String entity) {
            this.entity = Optional.ofNullable(entity);
            return this;
        }

        @JsonSetter(value = "entityPlural", nulls = Nulls.SKIP)
        public Builder entityPlural(Optional<String> entityPlural) {
            this.entityPlural = entityPlural;
            return this;
        }

        public Builder entityPlural(String entityPlural) {
            this.entityPlural = Optional.ofNullable(entityPlural);
            return this;
        }

        @JsonSetter(value = "icon", nulls = Nulls.SKIP)
        public Builder icon(Optional<String> icon) {
            this.icon = icon;
            return this;
        }

        public Builder icon(String icon) {
            this.icon = Optional.ofNullable(icon);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Object metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "environmentFilters", nulls = Nulls.SKIP)
        public Builder environmentFilters(Optional<Object> environmentFilters) {
            this.environmentFilters = environmentFilters;
            return this;
        }

        public Builder environmentFilters(Object environmentFilters) {
            this.environmentFilters = Optional.ofNullable(environmentFilters);
            return this;
        }

        @JsonSetter(value = "blueprint", nulls = Nulls.SKIP)
        public Builder blueprint(Optional<Object> blueprint) {
            this.blueprint = blueprint;
            return this;
        }

        public Builder blueprint(Object blueprint) {
            this.blueprint = Optional.ofNullable(blueprint);
            return this;
        }

        @JsonSetter(value = "activatedAt", nulls = Nulls.SKIP)
        public Builder activatedAt(Optional<OffsetDateTime> activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }

        public Builder activatedAt(OffsetDateTime activatedAt) {
            this.activatedAt = Optional.ofNullable(activatedAt);
            return this;
        }

        public AppPatch build() {
            return new AppPatch(
                    name,
                    namespace,
                    entity,
                    entityPlural,
                    icon,
                    metadata,
                    environmentFilters,
                    blueprint,
                    activatedAt,
                    additionalProperties);
        }
    }
}
