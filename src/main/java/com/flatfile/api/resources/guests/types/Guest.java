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
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.GuestId;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Guest.Builder.class)
public final class Guest implements IGuestConfig {
    private final EnvironmentId environmentId;

    private final String email;

    private final String name;

    private final List<GuestSpace> spaces;

    private final GuestId id;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private Guest(
            EnvironmentId environmentId,
            String email,
            String name,
            List<GuestSpace> spaces,
            GuestId id,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.environmentId = environmentId;
        this.email = email;
        this.name = name;
        this.spaces = spaces;
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("environmentId")
    @Override
    public EnvironmentId getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("email")
    @Override
    public String getEmail() {
        return email;
    }

    @JsonProperty("name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty("spaces")
    @Override
    public List<GuestSpace> getSpaces() {
        return spaces;
    }

    @JsonProperty("id")
    public GuestId getId() {
        return id;
    }

    /**
     * @return Date the guest object was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Date the guest object was last updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Guest && equalTo((Guest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Guest other) {
        return environmentId.equals(other.environmentId)
                && email.equals(other.email)
                && name.equals(other.name)
                && spaces.equals(other.spaces)
                && id.equals(other.id)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.environmentId, this.email, this.name, this.spaces, this.id, this.createdAt, this.updatedAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EnvironmentIdStage builder() {
        return new Builder();
    }

    public interface EnvironmentIdStage {
        EmailStage environmentId(EnvironmentId environmentId);

        Builder from(Guest other);
    }

    public interface EmailStage {
        NameStage email(String email);
    }

    public interface NameStage {
        IdStage name(String name);
    }

    public interface IdStage {
        CreatedAtStage id(GuestId id);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        Guest build();

        _FinalStage spaces(List<GuestSpace> spaces);

        _FinalStage addSpaces(GuestSpace spaces);

        _FinalStage addAllSpaces(List<GuestSpace> spaces);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EnvironmentIdStage, EmailStage, NameStage, IdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private EnvironmentId environmentId;

        private String email;

        private String name;

        private GuestId id;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private List<GuestSpace> spaces = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Guest other) {
            environmentId(other.getEnvironmentId());
            email(other.getEmail());
            name(other.getName());
            spaces(other.getSpaces());
            id(other.getId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public EmailStage environmentId(EnvironmentId environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        @Override
        @JsonSetter("email")
        public NameStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        @JsonSetter("name")
        public IdStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("id")
        public CreatedAtStage id(GuestId id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Date the guest object was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Date the guest object was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public _FinalStage addAllSpaces(List<GuestSpace> spaces) {
            this.spaces.addAll(spaces);
            return this;
        }

        @Override
        public _FinalStage addSpaces(GuestSpace spaces) {
            this.spaces.add(spaces);
            return this;
        }

        @Override
        @JsonSetter(value = "spaces", nulls = Nulls.SKIP)
        public _FinalStage spaces(List<GuestSpace> spaces) {
            this.spaces.clear();
            this.spaces.addAll(spaces);
            return this;
        }

        @Override
        public Guest build() {
            return new Guest(environmentId, email, name, spaces, id, createdAt, updatedAt, additionalProperties);
        }
    }
}
