/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.property.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ReferenceListPropertyConfig.Builder.class)
public final class ReferenceListPropertyConfig {
    private final String ref;

    private final String key;

    private final Map<String, Object> additionalProperties;

    private ReferenceListPropertyConfig(String ref, String key, Map<String, Object> additionalProperties) {
        this.ref = ref;
        this.key = key;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Full path reference to a sheet configuration. Must be in the same workbook.
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * @return Key of the property to use as the reference key. Defaults to <code>id</code>
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ReferenceListPropertyConfig && equalTo((ReferenceListPropertyConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ReferenceListPropertyConfig other) {
        return ref.equals(other.ref) && key.equals(other.key);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ref, this.key);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RefStage builder() {
        return new Builder();
    }

    public interface RefStage {
        KeyStage ref(@NotNull String ref);

        Builder from(ReferenceListPropertyConfig other);
    }

    public interface KeyStage {
        _FinalStage key(@NotNull String key);
    }

    public interface _FinalStage {
        ReferenceListPropertyConfig build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RefStage, KeyStage, _FinalStage {
        private String ref;

        private String key;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ReferenceListPropertyConfig other) {
            ref(other.getRef());
            key(other.getKey());
            return this;
        }

        /**
         * <p>Full path reference to a sheet configuration. Must be in the same workbook.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ref")
        public KeyStage ref(@NotNull String ref) {
            this.ref = Objects.requireNonNull(ref, "ref must not be null");
            return this;
        }

        /**
         * <p>Key of the property to use as the reference key. Defaults to <code>id</code></p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("key")
        public _FinalStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        @java.lang.Override
        public ReferenceListPropertyConfig build() {
            return new ReferenceListPropertyConfig(ref, key, additionalProperties);
        }
    }
}
