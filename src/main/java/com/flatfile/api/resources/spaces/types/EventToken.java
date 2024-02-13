/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.spaces.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.AccountId;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EventToken.Builder.class)
public final class EventToken {
    private final Optional<AccountId> accountId;

    private final Optional<String> subscribeKey;

    private final Optional<Integer> ttl;

    private final Optional<String> token;

    private final Map<String, Object> additionalProperties;

    private EventToken(
            Optional<AccountId> accountId,
            Optional<String> subscribeKey,
            Optional<Integer> ttl,
            Optional<String> token,
            Map<String, Object> additionalProperties) {
        this.accountId = accountId;
        this.subscribeKey = subscribeKey;
        this.ttl = ttl;
        this.token = token;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the Account.
     */
    @JsonProperty("accountId")
    public Optional<AccountId> getAccountId() {
        return accountId;
    }

    /**
     * @return The id of the event bus to subscribe to
     */
    @JsonProperty("subscribeKey")
    public Optional<String> getSubscribeKey() {
        return subscribeKey;
    }

    /**
     * @return Time to live in minutes
     */
    @JsonProperty("ttl")
    public Optional<Integer> getTtl() {
        return ttl;
    }

    /**
     * @return This should be your API key.
     */
    @JsonProperty("token")
    public Optional<String> getToken() {
        return token;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventToken && equalTo((EventToken) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EventToken other) {
        return accountId.equals(other.accountId)
                && subscribeKey.equals(other.subscribeKey)
                && ttl.equals(other.ttl)
                && token.equals(other.token);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accountId, this.subscribeKey, this.ttl, this.token);
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
        private Optional<AccountId> accountId = Optional.empty();

        private Optional<String> subscribeKey = Optional.empty();

        private Optional<Integer> ttl = Optional.empty();

        private Optional<String> token = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EventToken other) {
            accountId(other.getAccountId());
            subscribeKey(other.getSubscribeKey());
            ttl(other.getTtl());
            token(other.getToken());
            return this;
        }

        @JsonSetter(value = "accountId", nulls = Nulls.SKIP)
        public Builder accountId(Optional<AccountId> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(AccountId accountId) {
            this.accountId = Optional.of(accountId);
            return this;
        }

        @JsonSetter(value = "subscribeKey", nulls = Nulls.SKIP)
        public Builder subscribeKey(Optional<String> subscribeKey) {
            this.subscribeKey = subscribeKey;
            return this;
        }

        public Builder subscribeKey(String subscribeKey) {
            this.subscribeKey = Optional.of(subscribeKey);
            return this;
        }

        @JsonSetter(value = "ttl", nulls = Nulls.SKIP)
        public Builder ttl(Optional<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(Integer ttl) {
            this.ttl = Optional.of(ttl);
            return this;
        }

        @JsonSetter(value = "token", nulls = Nulls.SKIP)
        public Builder token(Optional<String> token) {
            this.token = token;
            return this;
        }

        public Builder token(String token) {
            this.token = Optional.of(token);
            return this;
        }

        public EventToken build() {
            return new EventToken(accountId, subscribeKey, ttl, token, additionalProperties);
        }
    }
}
