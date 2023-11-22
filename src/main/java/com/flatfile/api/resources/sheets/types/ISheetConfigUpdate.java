/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets.types;

import com.flatfile.api.resources.commons.types.Action;
import com.flatfile.api.resources.property.types.Property;
import java.util.List;
import java.util.Optional;

public interface ISheetConfigUpdate {
    Optional<String> getName();

    Optional<String> getDescription();

    Optional<String> getSlug();

    Optional<Boolean> getReadonly();

    Optional<Boolean> getAllowAdditionalFields();

    Optional<Double> getMappingConfidenceThreshold();

    Optional<List<SheetAccess>> getAccess();

    Optional<List<Property>> getFields();

    Optional<List<Action>> getActions();
}
