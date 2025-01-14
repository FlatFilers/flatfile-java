/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.versions.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SheetId;
import com.flatfile.api.resources.commons.types.VersionId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = VersionsPostRequestBody.Builder.class)
public final class VersionsPostRequestBody {
    private final Optional<SheetId> sheetId;

    private final Optional<VersionId> parentVersionId;

    private final Map<String, Object> additionalProperties;

    private VersionsPostRequestBody(
            Optional<SheetId> sheetId, Optional<VersionId> parentVersionId, Map<String, Object> additionalProperties) {
        this.sheetId = sheetId;
        this.parentVersionId = parentVersionId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the Sheet.
     */
    @JsonProperty("sheetId")
    public Optional<SheetId> getSheetId() {
        return sheetId;
    }

    /**
     * @return Deprecated, creating or updating a group of records together will automatically generate a commitId to group those record changes together.
     */
    @JsonProperty("parentVersionId")
    public Optional<VersionId> getParentVersionId() {
        return parentVersionId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VersionsPostRequestBody && equalTo((VersionsPostRequestBody) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VersionsPostRequestBody other) {
        return sheetId.equals(other.sheetId) && parentVersionId.equals(other.parentVersionId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.sheetId, this.parentVersionId);
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
        private Optional<SheetId> sheetId = Optional.empty();

        private Optional<VersionId> parentVersionId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(VersionsPostRequestBody other) {
            sheetId(other.getSheetId());
            parentVersionId(other.getParentVersionId());
            return this;
        }

        @JsonSetter(value = "sheetId", nulls = Nulls.SKIP)
        public Builder sheetId(Optional<SheetId> sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        public Builder sheetId(SheetId sheetId) {
            this.sheetId = Optional.ofNullable(sheetId);
            return this;
        }

        @JsonSetter(value = "parentVersionId", nulls = Nulls.SKIP)
        public Builder parentVersionId(Optional<VersionId> parentVersionId) {
            this.parentVersionId = parentVersionId;
            return this;
        }

        public Builder parentVersionId(VersionId parentVersionId) {
            this.parentVersionId = Optional.ofNullable(parentVersionId);
            return this;
        }

        public VersionsPostRequestBody build() {
            return new VersionsPostRequestBody(sheetId, parentVersionId, additionalProperties);
        }
    }
}
