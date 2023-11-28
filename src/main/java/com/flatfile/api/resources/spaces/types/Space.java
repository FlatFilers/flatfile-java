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
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.SpaceConfigId;
import com.flatfile.api.resources.commons.types.SpaceId;
import com.flatfile.api.resources.commons.types.UserId;
import com.flatfile.api.resources.commons.types.WorkbookId;
import com.flatfile.api.resources.environments.types.GuestAuthenticationEnum;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Space.Builder.class)
public final class Space implements IInternalSpaceConfigBase {
    private final Optional<SpaceConfigId> spaceConfigId;

    private final Optional<EnvironmentId> environmentId;

    private final Optional<WorkbookId> primaryWorkbookId;

    private final Optional<Object> metadata;

    private final Optional<List<Action>> actions;

    private final Optional<List<SpaceAccess>> access;

    private final Optional<Boolean> autoConfigure;

    private final Optional<String> namespace;

    private final Optional<List<String>> labels;

    private final Optional<String> translationsPath;

    private final Optional<String> languageOverride;

    private final Optional<OffsetDateTime> archivedAt;

    private final SpaceId id;

    private final Optional<Integer> workbooksCount;

    private final Optional<Integer> filesCount;

    private final Optional<UserId> createdByUserId;

    private final Optional<String> createdByUserName;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<String> guestLink;

    private final String name;

    private final Optional<Integer> displayOrder;

    private final Optional<String> accessToken;

    private final Optional<Boolean> isCollaborative;

    private final Optional<SpaceSize> size;

    private final Optional<OffsetDateTime> upgradedAt;

    private final List<GuestAuthenticationEnum> guestAuthentication;

    private final Map<String, Object> additionalProperties;

