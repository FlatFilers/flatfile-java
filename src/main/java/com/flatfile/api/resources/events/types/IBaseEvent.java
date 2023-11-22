/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events.types;

import java.util.List;
import java.util.Optional;

public interface IBaseEvent {
    Domain getDomain();

    Context getContext();

    Optional<EventAttributes> getAttributes();

    Optional<String> getCallbackUrl();

    Optional<String> getDataUrl();

    Optional<String> getTarget();

    Optional<Origin> getOrigin();

    Optional<List<String>> getNamespaces();
}
