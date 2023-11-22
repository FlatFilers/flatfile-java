/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.users.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ExchangeTokenData.Builder.class)
public final class ExchangeTokenData {
    private final boolean valid;

    private final Optional<String> token;

    private final Optional<String> sentTo;

    private final Map<String, Object> additionalProperties;

    private ExchangeTokenData(
            boolean valid, Optional<String> token, Optional<String> sentTo, Map<String, Object> additionalProperties) {
        this.valid = valid;
        this.token = token;
        this.sentTo = sentTo;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Whether the provided token was valid
     */
    @JsonProperty("valid")
    public boolean getValid() {
        return valid;
    }

    /**
     * @return The refreshed token, if the provided token was valid
     */
    @JsonProperty("token")
    public Optional<String> getToken() {
        return token;
    }

    /**
     * @return The email address the recovery email was sent to, if the provided token was not valid
     */
    @JsonProperty("sentTo")
    public Optional<String> getSentTo() {
        return sentTo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExchangeTokenData && equalTo((ExchangeTokenData) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExchangeTokenData other) {
        return valid == other.valid && token.equals(other.token) && sentTo.equals(other.sentTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.valid, this.token, this.sentTo);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValidStage builder() {
        return new Builder();
    }

    public interface ValidStage {
        _FinalStage valid(boolean valid);

        Builder from(ExchangeTokenData other);
    }

    public interface _FinalStage {
        ExchangeTokenData build();

        _FinalStage token(Optional<String> token);

        _FinalStage token(String token);

        _FinalStage sentTo(Optional<String> sentTo);

        _FinalStage sentTo(String sentTo);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValidStage, _FinalStage {
        private boolean valid;

        private Optional<String> sentTo = Optional.empty();

        private Optional<String> token = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ExchangeTokenData other) {
            valid(other.getValid());
            token(other.getToken());
            sentTo(other.getSentTo());
            return this;
        }

        /**
         * <p>Whether the provided token was valid</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("valid")
        public _FinalStage valid(boolean valid) {
            this.valid = valid;
            return this;
        }

        /**
         * <p>The email address the recovery email was sent to, if the provided token was not valid</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage sentTo(String sentTo) {
            this.sentTo = Optional.of(sentTo);
            return this;
        }

        @Override
        @JsonSetter(value = "sentTo", nulls = Nulls.SKIP)
        public _FinalStage sentTo(Optional<String> sentTo) {
            this.sentTo = sentTo;
            return this;
        }

        /**
         * <p>The refreshed token, if the provided token was valid</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage token(String token) {
            this.token = Optional.of(token);
            return this;
        }

        @Override
        @JsonSetter(value = "token", nulls = Nulls.SKIP)
        public _FinalStage token(Optional<String> token) {
            this.token = token;
            return this;
        }

        @Override
        public ExchangeTokenData build() {
            return new ExchangeTokenData(valid, token, sentTo, additionalProperties);
        }
    }
}
