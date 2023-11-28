/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.workbooks.types;

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
import com.flatfile.api.resources.commons.types.SpaceId;
import com.flatfile.api.resources.commons.types.WorkbookId;
import com.flatfile.api.resources.sheets.types.Sheet;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Workbook.Builder.class)
public final class Workbook {
    private final WorkbookId id;

    private final Optional<String> name;

    private final SpaceId spaceId;

    private final EnvironmentId environmentId;

    private final Optional<List<Sheet>> sheets;

    private final Optional<List<String>> labels;

    private final Optional<List<Action>> actions;

    private final Optional<WorkbookConfigSettings> settings;

    private final Optional<Object> metadata;

    private final Optional<String> namespace;

    private final OffsetDateTime updatedAt;

    private final OffsetDateTime createdAt;

    private final Map<String, Object> additionalProperties;

    private Workbook(
            WorkbookId id,
            Optional<String> name,
            SpaceId spaceId,
            EnvironmentId environmentId,
            Optional<List<Sheet>> sheets,
            Optional<List<String>> labels,
            Optional<List<Action>> actions,
            Optional<WorkbookConfigSettings> settings,
            Optional<Object> metadata,
            Optional<String> namespace,
            OffsetDateTime updatedAt,
            OffsetDateTime createdAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.spaceId = spaceId;
        this.environmentId = environmentId;
        this.sheets = sheets;
        this.labels = labels;
        this.actions = actions;
        this.settings = settings;
        this.metadata = metadata;
        this.namespace = namespace;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public WorkbookId getId() {
        return id;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("spaceId")
    public SpaceId getSpaceId() {
        return spaceId;
    }

    @JsonProperty("environmentId")
    public EnvironmentId getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("sheets")
    public Optional<List<Sheet>> getSheets() {
        return sheets;
    }

    @JsonProperty("labels")
    public Optional<List<String>> getLabels() {
        return labels;
    }

    @JsonProperty("actions")
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @JsonProperty("settings")
    public Optional<WorkbookConfigSettings> getSettings() {
        return settings;
    }

    /**
     * @return Metadata for the workbook
     */
    @JsonProperty("metadata")
    public Optional<Object> getMetadata() {
        return metadata;
    }

    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return Date the workbook was last updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Date the workbook was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Workbook && equalTo((Workbook) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Workbook other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && spaceId.equals(other.spaceId)
                && environmentId.equals(other.environmentId)
                && sheets.equals(other.sheets)
                && labels.equals(other.labels)
                && actions.equals(other.actions)
                && settings.equals(other.settings)
                && metadata.equals(other.metadata)
                && namespace.equals(other.namespace)
                && updatedAt.equals(other.updatedAt)
                && createdAt.equals(other.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.spaceId,
                this.environmentId,
                this.sheets,
                this.labels,
                this.actions,
                this.settings,
                this.metadata,
                this.namespace,
                this.updatedAt,
                this.createdAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SpaceIdStage id(WorkbookId id);

        Builder from(Workbook other);
    }

    public interface SpaceIdStage {
        EnvironmentIdStage spaceId(SpaceId spaceId);
    }

    public interface EnvironmentIdStage {
        UpdatedAtStage environmentId(EnvironmentId environmentId);
    }

    public interface UpdatedAtStage {
        CreatedAtStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        Workbook build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage sheets(Optional<List<Sheet>> sheets);

        _FinalStage sheets(List<Sheet> sheets);

        _FinalStage labels(Optional<List<String>> labels);

        _FinalStage labels(List<String> labels);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);

        _FinalStage settings(Optional<WorkbookConfigSettings> settings);

        _FinalStage settings(WorkbookConfigSettings settings);

        _FinalStage metadata(Optional<Object> metadata);

        _FinalStage metadata(Object metadata);

        _FinalStage namespace(Optional<String> namespace);

        _FinalStage namespace(String namespace);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, SpaceIdStage, EnvironmentIdStage, UpdatedAtStage, CreatedAtStage, _FinalStage {
        private WorkbookId id;

        private SpaceId spaceId;

        private EnvironmentId environmentId;

        private OffsetDateTime updatedAt;

        private OffsetDateTime createdAt;

        private Optional<String> namespace = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<WorkbookConfigSettings> settings = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<List<String>> labels = Optional.empty();

        private Optional<List<Sheet>> sheets = Optional.empty();

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Workbook other) {
            id(other.getId());
            name(other.getName());
            spaceId(other.getSpaceId());
            environmentId(other.getEnvironmentId());
            sheets(other.getSheets());
            labels(other.getLabels());
            actions(other.getActions());
            settings(other.getSettings());
            metadata(other.getMetadata());
            namespace(other.getNamespace());
            updatedAt(other.getUpdatedAt());
            createdAt(other.getCreatedAt());
            return this;
        }

        @Override
        @JsonSetter("id")
        public SpaceIdStage id(WorkbookId id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("spaceId")
        public EnvironmentIdStage spaceId(SpaceId spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public UpdatedAtStage environmentId(EnvironmentId environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Date the workbook was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public CreatedAtStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Date the workbook was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
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

        /**
         * <p>Metadata for the workbook</p>
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
        public _FinalStage settings(WorkbookConfigSettings settings) {
            this.settings = Optional.of(settings);
            return this;
        }

        @Override
        @JsonSetter(value = "settings", nulls = Nulls.SKIP)
        public _FinalStage settings(Optional<WorkbookConfigSettings> settings) {
            this.settings = settings;
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
        public _FinalStage sheets(List<Sheet> sheets) {
            this.sheets = Optional.of(sheets);
            return this;
        }

        @Override
        @JsonSetter(value = "sheets", nulls = Nulls.SKIP)
        public _FinalStage sheets(Optional<List<Sheet>> sheets) {
            this.sheets = sheets;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public Workbook build() {
            return new Workbook(
                    id,
                    name,
                    spaceId,
                    environmentId,
                    sheets,
                    labels,
                    actions,
                    settings,
                    metadata,
                    namespace,
                    updatedAt,
                    createdAt,
                    additionalProperties);
        }
    }
}
