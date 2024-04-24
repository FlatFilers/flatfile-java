/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.users.types;

import com.flatfile.api.resources.commons.types.UserId;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Optional;

public interface IUser extends IUserConfig {
    UserId getId();

    String getIdp();

    Optional<String> getIdpRef();

    Map<String, Object> getMetadata();

    OffsetDateTime getCreatedAt();

    OffsetDateTime getUpdatedAt();

    Optional<OffsetDateTime> getLastSeenAt();

    Optional<Integer> getDashboard();
}
