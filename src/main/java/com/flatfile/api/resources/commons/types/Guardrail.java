/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commons.types;

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
@JsonDeserialize(builder = Guardrail.Builder.class)
public final class Guardrail {
    private final String content;

    private final Map<String, Object> additionalProperties;

    private Guardrail(String content, Map<String, Object> additionalProperties) {
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Markdown guardrail for this action
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Guardrail && equalTo((Guardrail) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Guardrail other) {
        return content.equals(other.content);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.content);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(@NotNull String content);

        Builder from(Guardrail other);
    }

    public interface _FinalStage {
        Guardrail build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private String content;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Guardrail other) {
            content(other.getContent());
            return this;
        }

        /**
         * <p>Markdown guardrail for this action</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("content")
        public _FinalStage content(@NotNull String content) {
            this.content = Objects.requireNonNull(content, "content must not be null");
            return this;
        }

        @java.lang.Override
        public Guardrail build() {
            return new Guardrail(content, additionalProperties);
        }
    }
}
