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
import com.flatfile.api.resources.commons.types.ISuccessData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetRecordsResponseData.Builder.class)
public final class GetRecordsResponseData implements ISuccessData {
    private final boolean success;

    private final List<RecordWithLinks> records;

    private final Optional<RecordCounts> counts;

    private final Optional<String> versionId;

    private final Map<String, Object> additionalProperties;

    private GetRecordsResponseData(
            boolean success,
            List<RecordWithLinks> records,
            Optional<RecordCounts> counts,
            Optional<String> versionId,
            Map<String, Object> additionalProperties) {
        this.success = success;
        this.records = records;
        this.counts = counts;
        this.versionId = versionId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("success")
    @Override
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("records")
    public List<RecordWithLinks> getRecords() {
        return records;
    }

    @JsonProperty("counts")
    public Optional<RecordCounts> getCounts() {
        return counts;
    }

    @JsonProperty("versionId")
    public Optional<String> getVersionId() {
        return versionId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetRecordsResponseData && equalTo((GetRecordsResponseData) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetRecordsResponseData other) {
        return success == other.success
                && records.equals(other.records)
                && counts.equals(other.counts)
                && versionId.equals(other.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.success, this.records, this.counts, this.versionId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SuccessStage builder() {
        return new Builder();
    }

    public interface SuccessStage {
        _FinalStage success(boolean success);

        Builder from(GetRecordsResponseData other);
    }

    public interface _FinalStage {
        GetRecordsResponseData build();

        _FinalStage records(List<RecordWithLinks> records);

        _FinalStage addRecords(RecordWithLinks records);

        _FinalStage addAllRecords(List<RecordWithLinks> records);

        _FinalStage counts(Optional<RecordCounts> counts);

        _FinalStage counts(RecordCounts counts);

        _FinalStage versionId(Optional<String> versionId);

        _FinalStage versionId(String versionId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SuccessStage, _FinalStage {
        private boolean success;

        private Optional<String> versionId = Optional.empty();

        private Optional<RecordCounts> counts = Optional.empty();

        private List<RecordWithLinks> records = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GetRecordsResponseData other) {
            success(other.getSuccess());
            records(other.getRecords());
            counts(other.getCounts());
            versionId(other.getVersionId());
            return this;
        }

        @Override
        @JsonSetter("success")
        public _FinalStage success(boolean success) {
            this.success = success;
            return this;
        }

        @Override
        public _FinalStage versionId(String versionId) {
            this.versionId = Optional.of(versionId);
            return this;
        }

        @Override
        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public _FinalStage versionId(Optional<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        @Override
        public _FinalStage counts(RecordCounts counts) {
            this.counts = Optional.of(counts);
            return this;
        }

        @Override
        @JsonSetter(value = "counts", nulls = Nulls.SKIP)
        public _FinalStage counts(Optional<RecordCounts> counts) {
            this.counts = counts;
            return this;
        }

        @Override
        public _FinalStage addAllRecords(List<RecordWithLinks> records) {
            this.records.addAll(records);
            return this;
        }

        @Override
        public _FinalStage addRecords(RecordWithLinks records) {
            this.records.add(records);
            return this;
        }

        @Override
        @JsonSetter(value = "records", nulls = Nulls.SKIP)
        public _FinalStage records(List<RecordWithLinks> records) {
            this.records.clear();
            this.records.addAll(records);
            return this;
        }

        @Override
        public GetRecordsResponseData build() {
            return new GetRecordsResponseData(success, records, counts, versionId, additionalProperties);
        }
    }
}
