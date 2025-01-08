/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.FamilyId;
import com.flatfile.api.resources.commons.types.UserId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListProgramsRequest.Builder.class)
public final class ListProgramsRequest {
    private final Optional<Integer> pageSize;

    private final Optional<Integer> pageNumber;

    private final Optional<UserId> createdBy;

    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<EnvironmentId> environmentId;

    private final Optional<FamilyId> familyId;

    private final Optional<String> namespace;

    private final Optional<String> sourceKeys;

    private final Optional<String> destinationKeys;

    private final Map<String, Object> additionalProperties;

    private ListProgramsRequest(
            Optional<Integer> pageSize,
            Optional<Integer> pageNumber,
            Optional<UserId> createdBy,
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<EnvironmentId> environmentId,
            Optional<FamilyId> familyId,
            Optional<String> namespace,
            Optional<String> sourceKeys,
            Optional<String> destinationKeys,
            Map<String, Object> additionalProperties) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.createdBy = createdBy;
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.environmentId = environmentId;
        this.familyId = familyId;
        this.namespace = namespace;
        this.sourceKeys = sourceKeys;
        this.destinationKeys = destinationKeys;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Number of programs to return in a page (default 10)
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
     * @return Filter by creator
     */
    @JsonProperty("createdBy")
    public Optional<UserId> getCreatedBy() {
        return createdBy;
    }

    /**
     * @return Filter by creation time
     */
    @JsonProperty("createdAfter")
    public Optional<OffsetDateTime> getCreatedAfter() {
        return createdAfter;
    }

    /**
     * @return Filter by creation time
     */
    @JsonProperty("createdBefore")
    public Optional<OffsetDateTime> getCreatedBefore() {
        return createdBefore;
    }

    /**
     * @return The ID of the environment
     */
    @JsonProperty("environmentId")
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    /**
     * @return Filter by family
     */
    @JsonProperty("familyId")
    public Optional<FamilyId> getFamilyId() {
        return familyId;
    }

    /**
     * @return Filter by namespace
     */
    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return Filter by source keys
     */
    @JsonProperty("sourceKeys")
    public Optional<String> getSourceKeys() {
        return sourceKeys;
    }

    /**
     * @return Filter by destination keys
     */
    @JsonProperty("destinationKeys")
    public Optional<String> getDestinationKeys() {
        return destinationKeys;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListProgramsRequest && equalTo((ListProgramsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListProgramsRequest other) {
        return pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && createdBy.equals(other.createdBy)
                && createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && environmentId.equals(other.environmentId)
                && familyId.equals(other.familyId)
                && namespace.equals(other.namespace)
                && sourceKeys.equals(other.sourceKeys)
                && destinationKeys.equals(other.destinationKeys);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.pageSize,
                this.pageNumber,
                this.createdBy,
                this.createdAfter,
                this.createdBefore,
                this.environmentId,
                this.familyId,
                this.namespace,
                this.sourceKeys,
                this.destinationKeys);
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
        private Optional<Integer> pageSize = Optional.empty();

        private Optional<Integer> pageNumber = Optional.empty();

        private Optional<UserId> createdBy = Optional.empty();

        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<EnvironmentId> environmentId = Optional.empty();

        private Optional<FamilyId> familyId = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<String> sourceKeys = Optional.empty();

        private Optional<String> destinationKeys = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListProgramsRequest other) {
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            createdBy(other.getCreatedBy());
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            environmentId(other.getEnvironmentId());
            familyId(other.getFamilyId());
            namespace(other.getNamespace());
            sourceKeys(other.getSourceKeys());
            destinationKeys(other.getDestinationKeys());
            return this;
        }

        @JsonSetter(value = "pageSize", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        @JsonSetter(value = "pageNumber", nulls = Nulls.SKIP)
        public Builder pageNumber(Optional<Integer> pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = Optional.ofNullable(pageNumber);
            return this;
        }

        @JsonSetter(value = "createdBy", nulls = Nulls.SKIP)
        public Builder createdBy(Optional<UserId> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(UserId createdBy) {
            this.createdBy = Optional.ofNullable(createdBy);
            return this;
        }

        @JsonSetter(value = "createdAfter", nulls = Nulls.SKIP)
        public Builder createdAfter(Optional<OffsetDateTime> createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }

        public Builder createdAfter(OffsetDateTime createdAfter) {
            this.createdAfter = Optional.ofNullable(createdAfter);
            return this;
        }

        @JsonSetter(value = "createdBefore", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<OffsetDateTime> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(OffsetDateTime createdBefore) {
            this.createdBefore = Optional.ofNullable(createdBefore);
            return this;
        }

        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public Builder environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.ofNullable(environmentId);
            return this;
        }

        @JsonSetter(value = "familyId", nulls = Nulls.SKIP)
        public Builder familyId(Optional<FamilyId> familyId) {
            this.familyId = familyId;
            return this;
        }

        public Builder familyId(FamilyId familyId) {
            this.familyId = Optional.ofNullable(familyId);
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

        @JsonSetter(value = "sourceKeys", nulls = Nulls.SKIP)
        public Builder sourceKeys(Optional<String> sourceKeys) {
            this.sourceKeys = sourceKeys;
            return this;
        }

        public Builder sourceKeys(String sourceKeys) {
            this.sourceKeys = Optional.ofNullable(sourceKeys);
            return this;
        }

        @JsonSetter(value = "destinationKeys", nulls = Nulls.SKIP)
        public Builder destinationKeys(Optional<String> destinationKeys) {
            this.destinationKeys = destinationKeys;
            return this;
        }

        public Builder destinationKeys(String destinationKeys) {
            this.destinationKeys = Optional.ofNullable(destinationKeys);
            return this;
        }

        public ListProgramsRequest build() {
            return new ListProgramsRequest(
                    pageSize,
                    pageNumber,
                    createdBy,
                    createdAfter,
                    createdBefore,
                    environmentId,
                    familyId,
                    namespace,
                    sourceKeys,
                    destinationKeys,
                    additionalProperties);
        }
    }
}
