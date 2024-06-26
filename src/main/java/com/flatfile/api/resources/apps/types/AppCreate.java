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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AppCreate.Builder.class)
public final class AppCreate {
    private final String name;

    private final String namespace;

    private final AppType type;

    private final Optional<String> entity;

    private final Optional<String> entityPlural;

    private final Optional<String> icon;

    private final Optional<Object> metadata;

    private final Optional<Object> environmentFilters;

    private final Map<String, Object> additionalProperties;

    private AppCreate(
            String name,
            String namespace,
            AppType type,
            Optional<String> entity,
            Optional<String> entityPlural,
            Optional<String> icon,
            Optional<Object> metadata,
            Optional<Object> environmentFilters,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.namespace = namespace;
        this.type = type;
        this.entity = entity;
        this.entityPlural = entityPlural;
        this.icon = icon;
        this.metadata = metadata;
        this.environmentFilters = environmentFilters;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty("type")
    public AppType getType() {
        return type;
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AppCreate && equalTo((AppCreate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AppCreate other) {
        return name.equals(other.name)
                && namespace.equals(other.namespace)
                && type.equals(other.type)
                && entity.equals(other.entity)
                && entityPlural.equals(other.entityPlural)
                && icon.equals(other.icon)
                && metadata.equals(other.metadata)
                && environmentFilters.equals(other.environmentFilters);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.namespace,
                this.type,
                this.entity,
                this.entityPlural,
                this.icon,
                this.metadata,
                this.environmentFilters);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        NamespaceStage name(String name);

        Builder from(AppCreate other);
    }

    public interface NamespaceStage {
        TypeStage namespace(String namespace);
    }

    public interface TypeStage {
        _FinalStage type(AppType type);
    }

    public interface _FinalStage {
        AppCreate build();

        _FinalStage entity(Optional<String> entity);

        _FinalStage entity(String entity);

        _FinalStage entityPlural(Optional<String> entityPlural);

        _FinalStage entityPlural(String entityPlural);

        _FinalStage icon(Optional<String> icon);

        _FinalStage icon(String icon);

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage environmentFilters(Optional<Object> environmentFilters);

        _FinalStage environmentFilters(Object environmentFilters);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, NamespaceStage, TypeStage, _FinalStage {
        private String name;

        private String namespace;

        private AppType type;

        private Optional<Object> environmentFilters = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<String> icon = Optional.empty();

        private Optional<String> entityPlural = Optional.empty();

        private Optional<String> entity = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AppCreate other) {
            name(other.getName());
            namespace(other.getNamespace());
            type(other.getType());
            entity(other.getEntity());
            entityPlural(other.getEntityPlural());
            icon(other.getIcon());
            metadata(other.getMetadata());
            environmentFilters(other.getEnvironmentFilters());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public NamespaceStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("namespace")
        public TypeStage namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public _FinalStage type(AppType type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        public _FinalStage environmentFilters(Object environmentFilters) {
            this.environmentFilters = Optional.of(environmentFilters);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "environmentFilters", nulls = Nulls.SKIP)
        public _FinalStage environmentFilters(Optional<Object> environmentFilters) {
            this.environmentFilters = environmentFilters;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Object metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage icon(String icon) {
            this.icon = Optional.of(icon);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "icon", nulls = Nulls.SKIP)
        public _FinalStage icon(Optional<String> icon) {
            this.icon = icon;
            return this;
        }

        @java.lang.Override
        public _FinalStage entityPlural(String entityPlural) {
            this.entityPlural = Optional.of(entityPlural);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "entityPlural", nulls = Nulls.SKIP)
        public _FinalStage entityPlural(Optional<String> entityPlural) {
            this.entityPlural = entityPlural;
            return this;
        }

        @java.lang.Override
        public _FinalStage entity(String entity) {
            this.entity = Optional.of(entity);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "entity", nulls = Nulls.SKIP)
        public _FinalStage entity(Optional<String> entity) {
            this.entity = entity;
            return this;
        }

        @java.lang.Override
        public AppCreate build() {
            return new AppCreate(
                    name,
                    namespace,
                    type,
                    entity,
                    entityPlural,
                    icon,
                    metadata,
                    environmentFilters,
                    additionalProperties);
        }
    }
}
