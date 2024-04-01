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

    SPACE_ARCHIVED("space:archived"),

    SPACE_EXPIRED("space:expired"),

    SPACE_GUEST_ADDED("space:guestAdded"),

    SPACE_GUEST_REMOVED("space:guestRemoved"),

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

    SHEET_COUNTS_UPDATED("sheet:counts-updated"),

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

    PROGRAM_CREATED("program:created"),

    PROGRAM_UPDATED("program:updated"),

    COMMIT_CREATED("commit:created"),

    COMMIT_UPDATED("commit:updated"),

    COMMIT_COMPLETED("commit:completed"),

    LAYER_CREATED("layer:created"),

    SECRET_CREATED("secret:created"),

    SECRET_UPDATED("secret:updated"),

    SECRET_DELETED("secret:deleted"),

    CRON_5_MINUTES("cron:5-minutes"),

    CRON_HOURLY("cron:hourly"),

    CRON_DAILY("cron:daily"),

    CRON_WEEKLY("cron:weekly");

    private final String value;

    EventTopic(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
