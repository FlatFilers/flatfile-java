/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.guests.types;

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
@JsonDeserialize(builder = Invite.Builder.class)
public final class Invite {
    private final String guestId;

    private final String spaceId;

    private final Optional<String> fromName;

    private final Optional<String> message;

    private final Map<String, Object> additionalProperties;

    private Invite(
            String guestId,
            String spaceId,
            Optional<String> fromName,
            Optional<String> message,
            Map<String, Object> additionalProperties) {
        this.guestId = guestId;
        this.spaceId = spaceId;
        this.fromName = fromName;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("guestId")
    public String getGuestId() {
        return guestId;
    }

    @JsonProperty("spaceId")
    public String getSpaceId() {
        return spaceId;
    }

    /**
     * @return The name of the person or company sending the invitation
     */
    @JsonProperty("fromName")
    public Optional<String> getFromName() {
        return fromName;
    }

    /**
     * @return Message to send with the invite
     */
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Invite && equalTo((Invite) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Invite other) {
        return guestId.equals(other.guestId)
                && spaceId.equals(other.spaceId)
                && fromName.equals(other.fromName)
                && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.guestId, this.spaceId, this.fromName, this.message);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static GuestIdStage builder() {
        return new Builder();
    }

    public interface GuestIdStage {
        SpaceIdStage guestId(String guestId);

        Builder from(Invite other);
    }

    public interface SpaceIdStage {
        _FinalStage spaceId(String spaceId);
    }

    public interface _FinalStage {
        Invite build();

        _FinalStage fromName(Optional<String> fromName);

        _FinalStage fromName(String fromName);

        _FinalStage message(Optional<String> message);

        _FinalStage message(String message);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements GuestIdStage, SpaceIdStage, _FinalStage {
        private String guestId;

        private String spaceId;

        private Optional<String> message = Optional.empty();

        private Optional<String> fromName = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Invite other) {
            guestId(other.getGuestId());
            spaceId(other.getSpaceId());
            fromName(other.getFromName());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("guestId")
        public SpaceIdStage guestId(String guestId) {
            this.guestId = guestId;
            return this;
        }

        @Override
        @JsonSetter("spaceId")
        public _FinalStage spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * <p>Message to send with the invite</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage message(String message) {
            this.message = Optional.of(message);
            return this;
        }

        @Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<String> message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the person or company sending the invitation</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage fromName(String fromName) {
            this.fromName = Optional.of(fromName);
            return this;
        }

        @Override
        @JsonSetter(value = "fromName", nulls = Nulls.SKIP)
        public _FinalStage fromName(Optional<String> fromName) {
            this.fromName = fromName;
            return this;
        }

        @Override
        public Invite build() {
            return new Invite(guestId, spaceId, fromName, message, additionalProperties);
        }
    }
}
