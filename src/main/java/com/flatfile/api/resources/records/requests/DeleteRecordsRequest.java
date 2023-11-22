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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DeleteRecordsRequest.Builder.class)
public final class DeleteRecordsRequest {
    private final Optional<String> ids;

    private final Map<String, Object> additionalProperties;

    private DeleteRecordsRequest(Optional<String> ids, Map<String, Object> additionalProperties) {
        this.ids = ids;
        this.additionalProperties = additionalProperties;
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
        return other instanceof DeleteRecordsRequest && equalTo((DeleteRecordsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeleteRecordsRequest other) {
        return ids.equals(other.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ids);
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
        private Optional<String> ids = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(DeleteRecordsRequest other) {
            ids(other.getIds());
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

        public DeleteRecordsRequest build() {
            return new DeleteRecordsRequest(ids, additionalProperties);
        }
    }
}
