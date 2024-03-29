/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.users.requests;

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
@JsonDeserialize(builder = ListUsersRequest.Builder.class)
public final class ListUsersRequest {
    private final Optional<String> email;

    private final Map<String, Object> additionalProperties;

    private ListUsersRequest(Optional<String> email, Map<String, Object> additionalProperties) {
        this.email = email;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Email of guest to return
     */
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListUsersRequest && equalTo((ListUsersRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListUsersRequest other) {
        return email.equals(other.email);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.email);
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
        private Optional<String> email = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListUsersRequest other) {
            email(other.getEmail());
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = Optional.of(email);
            return this;
        }

        public ListUsersRequest build() {
            return new ListUsersRequest(email, additionalProperties);
        }
    }
}
