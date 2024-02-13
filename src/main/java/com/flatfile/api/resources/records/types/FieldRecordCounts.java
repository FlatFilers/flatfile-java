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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = FieldRecordCounts.Builder.class)
public final class FieldRecordCounts {
    private final int total;

    private final int valid;

    private final int error;

    private final int empty;

    private final Map<String, Object> additionalProperties;

    private FieldRecordCounts(int total, int valid, int error, int empty, Map<String, Object> additionalProperties) {
        this.total = total;
        this.valid = valid;
        this.error = error;
        this.empty = empty;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("valid")
    public int getValid() {
        return valid;
    }

    @JsonProperty("error")
    public int getError() {
        return error;
    }

    @JsonProperty("empty")
    public int getEmpty() {
        return empty;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FieldRecordCounts && equalTo((FieldRecordCounts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FieldRecordCounts other) {
        return total == other.total && valid == other.valid && error == other.error && empty == other.empty;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.total, this.valid, this.error, this.empty);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalStage builder() {
        return new Builder();
    }

    public interface TotalStage {
        ValidStage total(int total);

        Builder from(FieldRecordCounts other);
    }

    public interface ValidStage {
        ErrorStage valid(int valid);
    }

    public interface ErrorStage {
        EmptyStage error(int error);
    }

    public interface EmptyStage {
        _FinalStage empty(int empty);
    }

    public interface _FinalStage {
        FieldRecordCounts build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalStage, ValidStage, ErrorStage, EmptyStage, _FinalStage {
        private int total;

        private int valid;

        private int error;

        private int empty;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FieldRecordCounts other) {
            total(other.getTotal());
            valid(other.getValid());
            error(other.getError());
            empty(other.getEmpty());
            return this;
        }

        @java.lang.Override
        @JsonSetter("total")
        public ValidStage total(int total) {
            this.total = total;
            return this;
        }

        @java.lang.Override
        @JsonSetter("valid")
        public ErrorStage valid(int valid) {
            this.valid = valid;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public EmptyStage error(int error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        @JsonSetter("empty")
        public _FinalStage empty(int empty) {
            this.empty = empty;
            return this;
        }

        @java.lang.Override
        public FieldRecordCounts build() {
            return new FieldRecordCounts(total, valid, error, empty, additionalProperties);
        }
    }
}
