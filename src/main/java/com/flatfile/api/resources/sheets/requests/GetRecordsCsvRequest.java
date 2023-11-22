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
import com.flatfile.api.resources.commons.types.Filter;
import com.flatfile.api.resources.commons.types.SortDirection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetRecordsCsvRequest.Builder.class)
public final class GetRecordsCsvRequest {
    private final Optional<String> versionId;

    private final Optional<String> sinceVersionId;

    private final Optional<String> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Filter> filter;

    private final Optional<String> filterField;

    private final Optional<String> searchValue;

    private final Optional<String> searchField;

    private final Optional<String> ids;

    private final Map<String, Object> additionalProperties;

    private GetRecordsCsvRequest(
            Optional<String> versionId,
            Optional<String> sinceVersionId,
            Optional<String> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Filter> filter,
            Optional<String> filterField,
            Optional<String> searchValue,
            Optional<String> searchField,
            Optional<String> ids,
            Map<String, Object> additionalProperties) {
        this.versionId = versionId;
        this.sinceVersionId = sinceVersionId;
        this.sortField = sortField;
        this.sortDirection = sortDirection;
        this.filter = filter;
        this.filterField = filterField;
        this.searchValue = searchValue;
        this.searchField = searchField;
        this.ids = ids;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("versionId")
    public Optional<String> getVersionId() {
        return versionId;
    }

    @JsonProperty("sinceVersionId")
    public Optional<String> getSinceVersionId() {
        return sinceVersionId;
    }

    @JsonProperty("sortField")
    public Optional<String> getSortField() {
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

    @JsonProperty("filterField")
    public Optional<String> getFilterField() {
        return filterField;
    }

    @JsonProperty("searchValue")
    public Optional<String> getSearchValue() {
        return searchValue;
    }

    @JsonProperty("searchField")
    public Optional<String> getSearchField() {
        return searchField;
    }

    /**
     * @return The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records
     */
    @JsonProperty("ids")
    public Optional<String> getIds() {
        return ids;
    }

    @Override
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
                && sinceVersionId.equals(other.sinceVersionId)
                && sortField.equals(other.sortField)
                && sortDirection.equals(other.sortDirection)
                && filter.equals(other.filter)
                && filterField.equals(other.filterField)
                && searchValue.equals(other.searchValue)
                && searchField.equals(other.searchField)
                && ids.equals(other.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.versionId,
                this.sinceVersionId,
                this.sortField,
                this.sortDirection,
                this.filter,
                this.filterField,
                this.searchValue,
                this.searchField,
                this.ids);
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
        private Optional<String> versionId = Optional.empty();

        private Optional<String> sinceVersionId = Optional.empty();

        private Optional<String> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        private Optional<String> filterField = Optional.empty();

        private Optional<String> searchValue = Optional.empty();

        private Optional<String> searchField = Optional.empty();

        private Optional<String> ids = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetRecordsCsvRequest other) {
            versionId(other.getVersionId());
            sinceVersionId(other.getSinceVersionId());
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

        @JsonSetter(value = "sinceVersionId", nulls = Nulls.SKIP)
        public Builder sinceVersionId(Optional<String> sinceVersionId) {
            this.sinceVersionId = sinceVersionId;
            return this;
        }

        public Builder sinceVersionId(String sinceVersionId) {
            this.sinceVersionId = Optional.of(sinceVersionId);
            return this;
        }

        @JsonSetter(value = "sortField", nulls = Nulls.SKIP)
        public Builder sortField(Optional<String> sortField) {
            this.sortField = sortField;
            return this;
        }

        public Builder sortField(String sortField) {
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
        public Builder filterField(Optional<String> filterField) {
            this.filterField = filterField;
            return this;
        }

        public Builder filterField(String filterField) {
            this.filterField = Optional.of(filterField);
            return this;
        }

        @JsonSetter(value = "searchValue", nulls = Nulls.SKIP)
        public Builder searchValue(Optional<String> searchValue) {
            this.searchValue = searchValue;
            return this;
        }

        public Builder searchValue(String searchValue) {
            this.searchValue = Optional.of(searchValue);
            return this;
        }

        @JsonSetter(value = "searchField", nulls = Nulls.SKIP)
        public Builder searchField(Optional<String> searchField) {
            this.searchField = searchField;
            return this;
        }

        public Builder searchField(String searchField) {
            this.searchField = Optional.of(searchField);
            return this;
        }

        @JsonSetter(value = "ids", nulls = Nulls.SKIP)
        public Builder ids(Optional<String> ids) {
            this.ids = ids;
            return this;
        }

        public Builder ids(String ids) {
            this.ids = Optional.of(ids);
            return this;
        }

        public GetRecordsCsvRequest build() {
            return new GetRecordsCsvRequest(
                    versionId,
                    sinceVersionId,
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