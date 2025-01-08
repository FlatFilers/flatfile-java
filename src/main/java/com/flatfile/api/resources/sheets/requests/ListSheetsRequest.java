/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.WorkbookId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListSheetsRequest.Builder.class)
public final class ListSheetsRequest {
    private final WorkbookId workbookId;

    private final Map<String, Object> additionalProperties;

    private ListSheetsRequest(WorkbookId workbookId, Map<String, Object> additionalProperties) {
        this.workbookId = workbookId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ID of workbook
     */
    @JsonProperty("workbookId")
    public WorkbookId getWorkbookId() {
        return workbookId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListSheetsRequest && equalTo((ListSheetsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListSheetsRequest other) {
        return workbookId.equals(other.workbookId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.workbookId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static WorkbookIdStage builder() {
        return new Builder();
    }

    public interface WorkbookIdStage {
        _FinalStage workbookId(@NotNull WorkbookId workbookId);

        Builder from(ListSheetsRequest other);
    }

    public interface _FinalStage {
        ListSheetsRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WorkbookIdStage, _FinalStage {
        private WorkbookId workbookId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ListSheetsRequest other) {
            workbookId(other.getWorkbookId());
            return this;
        }

        /**
         * <p>ID of workbook</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("workbookId")
        public _FinalStage workbookId(@NotNull WorkbookId workbookId) {
            this.workbookId = Objects.requireNonNull(workbookId, "workbookId must not be null");
            return this;
        }

        @java.lang.Override
        public ListSheetsRequest build() {
            return new ListSheetsRequest(workbookId, additionalProperties);
        }
    }
}
