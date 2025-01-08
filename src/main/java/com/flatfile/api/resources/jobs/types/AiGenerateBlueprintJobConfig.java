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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.AppId;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AiGenerateBlueprintJobConfig.Builder.class)
public final class AiGenerateBlueprintJobConfig {
    private final SpaceId spaceId;

    private final AppId appId;

    private final Map<String, Object> additionalProperties;

    private AiGenerateBlueprintJobConfig(SpaceId spaceId, AppId appId, Map<String, Object> additionalProperties) {
        this.spaceId = spaceId;
        this.appId = appId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("spaceId")
    public SpaceId getSpaceId() {
        return spaceId;
    }

    @JsonProperty("appId")
    public AppId getAppId() {
        return appId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AiGenerateBlueprintJobConfig && equalTo((AiGenerateBlueprintJobConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AiGenerateBlueprintJobConfig other) {
        return spaceId.equals(other.spaceId) && appId.equals(other.appId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.spaceId, this.appId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SpaceIdStage builder() {
        return new Builder();
    }

    public interface SpaceIdStage {
        AppIdStage spaceId(@NotNull SpaceId spaceId);

        Builder from(AiGenerateBlueprintJobConfig other);
    }

    public interface AppIdStage {
        _FinalStage appId(@NotNull AppId appId);
    }

    public interface _FinalStage {
        AiGenerateBlueprintJobConfig build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SpaceIdStage, AppIdStage, _FinalStage {
        private SpaceId spaceId;

        private AppId appId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AiGenerateBlueprintJobConfig other) {
            spaceId(other.getSpaceId());
            appId(other.getAppId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("spaceId")
        public AppIdStage spaceId(@NotNull SpaceId spaceId) {
            this.spaceId = Objects.requireNonNull(spaceId, "spaceId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("appId")
        public _FinalStage appId(@NotNull AppId appId) {
            this.appId = Objects.requireNonNull(appId, "appId must not be null");
            return this;
        }

        @java.lang.Override
        public AiGenerateBlueprintJobConfig build() {
            return new AiGenerateBlueprintJobConfig(spaceId, appId, additionalProperties);
        }
    }
}