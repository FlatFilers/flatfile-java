/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

import java.util.Optional;

public interface IMappingRuleConfig {
    String getName();

    MappingRuleType getType();

    Optional<Object> getConfig();
}