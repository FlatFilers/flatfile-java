/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.apps.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.AppId;
import com.flatfile.api.resources.commons.types.ConstraintId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ConstraintResource.Builder.class)
public final class ConstraintResource implements IConstraintResource {
    private final ConstraintId id;

    private final AppId appId;

    private final String validator;

    private final Optional<String> description;

    private final Optional<String> function;

    private final Optional<Object> options;

    private final Optional<String> label;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<OffsetDateTime> deletedAt;

    private final Map<String, Object> additionalProperties;

    private ConstraintResource(
            ConstraintId id,
            AppId appId,
            String validator,
            Optional<String> description,
            Optional<String> function,
            Optional<Object> options,
            Optional<String> label,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<OffsetDateTime> deletedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.appId = appId;
        this.validator = validator;
        this.description = description;
        this.function = function;
        this.options = options;
        this.label = label;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    @java.lang.Override
    public ConstraintId getId() {
        return id;
    }

    @JsonProperty("appId")
    @java.lang.Override
    public AppId getAppId() {
        return appId;
    }

    @JsonProperty("validator")
    @java.lang.Override
    public String getValidator() {
        return validator;
    }

    @JsonProperty("description")
    @java.lang.Override
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("function")
    @java.lang.Override
    public Optional<String> getFunction() {
        return function;
    }

    @JsonProperty("options")
    @java.lang.Override
    public Optional<Object> getOptions() {
        return options;
    }

    @JsonProperty("label")
    @java.lang.Override
    public Optional<String> getLabel() {
        return label;
    }

    @JsonProperty("createdAt")
    @java.lang.Override
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    @java.lang.Override
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("deletedAt")
    @java.lang.Override
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConstraintResource && equalTo((ConstraintResource) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConstraintResource other) {
        return id.equals(other.id)
                && appId.equals(other.appId)
                && validator.equals(other.validator)
                && description.equals(other.description)
                && function.equals(other.function)
                && options.equals(other.options)
                && label.equals(other.label)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && deletedAt.equals(other.deletedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.appId,
                this.validator,
                this.description,
                this.function,
                this.options,
                this.label,
                this.createdAt,
                this.updatedAt,
                this.deletedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        AppIdStage id(@NotNull ConstraintId id);

        Builder from(ConstraintResource other);
    }

    public interface AppIdStage {
        ValidatorStage appId(@NotNull AppId appId);
    }

    public interface ValidatorStage {
        CreatedAtStage validator(@NotNull String validator);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ConstraintResource build();

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage function(Optional<String> function);

        _FinalStage function(String function);

        _FinalStage options(Optional<Object> options);

        _FinalStage options(Object options);

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, AppIdStage, ValidatorStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private ConstraintId id;

        private AppId appId;

        private String validator;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Optional<String> label = Optional.empty();

        private Optional<Object> options = Optional.empty();

        private Optional<String> function = Optional.empty();

        private Optional<String> description = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConstraintResource other) {
            id(other.getId());
            appId(other.getAppId());
            validator(other.getValidator());
            description(other.getDescription());
            function(other.getFunction());
            options(other.getOptions());
            label(other.getLabel());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            deletedAt(other.getDeletedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public AppIdStage id(@NotNull ConstraintId id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("appId")
        public ValidatorStage appId(@NotNull AppId appId) {
            this.appId = Objects.requireNonNull(appId, "appId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("validator")
        public CreatedAtStage validator(@NotNull String validator) {
            this.validator = Objects.requireNonNull(validator, "validator must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage deletedAt(OffsetDateTime deletedAt) {
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "deletedAt", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        @java.lang.Override
        public _FinalStage label(String label) {
            this.label = Optional.ofNullable(label);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        @java.lang.Override
        public _FinalStage options(Object options) {
            this.options = Optional.ofNullable(options);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "options", nulls = Nulls.SKIP)
        public _FinalStage options(Optional<Object> options) {
            this.options = options;
            return this;
        }

        @java.lang.Override
        public _FinalStage function(String function) {
            this.function = Optional.ofNullable(function);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "function", nulls = Nulls.SKIP)
        public _FinalStage function(Optional<String> function) {
            this.function = function;
            return this;
        }

        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        public ConstraintResource build() {
            return new ConstraintResource(
                    id,
                    appId,
                    validator,
                    description,
                    function,
                    options,
                    label,
                    createdAt,
                    updatedAt,
                    deletedAt,
                    additionalProperties);
        }
    }
}