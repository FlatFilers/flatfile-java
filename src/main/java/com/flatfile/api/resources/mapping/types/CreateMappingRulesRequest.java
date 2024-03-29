/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.mapping.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public final class CreateMappingRulesRequest {
    private final List<MappingRuleConfig> value;

    private CreateMappingRulesRequest(List<MappingRuleConfig> value) {
        this.value = value;
    }

    @JsonValue
    public List<MappingRuleConfig> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof CreateMappingRulesRequest
                        && this.value.equals(((CreateMappingRulesRequest) other).value));
    }

    @java.lang.Override
    public int hashCode() {
        return value.hashCode();
    }

    @java.lang.Override
    public String toString() {
        return value.toString();
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreateMappingRulesRequest of(List<MappingRuleConfig> value) {
        return new CreateMappingRulesRequest(value);
    }
}
