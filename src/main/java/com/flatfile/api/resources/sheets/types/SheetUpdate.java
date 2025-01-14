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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SheetUpdate.Builder.class)
public final class SheetUpdate implements ISheetUpdate {
    private final Optional<SheetId> id;

    private final Optional<WorkbookId> workbookId;

    private final Optional<SheetConfig> config;

    private final Optional<Object> metadata;

    private final Optional<String> namespace;

    private final Optional<OffsetDateTime> updatedAt;

    private final Optional<OffsetDateTime> createdAt;

    private final Map<String, Object> additionalProperties;

    private SheetUpdate(
            Optional<SheetId> id,
            Optional<WorkbookId> workbookId,
            Optional<SheetConfig> config,
            Optional<Object> metadata,
            Optional<String> namespace,
            Optional<OffsetDateTime> updatedAt,
            Optional<OffsetDateTime> createdAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.workbookId = workbookId;
        this.config = config;
        this.metadata = metadata;
        this.namespace = namespace;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the Sheet.
     */
    @JsonProperty("id")
    @java.lang.Override
    public Optional<SheetId> getId() {
        return id;
    }

    /**
     * @return The ID of the Workbook.
     */
    @JsonProperty("workbookId")
    @java.lang.Override
    public Optional<WorkbookId> getWorkbookId() {
        return workbookId;
    }

    /**
     * @return Describes shape of data as well as behavior.
     */
    @JsonProperty("config")
    @java.lang.Override
    public Optional<SheetConfig> getConfig() {
        return config;
    }

    /**
     * @return Useful for any contextual metadata regarding the sheet. Store any valid json
     */
    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Object> getMetadata() {
        return metadata;
    }

    /**
     * @return The scoped namespace of the Sheet.
     */
    @JsonProperty("namespace")
    @java.lang.Override
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return Date the sheet was last updated
     */
    @JsonProperty("updatedAt")
    @java.lang.Override
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return Date the sheet was created
     */
    @JsonProperty("createdAt")
    @java.lang.Override
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SheetUpdate && equalTo((SheetUpdate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SheetUpdate other) {
        return id.equals(other.id)
                && workbookId.equals(other.workbookId)
                && config.equals(other.config)
                && metadata.equals(other.metadata)
                && namespace.equals(other.namespace)
                && updatedAt.equals(other.updatedAt)
                && createdAt.equals(other.createdAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.workbookId, this.config, this.metadata, this.namespace, this.updatedAt, this.createdAt);
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
        private Optional<SheetId> id = Optional.empty();

        private Optional<WorkbookId> workbookId = Optional.empty();

        private Optional<SheetConfig> config = Optional.empty();

        private Optional<Object> metadata = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SheetUpdate other) {
            id(other.getId());
            workbookId(other.getWorkbookId());
            config(other.getConfig());
            metadata(other.getMetadata());
            namespace(other.getNamespace());
            updatedAt(other.getUpdatedAt());
            createdAt(other.getCreatedAt());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<SheetId> id) {
            this.id = id;
            return this;
        }

        public Builder id(SheetId id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "workbookId", nulls = Nulls.SKIP)
        public Builder workbookId(Optional<WorkbookId> workbookId) {
            this.workbookId = workbookId;
            return this;
        }

        public Builder workbookId(WorkbookId workbookId) {
            this.workbookId = Optional.ofNullable(workbookId);
            return this;
        }

        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public Builder config(Optional<SheetConfig> config) {
            this.config = config;
            return this;
        }

        public Builder config(SheetConfig config) {
            this.config = Optional.ofNullable(config);
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

        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public Builder namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        @JsonSetter(value = "updatedAt", nulls = Nulls.SKIP)
        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        @JsonSetter(value = "createdAt", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public SheetUpdate build() {
            return new SheetUpdate(
                    id, workbookId, config, metadata, namespace, updatedAt, createdAt, additionalProperties);
        }
    }
}
