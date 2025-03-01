/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = JobOutcomeNextSnapshot.Builder.class)
public final class JobOutcomeNextSnapshot {
    private final String snapshotId;

    private final String sheetId;

    private final Map<String, Object> additionalProperties;

    private JobOutcomeNextSnapshot(String snapshotId, String sheetId, Map<String, Object> additionalProperties) {
        this.snapshotId = snapshotId;
        this.sheetId = sheetId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("snapshotId")
    public String getSnapshotId() {
        return snapshotId;
    }

    @JsonProperty("sheetId")
    public String getSheetId() {
        return sheetId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcomeNextSnapshot && equalTo((JobOutcomeNextSnapshot) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcomeNextSnapshot other) {
        return snapshotId.equals(other.snapshotId) && sheetId.equals(other.sheetId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.snapshotId, this.sheetId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SnapshotIdStage builder() {
        return new Builder();
    }

    public interface SnapshotIdStage {
        SheetIdStage snapshotId(@NotNull String snapshotId);

        Builder from(JobOutcomeNextSnapshot other);
    }

    public interface SheetIdStage {
        _FinalStage sheetId(@NotNull String sheetId);
    }

    public interface _FinalStage {
        JobOutcomeNextSnapshot build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SnapshotIdStage, SheetIdStage, _FinalStage {
        private String snapshotId;

        private String sheetId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(JobOutcomeNextSnapshot other) {
            snapshotId(other.getSnapshotId());
            sheetId(other.getSheetId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("snapshotId")
        public SheetIdStage snapshotId(@NotNull String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId, "snapshotId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("sheetId")
        public _FinalStage sheetId(@NotNull String sheetId) {
            this.sheetId = Objects.requireNonNull(sheetId, "sheetId must not be null");
            return this;
        }

        @java.lang.Override
        public JobOutcomeNextSnapshot build() {
            return new JobOutcomeNextSnapshot(snapshotId, sheetId, additionalProperties);
        }
    }
}
