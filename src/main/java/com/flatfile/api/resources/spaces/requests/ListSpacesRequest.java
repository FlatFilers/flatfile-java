/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.spaces.requests;

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
import com.flatfile.api.resources.commons.types.SortDirection;
import com.flatfile.api.resources.spaces.types.GetSpacesSortField;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ListSpacesRequest.Builder.class)
public final class ListSpacesRequest {
    private final Optional<EnvironmentId> environmentId;

    private final Optional<Integer> pageSize;

    private final Optional<Integer> pageNumber;

    private final Optional<String> search;

    private final Optional<Boolean> archived;

    private final Optional<GetSpacesSortField> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Boolean> isCollaborative;

    private final Map<String, Object> additionalProperties;

    private ListSpacesRequest(
            Optional<EnvironmentId> environmentId,
            Optional<Integer> pageSize,
            Optional<Integer> pageNumber,
            Optional<String> search,
            Optional<Boolean> archived,
            Optional<GetSpacesSortField> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Boolean> isCollaborative,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.search = search;
        this.archived = archived;
        this.sortField = sortField;
        this.sortDirection = sortDirection;
        this.isCollaborative = isCollaborative;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the environment.
     */
    @JsonProperty("environmentId")
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    /**
     * @return Number of spaces to return in a page (default 10)
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
     * @return Search query for spaces
     */
    @JsonProperty("search")
    public Optional<String> getSearch() {
        return search;
    }

    /**
     * @return Flag to include archived spaces
     */
    @JsonProperty("archived")
    public Optional<Boolean> getArchived() {
        return archived;
    }

    /**
     * @return Field to sort spaces by
     */
    @JsonProperty("sortField")
    public Optional<GetSpacesSortField> getSortField() {
        return sortField;
    }

    /**
     * @return Direction of sorting
     */
    @JsonProperty("sortDirection")
    public Optional<SortDirection> getSortDirection() {
        return sortDirection;
    }

    /**
     * @return Flag for collaborative (project) spaces
     */
    @JsonProperty("isCollaborative")
    public Optional<Boolean> getIsCollaborative() {
        return isCollaborative;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListSpacesRequest && equalTo((ListSpacesRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListSpacesRequest other) {
        return environmentId.equals(other.environmentId)
                && pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && search.equals(other.search)
                && archived.equals(other.archived)
                && sortField.equals(other.sortField)
                && sortDirection.equals(other.sortDirection)
                && isCollaborative.equals(other.isCollaborative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.environmentId,
                this.pageSize,
                this.pageNumber,
                this.search,
                this.archived,
                this.sortField,
                this.sortDirection,
                this.isCollaborative);
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
        private Optional<EnvironmentId> environmentId = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<Integer> pageNumber = Optional.empty();

        private Optional<String> search = Optional.empty();

        private Optional<Boolean> archived = Optional.empty();

        private Optional<GetSpacesSortField> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Boolean> isCollaborative = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListSpacesRequest other) {
            environmentId(other.getEnvironmentId());
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            search(other.getSearch());
            archived(other.getArchived());
            sortField(other.getSortField());
            sortDirection(other.getSortDirection());
            isCollaborative(other.getIsCollaborative());
            return this;
        }

        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public Builder environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.of(environmentId);
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

        @JsonSetter(value = "search", nulls = Nulls.SKIP)
        public Builder search(Optional<String> search) {
            this.search = search;
            return this;
        }

        public Builder search(String search) {
            this.search = Optional.of(search);
            return this;
        }

        @JsonSetter(value = "archived", nulls = Nulls.SKIP)
        public Builder archived(Optional<Boolean> archived) {
            this.archived = archived;
            return this;
        }

        public Builder archived(Boolean archived) {
            this.archived = Optional.of(archived);
            return this;
        }

        @JsonSetter(value = "sortField", nulls = Nulls.SKIP)
        public Builder sortField(Optional<GetSpacesSortField> sortField) {
            this.sortField = sortField;
            return this;
        }

        public Builder sortField(GetSpacesSortField sortField) {
            this.sortField = Optional.of(sortField);
            return this;
        }

        @JsonSetter(value = "sortDirection", nulls = Nulls.SKIP)
        public Builder sortDirection(Optional<SortDirection> sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = Optional.of(sortDirection);
            return this;
        }

        @JsonSetter(value = "isCollaborative", nulls = Nulls.SKIP)
        public Builder isCollaborative(Optional<Boolean> isCollaborative) {
            this.isCollaborative = isCollaborative;
            return this;
        }

        public Builder isCollaborative(Boolean isCollaborative) {
            this.isCollaborative = Optional.of(isCollaborative);
            return this;
        }

        public ListSpacesRequest build() {
            return new ListSpacesRequest(
                    environmentId,
                    pageSize,
                    pageNumber,
                    search,
                    archived,
                    sortField,
                    sortDirection,
                    isCollaborative,
                    additionalProperties);
        }
    }
}
