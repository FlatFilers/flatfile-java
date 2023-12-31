/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventTopic {
    AGENT_CREATED("agent:created"),

    AGENT_UPDATED("agent:updated"),

    AGENT_DELETED("agent:deleted"),

    SPACE_CREATED("space:created"),

    SPACE_UPDATED("space:updated"),

    SPACE_DELETED("space:deleted"),

    SPACE_EXPIRED("space:expired"),

    DOCUMENT_CREATED("document:created"),

    DOCUMENT_UPDATED("document:updated"),

    DOCUMENT_DELETED("document:deleted"),

    WORKBOOK_CREATED("workbook:created"),

    WORKBOOK_UPDATED("workbook:updated"),

    WORKBOOK_DELETED("workbook:deleted"),

    WORKBOOK_EXPIRED("workbook:expired"),

    SHEET_CREATED("sheet:created"),

    SHEET_UPDATED("sheet:updated"),

    SHEET_DELETED("sheet:deleted"),

    SNAPSHOT_CREATED("snapshot:created"),

    RECORDS_CREATED("records:created"),

    RECORDS_UPDATED("records:updated"),

    RECORDS_DELETED("records:deleted"),

    FILE_CREATED("file:created"),

    FILE_UPDATED("file:updated"),

    FILE_DELETED("file:deleted"),

    FILE_EXPIRED("file:expired"),

    JOB_CREATED("job:created"),

    JOB_UPDATED("job:updated"),

    JOB_DELETED("job:deleted"),

    JOB_COMPLETED("job:completed"),

    JOB_READY("job:ready"),

    JOB_SCHEDULED("job:scheduled"),

    JOB_OUTCOME_ACKNOWLEDGED("job:outcome-acknowledged"),

    JOB_PARTS_COMPLETED("job:parts-completed"),

    JOB_FAILED("job:failed"),

    COMMIT_CREATED("commit:created"),

    COMMIT_UPDATED("commit:updated"),

    COMMIT_COMPLETED("commit:completed"),

    LAYER_CREATED("layer:created");

    private final String value;

    EventTopic(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
