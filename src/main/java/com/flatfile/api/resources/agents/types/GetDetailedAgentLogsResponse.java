/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.Pagination;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GetDetailedAgentLogsResponse.Builder.class)
public final class GetDetailedAgentLogsResponse {
    private final Optional<Pagination> pagination;

    private final List<DetailedAgentLog> data;

    private final Map<String, Object> additionalProperties;

    private GetDetailedAgentLogsResponse(
            Optional<Pagination> pagination, List<DetailedAgentLog> data, Map<String, Object> additionalProperties) {
        this.pagination = pagination;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pagination")
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @JsonProperty("data")
    public List<DetailedAgentLog> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetDetailedAgentLogsResponse && equalTo((GetDetailedAgentLogsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetDetailedAgentLogsResponse other) {
        return pagination.equals(other.pagination) && data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.pagination, this.data);
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
        private Optional<Pagination> pagination = Optional.empty();

        private List<DetailedAgentLog> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GetDetailedAgentLogsResponse other) {
            pagination(other.getPagination());
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "pagination", nulls = Nulls.SKIP)
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = Optional.ofNullable(pagination);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(List<DetailedAgentLog> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        public Builder addData(DetailedAgentLog data) {
            this.data.add(data);
            return this;
        }

        public Builder addAllData(List<DetailedAgentLog> data) {
            this.data.addAll(data);
            return this;
        }

        public GetDetailedAgentLogsResponse build() {
            return new GetDetailedAgentLogsResponse(pagination, data, additionalProperties);
        }
    }
}
