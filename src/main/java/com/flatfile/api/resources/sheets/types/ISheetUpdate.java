/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.types;

import com.flatfile.api.resources.records.types.RecordCounts;
import java.time.OffsetDateTime;
import java.util.Optional;

public interface ISheetUpdate {
    Optional<String> getId();

    Optional<String> getWorkbookId();

    Optional<SheetConfig> getConfig();

    Optional<RecordCounts> getCountRecords();

    Optional<String> getNamespace();

    Optional<OffsetDateTime> getUpdatedAt();

    Optional<OffsetDateTime> getCreatedAt();
}