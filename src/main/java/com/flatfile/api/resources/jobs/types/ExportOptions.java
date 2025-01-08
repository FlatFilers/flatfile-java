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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ExportOptions.Builder.class)
public final class ExportOptions {
    private final Optional<VersionId> versionId;

    private final Optional<CommitId> commitId;

    private final Optional<SortField> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Filter> filter;

    private final Optional<FilterField> filterField;

    private final Optional<SearchValue> searchValue;

    private final Optional<SearchField> searchField;

    private final Optional<String> q;

    private final Optional<List<RecordId>> ids;

    private final Map<String, Object> additionalProperties;

    private ExportOptions(
            Optional<VersionId> versionId,
            Optional<CommitId> commitId,
            Optional<SortField> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Filter> filter,
            Optional<FilterField> filterField,
            Optional<SearchValue> searchValue,
            Optional<SearchField> searchField,
            Optional<String> q,
            Optional<List<RecordId>> ids,
            Map<String, Object> additionalProperties) {
        this.versionId = versionId;
        this.commitId = commitId;
        this.sortField = sortField;
        this.sortDirection = sortDirection;
        this.filter = filter;
        this.filterField = filterField;
        this.searchValue = searchValue;
        this.searchField = searchField;
        this.q = q;
        this.ids = ids;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Deprecated, use <code>commitId</code> instead
     */
    @JsonProperty("versionId")
    public Optional<VersionId> getVersionId() {
        return versionId;
    }

    /**
     * @return If provided, the snapshot version of the workbook will be used for the export
     */
    @JsonProperty("commitId")
    public Optional<CommitId> getCommitId() {
        return commitId;
    }

    /**
     * @return The field to sort the records on
     */
    @JsonProperty("sortField")
    public Optional<SortField> getSortField() {
        return sortField;
    }

    /**
     * @return The direction to sort the records
     */
    @JsonProperty("sortDirection")
    public Optional<SortDirection> getSortDirection() {
        return sortDirection;
    }

    /**
     * @return The filter to apply to the records
     */
    @JsonProperty("filter")
    public Optional<Filter> getFilter() {
        return filter;
    }

    /**
     * @return The field to filter on
     */
    @JsonProperty("filterField")
    public Optional<FilterField> getFilterField() {
        return filterField;
    }

    /**
     * @return The value to search for
     */
    @JsonProperty("searchValue")
    public Optional<SearchValue> getSearchValue() {
        return searchValue;
    }

    /**
     * @return The field to search for the search value in
     */
    @JsonProperty("searchField")
    public Optional<SearchField> getSearchField() {
        return searchField;
    }

    /**
     * @return The FFQL query to filter records
     */
    @JsonProperty("q")
    public Optional<String> getQ() {
        return q;
    }

    /**
     * @return The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records
     */
    @JsonProperty("ids")
    public Optional<List<RecordId>> getIds() {
        return ids;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExportOptions && equalTo((ExportOptions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExportOptions other) {
        return versionId.equals(other.versionId)
                && commitId.equals(other.commitId)
                && sortField.equals(other.sortField)
                && sortDirection.equals(other.sortDirection)
                && filter.equals(other.filter)
                && filterField.equals(other.filterField)
                && searchValue.equals(other.searchValue)
                && searchField.equals(other.searchField)
                && q.equals(other.q)
                && ids.equals(other.ids);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.versionId,
                this.commitId,
                this.sortField,
                this.sortDirection,
                this.filter,
                this.filterField,
                this.searchValue,
                this.searchField,
                this.q,
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
        private Optional<VersionId> versionId = Optional.empty();

        private Optional<CommitId> commitId = Optional.empty();

        private Optional<SortField> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        private Optional<FilterField> filterField = Optional.empty();

        private Optional<SearchValue> searchValue = Optional.empty();

        private Optional<SearchField> searchField = Optional.empty();

        private Optional<String> q = Optional.empty();

        private Optional<List<RecordId>> ids = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ExportOptions other) {
            versionId(other.getVersionId());
            commitId(other.getCommitId());
            sortField(other.getSortField());
            sortDirection(other.getSortDirection());
            filter(other.getFilter());
            filterField(other.getFilterField());
            searchValue(other.getSearchValue());
            searchField(other.getSearchField());
            q(other.getQ());
            ids(other.getIds());
            return this;
        }

        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public Builder versionId(Optional<VersionId> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(VersionId versionId) {
            this.versionId = Optional.ofNullable(versionId);
            return this;
        }

        @JsonSetter(value = "commitId", nulls = Nulls.SKIP)
        public Builder commitId(Optional<CommitId> commitId) {
            this.commitId = commitId;
            return this;
        }

        public Builder commitId(CommitId commitId) {
            this.commitId = Optional.ofNullable(commitId);
            return this;
        }

        @JsonSetter(value = "sortField", nulls = Nulls.SKIP)
        public Builder sortField(Optional<SortField> sortField) {
            this.sortField = sortField;
            return this;
        }

        public Builder sortField(SortField sortField) {
            this.sortField = Optional.ofNullable(sortField);
            return this;
        }

        @JsonSetter(value = "sortDirection", nulls = Nulls.SKIP)
        public Builder sortDirection(Optional<SortDirection> sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = Optional.ofNullable(sortDirection);
            return this;
        }

        @JsonSetter(value = "filter", nulls = Nulls.SKIP)
        public Builder filter(Optional<Filter> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(Filter filter) {
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        @JsonSetter(value = "filterField", nulls = Nulls.SKIP)
        public Builder filterField(Optional<FilterField> filterField) {
            this.filterField = filterField;
            return this;
        }

        public Builder filterField(FilterField filterField) {
            this.filterField = Optional.ofNullable(filterField);
            return this;
        }

        @JsonSetter(value = "searchValue", nulls = Nulls.SKIP)
        public Builder searchValue(Optional<SearchValue> searchValue) {
            this.searchValue = searchValue;
            return this;
        }

        public Builder searchValue(SearchValue searchValue) {
            this.searchValue = Optional.ofNullable(searchValue);
            return this;
        }

        @JsonSetter(value = "searchField", nulls = Nulls.SKIP)
        public Builder searchField(Optional<SearchField> searchField) {
            this.searchField = searchField;
            return this;
        }

        public Builder searchField(SearchField searchField) {
            this.searchField = Optional.ofNullable(searchField);
            return this;
        }

        @JsonSetter(value = "q", nulls = Nulls.SKIP)
        public Builder q(Optional<String> q) {
            this.q = q;
            return this;
        }

        public Builder q(String q) {
            this.q = Optional.ofNullable(q);
            return this;
        }

        @JsonSetter(value = "ids", nulls = Nulls.SKIP)
        public Builder ids(Optional<List<RecordId>> ids) {
            this.ids = ids;
            return this;
        }

        public Builder ids(List<RecordId> ids) {
            this.ids = Optional.ofNullable(ids);
            return this;
        }

        public ExportOptions build() {
            return new ExportOptions(
                    versionId,
                    commitId,
                    sortField,
                    sortDirection,
                    filter,
                    filterField,
                    searchValue,
                    searchField,
                    q,
                    ids,
                    additionalProperties);
        }
    }
}
