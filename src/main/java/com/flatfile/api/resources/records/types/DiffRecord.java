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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DiffRecord.Builder.class)
public final class DiffRecord implements IRecordBase {
    private final RecordId id;

    private final Optional<VersionId> versionId;

    private final Optional<CommitId> commitId;

    private final Optional<Boolean> valid;

    private final Optional<List<ValidationMessage>> messages;

    private final Optional<Map<String, Object>> metadata;

    private final DiffData values;

    private final Map<String, Object> additionalProperties;

    private DiffRecord(
            RecordId id,
            Optional<VersionId> versionId,
            Optional<CommitId> commitId,
            Optional<Boolean> valid,
            Optional<List<ValidationMessage>> messages,
            Optional<Map<String, Object>> metadata,
            DiffData values,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.versionId = versionId;
        this.commitId = commitId;
        this.valid = valid;
        this.messages = messages;
        this.metadata = metadata;
        this.values = values;
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

    @JsonProperty("values")
    public DiffData getValues() {
        return values;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DiffRecord && equalTo((DiffRecord) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DiffRecord other) {
        return id.equals(other.id)
                && versionId.equals(other.versionId)
                && commitId.equals(other.commitId)
                && valid.equals(other.valid)
                && messages.equals(other.messages)
                && metadata.equals(other.metadata)
                && values.equals(other.values);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id, this.versionId, this.commitId, this.valid, this.messages, this.metadata, this.values);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        ValuesStage id(RecordId id);

        Builder from(DiffRecord other);
    }

    public interface ValuesStage {
        _FinalStage values(DiffData values);
    }

    public interface _FinalStage {
        DiffRecord build();

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
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, ValuesStage, _FinalStage {
        private RecordId id;

        private DiffData values;

        private Optional<Map<String, Object>> metadata = Optional.empty();

        private Optional<List<ValidationMessage>> messages = Optional.empty();

        private Optional<Boolean> valid = Optional.empty();

        private Optional<CommitId> commitId = Optional.empty();

        private Optional<VersionId> versionId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DiffRecord other) {
            id(other.getId());
            versionId(other.getVersionId());
            commitId(other.getCommitId());
            valid(other.getValid());
            messages(other.getMessages());
            metadata(other.getMetadata());
            values(other.getValues());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public ValuesStage id(RecordId id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("values")
        public _FinalStage values(DiffData values) {
            this.values = values;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.of(metadata);
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
            this.messages = Optional.of(messages);
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
            this.valid = Optional.of(valid);
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
            this.commitId = Optional.of(commitId);
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
            this.versionId = Optional.of(versionId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public _FinalStage versionId(Optional<VersionId> versionId) {
            this.versionId = versionId;
            return this;
        }

        @java.lang.Override
        public DiffRecord build() {
            return new DiffRecord(id, versionId, commitId, valid, messages, metadata, values, additionalProperties);
        }
    }
}
