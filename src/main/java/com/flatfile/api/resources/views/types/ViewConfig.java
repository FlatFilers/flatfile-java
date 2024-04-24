/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.views.types;

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
import com.flatfile.api.resources.commons.types.EventId;
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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ViewConfig.Builder.class)
public final class ViewConfig {
    private final Optional<VersionId> versionId;

    private final Optional<CommitId> commitId;

    private final Optional<VersionId> sinceVersionId;

    private final Optional<CommitId> sinceCommitId;

    private final Optional<SortField> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Filter> filter;

    private final Optional<FilterField> filterField;

    private final Optional<SearchValue> searchValue;

    private final Optional<SearchField> searchField;

    private final Optional<List<RecordId>> ids;

    private final Optional<Integer> pageSize;

    private final Optional<Integer> pageNumber;

    private final Optional<Boolean> includeCounts;

    private final Optional<Boolean> includeLength;

    private final Optional<Boolean> includeLinks;

    private final Optional<Boolean> includeMessages;

    private final Optional<EventId> for_;

    private final Optional<String> q;

    private final Map<String, Object> additionalProperties;

    private ViewConfig(
            Optional<VersionId> versionId,
            Optional<CommitId> commitId,
            Optional<VersionId> sinceVersionId,
            Optional<CommitId> sinceCommitId,
            Optional<SortField> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Filter> filter,
            Optional<FilterField> filterField,
            Optional<SearchValue> searchValue,
            Optional<SearchField> searchField,
            Optional<List<RecordId>> ids,
            Optional<Integer> pageSize,
            Optional<Integer> pageNumber,
            Optional<Boolean> includeCounts,
            Optional<Boolean> includeLength,
            Optional<Boolean> includeLinks,
            Optional<Boolean> includeMessages,
            Optional<EventId> for_,
            Optional<String> q,
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
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.includeCounts = includeCounts;
        this.includeLength = includeLength;
        this.includeLinks = includeLinks;
        this.includeMessages = includeMessages;
        this.for_ = for_;
        this.q = q;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Deprecated, use <code>commitId</code> instead.
     */
    @JsonProperty("versionId")
    public Optional<VersionId> getVersionId() {
        return versionId;
    }

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

    @JsonProperty("sinceCommitId")
    public Optional<CommitId> getSinceCommitId() {
        return sinceCommitId;
    }

    @JsonProperty("sortField")
    public Optional<SortField> getSortField() {
        return sortField;
    }

    @JsonProperty("sortDirection")
    public Optional<SortDirection> getSortDirection() {
        return sortDirection;
    }

    @JsonProperty("filter")
    public Optional<Filter> getFilter() {
        return filter;
    }

    /**
     * @return Name of field by which to filter records
     */
    @JsonProperty("filterField")
    public Optional<FilterField> getFilterField() {
        return filterField;
    }

    @JsonProperty("searchValue")
    public Optional<SearchValue> getSearchValue() {
        return searchValue;
    }

    @JsonProperty("searchField")
    public Optional<SearchField> getSearchField() {
        return searchField;
    }

    /**
     * @return The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records. Maximum of 100 allowed.
     */
    @JsonProperty("ids")
    public Optional<List<RecordId>> getIds() {
        return ids;
    }

    /**
     * @return Number of records to return in a page (default 10,000)
     */
    @JsonProperty("pageSize")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Based on pageSize, which page of records to return (Note - numbers start at 1)
     */
    @JsonProperty("pageNumber")
    public Optional<Integer> getPageNumber() {
        return pageNumber;
    }

    /**
     * @return <strong>DEPRECATED</strong> Use GET /sheets/:sheetId/counts
     */
    @JsonProperty("includeCounts")
    public Optional<Boolean> getIncludeCounts() {
        return includeCounts;
    }

    /**
     * @return The length of the record result set, returned as counts.total
     */
    @JsonProperty("includeLength")
    public Optional<Boolean> getIncludeLength() {
        return includeLength;
    }

    /**
     * @return If true, linked records will be included in the results. Defaults to false.
     */
    @JsonProperty("includeLinks")
    public Optional<Boolean> getIncludeLinks() {
        return includeLinks;
    }

    /**
     * @return Include error messages, defaults to false.
     */
    @JsonProperty("includeMessages")
    public Optional<Boolean> getIncludeMessages() {
        return includeMessages;
    }

    /**
     * @return if &quot;for&quot; is provided, the query parameters will be pulled from the event payload
     */
    @JsonProperty("for")
    public Optional<EventId> getFor() {
        return for_;
    }

    /**
     * @return An FFQL query used to filter the result set
     */
    @JsonProperty("q")
    public Optional<String> getQ() {
        return q;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ViewConfig && equalTo((ViewConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ViewConfig other) {
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
                && ids.equals(other.ids)
                && pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && includeCounts.equals(other.includeCounts)
                && includeLength.equals(other.includeLength)
                && includeLinks.equals(other.includeLinks)
                && includeMessages.equals(other.includeMessages)
                && for_.equals(other.for_)
                && q.equals(other.q);
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
                this.ids,
                this.pageSize,
                this.pageNumber,
                this.includeCounts,
                this.includeLength,
                this.includeLinks,
                this.includeMessages,
                this.for_,
                this.q);
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

        private Optional<VersionId> sinceVersionId = Optional.empty();

        private Optional<CommitId> sinceCommitId = Optional.empty();

        private Optional<SortField> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        private Optional<FilterField> filterField = Optional.empty();

        private Optional<SearchValue> searchValue = Optional.empty();

        private Optional<SearchField> searchField = Optional.empty();

        private Optional<List<RecordId>> ids = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<Integer> pageNumber = Optional.empty();

        private Optional<Boolean> includeCounts = Optional.empty();

        private Optional<Boolean> includeLength = Optional.empty();

        private Optional<Boolean> includeLinks = Optional.empty();

        private Optional<Boolean> includeMessages = Optional.empty();

        private Optional<EventId> for_ = Optional.empty();

        private Optional<String> q = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ViewConfig other) {
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
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            includeCounts(other.getIncludeCounts());
            includeLength(other.getIncludeLength());
            includeLinks(other.getIncludeLinks());
            includeMessages(other.getIncludeMessages());
            for_(other.getFor());
            q(other.getQ());
            return this;
        }

        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public Builder versionId(Optional<VersionId> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(VersionId versionId) {
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
        public Builder ids(Optional<List<RecordId>> ids) {
            this.ids = ids;
            return this;
        }

        public Builder ids(List<RecordId> ids) {
            this.ids = Optional.of(ids);
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

        @JsonSetter(value = "includeCounts", nulls = Nulls.SKIP)
        public Builder includeCounts(Optional<Boolean> includeCounts) {
            this.includeCounts = includeCounts;
            return this;
        }

        public Builder includeCounts(Boolean includeCounts) {
            this.includeCounts = Optional.of(includeCounts);
            return this;
        }

        @JsonSetter(value = "includeLength", nulls = Nulls.SKIP)
        public Builder includeLength(Optional<Boolean> includeLength) {
            this.includeLength = includeLength;
            return this;
        }

        public Builder includeLength(Boolean includeLength) {
            this.includeLength = Optional.of(includeLength);
            return this;
        }

        @JsonSetter(value = "includeLinks", nulls = Nulls.SKIP)
        public Builder includeLinks(Optional<Boolean> includeLinks) {
            this.includeLinks = includeLinks;
            return this;
        }

        public Builder includeLinks(Boolean includeLinks) {
            this.includeLinks = Optional.of(includeLinks);
            return this;
        }

        @JsonSetter(value = "includeMessages", nulls = Nulls.SKIP)
        public Builder includeMessages(Optional<Boolean> includeMessages) {
            this.includeMessages = includeMessages;
            return this;
        }

        public Builder includeMessages(Boolean includeMessages) {
            this.includeMessages = Optional.of(includeMessages);
            return this;
        }

        @JsonSetter(value = "for", nulls = Nulls.SKIP)
        public Builder for_(Optional<EventId> for_) {
            this.for_ = for_;
            return this;
        }

        public Builder for_(EventId for_) {
            this.for_ = Optional.of(for_);
            return this;
        }

        @JsonSetter(value = "q", nulls = Nulls.SKIP)
        public Builder q(Optional<String> q) {
            this.q = q;
            return this;
        }

        public Builder q(String q) {
            this.q = Optional.of(q);
            return this;
        }

        public ViewConfig build() {
            return new ViewConfig(
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
                    pageSize,
                    pageNumber,
                    includeCounts,
                    includeLength,
                    includeLinks,
                    includeMessages,
                    for_,
                    q,
                    additionalProperties);
        }
    }
}