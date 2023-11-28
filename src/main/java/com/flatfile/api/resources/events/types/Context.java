/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

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
import com.flatfile.api.resources.commons.types.DocumentId;
import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.EventId;
import com.flatfile.api.resources.commons.types.FileId;
import com.flatfile.api.resources.commons.types.JobId;
import com.flatfile.api.resources.commons.types.SheetId;
import com.flatfile.api.resources.commons.types.SnapshotId;
import com.flatfile.api.resources.commons.types.SpaceId;
import com.flatfile.api.resources.commons.types.VersionId;
import com.flatfile.api.resources.commons.types.WorkbookId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Context.Builder.class)
public final class Context {
    private final Optional<List<String>> namespaces;

    private final Optional<EventContextSlugs> slugs;

    private final Optional<ActionName> actionName;

    private final AccountId accountId;

    private final EnvironmentId environmentId;

    private final Optional<SpaceId> spaceId;

    private final Optional<WorkbookId> workbookId;

    private final Optional<SheetId> sheetId;

    private final Optional<SheetSlug> sheetSlug;

    private final Optional<SnapshotId> snapshotId;

    private final Optional<VersionId> versionId;

    private final Optional<VersionId> commitId;

    private final Optional<JobId> jobId;

    private final Optional<FileId> fileId;

    private final Optional<DocumentId> documentId;

    private final Optional<EventId> precedingEventId;

    private final Optional<String> actorId;

    private final Map<String, Object> additionalProperties;

