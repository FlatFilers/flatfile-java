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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.records.types.RecordCounts;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = RecordCountsResponseData.Builder.class)
public final class RecordCountsResponseData {
    private final RecordCounts counts;

    private final boolean success;

    private final Map<String, Object> additionalProperties;

    private RecordCountsResponseData(RecordCounts counts, boolean success, Map<String, Object> additionalProperties) {
        this.counts = counts;
        this.success = success;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("counts")
    public RecordCounts getCounts() {
        return counts;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RecordCountsResponseData && equalTo((RecordCountsResponseData) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RecordCountsResponseData other) {
        return counts.equals(other.counts) && success == other.success;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.counts, this.success);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CountsStage builder() {
        return new Builder();
    }

    public interface CountsStage {
        SuccessStage counts(@NotNull RecordCounts counts);

        Builder from(RecordCountsResponseData other);
    }

    public interface SuccessStage {
        _FinalStage success(boolean success);
    }

    public interface _FinalStage {
        RecordCountsResponseData build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CountsStage, SuccessStage, _FinalStage {
        private RecordCounts counts;

        private boolean success;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RecordCountsResponseData other) {
            counts(other.getCounts());
            success(other.getSuccess());
            return this;
        }

        @java.lang.Override
        @JsonSetter("counts")
        public SuccessStage counts(@NotNull RecordCounts counts) {
            this.counts = Objects.requireNonNull(counts, "counts must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("success")
        public _FinalStage success(boolean success) {
            this.success = success;
            return this;
        }

        @java.lang.Override
        public RecordCountsResponseData build() {
            return new RecordCountsResponseData(counts, success, additionalProperties);
        }
    }
}
