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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = JobPlanResponse.Builder.class)
public final class JobPlanResponse {
    private final JobPlan data;

    private final Map<String, Object> additionalProperties;

    private JobPlanResponse(JobPlan data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public JobPlan getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobPlanResponse && equalTo((JobPlanResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobPlanResponse other) {
        return data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DataStage builder() {
        return new Builder();
    }

    public interface DataStage {
        _FinalStage data(JobPlan data);

        Builder from(JobPlanResponse other);
    }

    public interface _FinalStage {
        JobPlanResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DataStage, _FinalStage {
        private JobPlan data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(JobPlanResponse other) {
            data(other.getData());
            return this;
        }

        @Override
        @JsonSetter("data")
        public _FinalStage data(JobPlan data) {
            this.data = data;
            return this;
        }

        @Override
        public JobPlanResponse build() {
            return new JobPlanResponse(data, additionalProperties);
        }
    }
}