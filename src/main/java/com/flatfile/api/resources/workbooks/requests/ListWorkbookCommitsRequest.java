/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.workbooks.requests;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListWorkbookCommitsRequest.Builder.class)
public final class ListWorkbookCommitsRequest {
    private final Optional<Boolean> completed;

    private final Map<String, Object> additionalProperties;

    private ListWorkbookCommitsRequest(Optional<Boolean> completed, Map<String, Object> additionalProperties) {
        this.completed = completed;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, only return commits that have been completed. If false, only return commits that have not been completed. If not provided, return all commits.
     */
    @JsonProperty("completed")
    public Optional<Boolean> getCompleted() {
        return completed;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListWorkbookCommitsRequest && equalTo((ListWorkbookCommitsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListWorkbookCommitsRequest other) {
        return completed.equals(other.completed);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.completed);
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
        private Optional<Boolean> completed = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListWorkbookCommitsRequest other) {
            completed(other.getCompleted());
            return this;
        }

        @JsonSetter(value = "completed", nulls = Nulls.SKIP)
        public Builder completed(Optional<Boolean> completed) {
            this.completed = completed;
            return this;
        }

        public Builder completed(Boolean completed) {
            this.completed = Optional.ofNullable(completed);
            return this;
        }

        public ListWorkbookCommitsRequest build() {
            return new ListWorkbookCommitsRequest(completed, additionalProperties);
        }
    }
}
