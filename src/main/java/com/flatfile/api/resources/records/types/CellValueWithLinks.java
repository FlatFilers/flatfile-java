/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CellValueWithLinks.Builder.class)
public final class CellValueWithLinks implements ICellValue {
    private final Optional<Boolean> valid;

    private final Optional<List<ValidationMessage>> messages;

    private final Optional<CellValueUnion> value;

    private final Optional<String> layer;

    private final Optional<OffsetDateTime> updatedAt;

    private final Optional<Records> links;

    private final Map<String, Object> additionalProperties;

    private CellValueWithLinks(
            Optional<Boolean> valid,
            Optional<List<ValidationMessage>> messages,
            Optional<CellValueUnion> value,
            Optional<String> layer,
            Optional<OffsetDateTime> updatedAt,
            Optional<Records> links,
            Map<String, Object> additionalProperties) {
        this.valid = valid;
        this.messages = messages;
        this.value = value;
        this.layer = layer;
        this.updatedAt = updatedAt;
        this.links = links;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("valid")
    @Override
    public Optional<Boolean> getValid() {
        return valid;
    }

    @JsonProperty("messages")
    @Override
    public Optional<List<ValidationMessage>> getMessages() {
        return messages;
    }

    @JsonProperty("value")
    @Override
    public Optional<CellValueUnion> getValue() {
        return value;
    }

    @JsonProperty("layer")
    @Override
    public Optional<String> getLayer() {
        return layer;
    }

    @JsonProperty("updatedAt")
    @Override
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("links")
    public Optional<Records> getLinks() {
        return links;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CellValueWithLinks && equalTo((CellValueWithLinks) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CellValueWithLinks other) {
        return valid.equals(other.valid)
                && messages.equals(other.messages)
                && value.equals(other.value)
                && layer.equals(other.layer)
                && updatedAt.equals(other.updatedAt)
                && links.equals(other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.valid, this.messages, this.value, this.layer, this.updatedAt, this.links);
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
        private Optional<Boolean> valid = Optional.empty();

        private Optional<List<ValidationMessage>> messages = Optional.empty();

        private Optional<CellValueUnion> value = Optional.empty();

        private Optional<String> layer = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<Records> links = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CellValueWithLinks other) {
            valid(other.getValid());
            messages(other.getMessages());
            value(other.getValue());
            layer(other.getLayer());
            updatedAt(other.getUpdatedAt());
            links(other.getLinks());
            return this;
        }

        @JsonSetter(value = "valid", nulls = Nulls.SKIP)
        public Builder valid(Optional<Boolean> valid) {
            this.valid = valid;
            return this;
        }

        public Builder valid(Boolean valid) {
            this.valid = Optional.of(valid);
            return this;
        }

        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public Builder messages(Optional<List<ValidationMessage>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(List<ValidationMessage> messages) {
            this.messages = Optional.of(messages);
            return this;
        }

        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public Builder value(Optional<CellValueUnion> value) {
            this.value = value;
            return this;
        }

        public Builder value(CellValueUnion value) {
            this.value = Optional.of(value);
            return this;
        }

        @JsonSetter(value = "layer", nulls = Nulls.SKIP)
        public Builder layer(Optional<String> layer) {
            this.layer = layer;
            return this;
        }

        public Builder layer(String layer) {
            this.layer = Optional.of(layer);
            return this;
        }

        @JsonSetter(value = "updatedAt", nulls = Nulls.SKIP)
        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Optional.of(updatedAt);
            return this;
        }

        @JsonSetter(value = "links", nulls = Nulls.SKIP)
        public Builder links(Optional<Records> links) {
            this.links = links;
            return this;
        }

        public Builder links(Records links) {
            this.links = Optional.of(links);
            return this;
        }

        public CellValueWithLinks build() {
            return new CellValueWithLinks(valid, messages, value, layer, updatedAt, links, additionalProperties);
        }
    }
}
