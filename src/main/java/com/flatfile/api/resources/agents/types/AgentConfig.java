/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.events.types.EventTopic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AgentConfig.Builder.class)
public final class AgentConfig implements IAgentConfig {
    private final Optional<List<EventTopic>> topics;

    private final Optional<Compiler> compiler;

    private final Optional<String> source;

    private final Optional<String> sourceMap;

    private final Optional<String> slug;

    private final Optional<Map<String, Object>> options;

    private final Map<String, Object> additionalProperties;

    private AgentConfig(
            Optional<List<EventTopic>> topics,
            Optional<Compiler> compiler,
            Optional<String> source,
            Optional<String> sourceMap,
            Optional<String> slug,
            Optional<Map<String, Object>> options,
            Map<String, Object> additionalProperties) {
        this.topics = topics;
        this.compiler = compiler;
        this.source = source;
        this.sourceMap = sourceMap;
        this.slug = slug;
        this.options = options;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The topics the agent should listen for
     */
    @JsonProperty("topics")
    @java.lang.Override
    public Optional<List<EventTopic>> getTopics() {
        return topics;
    }

    /**
     * @return The compiler of the agent
     */
    @JsonProperty("compiler")
    @java.lang.Override
    public Optional<Compiler> getCompiler() {
        return compiler;
    }

    /**
     * @return The source of the agent
     */
    @JsonProperty("source")
    @java.lang.Override
    public Optional<String> getSource() {
        return source;
    }

    /**
     * @return The source map of the agent
     */
    @JsonProperty("sourceMap")
    @java.lang.Override
    public Optional<String> getSourceMap() {
        return sourceMap;
    }

    /**
     * @return The slug of the agent
     */
    @JsonProperty("slug")
    @java.lang.Override
    public Optional<String> getSlug() {
        return slug;
    }

    /**
     * @return Options for the agent
     */
    @JsonProperty("options")
    @java.lang.Override
    public Optional<Map<String, Object>> getOptions() {
        return options;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AgentConfig && equalTo((AgentConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AgentConfig other) {
        return topics.equals(other.topics)
                && compiler.equals(other.compiler)
                && source.equals(other.source)
                && sourceMap.equals(other.sourceMap)
                && slug.equals(other.slug)
                && options.equals(other.options);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.topics, this.compiler, this.source, this.sourceMap, this.slug, this.options);
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
        private Optional<List<EventTopic>> topics = Optional.empty();

        private Optional<Compiler> compiler = Optional.empty();

        private Optional<String> source = Optional.empty();

        private Optional<String> sourceMap = Optional.empty();

        private Optional<String> slug = Optional.empty();

        private Optional<Map<String, Object>> options = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AgentConfig other) {
            topics(other.getTopics());
            compiler(other.getCompiler());
            source(other.getSource());
            sourceMap(other.getSourceMap());
            slug(other.getSlug());
            options(other.getOptions());
            return this;
        }

        @JsonSetter(value = "topics", nulls = Nulls.SKIP)
        public Builder topics(Optional<List<EventTopic>> topics) {
            this.topics = topics;
            return this;
        }

        public Builder topics(List<EventTopic> topics) {
            this.topics = Optional.ofNullable(topics);
            return this;
        }

        @JsonSetter(value = "compiler", nulls = Nulls.SKIP)
        public Builder compiler(Optional<Compiler> compiler) {
            this.compiler = compiler;
            return this;
        }

        public Builder compiler(Compiler compiler) {
            this.compiler = Optional.ofNullable(compiler);
            return this;
        }

        @JsonSetter(value = "source", nulls = Nulls.SKIP)
        public Builder source(Optional<String> source) {
            this.source = source;
            return this;
        }

        public Builder source(String source) {
            this.source = Optional.ofNullable(source);
            return this;
        }

        @JsonSetter(value = "sourceMap", nulls = Nulls.SKIP)
        public Builder sourceMap(Optional<String> sourceMap) {
            this.sourceMap = sourceMap;
            return this;
        }

        public Builder sourceMap(String sourceMap) {
            this.sourceMap = Optional.ofNullable(sourceMap);
            return this;
        }

        @JsonSetter(value = "slug", nulls = Nulls.SKIP)
        public Builder slug(Optional<String> slug) {
            this.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            this.slug = Optional.ofNullable(slug);
            return this;
        }

        @JsonSetter(value = "options", nulls = Nulls.SKIP)
        public Builder options(Optional<Map<String, Object>> options) {
            this.options = options;
            return this;
        }

        public Builder options(Map<String, Object> options) {
            this.options = Optional.ofNullable(options);
            return this;
        }

        public AgentConfig build() {
            return new AgentConfig(topics, compiler, source, sourceMap, slug, options, additionalProperties);
        }
    }
}
