/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

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
@JsonDeserialize(builder = EventContextSlugs.Builder.class)
public final class EventContextSlugs {
    private final Optional<String> space;

    private final Optional<String> workbook;

    private final Optional<String> sheet;

    private final Map<String, Object> additionalProperties;

    private EventContextSlugs(
            Optional<String> space,
            Optional<String> workbook,
            Optional<String> sheet,
            Map<String, Object> additionalProperties) {
        this.space = space;
        this.workbook = workbook;
        this.sheet = sheet;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The slug of the space
     */
    @JsonProperty("space")
    public Optional<String> getSpace() {
        return space;
    }

    /**
     * @return The slug of the workbook
     */
    @JsonProperty("workbook")
    public Optional<String> getWorkbook() {
        return workbook;
    }

    /**
     * @return The slug of the sheet
     */
    @JsonProperty("sheet")
    public Optional<String> getSheet() {
        return sheet;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventContextSlugs && equalTo((EventContextSlugs) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EventContextSlugs other) {
        return space.equals(other.space) && workbook.equals(other.workbook) && sheet.equals(other.sheet);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.space, this.workbook, this.sheet);
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
        private Optional<String> space = Optional.empty();

        private Optional<String> workbook = Optional.empty();

        private Optional<String> sheet = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EventContextSlugs other) {
            space(other.getSpace());
            workbook(other.getWorkbook());
            sheet(other.getSheet());
            return this;
        }

        @JsonSetter(value = "space", nulls = Nulls.SKIP)
        public Builder space(Optional<String> space) {
            this.space = space;
            return this;
        }

        public Builder space(String space) {
            this.space = Optional.ofNullable(space);
            return this;
        }

        @JsonSetter(value = "workbook", nulls = Nulls.SKIP)
        public Builder workbook(Optional<String> workbook) {
            this.workbook = workbook;
            return this;
        }

        public Builder workbook(String workbook) {
            this.workbook = Optional.ofNullable(workbook);
            return this;
        }

        @JsonSetter(value = "sheet", nulls = Nulls.SKIP)
        public Builder sheet(Optional<String> sheet) {
            this.sheet = sheet;
            return this;
        }

        public Builder sheet(String sheet) {
            this.sheet = Optional.ofNullable(sheet);
            return this;
        }

        public EventContextSlugs build() {
            return new EventContextSlugs(space, workbook, sheet, additionalProperties);
        }
    }
}
