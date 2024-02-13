/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.requests;

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
import com.flatfile.api.resources.commons.types.Filter;
import com.flatfile.api.resources.commons.types.FilterField;
import com.flatfile.api.resources.commons.types.RecordId;
import com.flatfile.api.resources.commons.types.SearchField;
import com.flatfile.api.resources.commons.types.SearchValue;
import com.flatfile.api.resources.commons.types.SortDirection;
import com.flatfile.api.resources.commons.types.SortField;
import com.flatfile.api.resources.commons.types.VersionId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetRecordsCsvRequest.Builder.class)
public final class GetRecordsCsvRequest {
    private final Optional<String> versionId;

    private final Optional<CommitId> commitId;

    private final Optional<VersionId> sinceVersionId;

    private final Optional<CommitId> sinceCommitId;

    private final Optional<SortField> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Filter> filter;

    private final Optional<FilterField> filterField;

    private final Optional<SearchValue> searchValue;

    private final Optional<SearchField> searchField;

    private final Optional<RecordId> ids;

    private final Map<String, Object> additionalProperties;

    private GetRecordsCsvRequest(
            Optional<String> versionId,
            Optional<CommitId> commitId,
            Optional<VersionId> sinceVersionId,
            Optional<CommitId> sinceCommitId,
            Optional<SortField> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Filter> filter,
            Optional<FilterField> filterField,
            Optional<SearchValue> searchValue,
            Optional<SearchField> searchField,
            Optional<RecordId> ids,
            Map<String, Object> additionalProperties) {
        this.versionId = versionId;
        this.commitId = commitId;
        this.sinceVersionId = sinceVersionId;
        this.sinceCommitId = sinceCommitId;
        this.sortField = sortField;
        this.sortDirection = sortDirection;
        this.filter = filter;
        this.filterField = filterField;
        this.searchValue = searchValue;
        this.searchField = searchField;
        this.ids = ids;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Deprecated, use <code>sinceCommitId</code> instead.
     */
    @JsonProperty("versionId")
    public Optional<String> getVersionId() {
        return versionId;
    }

    /**
     * @return <p>records that were changed in that version  in that version and only those records.</p>
     */
    @JsonProperty("commitId")
    public Optional<CommitId> getCommitId() {
        return commitId;
    }

    /**
     * @return Deprecated, use <code>sinceCommitId</code> instead.
     */
    @JsonProperty("sinceVersionId")
    public Optional<VersionId> getSinceVersionId() {
        return sinceVersionId;
    }

    /**
     * @return <p>records that were changed in that version in addition to any records from versions after that version.</p>
     */
    @JsonProperty("sinceCommitId")
    public Optional<CommitId> getSinceCommitId() {
        return sinceCommitId;
    }

    /**
     * @return The field to sort the data on.
     */
    @JsonProperty("sortField")
    public Optional<SortField> getSortField() {
        return sortField;
    }

    /**
     * @return Sort direction - asc (ascending) or desc (descending)
     */
    @JsonProperty("sortDirection")
    public Optional<SortDirection> getSortDirection() {
        return sortDirection;
    }

    /**
     * @return Options to filter records
     */
    @JsonProperty("filter")
    public Optional<Filter> getFilter() {
        return filter;
    }

    /**
     * @return The field to filter the data on.
     */
    @JsonProperty("filterField")
    public Optional<FilterField> getFilterField() {
        return filterField;
    }

    /**
     * @return The value to search for data on.
     */
    @JsonProperty("searchValue")
    public Optional<SearchValue> getSearchValue() {
        return searchValue;
    }

    /**
     * @return The field to search for data on.
     */
    @JsonProperty("searchField")
    public Optional<SearchField> getSearchField() {
        return searchField;
    }

    /**
     * @return The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records
     */
    @JsonProperty("ids")
    public Optional<RecordId> getIds() {
        return ids;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetRecordsCsvRequest && equalTo((GetRecordsCsvRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetRecordsCsvRequest other) {
        return versionId.equals(other.versionId)
                && commitId.equals(other.commitId)
                && sinceVersionId.equals(other.sinceVersionId)
                && sinceCommitId.equals(other.sinceCommitId)
                && sortField.equals(other.sortField)
                && sortDirection.equals(other.sortDirection)
                && filter.equals(other.filter)
                && filterField.equals(other.filterField)
                && searchValue.equals(other.searchValue)
                && searchField.equals(other.searchField)
                && ids.equals(other.ids);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.versionId,
                this.commitId,
                this.sinceVersionId,
                this.sinceCommitId,
                this.sortField,
                this.sortDirection,
                this.filter,
                this.filterField,
                this.searchValue,
                this.searchField,
                this.ids);
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
        private Optional<String> versionId = Optional.empty();

        private Optional<CommitId> commitId = Optional.empty();

        private Optional<VersionId> sinceVersionId = Optional.empty();

        private Optional<CommitId> sinceCommitId = Optional.empty();

        private Optional<SortField> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        private Optional<FilterField> filterField = Optional.empty();

        private Optional<SearchValue> searchValue = Optional.empty();

        private Optional<SearchField> searchField = Optional.empty();

        private Optional<RecordId> ids = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetRecordsCsvRequest other) {
            versionId(other.getVersionId());
            commitId(other.getCommitId());
            sinceVersionId(other.getSinceVersionId());
            sinceCommitId(other.getSinceCommitId());
            sortField(other.getSortField());
            sortDirection(other.getSortDirection());
            filter(other.getFilter());
            filterField(other.getFilterField());
            searchValue(other.getSearchValue());
            searchField(other.getSearchField());
            ids(other.getIds());
            return this;
        }

        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public Builder versionId(Optional<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            this.versionId = Optional.of(versionId);
            return this;
        }

        @JsonSetter(value = "commitId", nulls = Nulls.SKIP)
        public Builder commitId(Optional<CommitId> commitId) {
            this.commitId = commitId;
            return this;
        }

        public Builder commitId(CommitId commitId) {
            this.commitId = Optional.of(commitId);
            return this;
        }

        @JsonSetter(value = "sinceVersionId", nulls = Nulls.SKIP)
        public Builder sinceVersionId(Optional<VersionId> sinceVersionId) {
            this.sinceVersionId = sinceVersionId;
            return this;
        }

        public Builder sinceVersionId(VersionId sinceVersionId) {
            this.sinceVersionId = Optional.of(sinceVersionId);
            return this;
        }

        @JsonSetter(value = "sinceCommitId", nulls = Nulls.SKIP)
        public Builder sinceCommitId(Optional<CommitId> sinceCommitId) {
            this.sinceCommitId = sinceCommitId;
            return this;
        }

        public Builder sinceCommitId(CommitId sinceCommitId) {
            this.sinceCommitId = Optional.of(sinceCommitId);
            return this;
        }

        @JsonSetter(value = "sortField", nulls = Nulls.SKIP)
        public Builder sortField(Optional<SortField> sortField) {
            this.sortField = sortField;
            return this;
        }

        public Builder sortField(SortField sortField) {
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

        @JsonSetter(value = "filter", nulls = Nulls.SKIP)
        public Builder filter(Optional<Filter> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(Filter filter) {
            this.filter = Optional.of(filter);
            return this;
        }

        @JsonSetter(value = "filterField", nulls = Nulls.SKIP)
        public Builder filterField(Optional<FilterField> filterField) {
            this.filterField = filterField;
            return this;
        }

        public Builder filterField(FilterField filterField) {
            this.filterField = Optional.of(filterField);
            return this;
        }

        @JsonSetter(value = "searchValue", nulls = Nulls.SKIP)
        public Builder searchValue(Optional<SearchValue> searchValue) {
            this.searchValue = searchValue;
            return this;
        }

        public Builder searchValue(SearchValue searchValue) {
            this.searchValue = Optional.of(searchValue);
            return this;
        }

        @JsonSetter(value = "searchField", nulls = Nulls.SKIP)
        public Builder searchField(Optional<SearchField> searchField) {
            this.searchField = searchField;
            return this;
        }

        public Builder searchField(SearchField searchField) {
            this.searchField = Optional.of(searchField);
            return this;
        }

        @JsonSetter(value = "ids", nulls = Nulls.SKIP)
        public Builder ids(Optional<RecordId> ids) {
            this.ids = ids;
            return this;
        }

        public Builder ids(RecordId ids) {
            this.ids = Optional.of(ids);
            return this;
        }

        public GetRecordsCsvRequest build() {
            return new GetRecordsCsvRequest(
                    versionId,
                    commitId,
                    sinceVersionId,
                    sinceCommitId,
                    sortField,
                    sortDirection,
                    filter,
                    filterField,
                    searchValue,
                    searchField,
                    ids,
                    additionalProperties);
        }
    }
}
