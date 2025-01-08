/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.environments.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GuideVersionResponse.Builder.class)
public final class GuideVersionResponse {
    private final GuideVersionResource data;

    private final Map<String, Object> additionalProperties;

    private GuideVersionResponse(GuideVersionResource data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public GuideVersionResource getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GuideVersionResponse && equalTo((GuideVersionResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GuideVersionResponse other) {
        return data.equals(other.data);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DataStage builder() {
        return new Builder();
    }

    public interface DataStage {
        _FinalStage data(@NotNull GuideVersionResource data);

        Builder from(GuideVersionResponse other);
    }

    public interface _FinalStage {
        GuideVersionResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DataStage, _FinalStage {
        private GuideVersionResource data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GuideVersionResponse other) {
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public _FinalStage data(@NotNull GuideVersionResource data) {
            this.data = Objects.requireNonNull(data, "data must not be null");
            return this;
        }

        @java.lang.Override
        public GuideVersionResponse build() {
            return new GuideVersionResponse(data, additionalProperties);
        }
    }
}