    private Space(
            Optional<SpaceConfigId> spaceConfigId,
            Optional<EnvironmentId> environmentId,
            Optional<WorkbookId> primaryWorkbookId,
            Optional<Object> metadata,
            Optional<List<Action>> actions,
            Optional<List<SpaceAccess>> access,
            Optional<Boolean> autoConfigure,
            Optional<String> namespace,
            Optional<List<String>> labels,
            Optional<String> translationsPath,
            Optional<String> languageOverride,
            Optional<OffsetDateTime> archivedAt,
            SpaceId id,
            Optional<Integer> workbooksCount,
            Optional<Integer> filesCount,
            Optional<UserId> createdByUserId,
            Optional<String> createdByUserName,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<String> guestLink,
            String name,
            Optional<Integer> displayOrder,
            Optional<String> accessToken,
            Optional<Boolean> isCollaborative,
            Optional<SpaceSize> size,
            Optional<OffsetDateTime> upgradedAt,
            List<GuestAuthenticationEnum> guestAuthentication,
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
        this.id = id;
        this.workbooksCount = workbooksCount;
        this.filesCount = filesCount;
        this.createdByUserId = createdByUserId;
        this.createdByUserName = createdByUserName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.guestLink = guestLink;
        this.name = name;
        this.displayOrder = displayOrder;
        this.accessToken = accessToken;
        this.isCollaborative = isCollaborative;
        this.size = size;
        this.upgradedAt = upgradedAt;
        this.guestAuthentication = guestAuthentication;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("spaceConfigId")
    @Override
    public Optional<SpaceConfigId> getSpaceConfigId() {
        return spaceConfigId;
    }

    @JsonProperty("environmentId")
    @Override
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("primaryWorkbookId")
    @Override
    public Optional<WorkbookId> getPrimaryWorkbookId() {
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

    @JsonProperty("id")
    public SpaceId getId() {
        return id;
    }

    /**
     * @return Amount of workbooks in the space
     */
    @JsonProperty("workbooksCount")
    public Optional<Integer> getWorkbooksCount() {
        return workbooksCount;
    }

    /**
     * @return Amount of files in the space
     */
    @JsonProperty("filesCount")
    public Optional<Integer> getFilesCount() {
        return filesCount;
    }

    @JsonProperty("createdByUserId")
    public Optional<UserId> getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * @return User name who created space
     */
    @JsonProperty("createdByUserName")
    public Optional<String> getCreatedByUserName() {
        return createdByUserName;
    }

    /**
     * @return Date when space was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Date when space was updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Guest link to the space
     */
    @JsonProperty("guestLink")
    public Optional<String> getGuestLink() {
        return guestLink;
    }

    /**
     * @return The name of the space
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The display order
     */
    @JsonProperty("displayOrder")
    public Optional<Integer> getDisplayOrder() {
        return displayOrder;
    }

    @JsonProperty("accessToken")
    public Optional<String> getAccessToken() {
        return accessToken;
    }

    @JsonProperty("isCollaborative")
    public Optional<Boolean> getIsCollaborative() {
        return isCollaborative;
    }

    @JsonProperty("size")
    public Optional<SpaceSize> getSize() {
        return size;
    }

    @JsonProperty("upgradedAt")
    public Optional<OffsetDateTime> getUpgradedAt() {
        return upgradedAt;
    }

    @JsonProperty("guestAuthentication")
    public List<GuestAuthenticationEnum> getGuestAuthentication() {
        return guestAuthentication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Space && equalTo((Space) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Space other) {
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
                && id.equals(other.id)
                && workbooksCount.equals(other.workbooksCount)
                && filesCount.equals(other.filesCount)
                && createdByUserId.equals(other.createdByUserId)
                && createdByUserName.equals(other.createdByUserName)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && guestLink.equals(other.guestLink)
                && name.equals(other.name)
                && displayOrder.equals(other.displayOrder)
                && accessToken.equals(other.accessToken)
                && isCollaborative.equals(other.isCollaborative)
                && size.equals(other.size)
                && upgradedAt.equals(other.upgradedAt)
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
                this.id,
                this.workbooksCount,
                this.filesCount,
                this.createdByUserId,
                this.createdByUserName,
                this.createdAt,
                this.updatedAt,
                this.guestLink,
                this.name,
                this.displayOrder,
                this.accessToken,
                this.isCollaborative,
                this.size,
                this.upgradedAt,
                this.guestAuthentication);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        CreatedAtStage id(SpaceId id);

        Builder from(Space other);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        NameStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        Space build();

        _FinalStage spaceConfigId(Optional<SpaceConfigId> spaceConfigId);

        _FinalStage spaceConfigId(SpaceConfigId spaceConfigId);

        _FinalStage environmentId(Optional<EnvironmentId> environmentId);

        _FinalStage environmentId(EnvironmentId environmentId);

        _FinalStage primaryWorkbookId(Optional<WorkbookId> primaryWorkbookId);

        _FinalStage primaryWorkbookId(WorkbookId primaryWorkbookId);

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);

        _FinalStage access(Optional<List<SpaceAccess>> access);

        _FinalStage access(List<SpaceAccess> access);

        _FinalStage autoConfigure(Optional<Boolean> autoConfigure);

        _FinalStage autoConfigure(Boolean autoConfigure);

        _FinalStage namespace(Optional<String> namespace);

        _FinalStage namespace(String namespace);

        _FinalStage labels(Optional<List<String>> labels);

        _FinalStage labels(List<String> labels);

        _FinalStage translationsPath(Optional<String> translationsPath);

        _FinalStage translationsPath(String translationsPath);

        _FinalStage languageOverride(Optional<String> languageOverride);

        _FinalStage languageOverride(String languageOverride);

        _FinalStage archivedAt(Optional<OffsetDateTime> archivedAt);

        _FinalStage archivedAt(OffsetDateTime archivedAt);

        _FinalStage workbooksCount(Optional<Integer> workbooksCount);

        _FinalStage workbooksCount(Integer workbooksCount);

        _FinalStage filesCount(Optional<Integer> filesCount);

        _FinalStage filesCount(Integer filesCount);

        _FinalStage createdByUserId(Optional<UserId> createdByUserId);

        _FinalStage createdByUserId(UserId createdByUserId);

        _FinalStage createdByUserName(Optional<String> createdByUserName);

        _FinalStage createdByUserName(String createdByUserName);

        _FinalStage guestLink(Optional<String> guestLink);

        _FinalStage guestLink(String guestLink);

        _FinalStage displayOrder(Optional<Integer> displayOrder);

        _FinalStage displayOrder(Integer displayOrder);

        _FinalStage accessToken(Optional<String> accessToken);

        _FinalStage accessToken(String accessToken);

        _FinalStage isCollaborative(Optional<Boolean> isCollaborative);

        _FinalStage isCollaborative(Boolean isCollaborative);

        _FinalStage size(Optional<SpaceSize> size);

        _FinalStage size(SpaceSize size);

        _FinalStage upgradedAt(Optional<OffsetDateTime> upgradedAt);

        _FinalStage upgradedAt(OffsetDateTime upgradedAt);

        _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication);

        _FinalStage addGuestAuthentication(GuestAuthenticationEnum guestAuthentication);

        _FinalStage addAllGuestAuthentication(List<GuestAuthenticationEnum> guestAuthentication);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, CreatedAtStage, UpdatedAtStage, NameStage, _FinalStage {
        private SpaceId id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String name;

        private List<GuestAuthenticationEnum> guestAuthentication = new ArrayList<>();

        private Optional<OffsetDateTime> upgradedAt = Optional.empty();

        private Optional<SpaceSize> size = Optional.empty();

        private Optional<Boolean> isCollaborative = Optional.empty();

        private Optional<String> accessToken = Optional.empty();

        private Optional<Integer> displayOrder = Optional.empty();

        private Optional<String> guestLink = Optional.empty();

        private Optional<String> createdByUserName = Optional.empty();

        private Optional<UserId> createdByUserId = Optional.empty();

        private Optional<Integer> filesCount = Optional.empty();

        private Optional<Integer> workbooksCount = Optional.empty();

        private Optional<OffsetDateTime> archivedAt = Optional.empty();

        private Optional<String> languageOverride = Optional.empty();

        private Optional<String> translationsPath = Optional.empty();

        private Optional<List<String>> labels = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<Boolean> autoConfigure = Optional.empty();

        private Optional<List<SpaceAccess>> access = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<WorkbookId> primaryWorkbookId = Optional.empty();

        private Optional<EnvironmentId> environmentId = Optional.empty();

        private Optional<SpaceConfigId> spaceConfigId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Space other) {
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
            id(other.getId());
            workbooksCount(other.getWorkbooksCount());
            filesCount(other.getFilesCount());
            createdByUserId(other.getCreatedByUserId());
            createdByUserName(other.getCreatedByUserName());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            guestLink(other.getGuestLink());
            name(other.getName());
            displayOrder(other.getDisplayOrder());
            accessToken(other.getAccessToken());
            isCollaborative(other.getIsCollaborative());
            size(other.getSize());
            upgradedAt(other.getUpgradedAt());
            guestAuthentication(other.getGuestAuthentication());
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(SpaceId id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date when space was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Date when space was updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public NameStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The name of the space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage addAllGuestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication.addAll(guestAuthentication);
            return this;
        }

        @Override
        public _FinalStage addGuestAuthentication(GuestAuthenticationEnum guestAuthentication) {
            this.guestAuthentication.add(guestAuthentication);
            return this;
        }

        @Override
        @JsonSetter(value = "guestAuthentication", nulls = Nulls.SKIP)
        public _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication.clear();
            this.guestAuthentication.addAll(guestAuthentication);
            return this;
        }

        @Override
        public _FinalStage upgradedAt(OffsetDateTime upgradedAt) {
            this.upgradedAt = Optional.of(upgradedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "upgradedAt", nulls = Nulls.SKIP)
        public _FinalStage upgradedAt(Optional<OffsetDateTime> upgradedAt) {
            this.upgradedAt = upgradedAt;
            return this;
        }

        @Override
        public _FinalStage size(SpaceSize size) {
            this.size = Optional.of(size);
            return this;
        }

        @Override
        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public _FinalStage size(Optional<SpaceSize> size) {
            this.size = size;
            return this;
        }

        @Override
        public _FinalStage isCollaborative(Boolean isCollaborative) {
            this.isCollaborative = Optional.of(isCollaborative);
            return this;
        }

        @Override
        @JsonSetter(value = "isCollaborative", nulls = Nulls.SKIP)
        public _FinalStage isCollaborative(Optional<Boolean> isCollaborative) {
            this.isCollaborative = isCollaborative;
            return this;
        }

        @Override
        public _FinalStage accessToken(String accessToken) {
            this.accessToken = Optional.of(accessToken);
            return this;
        }

        @Override
        @JsonSetter(value = "accessToken", nulls = Nulls.SKIP)
        public _FinalStage accessToken(Optional<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The display order</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage displayOrder(Integer displayOrder) {
            this.displayOrder = Optional.of(displayOrder);
            return this;
        }

        @Override
        @JsonSetter(value = "displayOrder", nulls = Nulls.SKIP)
        public _FinalStage displayOrder(Optional<Integer> displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }

        /**
         * <p>Guest link to the space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage guestLink(String guestLink) {
            this.guestLink = Optional.of(guestLink);
            return this;
        }

        @Override
        @JsonSetter(value = "guestLink", nulls = Nulls.SKIP)
        public _FinalStage guestLink(Optional<String> guestLink) {
            this.guestLink = guestLink;
            return this;
        }

        /**
         * <p>User name who created space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage createdByUserName(String createdByUserName) {
            this.createdByUserName = Optional.of(createdByUserName);
            return this;
        }

        @Override
        @JsonSetter(value = "createdByUserName", nulls = Nulls.SKIP)
        public _FinalStage createdByUserName(Optional<String> createdByUserName) {
            this.createdByUserName = createdByUserName;
            return this;
        }

        @Override
        public _FinalStage createdByUserId(UserId createdByUserId) {
            this.createdByUserId = Optional.of(createdByUserId);
            return this;
        }

        @Override
        @JsonSetter(value = "createdByUserId", nulls = Nulls.SKIP)
        public _FinalStage createdByUserId(Optional<UserId> createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * <p>Amount of files in the space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage filesCount(Integer filesCount) {
            this.filesCount = Optional.of(filesCount);
            return this;
        }

        @Override
        @JsonSetter(value = "filesCount", nulls = Nulls.SKIP)
        public _FinalStage filesCount(Optional<Integer> filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        /**
         * <p>Amount of workbooks in the space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage workbooksCount(Integer workbooksCount) {
            this.workbooksCount = Optional.of(workbooksCount);
            return this;
        }

        @Override
        @JsonSetter(value = "workbooksCount", nulls = Nulls.SKIP)
        public _FinalStage workbooksCount(Optional<Integer> workbooksCount) {
            this.workbooksCount = workbooksCount;
            return this;
        }

        /**
         * <p>Date when space was archived</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage archivedAt(OffsetDateTime archivedAt) {
            this.archivedAt = Optional.of(archivedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "archivedAt", nulls = Nulls.SKIP)
        public _FinalStage archivedAt(Optional<OffsetDateTime> archivedAt) {
            this.archivedAt = archivedAt;
            return this;
        }

        @Override
        public _FinalStage languageOverride(String languageOverride) {
            this.languageOverride = Optional.of(languageOverride);
            return this;
        }

        @Override
        @JsonSetter(value = "languageOverride", nulls = Nulls.SKIP)
        public _FinalStage languageOverride(Optional<String> languageOverride) {
            this.languageOverride = languageOverride;
            return this;
        }

        @Override
        public _FinalStage translationsPath(String translationsPath) {
            this.translationsPath = Optional.of(translationsPath);
            return this;
        }

        @Override
        @JsonSetter(value = "translationsPath", nulls = Nulls.SKIP)
        public _FinalStage translationsPath(Optional<String> translationsPath) {
            this.translationsPath = translationsPath;
            return this;
        }

        @Override
        public _FinalStage labels(List<String> labels) {
            this.labels = Optional.of(labels);
            return this;
        }

        @Override
        @JsonSetter(value = "labels", nulls = Nulls.SKIP)
        public _FinalStage labels(Optional<List<String>> labels) {
            this.labels = labels;
            return this;
        }

        @Override
        public _FinalStage namespace(String namespace) {
            this.namespace = Optional.of(namespace);
            return this;
        }

        @Override
        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public _FinalStage namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        @Override
        public _FinalStage autoConfigure(Boolean autoConfigure) {
            this.autoConfigure = Optional.of(autoConfigure);
            return this;
        }

        @Override
        @JsonSetter(value = "autoConfigure", nulls = Nulls.SKIP)
        public _FinalStage autoConfigure(Optional<Boolean> autoConfigure) {
            this.autoConfigure = autoConfigure;
            return this;
        }

        @Override
        public _FinalStage access(List<SpaceAccess> access) {
            this.access = Optional.of(access);
            return this;
        }

        @Override
        @JsonSetter(value = "access", nulls = Nulls.SKIP)
        public _FinalStage access(Optional<List<SpaceAccess>> access) {
            this.access = access;
            return this;
        }

        @Override
        public _FinalStage actions(List<Action> actions) {
            this.actions = Optional.of(actions);
            return this;
        }

        @Override
        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public _FinalStage actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>Metadata for the space</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage metadata(Object metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        public _FinalStage primaryWorkbookId(WorkbookId primaryWorkbookId) {
            this.primaryWorkbookId = Optional.of(primaryWorkbookId);
            return this;
        }

        @Override
        @JsonSetter(value = "primaryWorkbookId", nulls = Nulls.SKIP)
        public _FinalStage primaryWorkbookId(Optional<WorkbookId> primaryWorkbookId) {
            this.primaryWorkbookId = primaryWorkbookId;
            return this;
        }

        @Override
        public _FinalStage environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.of(environmentId);
            return this;
        }

        @Override
        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public _FinalStage environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public _FinalStage spaceConfigId(SpaceConfigId spaceConfigId) {
            this.spaceConfigId = Optional.of(spaceConfigId);
            return this;
        }

        @Override
        @JsonSetter(value = "spaceConfigId", nulls = Nulls.SKIP)
        public _FinalStage spaceConfigId(Optional<SpaceConfigId> spaceConfigId) {
            this.spaceConfigId = spaceConfigId;
            return this;
        }

        @Override
        public Space build() {
            return new Space(
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
                    id,
                    workbooksCount,
                    filesCount,
                    createdByUserId,
                    createdByUserName,
                    createdAt,
                    updatedAt,
                    guestLink,
                    name,
                    displayOrder,
                    accessToken,
                    isCollaborative,
                    size,
                    upgradedAt,
                    guestAuthentication,
                    additionalProperties);
        }
    }
}
