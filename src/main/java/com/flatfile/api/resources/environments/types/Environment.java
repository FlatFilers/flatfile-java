/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.environments.types;

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
import com.flatfile.api.resources.commons.types.EnvironmentId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Environment.Builder.class)
public final class Environment {
    private final EnvironmentId id;

    private final AccountId accountId;

    private final String name;

    private final boolean isProd;

    private final List<GuestAuthenticationEnum> guestAuthentication;

    private final Map<String, Object> features;

    private final Map<String, Object> metadata;

    private final Optional<String> translationsPath;

    private final Optional<List<String>> namespaces;

    private final Optional<String> languageOverride;

    private final Map<String, Object> additionalProperties;

    private Environment(
            EnvironmentId id,
            AccountId accountId,
            String name,
            boolean isProd,
            List<GuestAuthenticationEnum> guestAuthentication,
            Map<String, Object> features,
            Map<String, Object> metadata,
            Optional<String> translationsPath,
            Optional<List<String>> namespaces,
            Optional<String> languageOverride,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.isProd = isProd;
        this.guestAuthentication = guestAuthentication;
        this.features = features;
        this.metadata = metadata;
        this.translationsPath = translationsPath;
        this.namespaces = namespaces;
        this.languageOverride = languageOverride;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public EnvironmentId getId() {
        return id;
    }

    @JsonProperty("accountId")
    public AccountId getAccountId() {
        return accountId;
    }

    /**
     * @return The name of the environment
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Whether or not the environment is a production environment
     */
    @JsonProperty("isProd")
    public boolean getIsProd() {
        return isProd;
    }

    @JsonProperty("guestAuthentication")
    public List<GuestAuthenticationEnum> getGuestAuthentication() {
        return guestAuthentication;
    }

    @JsonProperty("features")
    public Map<String, Object> getFeatures() {
        return features;
    }

    @JsonProperty("metadata")
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    @JsonProperty("translationsPath")
    public Optional<String> getTranslationsPath() {
        return translationsPath;
    }

    @JsonProperty("namespaces")
    public Optional<List<String>> getNamespaces() {
        return namespaces;
    }

    @JsonProperty("languageOverride")
    public Optional<String> getLanguageOverride() {
        return languageOverride;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Environment && equalTo((Environment) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Environment other) {
        return id.equals(other.id)
                && accountId.equals(other.accountId)
                && name.equals(other.name)
                && isProd == other.isProd
                && guestAuthentication.equals(other.guestAuthentication)
                && features.equals(other.features)
                && metadata.equals(other.metadata)
                && translationsPath.equals(other.translationsPath)
                && namespaces.equals(other.namespaces)
                && languageOverride.equals(other.languageOverride);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.accountId,
                this.name,
                this.isProd,
                this.guestAuthentication,
                this.features,
                this.metadata,
                this.translationsPath,
                this.namespaces,
                this.languageOverride);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        AccountIdStage id(EnvironmentId id);

        Builder from(Environment other);
    }

    public interface AccountIdStage {
        NameStage accountId(AccountId accountId);
    }

    public interface NameStage {
        IsProdStage name(String name);
    }

    public interface IsProdStage {
        _FinalStage isProd(boolean isProd);
    }

    public interface _FinalStage {
        Environment build();

        _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication);

        _FinalStage addGuestAuthentication(GuestAuthenticationEnum guestAuthentication);

        _FinalStage addAllGuestAuthentication(List<GuestAuthenticationEnum> guestAuthentication);

        _FinalStage features(Map<String, Object> features);

        _FinalStage putAllFeatures(Map<String, Object> features);

        _FinalStage features(String key, Object value);

        _FinalStage metadata(Map<String, Object> metadata);

        _FinalStage putAllMetadata(Map<String, Object> metadata);

        _FinalStage metadata(String key, Object value);

        _FinalStage translationsPath(Optional<String> translationsPath);

        _FinalStage translationsPath(String translationsPath);

        _FinalStage namespaces(Optional<List<String>> namespaces);

        _FinalStage namespaces(List<String> namespaces);

        _FinalStage languageOverride(Optional<String> languageOverride);

        _FinalStage languageOverride(String languageOverride);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, AccountIdStage, NameStage, IsProdStage, _FinalStage {
        private EnvironmentId id;

        private AccountId accountId;

        private String name;

        private boolean isProd;

        private Optional<String> languageOverride = Optional.empty();

        private Optional<List<String>> namespaces = Optional.empty();

        private Optional<String> translationsPath = Optional.empty();

        private Map<String, Object> metadata = new LinkedHashMap<>();

        private Map<String, Object> features = new LinkedHashMap<>();

        private List<GuestAuthenticationEnum> guestAuthentication = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Environment other) {
            id(other.getId());
            accountId(other.getAccountId());
            name(other.getName());
            isProd(other.getIsProd());
            guestAuthentication(other.getGuestAuthentication());
            features(other.getFeatures());
            metadata(other.getMetadata());
            translationsPath(other.getTranslationsPath());
            namespaces(other.getNamespaces());
            languageOverride(other.getLanguageOverride());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public AccountIdStage id(EnvironmentId id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("accountId")
        public NameStage accountId(AccountId accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The name of the environment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public IsProdStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Whether or not the environment is a production environment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("isProd")
        public _FinalStage isProd(boolean isProd) {
            this.isProd = isProd;
            return this;
        }

        @java.lang.Override
        public _FinalStage languageOverride(String languageOverride) {
            this.languageOverride = Optional.of(languageOverride);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "languageOverride", nulls = Nulls.SKIP)
        public _FinalStage languageOverride(Optional<String> languageOverride) {
            this.languageOverride = languageOverride;
            return this;
        }

        @java.lang.Override
        public _FinalStage namespaces(List<String> namespaces) {
            this.namespaces = Optional.of(namespaces);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "namespaces", nulls = Nulls.SKIP)
        public _FinalStage namespaces(Optional<List<String>> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        @java.lang.Override
        public _FinalStage translationsPath(String translationsPath) {
            this.translationsPath = Optional.of(translationsPath);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "translationsPath", nulls = Nulls.SKIP)
        public _FinalStage translationsPath(Optional<String> translationsPath) {
            this.translationsPath = translationsPath;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(String key, Object value) {
            this.metadata.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllMetadata(Map<String, Object> metadata) {
            this.metadata.putAll(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata.clear();
            this.metadata.putAll(metadata);
            return this;
        }

        @java.lang.Override
        public _FinalStage features(String key, Object value) {
            this.features.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllFeatures(Map<String, Object> features) {
            this.features.putAll(features);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "features", nulls = Nulls.SKIP)
        public _FinalStage features(Map<String, Object> features) {
            this.features.clear();
            this.features.putAll(features);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllGuestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication.addAll(guestAuthentication);
            return this;
        }

        @java.lang.Override
        public _FinalStage addGuestAuthentication(GuestAuthenticationEnum guestAuthentication) {
            this.guestAuthentication.add(guestAuthentication);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "guestAuthentication", nulls = Nulls.SKIP)
        public _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication.clear();
            this.guestAuthentication.addAll(guestAuthentication);
            return this;
        }

        @java.lang.Override
        public Environment build() {
            return new Environment(
                    id,
                    accountId,
                    name,
                    isProd,
                    guestAuthentication,
                    features,
                    metadata,
                    translationsPath,
                    namespaces,
                    languageOverride,
                    additionalProperties);
        }
    }
}
