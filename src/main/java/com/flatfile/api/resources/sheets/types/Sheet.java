/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SheetId;
import com.flatfile.api.resources.commons.types.WorkbookId;
import com.flatfile.api.resources.records.types.RecordCounts;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Sheet.Builder.class)
public final class Sheet {
    private final SheetId id;

    private final WorkbookId workbookId;

    private final String name;

    private final String slug;

    private final SheetConfig config;

    private final Optional<Object> metadata;

    private final Optional<String> namespace;

    private final Optional<String> lockedBy;

    private final OffsetDateTime updatedAt;

    private final OffsetDateTime createdAt;

    private final Optional<OffsetDateTime> lockedAt;

    private final Optional<RecordCounts> recordCounts;

    private final Map<String, Object> additionalProperties;

    private Sheet(
            SheetId id,
            WorkbookId workbookId,
            String name,
            String slug,
            SheetConfig config,
            Optional<Object> metadata,
            Optional<String> namespace,
            Optional<String> lockedBy,
            OffsetDateTime updatedAt,
            OffsetDateTime createdAt,
            Optional<OffsetDateTime> lockedAt,
            Optional<RecordCounts> recordCounts,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.workbookId = workbookId;
        this.name = name;
        this.slug = slug;
        this.config = config;
        this.metadata = metadata;
        this.namespace = namespace;
        this.lockedBy = lockedBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.lockedAt = lockedAt;
        this.recordCounts = recordCounts;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the Sheet.
     */
    @JsonProperty("id")
    public SheetId getId() {
        return id;
    }

    /**
     * @return The ID of the Workbook.
     */
    @JsonProperty("workbookId")
    public WorkbookId getWorkbookId() {
        return workbookId;
    }

    /**
     * @return The name of the Sheet.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The slug of the Sheet.
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * @return Describes shape of data as well as behavior
     */
    @JsonProperty("config")
    public SheetConfig getConfig() {
        return config;
    }

    /**
     * @return Useful for any contextual metadata regarding the sheet. Store any valid json
     */
    @JsonProperty("metadata")
    public Optional<Object> getMetadata() {
        return metadata;
    }

    /**
     * @return The scoped namespace of the Sheet.
     */
    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return The actor who locked the Sheet.
     */
    @JsonProperty("lockedBy")
    public Optional<String> getLockedBy() {
        return lockedBy;
    }

    /**
     * @return Date the sheet was last updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Date the sheet was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return The time the Sheet was locked.
     */
    @JsonProperty("lockedAt")
    public Optional<OffsetDateTime> getLockedAt() {
        return lockedAt;
    }

    /**
     * @return The precomputed counts of records in the Sheet (may not exist).
     */
    @JsonProperty("recordCounts")
    public Optional<RecordCounts> getRecordCounts() {
        return recordCounts;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Sheet && equalTo((Sheet) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Sheet other) {
        return id.equals(other.id)
                && workbookId.equals(other.workbookId)
                && name.equals(other.name)
                && slug.equals(other.slug)
                && config.equals(other.config)
                && metadata.equals(other.metadata)
                && namespace.equals(other.namespace)
                && lockedBy.equals(other.lockedBy)
                && updatedAt.equals(other.updatedAt)
                && createdAt.equals(other.createdAt)
                && lockedAt.equals(other.lockedAt)
                && recordCounts.equals(other.recordCounts);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.workbookId,
                this.name,
                this.slug,
                this.config,
                this.metadata,
                this.namespace,
                this.lockedBy,
                this.updatedAt,
                this.createdAt,
                this.lockedAt,
                this.recordCounts);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        WorkbookIdStage id(@NotNull SheetId id);

        Builder from(Sheet other);
    }

    public interface WorkbookIdStage {
        NameStage workbookId(@NotNull WorkbookId workbookId);
    }

    public interface NameStage {
        SlugStage name(@NotNull String name);
    }

    public interface SlugStage {
        ConfigStage slug(@NotNull String slug);
    }

    public interface ConfigStage {
        UpdatedAtStage config(@NotNull SheetConfig config);
    }

    public interface UpdatedAtStage {
        CreatedAtStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        Sheet build();

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage namespace(Optional<String> namespace);

        _FinalStage namespace(String namespace);

        _FinalStage lockedBy(Optional<String> lockedBy);

        _FinalStage lockedBy(String lockedBy);

        _FinalStage lockedAt(Optional<OffsetDateTime> lockedAt);

        _FinalStage lockedAt(OffsetDateTime lockedAt);

        _FinalStage recordCounts(Optional<RecordCounts> recordCounts);

        _FinalStage recordCounts(RecordCounts recordCounts);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    WorkbookIdStage,
                    NameStage,
                    SlugStage,
                    ConfigStage,
                    UpdatedAtStage,
                    CreatedAtStage,
                    _FinalStage {
        private SheetId id;

        private WorkbookId workbookId;

        private String name;

        private String slug;

        private SheetConfig config;

        private OffsetDateTime updatedAt;

        private OffsetDateTime createdAt;

        private Optional<RecordCounts> recordCounts = Optional.empty();

        private Optional<OffsetDateTime> lockedAt = Optional.empty();

        private Optional<String> lockedBy = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Sheet other) {
            id(other.getId());
            workbookId(other.getWorkbookId());
            name(other.getName());
            slug(other.getSlug());
            config(other.getConfig());
            metadata(other.getMetadata());
            namespace(other.getNamespace());
            lockedBy(other.getLockedBy());
            updatedAt(other.getUpdatedAt());
            createdAt(other.getCreatedAt());
            lockedAt(other.getLockedAt());
            recordCounts(other.getRecordCounts());
            return this;
        }

        /**
         * <p>The ID of the Sheet.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public WorkbookIdStage id(@NotNull SheetId id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>The ID of the Workbook.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("workbookId")
        public NameStage workbookId(@NotNull WorkbookId workbookId) {
            this.workbookId = Objects.requireNonNull(workbookId, "workbookId must not be null");
            return this;
        }

        /**
         * <p>The name of the Sheet.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public SlugStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The slug of the Sheet.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("slug")
        public ConfigStage slug(@NotNull String slug) {
            this.slug = Objects.requireNonNull(slug, "slug must not be null");
            return this;
        }

        /**
         * <p>Describes shape of data as well as behavior</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("config")
        public UpdatedAtStage config(@NotNull SheetConfig config) {
            this.config = Objects.requireNonNull(config, "config must not be null");
            return this;
        }

        /**
         * <p>Date the sheet was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public CreatedAtStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        /**
         * <p>Date the sheet was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>The precomputed counts of records in the Sheet (may not exist).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage recordCounts(RecordCounts recordCounts) {
            this.recordCounts = Optional.ofNullable(recordCounts);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "recordCounts", nulls = Nulls.SKIP)
        public _FinalStage recordCounts(Optional<RecordCounts> recordCounts) {
            this.recordCounts = recordCounts;
            return this;
        }

        /**
         * <p>The time the Sheet was locked.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lockedAt(OffsetDateTime lockedAt) {
            this.lockedAt = Optional.ofNullable(lockedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lockedAt", nulls = Nulls.SKIP)
        public _FinalStage lockedAt(Optional<OffsetDateTime> lockedAt) {
            this.lockedAt = lockedAt;
            return this;
        }

        /**
         * <p>The actor who locked the Sheet.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage lockedBy(String lockedBy) {
            this.lockedBy = Optional.ofNullable(lockedBy);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lockedBy", nulls = Nulls.SKIP)
        public _FinalStage lockedBy(Optional<String> lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }

        /**
         * <p>The scoped namespace of the Sheet.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage namespace(String namespace) {
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public _FinalStage namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Useful for any contextual metadata regarding the sheet. Store any valid json</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage metadata(Object metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public Sheet build() {
            return new Sheet(
                    id,
                    workbookId,
                    name,
                    slug,
                    config,
                    metadata,
                    namespace,
                    lockedBy,
                    updatedAt,
                    createdAt,
                    lockedAt,
                    recordCounts,
                    additionalProperties);
        }
    }
}
