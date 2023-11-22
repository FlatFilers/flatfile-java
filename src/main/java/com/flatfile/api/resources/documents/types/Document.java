/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.documents.types;

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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Document.Builder.class)
public final class Document implements IDocumentConfig {
    private final String title;

    private final String body;

    private final Optional<List<String>> treatments;

    private final Optional<List<Action>> actions;

    private final String id;

    private final Optional<String> spaceId;

    private final Optional<String> environmentId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private Document(
            String title,
            String body,
            Optional<List<String>> treatments,
            Optional<List<Action>> actions,
            String id,
            Optional<String> spaceId,
            Optional<String> environmentId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.title = title;
        this.body = body;
        this.treatments = treatments;
        this.actions = actions;
        this.id = id;
        this.spaceId = spaceId;
        this.environmentId = environmentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("title")
    @Override
    public String getTitle() {
        return title;
    }

    @JsonProperty("body")
    @Override
    public String getBody() {
        return body;
    }

    @JsonProperty("treatments")
    @Override
    public Optional<List<String>> getTreatments() {
        return treatments;
    }

    @JsonProperty("actions")
    @Override
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("spaceId")
    public Optional<String> getSpaceId() {
        return spaceId;
    }

    @JsonProperty("environmentId")
    public Optional<String> getEnvironmentId() {
        return environmentId;
    }

    /**
     * @return Date the document was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Date the document was last updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Document && equalTo((Document) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Document other) {
        return title.equals(other.title)
                && body.equals(other.body)
                && treatments.equals(other.treatments)
                && actions.equals(other.actions)
                && id.equals(other.id)
                && spaceId.equals(other.spaceId)
                && environmentId.equals(other.environmentId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.title,
                this.body,
                this.treatments,
                this.actions,
                this.id,
                this.spaceId,
                this.environmentId,
                this.createdAt,
                this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TitleStage builder() {
        return new Builder();
    }

    public interface TitleStage {
        BodyStage title(String title);

        Builder from(Document other);
    }

    public interface BodyStage {
        IdStage body(String body);
    }

    public interface IdStage {
        CreatedAtStage id(String id);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        Document build();

        _FinalStage treatments(Optional<List<String>> treatments);

        _FinalStage treatments(List<String> treatments);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);

        _FinalStage spaceId(Optional<String> spaceId);

        _FinalStage spaceId(String spaceId);

        _FinalStage environmentId(Optional<String> environmentId);

        _FinalStage environmentId(String environmentId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TitleStage, BodyStage, IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String title;

        private String body;

        private String id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<String> environmentId = Optional.empty();

        private Optional<String> spaceId = Optional.empty();

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<List<String>> treatments = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Document other) {
            title(other.getTitle());
            body(other.getBody());
            treatments(other.getTreatments());
            actions(other.getActions());
            id(other.getId());
            spaceId(other.getSpaceId());
            environmentId(other.getEnvironmentId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @Override
        @JsonSetter("title")
        public BodyStage title(String title) {
            this.title = title;
            return this;
        }

        @Override
        @JsonSetter("body")
        public IdStage body(String body) {
            this.body = body;
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date the document was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Date the document was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage environmentId(String environmentId) {
            this.environmentId = Optional.of(environmentId);
            return this;
        }

        @Override
        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public _FinalStage environmentId(Optional<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public _FinalStage spaceId(String spaceId) {
            this.spaceId = Optional.of(spaceId);
            return this;
        }

        @Override
        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public _FinalStage spaceId(Optional<String> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public _FinalStage actions(List<Action> actions) {
            this.actions = Optional.of(actions);
            return this;
        }

        @Override
        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public _FinalStage actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        @Override
        public _FinalStage treatments(List<String> treatments) {
            this.treatments = Optional.of(treatments);
            return this;
        }

        @Override
        @JsonSetter(value = "treatments", nulls = Nulls.SKIP)
        public _FinalStage treatments(Optional<List<String>> treatments) {
            this.treatments = treatments;
            return this;
        }

        @Override
        public Document build() {
            return new Document(
                    title,
                    body,
                    treatments,
                    actions,
                    id,
                    spaceId,
                    environmentId,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}