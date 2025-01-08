/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.FamilyId;
import com.flatfile.api.resources.commons.types.UserId;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Program.Builder.class)
public final class Program {
    private final List<MappingRuleOrConfig> rules;

    private final Optional<String> id;

    private final Optional<String> namespace;

    private final Optional<FamilyId> familyId;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<UserId> createdBy;

    private final List<String> sourceKeys;

    private final List<String> destinationKeys;

    private final Optional<ProgramSummary> summary;

    private final Optional<String> accessToken;

    private final Map<String, Object> additionalProperties;

    private Program(
            List<MappingRuleOrConfig> rules,
            Optional<String> id,
            Optional<String> namespace,
            Optional<FamilyId> familyId,
            Optional<OffsetDateTime> createdAt,
            Optional<UserId> createdBy,
            List<String> sourceKeys,
            List<String> destinationKeys,
            Optional<ProgramSummary> summary,
            Optional<String> accessToken,
            Map<String, Object> additionalProperties) {
        this.rules = rules;
        this.id = id;
        this.namespace = namespace;
        this.familyId = familyId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.sourceKeys = sourceKeys;
        this.destinationKeys = destinationKeys;
        this.summary = summary;
        this.accessToken = accessToken;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Mapping rules
     */
    @JsonProperty("rules")
    public List<MappingRuleOrConfig> getRules() {
        return rules;
    }

    /**
     * @return If this program was saved, this is the ID of the program
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return Namespace of the program
     */
    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return Family ID of the program, if it belongs to a family
     */
    @JsonProperty("familyId")
    public Optional<FamilyId> getFamilyId() {
        return familyId;
    }

    /**
     * @return If this program was saved, this is the time it was created
     */
    @JsonProperty("createdAt")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return If this program was saved, this is the user ID of the creator
     */
    @JsonProperty("createdBy")
    public Optional<UserId> getCreatedBy() {
        return createdBy;
    }

    /**
     * @return Source keys
     */
    @JsonProperty("sourceKeys")
    public List<String> getSourceKeys() {
        return sourceKeys;
    }

    /**
     * @return Destination keys
     */
    @JsonProperty("destinationKeys")
    public List<String> getDestinationKeys() {
        return destinationKeys;
    }

    /**
     * @return Summary of the mapping rules
     */
    @JsonProperty("summary")
    public Optional<ProgramSummary> getSummary() {
        return summary;
    }

    /**
     * @return If this program was saved, this token allows you to modify the program
     */
    @JsonProperty("accessToken")
    public Optional<String> getAccessToken() {
        return accessToken;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Program && equalTo((Program) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Program other) {
        return rules.equals(other.rules)
                && id.equals(other.id)
                && namespace.equals(other.namespace)
                && familyId.equals(other.familyId)
                && createdAt.equals(other.createdAt)
                && createdBy.equals(other.createdBy)
                && sourceKeys.equals(other.sourceKeys)
                && destinationKeys.equals(other.destinationKeys)
                && summary.equals(other.summary)
                && accessToken.equals(other.accessToken);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.rules,
                this.id,
                this.namespace,
                this.familyId,
                this.createdAt,
                this.createdBy,
                this.sourceKeys,
                this.destinationKeys,
                this.summary,
                this.accessToken);
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
        private List<MappingRuleOrConfig> rules = new ArrayList<>();

        private Optional<String> id = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<FamilyId> familyId = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<UserId> createdBy = Optional.empty();

        private List<String> sourceKeys = new ArrayList<>();

        private List<String> destinationKeys = new ArrayList<>();

        private Optional<ProgramSummary> summary = Optional.empty();

        private Optional<String> accessToken = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Program other) {
            rules(other.getRules());
            id(other.getId());
            namespace(other.getNamespace());
            familyId(other.getFamilyId());
            createdAt(other.getCreatedAt());
            createdBy(other.getCreatedBy());
            sourceKeys(other.getSourceKeys());
            destinationKeys(other.getDestinationKeys());
            summary(other.getSummary());
            accessToken(other.getAccessToken());
            return this;
        }

        @JsonSetter(value = "rules", nulls = Nulls.SKIP)
        public Builder rules(List<MappingRuleOrConfig> rules) {
            this.rules.clear();
            this.rules.addAll(rules);
            return this;
        }

        public Builder addRules(MappingRuleOrConfig rules) {
            this.rules.add(rules);
            return this;
        }

        public Builder addAllRules(List<MappingRuleOrConfig> rules) {
            this.rules.addAll(rules);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public Builder namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        @JsonSetter(value = "familyId", nulls = Nulls.SKIP)
        public Builder familyId(Optional<FamilyId> familyId) {
            this.familyId = familyId;
            return this;
        }

        public Builder familyId(FamilyId familyId) {
            this.familyId = Optional.ofNullable(familyId);
            return this;
        }

        @JsonSetter(value = "createdAt", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        @JsonSetter(value = "createdBy", nulls = Nulls.SKIP)
        public Builder createdBy(Optional<UserId> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(UserId createdBy) {
            this.createdBy = Optional.ofNullable(createdBy);
            return this;
        }

        @JsonSetter(value = "sourceKeys", nulls = Nulls.SKIP)
        public Builder sourceKeys(List<String> sourceKeys) {
            this.sourceKeys.clear();
            this.sourceKeys.addAll(sourceKeys);
            return this;
        }

        public Builder addSourceKeys(String sourceKeys) {
            this.sourceKeys.add(sourceKeys);
            return this;
        }

        public Builder addAllSourceKeys(List<String> sourceKeys) {
            this.sourceKeys.addAll(sourceKeys);
            return this;
        }

        @JsonSetter(value = "destinationKeys", nulls = Nulls.SKIP)
        public Builder destinationKeys(List<String> destinationKeys) {
            this.destinationKeys.clear();
            this.destinationKeys.addAll(destinationKeys);
            return this;
        }

        public Builder addDestinationKeys(String destinationKeys) {
            this.destinationKeys.add(destinationKeys);
            return this;
        }

        public Builder addAllDestinationKeys(List<String> destinationKeys) {
            this.destinationKeys.addAll(destinationKeys);
            return this;
        }

        @JsonSetter(value = "summary", nulls = Nulls.SKIP)
        public Builder summary(Optional<ProgramSummary> summary) {
            this.summary = summary;
            return this;
        }

        public Builder summary(ProgramSummary summary) {
            this.summary = Optional.ofNullable(summary);
            return this;
        }

        @JsonSetter(value = "accessToken", nulls = Nulls.SKIP)
        public Builder accessToken(Optional<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        public Program build() {
            return new Program(
                    rules,
                    id,
                    namespace,
                    familyId,
                    createdAt,
                    createdBy,
                    sourceKeys,
                    destinationKeys,
                    summary,
                    accessToken,
                    additionalProperties);
        }
    }
}
