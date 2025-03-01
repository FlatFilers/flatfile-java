/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents.types;

import com.flatfile.api.resources.events.types.EventTopic;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IAgentConfig {
    Optional<List<EventTopic>> getTopics();

    Optional<Compiler> getCompiler();

    Optional<String> getSource();

    Optional<String> getSourceMap();

    Optional<String> getSlug();

    Optional<Map<String, Object>> getOptions();
}
