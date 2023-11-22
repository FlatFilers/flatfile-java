/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.snapshots.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.snapshots.types.ChangeType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetSnapshotRecordsRequest.Builder.class)
public final class GetSnapshotRecordsRequest {
    private final Optional<Integer> pageSize;

    private final Optional<Integer> pageNumber;

    private final Optional<ChangeType> changeType;

    private final Map<String, Object> additionalProperties;

    private GetSnapshotRecordsRequest(
            Optional<Integer> pageSize,
            Optional<Integer> pageNumber,
            Optional<ChangeType> changeType,
            Map<String, Object> additionalProperties) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.changeType = changeType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of records to return in a page
     */
    @JsonProperty("pageSize")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Based on pageSize, which page of records to return
     */
    @JsonProperty("pageNumber")
    public Optional<Integer> getPageNumber() {
        return pageNumber;
    }

    /**
     * @return Filter records by change type
     */
    @JsonProperty("changeType")
    public Optional<ChangeType> getChangeType() {
        return changeType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetSnapshotRecordsRequest && equalTo((GetSnapshotRecordsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetSnapshotRecordsRequest other) {
        return pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && changeType.equals(other.changeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pageSize, this.pageNumber, this.changeType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Integer> pageSize = Optional.empty();

        private Optional<Integer> pageNumber = Optional.empty();

        private Optional<ChangeType> changeType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetSnapshotRecordsRequest other) {
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            changeType(other.getChangeType());
            return this;
        }

        @JsonSetter(value = "pageSize", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "pageNumber", nulls = Nulls.SKIP)
        public Builder pageNumber(Optional<Integer> pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = Optional.of(pageNumber);
            return this;
        }

        @JsonSetter(value = "changeType", nulls = Nulls.SKIP)
        public Builder changeType(Optional<ChangeType> changeType) {
            this.changeType = changeType;
            return this;
        }

        public Builder changeType(ChangeType changeType) {
            this.changeType = Optional.of(changeType);
            return this;
        }

        public GetSnapshotRecordsRequest build() {
            return new GetSnapshotRecordsRequest(pageSize, pageNumber, changeType, additionalProperties);
        }
    }
}