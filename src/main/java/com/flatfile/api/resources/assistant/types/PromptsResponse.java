/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.assistant.types;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PromptsResponse.Builder.class)
public final class PromptsResponse {
    private final Optional<Pagination> pagination;

    private final List<Prompt> data;

    private final Map<String, Object> additionalProperties;

    private PromptsResponse(
            Optional<Pagination> pagination, List<Prompt> data, Map<String, Object> additionalProperties) {
        this.pagination = pagination;
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("pagination")
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @JsonProperty("data")
    public List<Prompt> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PromptsResponse && equalTo((PromptsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PromptsResponse other) {
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

        private List<Prompt> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PromptsResponse other) {
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
            this.pagination = Optional.of(pagination);
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(List<Prompt> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        public Builder addData(Prompt data) {
            this.data.add(data);
            return this;
        }

        public Builder addAllData(List<Prompt> data) {
            this.data.addAll(data);
            return this;
        }

        public PromptsResponse build() {
            return new PromptsResponse(pagination, data, additionalProperties);
        }
    }
}
