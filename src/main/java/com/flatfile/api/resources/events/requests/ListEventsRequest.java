/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.SpaceId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ListEventsRequest.Builder.class)
public final class ListEventsRequest {
    private final Optional<EnvironmentId> environmentId;

    private final Optional<SpaceId> spaceId;

    private final Optional<String> domain;

    private final Optional<String> topic;

    private final Optional<OffsetDateTime> since;

    private final Optional<Integer> pageSize;

    private final Optional<Integer> pageNumber;

    private final Optional<Boolean> includeAcknowledged;

    private final Map<String, Object> additionalProperties;

    private ListEventsRequest(
            Optional<EnvironmentId> environmentId,
            Optional<SpaceId> spaceId,
            Optional<String> domain,
            Optional<String> topic,
            Optional<OffsetDateTime> since,
            Optional<Integer> pageSize,
            Optional<Integer> pageNumber,
            Optional<Boolean> includeAcknowledged,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.spaceId = spaceId;
        this.domain = domain;
        this.topic = topic;
        this.since = since;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.includeAcknowledged = includeAcknowledged;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Filter by environment
     */
    @JsonProperty("environmentId")
    public Optional<EnvironmentId> getEnvironmentId() {
        return environmentId;
    }

    /**
     * @return Filter by space
     */
    @JsonProperty("spaceId")
    public Optional<SpaceId> getSpaceId() {
        return spaceId;
    }

    /**
     * @return Filter by event domain
     */
    @JsonProperty("domain")
    public Optional<String> getDomain() {
        return domain;
    }

    /**
     * @return Filter by event topic
     */
    @JsonProperty("topic")
    public Optional<String> getTopic() {
        return topic;
    }

    /**
     * @return Filter by event timestamp
     */
    @JsonProperty("since")
    public Optional<OffsetDateTime> getSince() {
        return since;
    }

    /**
     * @return Number of results to return in a page (default 10)
     */
    @JsonProperty("pageSize")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Based on pageSize, which page of results to return
     */
    @JsonProperty("pageNumber")
    public Optional<Integer> getPageNumber() {
        return pageNumber;
    }

    /**
     * @return Include acknowledged events
     */
    @JsonProperty("includeAcknowledged")
    public Optional<Boolean> getIncludeAcknowledged() {
        return includeAcknowledged;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListEventsRequest && equalTo((ListEventsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListEventsRequest other) {
        return environmentId.equals(other.environmentId)
                && spaceId.equals(other.spaceId)
                && domain.equals(other.domain)
                && topic.equals(other.topic)
                && since.equals(other.since)
                && pageSize.equals(other.pageSize)
                && pageNumber.equals(other.pageNumber)
                && includeAcknowledged.equals(other.includeAcknowledged);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.environmentId,
                this.spaceId,
                this.domain,
                this.topic,
                this.since,
                this.pageSize,
                this.pageNumber,
                this.includeAcknowledged);
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
        private Optional<EnvironmentId> environmentId = Optional.empty();

        private Optional<SpaceId> spaceId = Optional.empty();

        private Optional<String> domain = Optional.empty();

        private Optional<String> topic = Optional.empty();

        private Optional<OffsetDateTime> since = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<Integer> pageNumber = Optional.empty();

        private Optional<Boolean> includeAcknowledged = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListEventsRequest other) {
            environmentId(other.getEnvironmentId());
            spaceId(other.getSpaceId());
            domain(other.getDomain());
            topic(other.getTopic());
            since(other.getSince());
            pageSize(other.getPageSize());
            pageNumber(other.getPageNumber());
            includeAcknowledged(other.getIncludeAcknowledged());
            return this;
        }

        @JsonSetter(value = "environmentId", nulls = Nulls.SKIP)
        public Builder environmentId(Optional<EnvironmentId> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(EnvironmentId environmentId) {
            this.environmentId = Optional.of(environmentId);
            return this;
        }

        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public Builder spaceId(Optional<SpaceId> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        public Builder spaceId(SpaceId spaceId) {
            this.spaceId = Optional.of(spaceId);
            return this;
        }

        @JsonSetter(value = "domain", nulls = Nulls.SKIP)
        public Builder domain(Optional<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Optional.of(domain);
            return this;
        }

        @JsonSetter(value = "topic", nulls = Nulls.SKIP)
        public Builder topic(Optional<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Optional.of(topic);
            return this;
        }

        @JsonSetter(value = "since", nulls = Nulls.SKIP)
        public Builder since(Optional<OffsetDateTime> since) {
            this.since = since;
            return this;
        }

        public Builder since(OffsetDateTime since) {
            this.since = Optional.of(since);
            return this;
        }

        @JsonSetter(value = "pageSize", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "pageNumber", nulls = Nulls.SKIP)
        public Builder pageNumber(Optional<Integer> pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = Optional.of(pageNumber);
            return this;
        }

        @JsonSetter(value = "includeAcknowledged", nulls = Nulls.SKIP)
        public Builder includeAcknowledged(Optional<Boolean> includeAcknowledged) {
            this.includeAcknowledged = includeAcknowledged;
            return this;
        }

        public Builder includeAcknowledged(Boolean includeAcknowledged) {
            this.includeAcknowledged = Optional.of(includeAcknowledged);
            return this;
        }

        public ListEventsRequest build() {
            return new ListEventsRequest(
                    environmentId,
                    spaceId,
                    domain,
                    topic,
                    since,
                    pageSize,
                    pageNumber,
                    includeAcknowledged,
                    additionalProperties);
        }
    }
}
