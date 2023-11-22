/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.snapshots.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SnapshotSummary.Builder.class)
public final class SnapshotSummary {
    private final SummarySection createdSince;

    private final SummarySection updatedSince;

    private final SummarySection deletedSince;

    private final Map<String, Object> additionalProperties;

    private SnapshotSummary(
            SummarySection createdSince,
            SummarySection updatedSince,
            SummarySection deletedSince,
            Map<String, Object> additionalProperties) {
        this.createdSince = createdSince;
        this.updatedSince = updatedSince;
        this.deletedSince = deletedSince;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("createdSince")
    public SummarySection getCreatedSince() {
        return createdSince;
    }

    @JsonProperty("updatedSince")
    public SummarySection getUpdatedSince() {
        return updatedSince;
    }

    @JsonProperty("deletedSince")
    public SummarySection getDeletedSince() {
        return deletedSince;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SnapshotSummary && equalTo((SnapshotSummary) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SnapshotSummary other) {
        return createdSince.equals(other.createdSince)
                && updatedSince.equals(other.updatedSince)
                && deletedSince.equals(other.deletedSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.createdSince, this.updatedSince, this.deletedSince);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreatedSinceStage builder() {
        return new Builder();
    }

    public interface CreatedSinceStage {
        UpdatedSinceStage createdSince(SummarySection createdSince);

        Builder from(SnapshotSummary other);
    }

    public interface UpdatedSinceStage {
        DeletedSinceStage updatedSince(SummarySection updatedSince);
    }

    public interface DeletedSinceStage {
        _FinalStage deletedSince(SummarySection deletedSince);
    }

    public interface _FinalStage {
        SnapshotSummary build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CreatedSinceStage, UpdatedSinceStage, DeletedSinceStage, _FinalStage {
        private SummarySection createdSince;

        private SummarySection updatedSince;

        private SummarySection deletedSince;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(SnapshotSummary other) {
            createdSince(other.getCreatedSince());
            updatedSince(other.getUpdatedSince());
            deletedSince(other.getDeletedSince());
            return this;
        }

        @Override
        @JsonSetter("createdSince")
        public UpdatedSinceStage createdSince(SummarySection createdSince) {
            this.createdSince = createdSince;
            return this;
        }

        @Override
        @JsonSetter("updatedSince")
        public DeletedSinceStage updatedSince(SummarySection updatedSince) {
            this.updatedSince = updatedSince;
            return this;
        }

        @Override
        @JsonSetter("deletedSince")
        public _FinalStage deletedSince(SummarySection deletedSince) {
            this.deletedSince = deletedSince;
            return this;
        }

        @Override
        public SnapshotSummary build() {
            return new SnapshotSummary(createdSince, updatedSince, deletedSince, additionalProperties);
        }
    }
}
