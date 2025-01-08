/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.requests;

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
import com.flatfile.api.resources.commons.types.FilterField;
import com.flatfile.api.resources.commons.types.RecordId;
import com.flatfile.api.resources.commons.types.SearchField;
import com.flatfile.api.resources.commons.types.SearchValue;
import com.flatfile.api.resources.records.types.CellValueUnion;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindAndReplaceRecordRequest.Builder.class)
public final class FindAndReplaceRecordRequest {
    private final Optional<Filter> filter;

    private final Optional<FilterField> filterField;

    private final Optional<SearchValue> searchValue;

    private final Optional<SearchField> searchField;

    private final Optional<RecordId> ids;

    private final Optional<String> q;

    private final Optional<CellValueUnion> find;

    private final Optional<CellValueUnion> replace;

    private final String fieldKey;

    private final Map<String, Object> additionalProperties;

    private FindAndReplaceRecordRequest(
            Optional<Filter> filter,
            Optional<FilterField> filterField,
            Optional<SearchValue> searchValue,
            Optional<SearchField> searchField,
            Optional<RecordId> ids,
            Optional<String> q,
            Optional<CellValueUnion> find,
            Optional<CellValueUnion> replace,
            String fieldKey,
            Map<String, Object> additionalProperties) {
        this.filter = filter;
        this.filterField = filterField;
        this.searchValue = searchValue;
        this.searchField = searchField;
        this.ids = ids;
        this.q = q;
        this.find = find;
        this.replace = replace;
        this.fieldKey = fieldKey;
        this.additionalProperties = additionalProperties;
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
     * @return The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records
     */
    @JsonProperty("ids")
    public Optional<RecordId> getIds() {
        return ids;
    }

    /**
     * @return An FFQL query used to filter the result set
     */
    @JsonProperty("q")
    public Optional<String> getQ() {
        return q;
    }

    /**
     * @return A value to find for a given field in a sheet. For exact matches, wrap the value in double quotes (&quot;Bob&quot;)
     */
    @JsonProperty("find")
    public Optional<CellValueUnion> getFind() {
        return find;
    }

    /**
     * @return The value to replace found values with
     */
    @JsonProperty("replace")
    public Optional<CellValueUnion> getReplace() {
        return replace;
    }

    /**
     * @return A unique key used to identify a field in a sheet
     */
    @JsonProperty("fieldKey")
    public String getFieldKey() {
        return fieldKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindAndReplaceRecordRequest && equalTo((FindAndReplaceRecordRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindAndReplaceRecordRequest other) {
        return filter.equals(other.filter)
                && filterField.equals(other.filterField)
                && searchValue.equals(other.searchValue)
                && searchField.equals(other.searchField)
                && ids.equals(other.ids)
                && q.equals(other.q)
                && find.equals(other.find)
                && replace.equals(other.replace)
                && fieldKey.equals(other.fieldKey);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.filter,
                this.filterField,
                this.searchValue,
                this.searchField,
                this.ids,
                this.q,
                this.find,
                this.replace,
                this.fieldKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FieldKeyStage builder() {
        return new Builder();
    }

    public interface FieldKeyStage {
        _FinalStage fieldKey(@NotNull String fieldKey);

        Builder from(FindAndReplaceRecordRequest other);
    }

    public interface _FinalStage {
        FindAndReplaceRecordRequest build();

        _FinalStage filter(Optional<Filter> filter);

        _FinalStage filter(Filter filter);

        _FinalStage filterField(Optional<FilterField> filterField);

        _FinalStage filterField(FilterField filterField);

        _FinalStage searchValue(Optional<SearchValue> searchValue);

        _FinalStage searchValue(SearchValue searchValue);

        _FinalStage searchField(Optional<SearchField> searchField);

        _FinalStage searchField(SearchField searchField);

        _FinalStage ids(Optional<RecordId> ids);

        _FinalStage ids(RecordId ids);

        _FinalStage q(Optional<String> q);

        _FinalStage q(String q);

        _FinalStage find(Optional<CellValueUnion> find);

        _FinalStage find(CellValueUnion find);

        _FinalStage replace(Optional<CellValueUnion> replace);

        _FinalStage replace(CellValueUnion replace);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FieldKeyStage, _FinalStage {
        private String fieldKey;

        private Optional<CellValueUnion> replace = Optional.empty();

        private Optional<CellValueUnion> find = Optional.empty();

        private Optional<String> q = Optional.empty();

        private Optional<RecordId> ids = Optional.empty();

        private Optional<SearchField> searchField = Optional.empty();

        private Optional<SearchValue> searchValue = Optional.empty();

        private Optional<FilterField> filterField = Optional.empty();

        private Optional<Filter> filter = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FindAndReplaceRecordRequest other) {
            filter(other.getFilter());
            filterField(other.getFilterField());
            searchValue(other.getSearchValue());
            searchField(other.getSearchField());
            ids(other.getIds());
            q(other.getQ());
            find(other.getFind());
            replace(other.getReplace());
            fieldKey(other.getFieldKey());
            return this;
        }

        /**
         * <p>A unique key used to identify a field in a sheet</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("fieldKey")
        public _FinalStage fieldKey(@NotNull String fieldKey) {
            this.fieldKey = Objects.requireNonNull(fieldKey, "fieldKey must not be null");
            return this;
        }

        /**
         * <p>The value to replace found values with</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage replace(CellValueUnion replace) {
            this.replace = Optional.ofNullable(replace);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "replace", nulls = Nulls.SKIP)
        public _FinalStage replace(Optional<CellValueUnion> replace) {
            this.replace = replace;
            return this;
        }

        /**
         * <p>A value to find for a given field in a sheet. For exact matches, wrap the value in double quotes (&quot;Bob&quot;)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage find(CellValueUnion find) {
            this.find = Optional.ofNullable(find);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "find", nulls = Nulls.SKIP)
        public _FinalStage find(Optional<CellValueUnion> find) {
            this.find = find;
            return this;
        }

        /**
         * <p>An FFQL query used to filter the result set</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage q(String q) {
            this.q = Optional.ofNullable(q);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "q", nulls = Nulls.SKIP)
        public _FinalStage q(Optional<String> q) {
            this.q = q;
            return this;
        }

        /**
         * <p>The Record Ids param (ids) is a list of record ids that can be passed to several record endpoints allowing the user to identify specific records to INCLUDE in the query, or specific records to EXCLUDE, depending on whether or not filters are being applied. When passing a query param that filters the record dataset, such as 'searchValue', or a 'filter' of 'valid' | 'error' | 'all', the 'ids' param will EXCLUDE those records from the filtered results. For basic queries that do not filter the dataset, passing record ids in the 'ids' param will limit the dataset to INCLUDE just those specific records</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage ids(RecordId ids) {
            this.ids = Optional.ofNullable(ids);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "ids", nulls = Nulls.SKIP)
        public _FinalStage ids(Optional<RecordId> ids) {
            this.ids = ids;
            return this;
        }

        @java.lang.Override
        public _FinalStage searchField(SearchField searchField) {
            this.searchField = Optional.ofNullable(searchField);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "searchField", nulls = Nulls.SKIP)
        public _FinalStage searchField(Optional<SearchField> searchField) {
            this.searchField = searchField;
            return this;
        }

        @java.lang.Override
        public _FinalStage searchValue(SearchValue searchValue) {
            this.searchValue = Optional.ofNullable(searchValue);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "searchValue", nulls = Nulls.SKIP)
        public _FinalStage searchValue(Optional<SearchValue> searchValue) {
            this.searchValue = searchValue;
            return this;
        }

        /**
         * <p>Name of field by which to filter records</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage filterField(FilterField filterField) {
            this.filterField = Optional.ofNullable(filterField);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "filterField", nulls = Nulls.SKIP)
        public _FinalStage filterField(Optional<FilterField> filterField) {
            this.filterField = filterField;
            return this;
        }

        @java.lang.Override
        public _FinalStage filter(Filter filter) {
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "filter", nulls = Nulls.SKIP)
        public _FinalStage filter(Optional<Filter> filter) {
            this.filter = filter;
            return this;
        }

        @java.lang.Override
        public FindAndReplaceRecordRequest build() {
            return new FindAndReplaceRecordRequest(
                    filter,
                    filterField,
                    searchValue,
                    searchField,
                    ids,
                    q,
                    find,
                    replace,
                    fieldKey,
                    additionalProperties);
        }
    }
}
