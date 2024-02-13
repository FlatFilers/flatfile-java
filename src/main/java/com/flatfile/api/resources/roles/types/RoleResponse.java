/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.roles.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.AccountId;
import com.flatfile.api.resources.commons.types.RoleId;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RoleResponse.Builder.class)
public final class RoleResponse {
    private final RoleId id;

    private final String name;

    private final AccountId accountId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private RoleResponse(
            RoleId id,
            String name,
            AccountId accountId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.accountId = accountId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public RoleId getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("accountId")
    public AccountId getAccountId() {
        return accountId;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RoleResponse && equalTo((RoleResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RoleResponse other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && accountId.equals(other.accountId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.accountId, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(RoleId id);

        Builder from(RoleResponse other);
    }

    public interface NameStage {
        AccountIdStage name(String name);
    }

    public interface AccountIdStage {
        CreatedAtStage accountId(AccountId accountId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        RoleResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, NameStage, AccountIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private RoleId id;

        private String name;

        private AccountId accountId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RoleResponse other) {
            id(other.getId());
            name(other.getName());
            accountId(other.getAccountId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(RoleId id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public AccountIdStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("accountId")
        public CreatedAtStage accountId(AccountId accountId) {
            this.accountId = accountId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @java.lang.Override
        public RoleResponse build() {
            return new RoleResponse(id, name, accountId, createdAt, updatedAt, additionalProperties);
        }
    }
}
