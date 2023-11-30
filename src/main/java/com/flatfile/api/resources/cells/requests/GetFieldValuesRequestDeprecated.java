/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.cells.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.cells.types.DistinctDeprecated;
import com.flatfile.api.resources.cells.types.FieldKeyDeprecated;
import com.flatfile.api.resources.cells.types.IncludeCountsDeprecated;
import com.flatfile.api.resources.commons.types.Filter;
import com.flatfile.api.resources.commons.types.FilterField;
import com.flatfile.api.resources.commons.types.PageNumber;
import com.flatfile.api.resources.commons.types.PageSize;
import com.flatfile.api.resources.commons.types.SearchValue;
import com.flatfile.api.resources.commons.types.SortDirection;
import com.flatfile.api.resources.commons.types.SortField;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GetFieldValuesRequestDeprecated.Builder.class)
public final class GetFieldValuesRequestDeprecated {
    private final Optional<FieldKeyDeprecated> fieldKey;

    private final Optional<SortField> sortField;

    private final Optional<SortDirection> sortDirection;

    private final Optional<Filter> filter;

    private final Optional<FilterField> filterField;

    private final Optional<PageSize> pageSize;

    private final Optional<PageNumber> pageNumber;

    private final Optional<DistinctDeprecated> distinct;

    private final Optional<IncludeCountsDeprecated> includeCounts;

    private final Optional<SearchValue> searchValue;

    private final Map<String, Object> additionalProperties;

    private GetFieldValuesRequestDeprecated(
            Optional<FieldKeyDeprecated> fieldKey,
            Optional<SortField> sortField,
            Optional<SortDirection> sortDirection,
            Optional<Filter> filter,
            Optional<FilterField> filterField,
            Optional<PageSize> pageSize,
            Optional<PageNumber> pageNumber,
            Optional<DistinctDeprecated> distinct,
            Optional<IncludeCountsDeprecated> includeCounts,
            Optional<SearchValue> searchValue,
            Map<String, Object> additionalProperties) {
        this.fieldKey = fieldKey;
        this.sortField = sortField;
        this.sortDirection = sortDirection;
        this.filter = filter;
        this.filterField = filterField;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.distinct = distinct;
        this.includeCounts = includeCounts;
        this.searchValue = searchValue;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("fieldKey")
    public Optional<FieldKeyDeprecated> getFieldKey() {
        return fieldKey;
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

    /**
     * @return Number of records to return in a page (default 1000 if pageNumber included)
     */
    @JsonProperty("pageSize")
    public Optional<PageSize> getPageSize() {
        return pageSize;
    }

    /**
     * @return Based on pageSize, which page of records to return
     */
    @JsonProperty("pageNumber")
    public Optional<PageNumber> getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("distinct")
    public Optional<DistinctDeprecated> getDistinct() {
        return distinct;
    }

    @JsonProperty("includeCounts")
    public Optional<IncludeCountsDeprecated> getIncludeCounts() {
        return includeCounts;
    }

    /**
     * @return A value to find for a given field in a sheet. Wrap the value in &quot;&quot; for exact match
     */
    @JsonProperty("searchValue")
    public Optional<SearchValue> getSearchValue() {
        return searchValue;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetFieldValuesRequestDeprecated && equalTo((GetFieldValuesRequestDeprecated) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetFieldValuesRequestDeprecated other) {
        return fieldKey.equals(other.fieldKey)
                && sortField.equals(other.sortField)
                && sortDirection.equals(other.sortDirection)
                && filter.equals(other.filter)
                && filterField.equals(other.filterField)
                && pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && distinct.equals(other.distinct)
                && includeCounts.equals(other.includeCounts)
                && searchValue.equals(other.searchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.fieldKey,
                this.sortField,
                this.sortDirection,
                this.filter,
                this.filterField,
                this.pageSize,
                this.pageNumber,
                this.distinct,
                this.includeCounts,
                this.searchValue);
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
        private Optional<FieldKeyDeprecated> fieldKey = Optional.empty();

        private Optional<SortField> sortField = Optional.empty();

        private Optional<SortDirection> sortDirection = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        private Optional<FilterField> filterField = Optional.empty();

        private Optional<PageSize> pageSize = Optional.empty();

        private Optional<PageNumber> pageNumber = Optional.empty();

        private Optional<DistinctDeprecated> distinct = Optional.empty();

        private Optional<IncludeCountsDeprecated> includeCounts = Optional.empty();

        private Optional<SearchValue> searchValue = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetFieldValuesRequestDeprecated other) {
            fieldKey(other.getFieldKey());
            sortField(other.getSortField());
            sortDirection(other.getSortDirection());
            filter(other.getFilter());
            filterField(other.getFilterField());
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            distinct(other.getDistinct());
            includeCounts(other.getIncludeCounts());
            searchValue(other.getSearchValue());
            return this;
        }

        @JsonSetter(value = "fieldKey", nulls = Nulls.SKIP)
        public Builder fieldKey(Optional<FieldKeyDeprecated> fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        public Builder fieldKey(FieldKeyDeprecated fieldKey) {
            this.fieldKey = Optional.of(fieldKey);
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

        @JsonSetter(value = "pageSize", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<PageSize> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(PageSize pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "pageNumber", nulls = Nulls.SKIP)
        public Builder pageNumber(Optional<PageNumber> pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(PageNumber pageNumber) {
            this.pageNumber = Optional.of(pageNumber);
            return this;
        }

        @JsonSetter(value = "distinct", nulls = Nulls.SKIP)
        public Builder distinct(Optional<DistinctDeprecated> distinct) {
            this.distinct = distinct;
            return this;
        }

        public Builder distinct(DistinctDeprecated distinct) {
            this.distinct = Optional.of(distinct);
            return this;
        }

        @JsonSetter(value = "includeCounts", nulls = Nulls.SKIP)
        public Builder includeCounts(Optional<IncludeCountsDeprecated> includeCounts) {
            this.includeCounts = includeCounts;
            return this;
        }

        public Builder includeCounts(IncludeCountsDeprecated includeCounts) {
            this.includeCounts = Optional.of(includeCounts);
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

        public GetFieldValuesRequestDeprecated build() {
            return new GetFieldValuesRequestDeprecated(
                    fieldKey,
                    sortField,
                    sortDirection,
                    filter,
                    filterField,
                    pageSize,
                    pageNumber,
                    distinct,
                    includeCounts,
                    searchValue,
                    additionalProperties);
        }
    }
}
