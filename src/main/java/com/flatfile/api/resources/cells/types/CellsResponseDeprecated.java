/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.cells.types;

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
@JsonDeserialize(builder = CellsResponseDeprecated.Builder.class)
public final class CellsResponseDeprecated {
    private final CellsResponseDataDeprecated data;

    private final Map<String, Object> additionalProperties;

    private CellsResponseDeprecated(CellsResponseDataDeprecated data, Map<String, Object> additionalProperties) {
        this.data = data;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("data")
    public CellsResponseDataDeprecated getData() {
        return data;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CellsResponseDeprecated && equalTo((CellsResponseDeprecated) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CellsResponseDeprecated other) {
        return data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.data);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DataStage builder() {
        return new Builder();
    }

    public interface DataStage {
        _FinalStage data(CellsResponseDataDeprecated data);

        Builder from(CellsResponseDeprecated other);
    }

    public interface _FinalStage {
        CellsResponseDeprecated build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DataStage, _FinalStage {
        private CellsResponseDataDeprecated data;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(CellsResponseDeprecated other) {
            data(other.getData());
            return this;
        }

        @Override
        @JsonSetter("data")
        public _FinalStage data(CellsResponseDataDeprecated data) {
            this.data = data;
            return this;
        }

        @Override
        public CellsResponseDeprecated build() {
            return new CellsResponseDeprecated(data, additionalProperties);
        }
    }
}