    private Context(
            Optional<List<String>> namespaces,
            Optional<EventContextSlugs> slugs,
            Optional<ActionName> actionName,
            AccountId accountId,
            EnvironmentId environmentId,
            Optional<SpaceId> spaceId,
            Optional<WorkbookId> workbookId,
            Optional<SheetId> sheetId,
            Optional<SheetSlug> sheetSlug,
            Optional<SnapshotId> snapshotId,
            Optional<VersionId> versionId,
            Optional<VersionId> commitId,
            Optional<JobId> jobId,
            Optional<FileId> fileId,
            Optional<DocumentId> documentId,
            Optional<EventId> precedingEventId,
            Optional<String> actorId,
            Map<String, Object> additionalProperties) {
        this.namespaces = namespaces;
        this.slugs = slugs;
        this.actionName = actionName;
        this.accountId = accountId;
        this.environmentId = environmentId;
        this.spaceId = spaceId;
        this.workbookId = workbookId;
        this.sheetId = sheetId;
        this.sheetSlug = sheetSlug;
        this.snapshotId = snapshotId;
        this.versionId = versionId;
        this.commitId = commitId;
        this.jobId = jobId;
        this.fileId = fileId;
        this.documentId = documentId;
        this.precedingEventId = precedingEventId;
        this.actorId = actorId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The namespaces of the event
     */
    @JsonProperty("namespaces")
    public Optional<List<String>> getNamespaces() {
        return namespaces;
    }

    /**
     * @return The slugs of related resources
     */
    @JsonProperty("slugs")
    public Optional<EventContextSlugs> getSlugs() {
        return slugs;
    }

    @JsonProperty("actionName")
    public Optional<ActionName> getActionName() {
        return actionName;
    }

    @JsonProperty("accountId")
    public AccountId getAccountId() {
        return accountId;
    }

    @JsonProperty("environmentId")
    public EnvironmentId getEnvironmentId() {
        return environmentId;
    }

    @JsonProperty("spaceId")
    public Optional<SpaceId> getSpaceId() {
        return spaceId;
    }

    @JsonProperty("workbookId")
    public Optional<WorkbookId> getWorkbookId() {
        return workbookId;
    }

    @JsonProperty("sheetId")
    public Optional<SheetId> getSheetId() {
        return sheetId;
    }

    @JsonProperty("sheetSlug")
    public Optional<SheetSlug> getSheetSlug() {
        return sheetSlug;
    }

    @JsonProperty("snapshotId")
    public Optional<SnapshotId> getSnapshotId() {
        return snapshotId;
    }

    @JsonProperty("versionId")
    public Optional<VersionId> getVersionId() {
        return versionId;
    }

    @JsonProperty("commitId")
    public Optional<VersionId> getCommitId() {
        return commitId;
    }

    @JsonProperty("jobId")
    public Optional<JobId> getJobId() {
        return jobId;
    }

    @JsonProperty("fileId")
    public Optional<FileId> getFileId() {
        return fileId;
    }

    @JsonProperty("documentId")
    public Optional<DocumentId> getDocumentId() {
        return documentId;
    }

    @JsonProperty("precedingEventId")
    public Optional<EventId> getPrecedingEventId() {
        return precedingEventId;
    }

    /**
     * @return Can be a UserId, GuestId, or AgentId
     */
    @JsonProperty("actorId")
    public Optional<String> getActorId() {
        return actorId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Context && equalTo((Context) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Context other) {
        return namespaces.equals(other.namespaces)
                && slugs.equals(other.slugs)
                && actionName.equals(other.actionName)
                && accountId.equals(other.accountId)
                && environmentId.equals(other.environmentId)
                && spaceId.equals(other.spaceId)
                && workbookId.equals(other.workbookId)
                && sheetId.equals(other.sheetId)
                && sheetSlug.equals(other.sheetSlug)
                && snapshotId.equals(other.snapshotId)
                && versionId.equals(other.versionId)
                && commitId.equals(other.commitId)
                && jobId.equals(other.jobId)
                && fileId.equals(other.fileId)
                && documentId.equals(other.documentId)
                && precedingEventId.equals(other.precedingEventId)
                && actorId.equals(other.actorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.namespaces,
                this.slugs,
                this.actionName,
                this.accountId,
                this.environmentId,
                this.spaceId,
                this.workbookId,
                this.sheetId,
                this.sheetSlug,
                this.snapshotId,
                this.versionId,
                this.commitId,
                this.jobId,
                this.fileId,
                this.documentId,
                this.precedingEventId,
                this.actorId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccountIdStage builder() {
        return new Builder();
    }

    public interface AccountIdStage {
        EnvironmentIdStage accountId(AccountId accountId);

        Builder from(Context other);
    }

    public interface EnvironmentIdStage {
        _FinalStage environmentId(EnvironmentId environmentId);
    }

    public interface _FinalStage {
        Context build();

        _FinalStage namespaces(Optional<List<String>> namespaces);

        _FinalStage namespaces(List<String> namespaces);

        _FinalStage slugs(Optional<EventContextSlugs> slugs);

        _FinalStage slugs(EventContextSlugs slugs);

        _FinalStage actionName(Optional<ActionName> actionName);

        _FinalStage actionName(ActionName actionName);

        _FinalStage spaceId(Optional<SpaceId> spaceId);

        _FinalStage spaceId(SpaceId spaceId);

        _FinalStage workbookId(Optional<WorkbookId> workbookId);

        _FinalStage workbookId(WorkbookId workbookId);

        _FinalStage sheetId(Optional<SheetId> sheetId);

        _FinalStage sheetId(SheetId sheetId);

        _FinalStage sheetSlug(Optional<SheetSlug> sheetSlug);

        _FinalStage sheetSlug(SheetSlug sheetSlug);

        _FinalStage snapshotId(Optional<SnapshotId> snapshotId);

        _FinalStage snapshotId(SnapshotId snapshotId);

        _FinalStage versionId(Optional<VersionId> versionId);

        _FinalStage versionId(VersionId versionId);

        _FinalStage commitId(Optional<VersionId> commitId);

        _FinalStage commitId(VersionId commitId);

        _FinalStage jobId(Optional<JobId> jobId);

        _FinalStage jobId(JobId jobId);

        _FinalStage fileId(Optional<FileId> fileId);

        _FinalStage fileId(FileId fileId);

        _FinalStage documentId(Optional<DocumentId> documentId);

        _FinalStage documentId(DocumentId documentId);

        _FinalStage precedingEventId(Optional<EventId> precedingEventId);

        _FinalStage precedingEventId(EventId precedingEventId);

        _FinalStage actorId(Optional<String> actorId);

        _FinalStage actorId(String actorId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccountIdStage, EnvironmentIdStage, _FinalStage {
        private AccountId accountId;

        private EnvironmentId environmentId;

        private Optional<String> actorId = Optional.empty();

        private Optional<EventId> precedingEventId = Optional.empty();

        private Optional<DocumentId> documentId = Optional.empty();

        private Optional<FileId> fileId = Optional.empty();

        private Optional<JobId> jobId = Optional.empty();

        private Optional<VersionId> commitId = Optional.empty();

        private Optional<VersionId> versionId = Optional.empty();

        private Optional<SnapshotId> snapshotId = Optional.empty();

        private Optional<SheetSlug> sheetSlug = Optional.empty();

        private Optional<SheetId> sheetId = Optional.empty();

        private Optional<WorkbookId> workbookId = Optional.empty();

        private Optional<SpaceId> spaceId = Optional.empty();

        private Optional<ActionName> actionName = Optional.empty();

        private Optional<EventContextSlugs> slugs = Optional.empty();

        private Optional<List<String>> namespaces = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Context other) {
            namespaces(other.getNamespaces());
            slugs(other.getSlugs());
            actionName(other.getActionName());
            accountId(other.getAccountId());
            environmentId(other.getEnvironmentId());
            spaceId(other.getSpaceId());
            workbookId(other.getWorkbookId());
            sheetId(other.getSheetId());
            sheetSlug(other.getSheetSlug());
            snapshotId(other.getSnapshotId());
            versionId(other.getVersionId());
            commitId(other.getCommitId());
            jobId(other.getJobId());
            fileId(other.getFileId());
            documentId(other.getDocumentId());
            precedingEventId(other.getPrecedingEventId());
            actorId(other.getActorId());
            return this;
        }

        @Override
        @JsonSetter("accountId")
        public EnvironmentIdStage accountId(AccountId accountId) {
            this.accountId = accountId;
            return this;
        }

        @Override
        @JsonSetter("environmentId")
        public _FinalStage environmentId(EnvironmentId environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Can be a UserId, GuestId, or AgentId</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage actorId(String actorId) {
            this.actorId = Optional.of(actorId);
            return this;
        }

        @Override
        @JsonSetter(value = "actorId", nulls = Nulls.SKIP)
        public _FinalStage actorId(Optional<String> actorId) {
            this.actorId = actorId;
            return this;
        }

        @Override
        public _FinalStage precedingEventId(EventId precedingEventId) {
            this.precedingEventId = Optional.of(precedingEventId);
            return this;
        }

        @Override
        @JsonSetter(value = "precedingEventId", nulls = Nulls.SKIP)
        public _FinalStage precedingEventId(Optional<EventId> precedingEventId) {
            this.precedingEventId = precedingEventId;
            return this;
        }

        @Override
        public _FinalStage documentId(DocumentId documentId) {
            this.documentId = Optional.of(documentId);
            return this;
        }

        @Override
        @JsonSetter(value = "documentId", nulls = Nulls.SKIP)
        public _FinalStage documentId(Optional<DocumentId> documentId) {
            this.documentId = documentId;
            return this;
        }

        @Override
        public _FinalStage fileId(FileId fileId) {
            this.fileId = Optional.of(fileId);
            return this;
        }

        @Override
        @JsonSetter(value = "fileId", nulls = Nulls.SKIP)
        public _FinalStage fileId(Optional<FileId> fileId) {
            this.fileId = fileId;
            return this;
        }

        @Override
        public _FinalStage jobId(JobId jobId) {
            this.jobId = Optional.of(jobId);
            return this;
        }

        @Override
        @JsonSetter(value = "jobId", nulls = Nulls.SKIP)
        public _FinalStage jobId(Optional<JobId> jobId) {
            this.jobId = jobId;
            return this;
        }

        @Override
        public _FinalStage commitId(VersionId commitId) {
            this.commitId = Optional.of(commitId);
            return this;
        }

        @Override
        @JsonSetter(value = "commitId", nulls = Nulls.SKIP)
        public _FinalStage commitId(Optional<VersionId> commitId) {
            this.commitId = commitId;
            return this;
        }

        @Override
        public _FinalStage versionId(VersionId versionId) {
            this.versionId = Optional.of(versionId);
            return this;
        }

        @Override
        @JsonSetter(value = "versionId", nulls = Nulls.SKIP)
        public _FinalStage versionId(Optional<VersionId> versionId) {
            this.versionId = versionId;
            return this;
        }

        @Override
        public _FinalStage snapshotId(SnapshotId snapshotId) {
            this.snapshotId = Optional.of(snapshotId);
            return this;
        }

        @Override
        @JsonSetter(value = "snapshotId", nulls = Nulls.SKIP)
        public _FinalStage snapshotId(Optional<SnapshotId> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public _FinalStage sheetSlug(SheetSlug sheetSlug) {
            this.sheetSlug = Optional.of(sheetSlug);
            return this;
        }

        @Override
        @JsonSetter(value = "sheetSlug", nulls = Nulls.SKIP)
        public _FinalStage sheetSlug(Optional<SheetSlug> sheetSlug) {
            this.sheetSlug = sheetSlug;
            return this;
        }

        @Override
        public _FinalStage sheetId(SheetId sheetId) {
            this.sheetId = Optional.of(sheetId);
            return this;
        }

        @Override
        @JsonSetter(value = "sheetId", nulls = Nulls.SKIP)
        public _FinalStage sheetId(Optional<SheetId> sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        @Override
        public _FinalStage workbookId(WorkbookId workbookId) {
            this.workbookId = Optional.of(workbookId);
            return this;
        }

        @Override
        @JsonSetter(value = "workbookId", nulls = Nulls.SKIP)
        public _FinalStage workbookId(Optional<WorkbookId> workbookId) {
            this.workbookId = workbookId;
            return this;
        }

        @Override
        public _FinalStage spaceId(SpaceId spaceId) {
            this.spaceId = Optional.of(spaceId);
            return this;
        }

        @Override
        @JsonSetter(value = "spaceId", nulls = Nulls.SKIP)
        public _FinalStage spaceId(Optional<SpaceId> spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public _FinalStage actionName(ActionName actionName) {
            this.actionName = Optional.of(actionName);
            return this;
        }

        @Override
        @JsonSetter(value = "actionName", nulls = Nulls.SKIP)
        public _FinalStage actionName(Optional<ActionName> actionName) {
            this.actionName = actionName;
            return this;
        }

        /**
         * <p>The slugs of related resources</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage slugs(EventContextSlugs slugs) {
            this.slugs = Optional.of(slugs);
            return this;
        }

        @Override
        @JsonSetter(value = "slugs", nulls = Nulls.SKIP)
        public _FinalStage slugs(Optional<EventContextSlugs> slugs) {
            this.slugs = slugs;
            return this;
        }

        /**
         * <p>The namespaces of the event</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
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
        public Context build() {
            return new Context(
                    namespaces,
                    slugs,
                    actionName,
                    accountId,
                    environmentId,
                    spaceId,
                    workbookId,
                    sheetId,
                    sheetSlug,
                    snapshotId,
                    versionId,
                    commitId,
                    jobId,
                    fileId,
                    documentId,
                    precedingEventId,
                    actorId,
                    additionalProperties);
        }
    }
}
