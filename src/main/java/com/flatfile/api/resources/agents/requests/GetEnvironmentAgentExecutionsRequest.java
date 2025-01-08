/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.PageNumber;
import com.flatfile.api.resources.commons.types.PageSize;
import com.flatfile.api.resources.commons.types.SpaceId;
import com.flatfile.api.resources.commons.types.SuccessQueryParameter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GetEnvironmentAgentExecutionsRequest.Builder.class)
public final class GetEnvironmentAgentExecutionsRequest {
    private final EnvironmentId environmentId;

    private final Optional<SpaceId> spaceId;

    private final Optional<SuccessQueryParameter> success;

    private final Optional<PageSize> pageSize;

    private final Optional<PageNumber> pageNumber;

    private final Map<String, Object> additionalProperties;

    private GetEnvironmentAgentExecutionsRequest(
            EnvironmentId environmentId,
            Optional<SpaceId> spaceId,
            Optional<SuccessQueryParameter> success,
            Optional<PageSize> pageSize,
            Optional<PageNumber> pageNumber,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.spaceId = spaceId;
        this.success = success;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    public EnvironmentId getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("spaceId")
    public Optional<SpaceId> getSpaceId() {
        return spaceId;
    }

    @JsonProperty("success")
    public Optional<SuccessQueryParameter> getSuccess() {
        return success;
    }

    @JsonProperty("pageSize")
    public Optional<PageSize> getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageNumber")
    public Optional<PageNumber> getPageNumber() {
        return pageNumber;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GetEnvironmentAgentExecutionsRequest
                && equalTo((GetEnvironmentAgentExecutionsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GetEnvironmentAgentExecutionsRequest other) {
        return environmentId.equals(other.environmentId)
                && spaceId.equals(other.spaceId)
                && success.equals(other.success)
                && pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.environmentId, this.spaceId, this.success, this.pageSize, this.pageNumber);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EnvironmentIdStage builder() {
        return new Builder();
    }

    public interface EnvironmentIdStage {
        _FinalStage environmentId(@NotNull EnvironmentId environmentId);

        Builder from(GetEnvironmentAgentExecutionsRequest other);
    }

    public interface _FinalStage {
        GetEnvironmentAgentExecutionsRequest build();

        _FinalStage spaceId(Optional<SpaceId> spaceId);

        _FinalStage spaceId(SpaceId spaceId);

        _FinalStage success(Optional<SuccessQueryParameter> success);

        _FinalStage success(SuccessQueryParameter success);

        _FinalStage pageSize(Optional<PageSize> pageSize);

        _FinalStage pageSize(PageSize pageSize);

        _FinalStage pageNumber(Optional<PageNumber> pageNumber);

        _FinalStage pageNumber(PageNumber pageNumber);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EnvironmentIdStage, _FinalStage {
        private EnvironmentId environmentId;

        private Optional<PageNumber> pageNumber = Optional.empty();

        private Optional<PageSize> pageSize = Optional.empty();

        private Optional<SuccessQueryParameter> success = Optional.empty();

        private Optional<SpaceId> spaceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GetEnvironmentAgentExecutionsRequest other) {
            environmentId(other.getEnvironmentId());
            spaceId(other.getSpaceId());
            success(other.getSuccess());
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            return this;
        }

        @java.lang.Override
        @JsonSetter("environmentId")
        public _FinalStage environmentId(@NotNull EnvironmentId environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId, "environmentId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage pageNumber(PageNumber pageNumber) {
            this.pageNumber = Optional.ofNullable(pageNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pageNumber", nulls = Nulls.SKIP)
        public _FinalStage pageNumber(Optional<PageNumber> pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        @java.lang.Override
        public _FinalStage pageSize(PageSize pageSize) {
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pageSize", nulls = Nulls.SKIP)
        public _FinalStage pageSize(Optional<PageSize> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        @java.lang.Override
        public _FinalStage success(SuccessQueryParameter success) {
            this.success = Optional.ofNullable(success);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "success", nulls = Nulls.SKIP)
        public _FinalStage success(Optional<SuccessQueryParameter> success) {
            this.success = success;
            return this;
        }

        @java.lang.Override
        public _FinalStage spaceId(SpaceId spaceId) {
            this.spaceId = Optional.ofNullable(spaceId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public _FinalStage spaceId(Optional<SpaceId> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @java.lang.Override
        public GetEnvironmentAgentExecutionsRequest build() {
            return new GetEnvironmentAgentExecutionsRequest(
                    environmentId, spaceId, success, pageSize, pageNumber, additionalProperties);
        }
    }
}
