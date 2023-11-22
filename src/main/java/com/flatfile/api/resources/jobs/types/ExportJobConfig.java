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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ExportJobConfig.Builder.class)
public final class ExportJobConfig {
    private final ExportOptions options;

    private final Map<String, Object> additionalProperties;

    private ExportJobConfig(ExportOptions options, Map<String, Object> additionalProperties) {
        this.options = options;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("options")
    public ExportOptions getOptions() {
        return options;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExportJobConfig && equalTo((ExportJobConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExportJobConfig other) {
        return options.equals(other.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.options);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OptionsStage builder() {
        return new Builder();
    }

    public interface OptionsStage {
        _FinalStage options(ExportOptions options);

        Builder from(ExportJobConfig other);
    }

    public interface _FinalStage {
        ExportJobConfig build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OptionsStage, _FinalStage {
        private ExportOptions options;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ExportJobConfig other) {
            options(other.getOptions());
            return this;
        }

        @Override
        @JsonSetter("options")
        public _FinalStage options(ExportOptions options) {
            this.options = options;
            return this;
        }

        @Override
        public ExportJobConfig build() {
            return new ExportJobConfig(options, additionalProperties);
        }
    }
}