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
@JsonDeserialize(builder = ResourceJobSubject.Builder.class)
public final class ResourceJobSubject {
    private final String id;

    private final Map<String, Object> additionalProperties;

    private ResourceJobSubject(String id, Map<String, Object> additionalProperties) {
        this.id = id;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ResourceJobSubject && equalTo((ResourceJobSubject) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ResourceJobSubject other) {
        return id.equals(other.id);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(String id);

        Builder from(ResourceJobSubject other);
    }

    public interface _FinalStage {
        ResourceJobSubject build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private String id;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ResourceJobSubject other) {
            id(other.getId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public ResourceJobSubject build() {
            return new ResourceJobSubject(id, additionalProperties);
        }
    }
}
