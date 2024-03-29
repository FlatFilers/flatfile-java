/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.records.types;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ICellValue {
    Optional<Boolean> getValid();

    Optional<List<ValidationMessage>> getMessages();

    Optional<Map<String, Object>> getMetadata();

    Optional<CellValueUnion> getValue();

    Optional<String> getLayer();

    Optional<OffsetDateTime> getUpdatedAt();
}
