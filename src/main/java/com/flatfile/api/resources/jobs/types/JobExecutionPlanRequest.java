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
@JsonDeserialize(builder = JobExecutionPlanRequest.Builder.class)
public final class JobExecutionPlanRequest implements IJobExecutionPlan {
    private final List<Edge> fieldMapping;

    private final List<SourceField> unmappedSourceFields;

    private final List<DestinationField> unmappedDestinationFields;

    private final String fileId;

    private final String jobId;

    private final Map<String, Object> additionalProperties;

    private JobExecutionPlanRequest(
            List<Edge> fieldMapping,
            List<SourceField> unmappedSourceFields,
            List<DestinationField> unmappedDestinationFields,
            String fileId,
            String jobId,
            Map<String, Object> additionalProperties) {
        this.fieldMapping = fieldMapping;
        this.unmappedSourceFields = unmappedSourceFields;
        this.unmappedDestinationFields = unmappedDestinationFields;
        this.fileId = fileId;
        this.jobId = jobId;
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

    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobExecutionPlanRequest && equalTo((JobExecutionPlanRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobExecutionPlanRequest other) {
        return fieldMapping.equals(other.fieldMapping)
                && unmappedSourceFields.equals(other.unmappedSourceFields)
                && unmappedDestinationFields.equals(other.unmappedDestinationFields)
                && fileId.equals(other.fileId)
                && jobId.equals(other.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.fieldMapping, this.unmappedSourceFields, this.unmappedDestinationFields, this.fileId, this.jobId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FileIdStage builder() {
        return new Builder();
    }

    public interface FileIdStage {
        JobIdStage fileId(String fileId);

        Builder from(JobExecutionPlanRequest other);
    }

    public interface JobIdStage {
        _FinalStage jobId(String jobId);
    }

    public interface _FinalStage {
        JobExecutionPlanRequest build();

        _FinalStage fieldMapping(List<Edge> fieldMapping);

        _FinalStage addFieldMapping(Edge fieldMapping);

        _FinalStage addAllFieldMapping(List<Edge> fieldMapping);

        _FinalStage unmappedSourceFields(List<SourceField> unmappedSourceFields);

        _FinalStage addUnmappedSourceFields(SourceField unmappedSourceFields);

        _FinalStage addAllUnmappedSourceFields(List<SourceField> unmappedSourceFields);

        _FinalStage unmappedDestinationFields(List<DestinationField> unmappedDestinationFields);

        _FinalStage addUnmappedDestinationFields(DestinationField unmappedDestinationFields);

        _FinalStage addAllUnmappedDestinationFields(List<DestinationField> unmappedDestinationFields);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FileIdStage, JobIdStage, _FinalStage {
        private String fileId;

        private String jobId;

        private List<DestinationField> unmappedDestinationFields = new ArrayList<>();

        private List<SourceField> unmappedSourceFields = new ArrayList<>();

        private List<Edge> fieldMapping = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(JobExecutionPlanRequest other) {
            fieldMapping(other.getFieldMapping());
            unmappedSourceFields(other.getUnmappedSourceFields());
            unmappedDestinationFields(other.getUnmappedDestinationFields());
            fileId(other.getFileId());
            jobId(other.getJobId());
            return this;
        }

        @Override
        @JsonSetter("fileId")
        public JobIdStage fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        @Override
        @JsonSetter("jobId")
        public _FinalStage jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        @Override
        public _FinalStage addAllUnmappedDestinationFields(List<DestinationField> unmappedDestinationFields) {
            this.unmappedDestinationFields.addAll(unmappedDestinationFields);
            return this;
        }

        @Override
        public _FinalStage addUnmappedDestinationFields(DestinationField unmappedDestinationFields) {
            this.unmappedDestinationFields.add(unmappedDestinationFields);
            return this;
        }

        @Override
        @JsonSetter(value = "unmappedDestinationFields", nulls = Nulls.SKIP)
        public _FinalStage unmappedDestinationFields(List<DestinationField> unmappedDestinationFields) {
            this.unmappedDestinationFields.clear();
            this.unmappedDestinationFields.addAll(unmappedDestinationFields);
            return this;
        }

        @Override
        public _FinalStage addAllUnmappedSourceFields(List<SourceField> unmappedSourceFields) {
            this.unmappedSourceFields.addAll(unmappedSourceFields);
            return this;
        }

        @Override
        public _FinalStage addUnmappedSourceFields(SourceField unmappedSourceFields) {
            this.unmappedSourceFields.add(unmappedSourceFields);
            return this;
        }

        @Override
        @JsonSetter(value = "unmappedSourceFields", nulls = Nulls.SKIP)
        public _FinalStage unmappedSourceFields(List<SourceField> unmappedSourceFields) {
            this.unmappedSourceFields.clear();
            this.unmappedSourceFields.addAll(unmappedSourceFields);
            return this;
        }

        @Override
        public _FinalStage addAllFieldMapping(List<Edge> fieldMapping) {
            this.fieldMapping.addAll(fieldMapping);
            return this;
        }

        @Override
        public _FinalStage addFieldMapping(Edge fieldMapping) {
            this.fieldMapping.add(fieldMapping);
            return this;
        }

        @Override
        @JsonSetter(value = "fieldMapping", nulls = Nulls.SKIP)
        public _FinalStage fieldMapping(List<Edge> fieldMapping) {
            this.fieldMapping.clear();
            this.fieldMapping.addAll(fieldMapping);
            return this;
        }

        @Override
        public JobExecutionPlanRequest build() {
            return new JobExecutionPlanRequest(
                    fieldMapping, unmappedSourceFields, unmappedDestinationFields, fileId, jobId, additionalProperties);
        }
    }
}