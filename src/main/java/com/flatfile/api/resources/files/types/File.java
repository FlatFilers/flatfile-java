/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.files.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.resources.commons.types.Action;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = File.Builder.class)
public final class File {
    private final String id;

    private final String name;

    private final String ext;

    private final String mimetype;

    private final String encoding;

    private final ModelFileStatusEnum status;

    private final Optional<Mode> mode;

    private final int size;

    private final int bytesReceived;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final String spaceId;

    private final Optional<String> workbookId;

    private final Optional<String> sheetId;

    private final Optional<List<Action>> actions;

    private final Map<String, Object> additionalProperties;

    private File(
            String id,
            String name,
            String ext,
            String mimetype,
            String encoding,
            ModelFileStatusEnum status,
            Optional<Mode> mode,
            int size,
            int bytesReceived,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String spaceId,
            Optional<String> workbookId,
            Optional<String> sheetId,
            Optional<List<Action>> actions,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.ext = ext;
        this.mimetype = mimetype;
        this.encoding = encoding;
        this.status = status;
        this.mode = mode;
        this.size = size;
        this.bytesReceived = bytesReceived;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.spaceId = spaceId;
        this.workbookId = workbookId;
        this.sheetId = sheetId;
        this.actions = actions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Original filename
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Extension of the file
     */
    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    /**
     * @return MIME Type of the file
     */
    @JsonProperty("mimetype")
    public String getMimetype() {
        return mimetype;
    }

    /**
     * @return Text encoding of the file
     */
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    /**
     * @return Status of the file
     */
    @JsonProperty("status")
    public ModelFileStatusEnum getStatus() {
        return status;
    }

    /**
     * @return The storage mode of file
     */
    @JsonProperty("mode")
    public Optional<Mode> getMode() {
        return mode;
    }

    /**
     * @return Size of file in bytes
     */
    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    /**
     * @return Number of bytes that have been uploaded so far (useful for progress tracking)
     */
    @JsonProperty("bytesReceived")
    public int getBytesReceived() {
        return bytesReceived;
    }

    /**
     * @return Date the file was created
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Date the file was last updated
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("spaceId")
    public String getSpaceId() {
        return spaceId;
    }

    @JsonProperty("workbookId")
    public Optional<String> getWorkbookId() {
        return workbookId;
    }

    @JsonProperty("sheetId")
    public Optional<String> getSheetId() {
        return sheetId;
    }

    @JsonProperty("actions")
    public Optional<List<Action>> getActions() {
        return actions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof File && equalTo((File) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(File other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && ext.equals(other.ext)
                && mimetype.equals(other.mimetype)
                && encoding.equals(other.encoding)
                && status.equals(other.status)
                && mode.equals(other.mode)
                && size == other.size
                && bytesReceived == other.bytesReceived
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && spaceId.equals(other.spaceId)
                && workbookId.equals(other.workbookId)
                && sheetId.equals(other.sheetId)
                && actions.equals(other.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.ext,
                this.mimetype,
                this.encoding,
                this.status,
                this.mode,
                this.size,
                this.bytesReceived,
                this.createdAt,
                this.updatedAt,
                this.spaceId,
                this.workbookId,
                this.sheetId,
                this.actions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(String id);

        Builder from(File other);
    }

    public interface NameStage {
        ExtStage name(String name);
    }

    public interface ExtStage {
        MimetypeStage ext(String ext);
    }

    public interface MimetypeStage {
        EncodingStage mimetype(String mimetype);
    }

    public interface EncodingStage {
        StatusStage encoding(String encoding);
    }

    public interface StatusStage {
        SizeStage status(ModelFileStatusEnum status);
    }

    public interface SizeStage {
        BytesReceivedStage size(int size);
    }

    public interface BytesReceivedStage {
        CreatedAtStage bytesReceived(int bytesReceived);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        SpaceIdStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface SpaceIdStage {
        _FinalStage spaceId(String spaceId);
    }

    public interface _FinalStage {
        File build();

        _FinalStage mode(Optional<Mode> mode);

        _FinalStage mode(Mode mode);

        _FinalStage workbookId(Optional<String> workbookId);

        _FinalStage workbookId(String workbookId);

        _FinalStage sheetId(Optional<String> sheetId);

        _FinalStage sheetId(String sheetId);

        _FinalStage actions(Optional<List<Action>> actions);

        _FinalStage actions(List<Action> actions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    NameStage,
                    ExtStage,
                    MimetypeStage,
                    EncodingStage,
                    StatusStage,
                    SizeStage,
                    BytesReceivedStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    SpaceIdStage,
                    _FinalStage {
        private String id;

        private String name;

        private String ext;

        private String mimetype;

        private String encoding;

        private ModelFileStatusEnum status;

        private int size;

        private int bytesReceived;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String spaceId;

        private Optional<List<Action>> actions = Optional.empty();

        private Optional<String> sheetId = Optional.empty();

        private Optional<String> workbookId = Optional.empty();

        private Optional<Mode> mode = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(File other) {
            id(other.getId());
            name(other.getName());
            ext(other.getExt());
            mimetype(other.getMimetype());
            encoding(other.getEncoding());
            status(other.getStatus());
            mode(other.getMode());
            size(other.getSize());
            bytesReceived(other.getBytesReceived());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            spaceId(other.getSpaceId());
            workbookId(other.getWorkbookId());
            sheetId(other.getSheetId());
            actions(other.getActions());
            return this;
        }

        @Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Original filename</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public ExtStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Extension of the file</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("ext")
        public MimetypeStage ext(String ext) {
            this.ext = ext;
            return this;
        }

        /**
         * <p>MIME Type of the file</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("mimetype")
        public EncodingStage mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        /**
         * <p>Text encoding of the file</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("encoding")
        public StatusStage encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * <p>Status of the file</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("status")
        public SizeStage status(ModelFileStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Size of file in bytes</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("size")
        public BytesReceivedStage size(int size) {
            this.size = size;
            return this;
        }

        /**
         * <p>Number of bytes that have been uploaded so far (useful for progress tracking)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("bytesReceived")
        public CreatedAtStage bytesReceived(int bytesReceived) {
            this.bytesReceived = bytesReceived;
            return this;
        }

        /**
         * <p>Date the file was created</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Date the file was last updated</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("updatedAt")
        public SpaceIdStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        @JsonSetter("spaceId")
        public _FinalStage spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public _FinalStage actions(List<Action> actions) {
            this.actions = Optional.of(actions);
            return this;
        }

        @Override
        @JsonSetter(value = "actions", nulls = Nulls.SKIP)
        public _FinalStage actions(Optional<List<Action>> actions) {
            this.actions = actions;
            return this;
        }

        @Override
        public _FinalStage sheetId(String sheetId) {
            this.sheetId = Optional.of(sheetId);
            return this;
        }

        @Override
        @JsonSetter(value = "sheetId", nulls = Nulls.SKIP)
        public _FinalStage sheetId(Optional<String> sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        @Override
        public _FinalStage workbookId(String workbookId) {
            this.workbookId = Optional.of(workbookId);
            return this;
        }

        @Override
        @JsonSetter(value = "workbookId", nulls = Nulls.SKIP)
        public _FinalStage workbookId(Optional<String> workbookId) {
            this.workbookId = workbookId;
            return this;
        }

        /**
         * <p>The storage mode of file</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage mode(Mode mode) {
            this.mode = Optional.of(mode);
            return this;
        }

        @Override
        @JsonSetter(value = "mode", nulls = Nulls.SKIP)
        public _FinalStage mode(Optional<Mode> mode) {
            this.mode = mode;
            return this;
        }

        @Override
        public File build() {
            return new File(
                    id,
                    name,
                    ext,
                    mimetype,
                    encoding,
                    status,
                    mode,
                    size,
                    bytesReceived,
                    createdAt,
                    updatedAt,
                    spaceId,
                    workbookId,
                    sheetId,
                    actions,
                    additionalProperties);
        }
    }
}
