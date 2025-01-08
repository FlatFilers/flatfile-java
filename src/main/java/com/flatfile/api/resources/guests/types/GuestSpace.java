/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.guests.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GuestSpace.Builder.class)
public final class GuestSpace {
    private final SpaceId id;

    private final Optional<List<GuestWorkbook>> workbooks;

    private final Optional<OffsetDateTime> lastAccessed;

    private final Map<String, Object> additionalProperties;

    private GuestSpace(
            SpaceId id,
            Optional<List<GuestWorkbook>> workbooks,
            Optional<OffsetDateTime> lastAccessed,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.workbooks = workbooks;
        this.lastAccessed = lastAccessed;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public SpaceId getId() {
        return id;
    }

    @JsonProperty("workbooks")
    public Optional<List<GuestWorkbook>> getWorkbooks() {
        return workbooks;
    }

    @JsonProperty("lastAccessed")
    public Optional<OffsetDateTime> getLastAccessed() {
        return lastAccessed;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GuestSpace && equalTo((GuestSpace) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GuestSpace other) {
        return id.equals(other.id) && workbooks.equals(other.workbooks) && lastAccessed.equals(other.lastAccessed);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.workbooks, this.lastAccessed);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(@NotNull SpaceId id);

        Builder from(GuestSpace other);
    }

    public interface _FinalStage {
        GuestSpace build();

        _FinalStage workbooks(Optional<List<GuestWorkbook>> workbooks);

        _FinalStage workbooks(List<GuestWorkbook> workbooks);

        _FinalStage lastAccessed(Optional<OffsetDateTime> lastAccessed);

        _FinalStage lastAccessed(OffsetDateTime lastAccessed);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private SpaceId id;

        private Optional<OffsetDateTime> lastAccessed = Optional.empty();

        private Optional<List<GuestWorkbook>> workbooks = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GuestSpace other) {
            id(other.getId());
            workbooks(other.getWorkbooks());
            lastAccessed(other.getLastAccessed());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(@NotNull SpaceId id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage lastAccessed(OffsetDateTime lastAccessed) {
            this.lastAccessed = Optional.ofNullable(lastAccessed);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "lastAccessed", nulls = Nulls.SKIP)
        public _FinalStage lastAccessed(Optional<OffsetDateTime> lastAccessed) {
            this.lastAccessed = lastAccessed;
            return this;
        }

        @java.lang.Override
        public _FinalStage workbooks(List<GuestWorkbook> workbooks) {
            this.workbooks = Optional.ofNullable(workbooks);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "workbooks", nulls = Nulls.SKIP)
        public _FinalStage workbooks(Optional<List<GuestWorkbook>> workbooks) {
            this.workbooks = workbooks;
            return this;
        }

        @java.lang.Override
        public GuestSpace build() {
            return new GuestSpace(id, workbooks, lastAccessed, additionalProperties);
        }
    }
}
