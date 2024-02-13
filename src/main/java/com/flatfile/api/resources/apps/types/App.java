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
import com.flatfile.api.resources.commons.types.AppId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = App.Builder.class)
public final class App {
    private final AppId id;

    private final String name;

    private final String namespace;

    private final AppType type;

    private final String entity;

    private final String entityPlural;

    private final Optional<String> icon;

    private final Object metadata;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<OffsetDateTime> deletedAt;

    private final Optional<OffsetDateTime> activatedAt;

    private final Map<String, Object> additionalProperties;

    private App(
            AppId id,
            String name,
            String namespace,
            AppType type,
            String entity,
            String entityPlural,
            Optional<String> icon,
            Object metadata,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<OffsetDateTime> deletedAt,
            Optional<OffsetDateTime> activatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.namespace = namespace;
        this.type = type;
        this.entity = entity;
        this.entityPlural = entityPlural;
        this.icon = icon;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.activatedAt = activatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public AppId getId() {
        return id;
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
    public String getEntity() {
        return entity;
    }

    @JsonProperty("entityPlural")
    public String getEntityPlural() {
        return entityPlural;
    }

    @JsonProperty("icon")
    public Optional<String> getIcon() {
        return icon;
    }

    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("deletedAt")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("activatedAt")
    public Optional<OffsetDateTime> getActivatedAt() {
        return activatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof App && equalTo((App) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(App other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && namespace.equals(other.namespace)
                && type.equals(other.type)
                && entity.equals(other.entity)
                && entityPlural.equals(other.entityPlural)
                && icon.equals(other.icon)
                && metadata.equals(other.metadata)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && deletedAt.equals(other.deletedAt)
                && activatedAt.equals(other.activatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.namespace,
                this.type,
                this.entity,
                this.entityPlural,
                this.icon,
                this.metadata,
                this.createdAt,
                this.updatedAt,
                this.deletedAt,
                this.activatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(AppId id);

        Builder from(App other);
    }

    public interface NameStage {
        NamespaceStage name(String name);
    }

    public interface NamespaceStage {
        TypeStage namespace(String namespace);
    }

    public interface TypeStage {
        EntityStage type(AppType type);
    }

    public interface EntityStage {
        EntityPluralStage entity(String entity);
    }

    public interface EntityPluralStage {
        MetadataStage entityPlural(String entityPlural);
    }

    public interface MetadataStage {
        CreatedAtStage metadata(Object metadata);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        App build();

        _FinalStage icon(Optional<String> icon);

        _FinalStage icon(String icon);

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);

        _FinalStage activatedAt(Optional<OffsetDateTime> activatedAt);

        _FinalStage activatedAt(OffsetDateTime activatedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    NameStage,
                    NamespaceStage,
                    TypeStage,
                    EntityStage,
                    EntityPluralStage,
                    MetadataStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    _FinalStage {
        private AppId id;

        private String name;

        private String namespace;

        private AppType type;

        private String entity;

        private String entityPlural;

        private Object metadata;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<OffsetDateTime> activatedAt = Optional.empty();

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Optional<String> icon = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(App other) {
            id(other.getId());
            name(other.getName());
            namespace(other.getNamespace());
            type(other.getType());
            entity(other.getEntity());
            entityPlural(other.getEntityPlural());
            icon(other.getIcon());
            metadata(other.getMetadata());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            deletedAt(other.getDeletedAt());
            activatedAt(other.getActivatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(AppId id) {
            this.id = id;
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
        public EntityStage type(AppType type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        @JsonSetter("entity")
        public EntityPluralStage entity(String entity) {
            this.entity = entity;
            return this;
        }

        @java.lang.Override
        @JsonSetter("entityPlural")
        public MetadataStage entityPlural(String entityPlural) {
            this.entityPlural = entityPlural;
            return this;
        }

        @java.lang.Override
        @JsonSetter("metadata")
        public CreatedAtStage metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage activatedAt(OffsetDateTime activatedAt) {
            this.activatedAt = Optional.of(activatedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "activatedAt", nulls = Nulls.SKIP)
        public _FinalStage activatedAt(Optional<OffsetDateTime> activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage deletedAt(OffsetDateTime deletedAt) {
            this.deletedAt = Optional.of(deletedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "deletedAt", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt) {
            this.deletedAt = deletedAt;
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
        public App build() {
            return new App(
                    id,
                    name,
                    namespace,
                    type,
                    entity,
                    entityPlural,
                    icon,
                    metadata,
                    createdAt,
                    updatedAt,
                    deletedAt,
                    activatedAt,
                    additionalProperties);
        }
    }
}
