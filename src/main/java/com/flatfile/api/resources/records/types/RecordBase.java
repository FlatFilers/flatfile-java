/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.CommitId;
import com.flatfile.api.resources.commons.types.RecordId;
import com.flatfile.api.resources.commons.types.VersionId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = RecordBase.Builder.class)
public final class RecordBase implements IRecordBase {
    private final RecordId id;

    private final Optional<VersionId> versionId;

    private final Optional<CommitId> commitId;

    private final Optional<Boolean> valid;

    private final Optional<List<ValidationMessage>> messages;

    private final Optional<Map<String, Object>> metadata;

    private final Optional<RecordConfig> config;

    private final Map<String, Object> additionalProperties;

    private RecordBase(
            RecordId id,
            Optional<VersionId> versionId,
            Optional<CommitId> commitId,
            Optional<Boolean> valid,
            Optional<List<ValidationMessage>> messages,
            Optional<Map<String, Object>> metadata,
            Optional<RecordConfig> config,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.versionId = versionId;
        this.commitId = commitId;
        this.valid = valid;
        this.messages = messages;
        this.metadata = metadata;
        this.config = config;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @java.lang.Override
    public RecordId getId() {
        return id;
    }

    /**
     * @return Deprecated, use <code>commitId</code> instead.
     */
    @JsonProperty("versionId")
    @java.lang.Override
    public Optional<VersionId> getVersionId() {
        return versionId;
    }

    @JsonProperty("commitId")
    @java.lang.Override
    public Optional<CommitId> getCommitId() {
        return commitId;
    }

    /**
     * @return Auto-generated value based on whether the record contains a field with an error message. Cannot be set via the API.
     */
    @JsonProperty("valid")
    @java.lang.Override
    public Optional<Boolean> getValid() {
        return valid;
    }

    /**
     * @return This record level <code>messages</code> property is deprecated and no longer stored or used. Use the <code>messages</code> property on the individual cell values instead. This property will be removed in a future release.
     */
    @JsonProperty("messages")
    @java.lang.Override
    public Optional<List<ValidationMessage>> getMessages() {
        return messages;
    }

    @JsonProperty("metadata")
    @java.lang.Override
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    @JsonProperty("config")
    @java.lang.Override
    public Optional<RecordConfig> getConfig() {
        return config;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RecordBase && equalTo((RecordBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RecordBase other) {
        return id.equals(other.id)
                && versionId.equals(other.versionId)
                && commitId.equals(other.commitId)
                && valid.equals(other.valid)
                && messages.equals(other.messages)
                && metadata.equals(other.metadata)
                && config.equals(other.config);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.versionId, this.commitId, this.valid, this.messages, this.metadata, this.config);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(@NotNull RecordId id);

        Builder from(RecordBase other);
    }

    public interface _FinalStage {
        RecordBase build();

        _FinalStage versionId(Optional<VersionId> versionId);

        _FinalStage versionId(VersionId versionId);

        _FinalStage commitId(Optional<CommitId> commitId);

        _FinalStage commitId(CommitId commitId);

        _FinalStage valid(Optional<Boolean> valid);

        _FinalStage valid(Boolean valid);

        _FinalStage messages(Optional<List<ValidationMessage>> messages);

        _FinalStage messages(List<ValidationMessage> messages);

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);

        _FinalStage config(Optional<RecordConfig> config);

        _FinalStage config(RecordConfig config);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private RecordId id;

        private Optional<RecordConfig> config = Optional.empty();

        private Optional<Map<String, Object>> metadata = Optional.empty();

        private Optional<List<ValidationMessage>> messages = Optional.empty();

        private Optional<Boolean> valid = Optional.empty();

        private Optional<CommitId> commitId = Optional.empty();

        private Optional<VersionId> versionId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RecordBase other) {
            id(other.getId());
            versionId(other.getVersionId());
            commitId(other.getCommitId());
            valid(other.getValid());
            messages(other.getMessages());
            metadata(other.getMetadata());
            config(other.getConfig());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(@NotNull RecordId id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage config(RecordConfig config) {
            this.config = Optional.ofNullable(config);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public _FinalStage config(Optional<RecordConfig> config) {
            this.config = config;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>This record level <code>messages</code> property is deprecated and no longer stored or used. Use the <code>messages</code> property on the individual cell values instead. This property will be removed in a future release.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage messages(List<ValidationMessage> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public _FinalStage messages(Optional<List<ValidationMessage>> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * <p>Auto-generated value based on whether the record contains a field with an error message. Cannot be set via the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage valid(Boolean valid) {
            this.valid = Optional.ofNullable(valid);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "valid", nulls = Nulls.SKIP)
        public _FinalStage valid(Optional<Boolean> valid) {
            this.valid = valid;
            return this;
        }

        @java.lang.Override
        public _FinalStage commitId(CommitId commitId) {
            this.commitId = Optional.ofNullable(commitId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "commitId", nulls = Nulls.SKIP)
        public _FinalStage commitId(Optional<CommitId> commitId) {
            this.commitId = commitId;
            return this;
        }

        /**
         * <p>Deprecated, use <code>commitId</code> instead.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage versionId(VersionId versionId) {
            this.versionId = Optional.ofNullable(versionId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public _FinalStage versionId(Optional<VersionId> versionId) {
            this.versionId = versionId;
            return this;
        }

        @java.lang.Override
        public RecordBase build() {
            return new RecordBase(id, versionId, commitId, valid, messages, metadata, config, additionalProperties);
        }
    }
}
