/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ProgramsResponse.Builder.class)
public final class ProgramsResponse {
    private final List<Program> data;

    private final Map<String, Object> additionalProperties;

    private ProgramsResponse(List<Program> data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public List<Program> getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProgramsResponse && equalTo((ProgramsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProgramsResponse other) {
        return data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data);
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
        private List<Program> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ProgramsResponse other) {
            data(other.getData());
            return this;
        }

        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public Builder data(List<Program> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        public Builder addData(Program data) {
            this.data.add(data);
            return this;
        }

        public Builder addAllData(List<Program> data) {
            this.data.addAll(data);
            return this;
        }

        public ProgramsResponse build() {
            return new ProgramsResponse(data, additionalProperties);
        }
    }
}
