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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GuideCreateRequest.Builder.class)
public final class GuideCreateRequest {
    private final String description;

    private final String title;

    private final Optional<Map<String, Object>> metadata;

    private final String slug;

    private final List<GuideVersionResource> versions;

    private final List<Optional<Map<String, Object>>> blocks;

    private final String environmentId;

    private final Map<String, Object> additionalProperties;

    private GuideCreateRequest(
            String description,
            String title,
            Optional<Map<String, Object>> metadata,
            String slug,
            List<GuideVersionResource> versions,
            List<Optional<Map<String, Object>>> blocks,
            String environmentId,
            Map<String, Object> additionalProperties) {
        this.description = description;
        this.title = title;
        this.metadata = metadata;
        this.slug = slug;
        this.versions = versions;
        this.blocks = blocks;
        this.environmentId = environmentId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("versions")
    public List<GuideVersionResource> getVersions() {
        return versions;
    }

    @JsonProperty("blocks")
    public List<Optional<Map<String, Object>>> getBlocks() {
        return blocks;
    }

    @JsonProperty("environmentId")
    public String getEnvironmentId() {
        return environmentId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GuideCreateRequest && equalTo((GuideCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GuideCreateRequest other) {
        return description.equals(other.description)
                && title.equals(other.title)
                && metadata.equals(other.metadata)
                && slug.equals(other.slug)
                && versions.equals(other.versions)
                && blocks.equals(other.blocks)
                && environmentId.equals(other.environmentId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.description, this.title, this.metadata, this.slug, this.versions, this.blocks, this.environmentId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DescriptionStage builder() {
        return new Builder();
    }

    public interface DescriptionStage {
        TitleStage description(@NotNull String description);

        Builder from(GuideCreateRequest other);
    }

    public interface TitleStage {
        SlugStage title(@NotNull String title);
    }

    public interface SlugStage {
        EnvironmentIdStage slug(@NotNull String slug);
    }

    public interface EnvironmentIdStage {
        _FinalStage environmentId(@NotNull String environmentId);
    }

    public interface _FinalStage {
        GuideCreateRequest build();

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);

        _FinalStage versions(List<GuideVersionResource> versions);

        _FinalStage addVersions(GuideVersionResource versions);

        _FinalStage addAllVersions(List<GuideVersionResource> versions);

        _FinalStage blocks(List<Optional<Map<String, Object>>> blocks);

        _FinalStage addBlocks(Optional<Map<String, Object>> blocks);

        _FinalStage addAllBlocks(List<Optional<Map<String, Object>>> blocks);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DescriptionStage, TitleStage, SlugStage, EnvironmentIdStage, _FinalStage {
        private String description;

        private String title;

        private String slug;

        private String environmentId;

        private List<Optional<Map<String, Object>>> blocks = new ArrayList<>();

        private List<GuideVersionResource> versions = new ArrayList<>();

        private Optional<Map<String, Object>> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GuideCreateRequest other) {
            description(other.getDescription());
            title(other.getTitle());
            metadata(other.getMetadata());
            slug(other.getSlug());
            versions(other.getVersions());
            blocks(other.getBlocks());
            environmentId(other.getEnvironmentId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("description")
        public TitleStage description(@NotNull String description) {
            this.description = Objects.requireNonNull(description, "description must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("title")
        public SlugStage title(@NotNull String title) {
            this.title = Objects.requireNonNull(title, "title must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("slug")
        public EnvironmentIdStage slug(@NotNull String slug) {
            this.slug = Objects.requireNonNull(slug, "slug must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("environmentId")
        public _FinalStage environmentId(@NotNull String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId, "environmentId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllBlocks(List<Optional<Map<String, Object>>> blocks) {
            this.blocks.addAll(blocks);
            return this;
        }

        @java.lang.Override
        public _FinalStage addBlocks(Optional<Map<String, Object>> blocks) {
            this.blocks.add(blocks);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "blocks", nulls = Nulls.SKIP)
        public _FinalStage blocks(List<Optional<Map<String, Object>>> blocks) {
            this.blocks.clear();
            this.blocks.addAll(blocks);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllVersions(List<GuideVersionResource> versions) {
            this.versions.addAll(versions);
            return this;
        }

        @java.lang.Override
        public _FinalStage addVersions(GuideVersionResource versions) {
            this.versions.add(versions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "versions", nulls = Nulls.SKIP)
        public _FinalStage versions(List<GuideVersionResource> versions) {
            this.versions.clear();
            this.versions.addAll(versions);
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public GuideCreateRequest build() {
            return new GuideCreateRequest(
                    description, title, metadata, slug, versions, blocks, environmentId, additionalProperties);
        }
    }
}
