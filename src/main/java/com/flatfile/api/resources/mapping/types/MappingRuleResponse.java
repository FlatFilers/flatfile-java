/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

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
@JsonDeserialize(builder = MappingRuleResponse.Builder.class)
public final class MappingRuleResponse {
    private final MappingRule data;

    private final Map<String, Object> additionalProperties;

    private MappingRuleResponse(MappingRule data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public MappingRule getData() {
        return data;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MappingRuleResponse && equalTo((MappingRuleResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MappingRuleResponse other) {
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
        _FinalStage data(MappingRule data);

        Builder from(MappingRuleResponse other);
    }

    public interface _FinalStage {
        MappingRuleResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DataStage, _FinalStage {
        private MappingRule data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(MappingRuleResponse other) {
            data(other.getData());
            return this;
        }

        @java.lang.Override
        @JsonSetter("data")
        public _FinalStage data(MappingRule data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public MappingRuleResponse build() {
            return new MappingRuleResponse(data, additionalProperties);
        }
    }
}
