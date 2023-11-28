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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EnvironmentConfigCreate.Builder.class)
public final class EnvironmentConfigCreate {
    private final String name;

    private final boolean isProd;

    private final Optional<List<GuestAuthenticationEnum>> guestAuthentication;

    private final Optional<Map<String, Object>> metadata;

    private final Optional<String> translationsPath;

    private final Optional<List<String>> namespaces;

    private final Optional<String> languageOverride;

    private final Map<String, Object> additionalProperties;

    private EnvironmentConfigCreate(
            String name,
            boolean isProd,
            Optional<List<GuestAuthenticationEnum>> guestAuthentication,
            Optional<Map<String, Object>> metadata,
            Optional<String> translationsPath,
            Optional<List<String>> namespaces,
            Optional<String> languageOverride,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.isProd = isProd;
        this.guestAuthentication = guestAuthentication;
        this.metadata = metadata;
        this.translationsPath = translationsPath;
        this.namespaces = namespaces;
        this.languageOverride = languageOverride;
        this.additionalProperties = additionalProperties;
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
    public Optional<List<GuestAuthenticationEnum>> getGuestAuthentication() {
        return guestAuthentication;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EnvironmentConfigCreate && equalTo((EnvironmentConfigCreate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EnvironmentConfigCreate other) {
        return name.equals(other.name)
                && isProd == other.isProd
                && guestAuthentication.equals(other.guestAuthentication)
                && metadata.equals(other.metadata)
                && translationsPath.equals(other.translationsPath)
                && namespaces.equals(other.namespaces)
                && languageOverride.equals(other.languageOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.isProd,
                this.guestAuthentication,
                this.metadata,
                this.translationsPath,
                this.namespaces,
                this.languageOverride);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        IsProdStage name(String name);

        Builder from(EnvironmentConfigCreate other);
    }

    public interface IsProdStage {
        _FinalStage isProd(boolean isProd);
    }

    public interface _FinalStage {
        EnvironmentConfigCreate build();

        _FinalStage guestAuthentication(Optional<List<GuestAuthenticationEnum>> guestAuthentication);

        _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication);

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);

        _FinalStage translationsPath(Optional<String> translationsPath);

        _FinalStage translationsPath(String translationsPath);

        _FinalStage namespaces(Optional<List<String>> namespaces);

        _FinalStage namespaces(List<String> namespaces);

        _FinalStage languageOverride(Optional<String> languageOverride);

        _FinalStage languageOverride(String languageOverride);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, IsProdStage, _FinalStage {
        private String name;

        private boolean isProd;

        private Optional<String> languageOverride = Optional.empty();

        private Optional<List<String>> namespaces = Optional.empty();

        private Optional<String> translationsPath = Optional.empty();

        private Optional<Map<String, Object>> metadata = Optional.empty();

        private Optional<List<GuestAuthenticationEnum>> guestAuthentication = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(EnvironmentConfigCreate other) {
            name(other.getName());
            isProd(other.getIsProd());
            guestAuthentication(other.getGuestAuthentication());
            metadata(other.getMetadata());
            translationsPath(other.getTranslationsPath());
            namespaces(other.getNamespaces());
            languageOverride(other.getLanguageOverride());
            return this;
        }

        /**
         * <p>The name of the environment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public IsProdStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Whether or not the environment is a production environment</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("isProd")
        public _FinalStage isProd(boolean isProd) {
            this.isProd = isProd;
            return this;
        }

        @Override
        public _FinalStage languageOverride(String languageOverride) {
            this.languageOverride = Optional.of(languageOverride);
            return this;
        }

        @Override
        @JsonSetter(value = "languageOverride", nulls = Nulls.SKIP)
        public _FinalStage languageOverride(Optional<String> languageOverride) {
            this.languageOverride = languageOverride;
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
        public _FinalStage translationsPath(String translationsPath) {
            this.translationsPath = Optional.of(translationsPath);
            return this;
        }

        @Override
        @JsonSetter(value = "translationsPath", nulls = Nulls.SKIP)
        public _FinalStage translationsPath(Optional<String> translationsPath) {
            this.translationsPath = translationsPath;
            return this;
        }

        @Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.of(metadata);
            return this;
        }

        @Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        public _FinalStage guestAuthentication(List<GuestAuthenticationEnum> guestAuthentication) {
            this.guestAuthentication = Optional.of(guestAuthentication);
            return this;
        }

        @Override
        @JsonSetter(value = "guestAuthentication", nulls = Nulls.SKIP)
        public _FinalStage guestAuthentication(Optional<List<GuestAuthenticationEnum>> guestAuthentication) {
            this.guestAuthentication = guestAuthentication;
            return this;
        }

        @Override
        public EnvironmentConfigCreate build() {
            return new EnvironmentConfigCreate(
                    name,
                    isProd,
                    guestAuthentication,
                    metadata,
                    translationsPath,
                    namespaces,
                    languageOverride,
                    additionalProperties);
        }
    }
}
