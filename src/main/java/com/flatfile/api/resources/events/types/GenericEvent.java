/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = GenericEvent.Builder.class)
public final class GenericEvent implements IBaseEvent {
    private final Domain domain;

    private final Context context;

    private final Optional<EventAttributes> attributes;

    private final Optional<String> callbackUrl;

    private final Optional<String> dataUrl;

    private final Optional<String> target;

    private final Optional<Origin> origin;

    private final Optional<List<String>> namespaces;

    private final String id;

    private final OffsetDateTime createdAt;

    private final Optional<OffsetDateTime> deletedAt;

    private final Optional<OffsetDateTime> acknowledgedAt;

    private final Optional<String> acknowledgedBy;

    private final Map<String, Object> payload;

    private final Map<String, Object> additionalProperties;

    private GenericEvent(
            Domain domain,
            Context context,
            Optional<EventAttributes> attributes,
            Optional<String> callbackUrl,
            Optional<String> dataUrl,
            Optional<String> target,
            Optional<Origin> origin,
            Optional<List<String>> namespaces,
            String id,
            OffsetDateTime createdAt,
            Optional<OffsetDateTime> deletedAt,
            Optional<OffsetDateTime> acknowledgedAt,
            Optional<String> acknowledgedBy,
            Map<String, Object> payload,
            Map<String, Object> additionalProperties) {
        this.domain = domain;
        this.context = context;
        this.attributes = attributes;
        this.callbackUrl = callbackUrl;
        this.dataUrl = dataUrl;
        this.target = target;
        this.origin = origin;
        this.namespaces = namespaces;
        this.id = id;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.acknowledgedAt = acknowledgedAt;
        this.acknowledgedBy = acknowledgedBy;
        this.payload = payload;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The domain of the event
     */
    @JsonProperty("domain")
    @Override
    public Domain getDomain() {
        return domain;
    }

    /**
     * @return The context of the event
     */
    @JsonProperty("context")
    @Override
    public Context getContext() {
        return context;
    }

    /**
     * @return The attributes of the event
     */
    @JsonProperty("attributes")
    @Override
    public Optional<EventAttributes> getAttributes() {
        return attributes;
    }

    /**
     * @return The callback url to acknowledge the event
     */
    @JsonProperty("callbackUrl")
    @Override
    public Optional<String> getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * @return The url to retrieve the data associated with the event
     */
    @JsonProperty("dataUrl")
    @Override
    public Optional<String> getDataUrl() {
        return dataUrl;
    }

    @JsonProperty("target")
    @Override
    public Optional<String> getTarget() {
        return target;
    }

    @JsonProperty("origin")
    @Override
    public Optional<Origin> getOrigin() {
        return origin;
    }

    @JsonProperty("namespaces")
    @Override
    public Optional<List<String>> getNamespaces() {
        return namespaces;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Date the event was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Date the event was deleted
     */
    @JsonProperty("deletedAt")
    public Optional<OffsetDateTime> getDeletedAt() {
        return deletedAt;
    }

    /**
     * @return Date the event was acknowledged
     */
    @JsonProperty("acknowledgedAt")
    public Optional<OffsetDateTime> getAcknowledgedAt() {
        return acknowledgedAt;
    }

    /**
     * @return The actor (user or system) who acknowledged the event
     */
    @JsonProperty("acknowledgedBy")
    public Optional<String> getAcknowledgedBy() {
        return acknowledgedBy;
    }

    @JsonProperty("payload")
    public Map<String, Object> getPayload() {
        return payload;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenericEvent && equalTo((GenericEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenericEvent other) {
        return domain.equals(other.domain)
                && context.equals(other.context)
                && attributes.equals(other.attributes)
                && callbackUrl.equals(other.callbackUrl)
                && dataUrl.equals(other.dataUrl)
                && target.equals(other.target)
                && origin.equals(other.origin)
                && namespaces.equals(other.namespaces)
                && id.equals(other.id)
                && createdAt.equals(other.createdAt)
                && deletedAt.equals(other.deletedAt)
                && acknowledgedAt.equals(other.acknowledgedAt)
                && acknowledgedBy.equals(other.acknowledgedBy)
                && payload.equals(other.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.domain,
                this.context,
                this.attributes,
                this.callbackUrl,
                this.dataUrl,
                this.target,
                this.origin,
                this.namespaces,
                this.id,
                this.createdAt,
                this.deletedAt,
                this.acknowledgedAt,
                this.acknowledgedBy,
                this.payload);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DomainStage builder() {
        return new Builder();
    }

    public interface DomainStage {
        ContextStage domain(Domain domain);

        Builder from(GenericEvent other);
    }

    public interface ContextStage {
        IdStage context(Context context);
    }

    public interface IdStage {
        CreatedAtStage id(String id);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        GenericEvent build();

        _FinalStage attributes(Optional<EventAttributes> attributes);

        _FinalStage attributes(EventAttributes attributes);

        _FinalStage callbackUrl(Optional<String> callbackUrl);

        _FinalStage callbackUrl(String callbackUrl);

        _FinalStage dataUrl(Optional<String> dataUrl);

        _FinalStage dataUrl(String dataUrl);

        _FinalStage target(Optional<String> target);

        _FinalStage target(String target);

        _FinalStage origin(Optional<Origin> origin);

        _FinalStage origin(Origin origin);

        _FinalStage namespaces(Optional<List<String>> namespaces);

        _FinalStage namespaces(List<String> namespaces);

        _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt);

        _FinalStage deletedAt(OffsetDateTime deletedAt);

        _FinalStage acknowledgedAt(Optional<OffsetDateTime> acknowledgedAt);

        _FinalStage acknowledgedAt(OffsetDateTime acknowledgedAt);

        _FinalStage acknowledgedBy(Optional<String> acknowledgedBy);

        _FinalStage acknowledgedBy(String acknowledgedBy);

        _FinalStage payload(Map<String, Object> payload);

        _FinalStage putAllPayload(Map<String, Object> payload);

        _FinalStage payload(String key, Object value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DomainStage, ContextStage, IdStage, CreatedAtStage, _FinalStage {
        private Domain domain;

        private Context context;

        private String id;

        private OffsetDateTime createdAt;

        private Map<String, Object> payload = new LinkedHashMap<>();

        private Optional<String> acknowledgedBy = Optional.empty();

        private Optional<OffsetDateTime> acknowledgedAt = Optional.empty();

        private Optional<OffsetDateTime> deletedAt = Optional.empty();

        private Optional<List<String>> namespaces = Optional.empty();

        private Optional<Origin> origin = Optional.empty();

        private Optional<String> target = Optional.empty();

        private Optional<String> dataUrl = Optional.empty();

        private Optional<String> callbackUrl = Optional.empty();

        private Optional<EventAttributes> attributes = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(GenericEvent other) {
            domain(other.getDomain());
            context(other.getContext());
            attributes(other.getAttributes());
            callbackUrl(other.getCallbackUrl());
            dataUrl(other.getDataUrl());
            target(other.getTarget());
            origin(other.getOrigin());
            namespaces(other.getNamespaces());
            id(other.getId());
            createdAt(other.getCreatedAt());
            deletedAt(other.getDeletedAt());
            acknowledgedAt(other.getAcknowledgedAt());
            acknowledgedBy(other.getAcknowledgedBy());
            payload(other.getPayload());
            return this;
        }

        /**
         * <p>The domain of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("domain")
        public ContextStage domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The context of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("context")
        public IdStage context(Context context) {
            this.context = context;
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date the event was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        public _FinalStage payload(String key, Object value) {
            this.payload.put(key, value);
            return this;
        }

        @Override
        public _FinalStage putAllPayload(Map<String, Object> payload) {
            this.payload.putAll(payload);
            return this;
        }

        @Override
        @JsonSetter(value = "payload", nulls = Nulls.SKIP)
        public _FinalStage payload(Map<String, Object> payload) {
            this.payload.clear();
            this.payload.putAll(payload);
            return this;
        }

        /**
         * <p>The actor (user or system) who acknowledged the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage acknowledgedBy(String acknowledgedBy) {
            this.acknowledgedBy = Optional.of(acknowledgedBy);
            return this;
        }

        @Override
        @JsonSetter(value = "acknowledgedBy", nulls = Nulls.SKIP)
        public _FinalStage acknowledgedBy(Optional<String> acknowledgedBy) {
            this.acknowledgedBy = acknowledgedBy;
            return this;
        }

        /**
         * <p>Date the event was acknowledged</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage acknowledgedAt(OffsetDateTime acknowledgedAt) {
            this.acknowledgedAt = Optional.of(acknowledgedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "acknowledgedAt", nulls = Nulls.SKIP)
        public _FinalStage acknowledgedAt(Optional<OffsetDateTime> acknowledgedAt) {
            this.acknowledgedAt = acknowledgedAt;
            return this;
        }

        /**
         * <p>Date the event was deleted</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage deletedAt(OffsetDateTime deletedAt) {
            this.deletedAt = Optional.of(deletedAt);
            return this;
        }

        @Override
        @JsonSetter(value = "deletedAt", nulls = Nulls.SKIP)
        public _FinalStage deletedAt(Optional<OffsetDateTime> deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        @Override
        public _FinalStage namespaces(List<String> namespaces) {
            this.namespaces = Optional.of(namespaces);
            return this;
        }

        @Override
        @JsonSetter(value = "namespaces", nulls = Nulls.SKIP)
        public _FinalStage namespaces(Optional<List<String>> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        @Override
        public _FinalStage origin(Origin origin) {
            this.origin = Optional.of(origin);
            return this;
        }

        @Override
        @JsonSetter(value = "origin", nulls = Nulls.SKIP)
        public _FinalStage origin(Optional<Origin> origin) {
            this.origin = origin;
            return this;
        }

        @Override
        public _FinalStage target(String target) {
            this.target = Optional.of(target);
            return this;
        }

        @Override
        @JsonSetter(value = "target", nulls = Nulls.SKIP)
        public _FinalStage target(Optional<String> target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The url to retrieve the data associated with the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage dataUrl(String dataUrl) {
            this.dataUrl = Optional.of(dataUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "dataUrl", nulls = Nulls.SKIP)
        public _FinalStage dataUrl(Optional<String> dataUrl) {
            this.dataUrl = dataUrl;
            return this;
        }

        /**
         * <p>The callback url to acknowledge the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage callbackUrl(String callbackUrl) {
            this.callbackUrl = Optional.of(callbackUrl);
            return this;
        }

        @Override
        @JsonSetter(value = "callbackUrl", nulls = Nulls.SKIP)
        public _FinalStage callbackUrl(Optional<String> callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The attributes of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage attributes(EventAttributes attributes) {
            this.attributes = Optional.of(attributes);
            return this;
        }

        @Override
        @JsonSetter(value = "attributes", nulls = Nulls.SKIP)
        public _FinalStage attributes(Optional<EventAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }

        @Override
        public GenericEvent build() {
            return new GenericEvent(
                    domain,
                    context,
                    attributes,
                    callbackUrl,
                    dataUrl,
                    target,
                    origin,
                    namespaces,
                    id,
                    createdAt,
                    deletedAt,
                    acknowledgedAt,
                    acknowledgedBy,
                    payload,
                    additionalProperties);
        }
    }
}