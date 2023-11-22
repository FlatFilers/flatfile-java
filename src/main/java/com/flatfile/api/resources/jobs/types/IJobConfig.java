/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs.types;

import java.util.Map;
import java.util.Optional;

public interface IJobConfig {
    JobType getType();

    String getOperation();

    String getSource();

    Optional<String> getDestination();

    Optional<JobUpdateConfig> getConfig();

    Optional<Trigger> getTrigger();

    Optional<JobStatus> getStatus();

    Optional<Double> getProgress();

    Optional<String> getFileId();

    Optional<JobMode> getMode();

    Optional<Map<String, Object>> getInput();

    Optional<JobSubject> getSubject();

    Optional<Map<String, Object>> getOutcome();

    Optional<String> getInfo();

    Optional<Boolean> getManaged();

    Optional<Integer> getPart();

    Optional<Map<String, Object>> getPartData();

    Optional<JobPartExecution> getPartExecution();

    Optional<String> getParentId();
}
