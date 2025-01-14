/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.views.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.SheetId;
import com.flatfile.api.resources.commons.types.ViewId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = View.Builder.class)
public final class View {
    private final ViewId id;

    private final SheetId sheetId;

    private final String name;

    private final ViewConfig config;

    private final String createdBy;

    private final Map<String, Object> additionalProperties;

    private View(
            ViewId id,
            SheetId sheetId,
            String name,
            ViewConfig config,
            String createdBy,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.sheetId = sheetId;
        this.name = name;
        this.config = config;
        this.createdBy = createdBy;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the view
     */
    @JsonProperty("id")
    public ViewId getId() {
        return id;
    }

    /**
     * @return The associated sheet ID of the view
     */
    @JsonProperty("sheetId")
    public SheetId getSheetId() {
        return sheetId;
    }

    /**
     * @return The name of the view
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The view filters of the view
     */
    @JsonProperty("config")
    public ViewConfig getConfig() {
        return config;
    }

    /**
     * @return ID of the actor who created the view
     */
    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof View && equalTo((View) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(View other) {
        return id.equals(other.id)
                && sheetId.equals(other.sheetId)
                && name.equals(other.name)
                && config.equals(other.config)
                && createdBy.equals(other.createdBy);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.sheetId, this.name, this.config, this.createdBy);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        SheetIdStage id(@NotNull ViewId id);

        Builder from(View other);
    }

    public interface SheetIdStage {
        NameStage sheetId(@NotNull SheetId sheetId);
    }

    public interface NameStage {
        ConfigStage name(@NotNull String name);
    }

    public interface ConfigStage {
        CreatedByStage config(@NotNull ViewConfig config);
    }

    public interface CreatedByStage {
        _FinalStage createdBy(@NotNull String createdBy);
    }

    public interface _FinalStage {
        View build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, SheetIdStage, NameStage, ConfigStage, CreatedByStage, _FinalStage {
        private ViewId id;

        private SheetId sheetId;

        private String name;

        private ViewConfig config;

        private String createdBy;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(View other) {
            id(other.getId());
            sheetId(other.getSheetId());
            name(other.getName());
            config(other.getConfig());
            createdBy(other.getCreatedBy());
            return this;
        }

        /**
         * <p>The ID of the view</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public SheetIdStage id(@NotNull ViewId id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>The associated sheet ID of the view</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("sheetId")
        public NameStage sheetId(@NotNull SheetId sheetId) {
            this.sheetId = Objects.requireNonNull(sheetId, "sheetId must not be null");
            return this;
        }

        /**
         * <p>The name of the view</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public ConfigStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The view filters of the view</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("config")
        public CreatedByStage config(@NotNull ViewConfig config) {
            this.config = Objects.requireNonNull(config, "config must not be null");
            return this;
        }

        /**
         * <p>ID of the actor who created the view</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdBy")
        public _FinalStage createdBy(@NotNull String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy, "createdBy must not be null");
            return this;
        }

        @java.lang.Override
        public View build() {
            return new View(id, sheetId, name, config, createdBy, additionalProperties);
        }
    }
}
