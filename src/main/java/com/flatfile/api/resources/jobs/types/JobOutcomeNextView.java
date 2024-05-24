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
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = JobOutcomeNextView.Builder.class)
public final class JobOutcomeNextView {
    private final String sheetId;

    private final List<String> hiddenColumns;

    private final Optional<String> label;

    private final Map<String, Object> additionalProperties;

    private JobOutcomeNextView(
            String sheetId,
            List<String> hiddenColumns,
            Optional<String> label,
            Map<String, Object> additionalProperties) {
        this.sheetId = sheetId;
        this.hiddenColumns = hiddenColumns;
        this.label = label;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("sheetId")
    public String getSheetId() {
        return sheetId;
    }

    /**
     * @return An array of field keys from the sheet
     */
    @JsonProperty("hiddenColumns")
    public List<String> getHiddenColumns() {
        return hiddenColumns;
    }

    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof JobOutcomeNextView && equalTo((JobOutcomeNextView) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(JobOutcomeNextView other) {
        return sheetId.equals(other.sheetId) && hiddenColumns.equals(other.hiddenColumns) && label.equals(other.label);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sheetId, this.hiddenColumns, this.label);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SheetIdStage builder() {
        return new Builder();
    }

    public interface SheetIdStage {
        _FinalStage sheetId(String sheetId);

        Builder from(JobOutcomeNextView other);
    }

    public interface _FinalStage {
        JobOutcomeNextView build();

        _FinalStage hiddenColumns(List<String> hiddenColumns);

        _FinalStage addHiddenColumns(String hiddenColumns);

        _FinalStage addAllHiddenColumns(List<String> hiddenColumns);

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SheetIdStage, _FinalStage {
        private String sheetId;

        private Optional<String> label = Optional.empty();

        private List<String> hiddenColumns = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(JobOutcomeNextView other) {
            sheetId(other.getSheetId());
            hiddenColumns(other.getHiddenColumns());
            label(other.getLabel());
            return this;
        }

        @java.lang.Override
        @JsonSetter("sheetId")
        public _FinalStage sheetId(String sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        @java.lang.Override
        public _FinalStage label(String label) {
            this.label = Optional.of(label);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        /**
         * <p>An array of field keys from the sheet</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllHiddenColumns(List<String> hiddenColumns) {
            this.hiddenColumns.addAll(hiddenColumns);
            return this;
        }

        /**
         * <p>An array of field keys from the sheet</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addHiddenColumns(String hiddenColumns) {
            this.hiddenColumns.add(hiddenColumns);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "hiddenColumns", nulls = Nulls.SKIP)
        public _FinalStage hiddenColumns(List<String> hiddenColumns) {
            this.hiddenColumns.clear();
            this.hiddenColumns.addAll(hiddenColumns);
            return this;
        }

        @java.lang.Override
        public JobOutcomeNextView build() {
            return new JobOutcomeNextView(sheetId, hiddenColumns, label, additionalProperties);
        }
    }
}
