/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.actions.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.flatfile.api.resources.commons.types.ApiAction;
import java.util.List;

public final class ActionsResponse {
    private final List<ApiAction> value;

    private ActionsResponse(List<ApiAction> value) {
        this.value = value;
    }

    @JsonValue
    public List<ApiAction> get() {
        return this.value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof ActionsResponse && this.value.equals(((ActionsResponse) other).value));
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
    public static ActionsResponse of(List<ApiAction> value) {
        return new ActionsResponse(value);
    }
}
