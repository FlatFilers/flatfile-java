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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = DocumentConfig.Builder.class)
public final class DocumentConfig implements IDocumentConfig {
    private final String title;

    private final String body;

    private final Optional<List<String>> treatments;

    private final Optional<List<Action>> actions;

    private final Map<String, Object> additionalProperties;

    private DocumentConfig(
            String title,
            String body,
            Optional<List<String>> treatments,
            Optional<List<Action>> actions,
            Map<String, Object> additionalProperties) {
        this.title = title;
        this.body = body;
        this.treatments = treatments;
        this.actions = actions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("title")
    @java.lang.Override
    public String getTitle() {
        return title;
    }

    @JsonProperty("body")
    @java.lang.Override
    public String getBody() {
        return body;
    }

    /**
     * @return Certain treatments will cause your Document to look or behave differently.
     */
    @JsonProperty("treatments")
    @java.lang.Override
    public Optional<List<String>> getTreatments() {
        return treatments;
    }

    @JsonProperty("actions")
    @java.lang.Override
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DocumentConfig && equalTo((DocumentConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DocumentConfig other) {
        return title.equals(other.title)
                && body.equals(other.body)
                && treatments.equals(other.treatments)
                && actions.equals(other.actions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.title, this.body, this.treatments, this.actions);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TitleStage builder() {
        return new Builder();
    }

    public interface TitleStage {
        BodyStage title(@NotNull String title);

        Builder from(DocumentConfig other);
    }

    public interface BodyStage {
        _FinalStage body(@NotNull String body);
    }

    public interface _FinalStage {
        DocumentConfig build();

        _FinalStage treatments(Optional<List<String>> treatments);

        _FinalStage treatments(List<String> treatments);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TitleStage, BodyStage, _FinalStage {
        private String title;

        private String body;

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<List<String>> treatments = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DocumentConfig other) {
            title(other.getTitle());
            body(other.getBody());
            treatments(other.getTreatments());
            actions(other.getActions());
            return this;
        }

        @java.lang.Override
        @JsonSetter("title")
        public BodyStage title(@NotNull String title) {
            this.title = Objects.requireNonNull(title, "title must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("body")
        public _FinalStage body(@NotNull String body) {
            this.body = Objects.requireNonNull(body, "body must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage actions(List<Action> actions) {
            this.actions = Optional.ofNullable(actions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public _FinalStage actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>Certain treatments will cause your Document to look or behave differently.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage treatments(List<String> treatments) {
            this.treatments = Optional.ofNullable(treatments);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "treatments", nulls = Nulls.SKIP)
        public _FinalStage treatments(Optional<List<String>> treatments) {
            this.treatments = treatments;
            return this;
        }

        @java.lang.Override
        public DocumentConfig build() {
            return new DocumentConfig(title, body, treatments, actions, additionalProperties);
        }
    }
}
