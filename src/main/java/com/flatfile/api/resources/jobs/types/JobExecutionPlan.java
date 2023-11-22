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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = JobExecutionPlan.Builder.class)
public final class JobExecutionPlan implements IJobExecutionPlan {
    private final List<Edge> fieldMapping;

    private final List<SourceField> unmappedSourceFields;

    private final List<DestinationField> unmappedDestinationFields;

    private final Map<String, Object> additionalProperties;

    private JobExecutionPlan(
            List<Edge> fieldMapping,
            List<SourceField> unmappedSourceFields,
            List<DestinationField> unmappedDestinationFields,
            Map<String, Object> additionalProperties) {
        this.fieldMapping = fieldMapping;
        this.unmappedSourceFields = unmappedSourceFields;
        this.unmappedDestinationFields = unmappedDestinationFields;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("fieldMapping")
    @Override
    public List<Edge> getFieldMapping() {
        return fieldMapping;
    }

    @JsonProperty("unmappedSourceFields")
    @Override
    public List<SourceField> getUnmappedSourceFields() {
        return unmappedSourceFields;
    }

    @JsonProperty("unmappedDestinationFields")
    @Override
    public List<DestinationField> getUnmappedDestinationFields() {
        return unmappedDestinationFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobExecutionPlan && equalTo((JobExecutionPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobExecutionPlan other) {
        return fieldMapping.equals(other.fieldMapping)
                && unmappedSourceFields.equals(other.unmappedSourceFields)
                && unmappedDestinationFields.equals(other.unmappedDestinationFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fieldMapping, this.unmappedSourceFields, this.unmappedDestinationFields);
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
        private List<Edge> fieldMapping = new ArrayList<>();

        private List<SourceField> unmappedSourceFields = new ArrayList<>();

        private List<DestinationField> unmappedDestinationFields = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(JobExecutionPlan other) {
            fieldMapping(other.getFieldMapping());
            unmappedSourceFields(other.getUnmappedSourceFields());
            unmappedDestinationFields(other.getUnmappedDestinationFields());
            return this;
        }

        @JsonSetter(value = "fieldMapping", nulls = Nulls.SKIP)
        public Builder fieldMapping(List<Edge> fieldMapping) {
            this.fieldMapping.clear();
            this.fieldMapping.addAll(fieldMapping);
            return this;
        }

        public Builder addFieldMapping(Edge fieldMapping) {
            this.fieldMapping.add(fieldMapping);
            return this;
        }

        public Builder addAllFieldMapping(List<Edge> fieldMapping) {
            this.fieldMapping.addAll(fieldMapping);
            return this;
        }

        @JsonSetter(value = "unmappedSourceFields", nulls = Nulls.SKIP)
        public Builder unmappedSourceFields(List<SourceField> unmappedSourceFields) {
            this.unmappedSourceFields.clear();
            this.unmappedSourceFields.addAll(unmappedSourceFields);
            return this;
        }

        public Builder addUnmappedSourceFields(SourceField unmappedSourceFields) {
            this.unmappedSourceFields.add(unmappedSourceFields);
            return this;
        }

        public Builder addAllUnmappedSourceFields(List<SourceField> unmappedSourceFields) {
            this.unmappedSourceFields.addAll(unmappedSourceFields);
            return this;
        }

        @JsonSetter(value = "unmappedDestinationFields", nulls = Nulls.SKIP)
        public Builder unmappedDestinationFields(List<DestinationField> unmappedDestinationFields) {
            this.unmappedDestinationFields.clear();
            this.unmappedDestinationFields.addAll(unmappedDestinationFields);
            return this;
        }

        public Builder addUnmappedDestinationFields(DestinationField unmappedDestinationFields) {
            this.unmappedDestinationFields.add(unmappedDestinationFields);
            return this;
        }

        public Builder addAllUnmappedDestinationFields(List<DestinationField> unmappedDestinationFields) {
            this.unmappedDestinationFields.addAll(unmappedDestinationFields);
            return this;
        }

        public JobExecutionPlan build() {
            return new JobExecutionPlan(
                    fieldMapping, unmappedSourceFields, unmappedDestinationFields, additionalProperties);
        }
    }
}