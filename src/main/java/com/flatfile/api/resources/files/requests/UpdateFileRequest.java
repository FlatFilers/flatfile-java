/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.files.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.Action;
import com.flatfile.api.resources.files.types.Mode;
import com.flatfile.api.resources.files.types.ModelFileStatusEnum;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UpdateFileRequest.Builder.class)
public final class UpdateFileRequest {
    private final Optional<String> workbookId;

    private final Optional<String> name;

    private final Optional<Mode> mode;

    private final Optional<ModelFileStatusEnum> status;

    private final Optional<List<Action>> actions;

    private final Map<String, Object> additionalProperties;

    private UpdateFileRequest(
            Optional<String> workbookId,
            Optional<String> name,
            Optional<Mode> mode,
            Optional<ModelFileStatusEnum> status,
            Optional<List<Action>> actions,
            Map<String, Object> additionalProperties) {
        this.workbookId = workbookId;
        this.name = name;
        this.mode = mode;
        this.status = status;
        this.actions = actions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("workbookId")
    public Optional<String> getWorkbookId() {
        return workbookId;
    }

    /**
     * @return The name of the file
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The storage mode of file to update
     */
    @JsonProperty("mode")
    public Optional<Mode> getMode() {
        return mode;
    }

    /**
     * @return Status of the file
     */
    @JsonProperty("status")
    public Optional<ModelFileStatusEnum> getStatus() {
        return status;
    }

    /**
     * @return The actions attached to the file
     */
    @JsonProperty("actions")
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateFileRequest && equalTo((UpdateFileRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateFileRequest other) {
        return workbookId.equals(other.workbookId)
                && name.equals(other.name)
                && mode.equals(other.mode)
                && status.equals(other.status)
                && actions.equals(other.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.workbookId, this.name, this.mode, this.status, this.actions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> workbookId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Mode> mode = Optional.empty();

        private Optional<ModelFileStatusEnum> status = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateFileRequest other) {
            workbookId(other.getWorkbookId());
            name(other.getName());
            mode(other.getMode());
            status(other.getStatus());
            actions(other.getActions());
            return this;
        }

        @JsonSetter(value = "workbookId", nulls = Nulls.SKIP)
        public Builder workbookId(Optional<String> workbookId) {
            this.workbookId = workbookId;
            return this;
        }

        public Builder workbookId(String workbookId) {
            this.workbookId = Optional.of(workbookId);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "mode", nulls = Nulls.SKIP)
        public Builder mode(Optional<Mode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(Mode mode) {
            this.mode = Optional.of(mode);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<ModelFileStatusEnum> status) {
            this.status = status;
            return this;
        }

        public Builder status(ModelFileStatusEnum status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public Builder actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder actions(List<Action> actions) {
            this.actions = Optional.of(actions);
            return this;
        }

        public UpdateFileRequest build() {
            return new UpdateFileRequest(workbookId, name, mode, status, actions, additionalProperties);
        }
    }
}