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
import com.flatfile.api.resources.sheets.types.SheetConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ProgramConfig.Builder.class)
public final class ProgramConfig {
    private final SheetConfig source;

    private final SheetConfig destination;

    private final Optional<FamilyId> familyId;

    private final Optional<String> namespace;

    private final Optional<Boolean> save;

    private final Map<String, Object> additionalProperties;

    private ProgramConfig(
            SheetConfig source,
            SheetConfig destination,
            Optional<FamilyId> familyId,
            Optional<String> namespace,
            Optional<Boolean> save,
            Map<String, Object> additionalProperties) {
        this.source = source;
        this.destination = destination;
        this.familyId = familyId;
        this.namespace = namespace;
        this.save = save;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Source schema
     */
    @JsonProperty("source")
    public SheetConfig getSource() {
        return source;
    }

    /**
     * @return Destination schema
     */
    @JsonProperty("destination")
    public SheetConfig getDestination() {
        return destination;
    }

    /**
     * @return ID of the family to add the program to
     */
    @JsonProperty("familyId")
    public Optional<FamilyId> getFamilyId() {
        return familyId;
    }

    /**
     * @return Namespace of the program
     */
    @JsonProperty("namespace")
    public Optional<String> getNamespace() {
        return namespace;
    }

    /**
     * @return Whether to save the program for editing later. Defaults to false. If true, the response will contain an ID and access token.
     */
    @JsonProperty("save")
    public Optional<Boolean> getSave() {
        return save;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ProgramConfig && equalTo((ProgramConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ProgramConfig other) {
        return source.equals(other.source)
                && destination.equals(other.destination)
                && familyId.equals(other.familyId)
                && namespace.equals(other.namespace)
                && save.equals(other.save);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.source, this.destination, this.familyId, this.namespace, this.save);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SourceStage builder() {
        return new Builder();
    }

    public interface SourceStage {
        DestinationStage source(@NotNull SheetConfig source);

        Builder from(ProgramConfig other);
    }

    public interface DestinationStage {
        _FinalStage destination(@NotNull SheetConfig destination);
    }

    public interface _FinalStage {
        ProgramConfig build();

        _FinalStage familyId(Optional<FamilyId> familyId);

        _FinalStage familyId(FamilyId familyId);

        _FinalStage namespace(Optional<String> namespace);

        _FinalStage namespace(String namespace);

        _FinalStage save(Optional<Boolean> save);

        _FinalStage save(Boolean save);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SourceStage, DestinationStage, _FinalStage {
        private SheetConfig source;

        private SheetConfig destination;

        private Optional<Boolean> save = Optional.empty();

        private Optional<String> namespace = Optional.empty();

        private Optional<FamilyId> familyId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ProgramConfig other) {
            source(other.getSource());
            destination(other.getDestination());
            familyId(other.getFamilyId());
            namespace(other.getNamespace());
            save(other.getSave());
            return this;
        }

        /**
         * <p>Source schema</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source")
        public DestinationStage source(@NotNull SheetConfig source) {
            this.source = Objects.requireNonNull(source, "source must not be null");
            return this;
        }

        /**
         * <p>Destination schema</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("destination")
        public _FinalStage destination(@NotNull SheetConfig destination) {
            this.destination = Objects.requireNonNull(destination, "destination must not be null");
            return this;
        }

        /**
         * <p>Whether to save the program for editing later. Defaults to false. If true, the response will contain an ID and access token.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage save(Boolean save) {
            this.save = Optional.ofNullable(save);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "save", nulls = Nulls.SKIP)
        public _FinalStage save(Optional<Boolean> save) {
            this.save = save;
            return this;
        }

        /**
         * <p>Namespace of the program</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage namespace(String namespace) {
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "namespace", nulls = Nulls.SKIP)
        public _FinalStage namespace(Optional<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>ID of the family to add the program to</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage familyId(FamilyId familyId) {
            this.familyId = Optional.ofNullable(familyId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "familyId", nulls = Nulls.SKIP)
        public _FinalStage familyId(Optional<FamilyId> familyId) {
            this.familyId = familyId;
            return this;
        }

        @java.lang.Override
        public ProgramConfig build() {
            return new ProgramConfig(source, destination, familyId, namespace, save, additionalProperties);
        }
    }
}
