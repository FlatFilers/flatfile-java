/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.spaces.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.Action;
import com.flatfile.api.resources.environments.types.GuestAuthenticationEnum;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SpaceConfig.Builder.class)
public final class SpaceConfig implements IInternalSpaceConfigBase {
    private final Optional<String> spaceConfigId;

    private final Optional<String> environmentId;

    private final Optional<String> primaryWorkbookId;

    private final Optional<Object> metadata;

    private final Optional<List<Action>> actions;

    private final Optional<List<SpaceAccess>> access;

    private final Optional<Boolean> autoConfigure;

    private final Optional<String> namespace;

    private final Optional<List<String>> labels;

    private final Optional<String> translationsPath;

    private final Optional<String> languageOverride;

    private final Optional<OffsetDateTime> archivedAt;

    private final Optional<String> name;

    private final Optional<Integer> displayOrder;

    private final Optional<List<GuestAuthenticationEnum>> guestAuthentication;

    private final Map<String, Object> additionalProperties;

    private SpaceConfig(
            Optional<String> spaceConfigId,
            Optional<String> environmentId,
            Optional<String> primaryWorkbookId,
            Optional<Object> metadata,
            Optional<List<Action>> actions,
            Optional<List<SpaceAccess>> access,
            Optional<Boolean> autoConfigure,
            Optional<String> namespace,
            Optional<List<String>> labels,
            Optional<String> translationsPath,
            Optional<String> languageOverride,
            Optional<OffsetDateTime> archivedAt,
            Optional<String> name,
            Optional<Integer> displayOrder,
            Optional<List<GuestAuthenticationEnum>> guestAuthentication,
            Map<String, Object> additionalProperties) {
        this.spaceConfigId = spaceConfigId;
        this.environmentId = environmentId;
        this.primaryWorkbookId = primaryWorkbookId;
        this.metadata = metadata;
        this.actions = actions;
        this.access = access;
        this.autoConfigure = autoConfigure;
        this.namespace = namespace;
        this.labels = labels;
        this.translationsPath = translationsPath;
        this.languageOverride = languageOverride;
        this.archivedAt = archivedAt;
        this.name = name;
        this.displayOrder = displayOrder;
        this.guestAuthentication = guestAuthentication;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("spaceConfigId")
    @Override
    public Optional<String> getSpaceConfigId() {
        return spaceConfigId;
    }

    @JsonProperty("environmentId")
    @Override
    public Optional<String> getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("primaryWorkbookId")
    @Override
    public Optional<String> getPrimaryWorkbookId() {
        return primaryWorkbookId;
    }

    /**
     * @return Metadata for the space
     */
    @JsonProperty("metadata")
    @Override
    public Optional<Object> getMetadata() {
        return metadata;
    }

    @JsonProperty("actions")
    @Override
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @JsonProperty("access")
    @Override
    public Optional<List<SpaceAccess>> getAccess() {
        return access;
    }

    @JsonProperty("autoConfigure")
    @Override
    public Optional<Boolean> getAutoConfigure() {
        return autoConfigure;
    }

    @JsonProperty("namespace")
    @Override
    public Optional<String> getNamespace() {
        return namespace;
    }

    @JsonProperty("labels")
    @Override
    public Optional<List<String>> getLabels() {
        return labels;
    }

    @JsonProperty("translationsPath")
    @Override
    public Optional<String> getTranslationsPath() {
        return translationsPath;
    }

    @JsonProperty("languageOverride")
    @Override
    public Optional<String> getLanguageOverride() {
        return languageOverride;
    }

    /**
     * @return Date when space was archived
     */
    @JsonProperty("archivedAt")
    @Override
    public Optional<OffsetDateTime> getArchivedAt() {
        return archivedAt;
    }

    /**
     * @return The name of the space
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The display order
     */
    @JsonProperty("displayOrder")
    public Optional<Integer> getDisplayOrder() {
        return displayOrder;
    }

    @JsonProperty("guestAuthentication")
    public Optional<List<GuestAuthenticationEnum>> getGuestAuthentication() {
        return guestAuthentication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SpaceConfig && equalTo((SpaceConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SpaceConfig other) {
        return spaceConfigId.equals(other.spaceConfigId)
                && environmentId.equals(other.environmentId)
                && primaryWorkbookId.equals(other.primaryWorkbookId)
                && metadata.equals(other.metadata)
                && actions.equals(other.actions)
                && access.equals(other.access)
                && autoConfigure.equals(other.autoConfigure)
                && namespace.equals(other.namespace)
                && labels.equals(other.labels)
                && translationsPath.equals(other.translationsPath)
                && languageOverride.equals(other.languageOverride)
                && archivedAt.equals(other.archivedAt)
                && name.equals(other.name)
                && displayOrder.equals(other.displayOrder)
                && guestAuthentication.equals(other.guestAuthentication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.spaceConfigId,
                this.environmentId,
                this.primaryWorkbookId,
                this.metadata,
                this.actions,
                this.access,
                this.autoConfigure,
                this.namespace,
                this.labels,
                this.translationsPath,
                this.languageOverride,
                this.archivedAt,
                this.name,
                this.displayOrder,
                this.guestAuthentication);
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
        private Optional<String> spaceConfigId = Optional.empty();

        private Optional<String> environmentId = Optional.empty();

        private Optional<String> primaryWorkbookId = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<List<SpaceAccess>> access = Optional.empty();

        private Optional<Boolean> autoConfigure = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<List<String>> labels = Optional.empty();

        private Optional<String> translationsPath = Optional.empty();

        private Optional<String> languageOverride = Optional.empty();

        private Optional<OffsetDateTime> archivedAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Integer> displayOrder = Optional.empty();

        private Optional<List<GuestAuthenticationEnum>> guestAuthentication = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SpaceConfig other) {
            spaceConfigId(other.getSpaceConfigId());
            environmentId(other.getEnvironmentId());
            primaryWorkbookId(other.getPrimaryWorkbookId());
            metadata(other.getMetadata());
            actions(other.getActions());
            access(other.getAccess());
            autoConfigure(other.getAutoConfigure());
            namespace(other.getNamespace());
            labels(other.getLabels());
            translationsPath(other.getTranslationsPath());
            languageOverride(other.getLanguageOverride());
            archivedAt(other.getArchivedAt());
            name(other.getName());
            displayOrder(other.getDisplayOrder());
            guestAuthentication(other.getGuestAuthentication());
            return this;
        }

        @JsonSetter(value = "spaceConfigId", nulls = Nulls.SKIP)
        public Builder spaceConfigId(Optional<String> spaceConfigId) {
            this.spaceConfigId = spaceConfigId;
            return this;
        }

        public Builder spaceConfigId(String spaceConfigId) {
            this.spaceConfigId = Optional.of(spaceConfigId);
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

        @JsonSetter(value = "primaryWorkbookId", nulls = Nulls.SKIP)
        public Builder primaryWorkbookId(Optional<String> primaryWorkbookId) {
            this.primaryWorkbookId = primaryWorkbookId;
            return this;
        }

        public Builder primaryWorkbookId(String primaryWorkbookId) {
            this.primaryWorkbookId = Optional.of(primaryWorkbookId);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Object metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public Builder actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder actions(List<Action> actions) {
            this.actions = Optional.of(actions);
            return this;
        }

        @JsonSetter(value = "access", nulls = Nulls.SKIP)
        public Builder access(Optional<List<SpaceAccess>> access) {
            this.access = access;
            return this;
        }

        public Builder access(List<SpaceAccess> access) {
            this.access = Optional.of(access);
            return this;
        }

        @JsonSetter(value = "autoConfigure", nulls = Nulls.SKIP)
        public Builder autoConfigure(Optional<Boolean> autoConfigure) {
            this.autoConfigure = autoConfigure;
            return this;
        }

        public Builder autoConfigure(Boolean autoConfigure) {
            this.autoConfigure = Optional.of(autoConfigure);
            return this;
        }

        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public Builder namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Optional.of(namespace);
            return this;
        }

        @JsonSetter(value = "labels", nulls = Nulls.SKIP)
        public Builder labels(Optional<List<String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(List<String> labels) {
            this.labels = Optional.of(labels);
            return this;
        }

        @JsonSetter(value = "translationsPath", nulls = Nulls.SKIP)
        public Builder translationsPath(Optional<String> translationsPath) {
            this.translationsPath = translationsPath;
            return this;
        }

        public Builder translationsPath(String translationsPath) {
            this.translationsPath = Optional.of(translationsPath);
            return this;
        }

        @JsonSetter(value = "languageOverride", nulls = Nulls.SKIP)
        public Builder languageOverride(Optional<String> languageOverride) {
            this.languageOverride = languageOverride;
            return this;
        }

        public Builder languageOverride(String languageOverride) {
            this.languageOverride = Optional.of(languageOverride);
            return this;
        }

        @JsonSetter(value = "archivedAt", nulls = Nulls.SKIP)
        public Builder archivedAt(Optional<OffsetDateTime> archivedAt) {
            this.archivedAt = archivedAt;
            return this;
        }

        public Builder archivedAt(OffsetDateTime archivedAt) {
            this.archivedAt = Optional.of(archivedAt);
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

        @JsonSetter(value = "displayOrder", nulls = Nulls.SKIP)
        public Builder displayOrder(Optional<Integer> displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }

        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = Optional.of(displayOrder);
            return this;
        }

        @JsonSetter(value = "guestAuthentication", nulls = Nulls.SKIP)
        public Builder guestAuthentication(Optional<List<GuestAuthenticationEnum>> guestAuthentication) {
            this.guestAuthentication = guestAuthentication;
            return this;
        }

        public Builder guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication = Optional.of(guestAuthentication);
            return this;
        }

        public SpaceConfig build() {
            return new SpaceConfig(
                    spaceConfigId,
                    environmentId,
                    primaryWorkbookId,
                    metadata,
                    actions,
                    access,
                    autoConfigure,
                    namespace,
                    labels,
                    translationsPath,
                    languageOverride,
                    archivedAt,
                    name,
                    displayOrder,
                    guestAuthentication,
                    additionalProperties);
        }
    }
}