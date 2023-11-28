/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

import com.flatfile.api.resources.commons.types.EnvironmentId;
import com.flatfile.api.resources.commons.types.FileId;
import com.flatfile.api.resources.commons.types.JobId;
import java.util.Map;
import java.util.Optional;

public interface IJobConfig {
    JobType getType();

    String getOperation();

    JobSource getSource();

    Optional<JobDestination> getDestination();

    Optional<JobUpdateConfig> getConfig();

    Optional<Trigger> getTrigger();

    Optional<JobStatus> getStatus();

    Optional<Double> getProgress();

    Optional<FileId> getFileId();

    Optional<JobMode> getMode();

    Optional<Map<String, Object>> getInput();

    Optional<JobSubject> getSubject();

    Optional<Map<String, Object>> getOutcome();

    Optional<String> getInfo();

    Optional<Boolean> getManaged();

    Optional<EnvironmentId> getEnvironmentId();

    Optional<Integer> getPart();

    Optional<Map<String, Object>> getPartData();

    Optional<JobPartExecution> getPartExecution();

    Optional<JobId> getParentId();
}
