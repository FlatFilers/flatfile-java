/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.guests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.FlatfileApiException;
import com.flatfile.api.core.FlatfileException;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commons.errors.BadRequestError;
import com.flatfile.api.resources.commons.errors.ForbiddenError;
import com.flatfile.api.resources.commons.errors.NotFoundError;
import com.flatfile.api.resources.commons.types.ActorRoleId;
import com.flatfile.api.resources.commons.types.Errors;
import com.flatfile.api.resources.commons.types.GuestId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.guests.requests.GetGuestTokenRequest;
import com.flatfile.api.resources.guests.requests.ListGuestsRequest;
import com.flatfile.api.resources.guests.types.CreateGuestResponse;
import com.flatfile.api.resources.guests.types.GuestConfig;
import com.flatfile.api.resources.guests.types.GuestConfigUpdate;
import com.flatfile.api.resources.guests.types.GuestResponse;
import com.flatfile.api.resources.guests.types.GuestTokenResponse;
import com.flatfile.api.resources.guests.types.Invite;
import com.flatfile.api.resources.guests.types.ListGuestsResponse;
import com.flatfile.api.resources.roles.types.AssignActorRoleRequest;
import com.flatfile.api.resources.roles.types.AssignRoleResponse;
import com.flatfile.api.resources.roles.types.ListActorRolesResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class GuestsClient {
    protected final ClientOptions clientOptions;

    public GuestsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns all guests
     */
    public ListGuestsResponse list(ListGuestsRequest request) {
        return list(request, null);
    }

    /**
     * Returns all guests
     */
    public ListGuestsResponse list(ListGuestsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests");
        httpUrl.addQueryParameter("spaceId", request.getSpaceId().toString());
        if (request.getEmail().isPresent()) {
            httpUrl.addQueryParameter("email", request.getEmail().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListGuestsResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Guests are only there to upload, edit, and download files and perform their tasks in a specific Space.
     */
    public CreateGuestResponse create(List<GuestConfig> request) {
        return create(request, null);
    }

    /**
     * Guests are only there to upload, edit, and download files and perform their tasks in a specific Space.
     */
    public CreateGuestResponse create(List<GuestConfig> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new FlatfileException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), CreateGuestResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Returns a single guest
     */
    public GuestResponse get(GuestId guestId) {
        return get(guestId, null);
    }

    /**
     * Returns a single guest
     */
    public GuestResponse get(GuestId guestId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), GuestResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Deletes a single guest
     */
    public Success delete(GuestId guestId) {
        return delete(guestId, null);
    }

    /**
     * Deletes a single guest
     */
    public Success delete(GuestId guestId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Success.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Updates a single guest, for example to change name or email
     */
    public GuestResponse update(GuestId guestId) {
        return update(guestId, GuestConfigUpdate.builder().build());
    }

    /**
     * Updates a single guest, for example to change name or email
     */
    public GuestResponse update(GuestId guestId, GuestConfigUpdate request) {
        return update(guestId, request, null);
    }

    /**
     * Updates a single guest, for example to change name or email
     */
    public GuestResponse update(GuestId guestId, GuestConfigUpdate request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new FlatfileException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PATCH", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), GuestResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Returns a single guest token
     */
    public GuestTokenResponse getGuestToken(GuestId guestId, GetGuestTokenRequest request) {
        return getGuestToken(guestId, request, null);
    }

    /**
     * Returns a single guest token
     */
    public GuestTokenResponse getGuestToken(
            GuestId guestId, GetGuestTokenRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .addPathSegments("token");
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), GuestTokenResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Lists roles assigned to a guest.
     */
    public ListActorRolesResponse listGuestRoles(GuestId guestId) {
        return listGuestRoles(guestId, null);
    }

    /**
     * Lists roles assigned to a guest.
     */
    public ListActorRolesResponse listGuestRoles(GuestId guestId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .addPathSegments("roles")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListActorRolesResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 403:
                        throw new ForbiddenError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Assigns a role to a guest.
     */
    public AssignRoleResponse assignGuestRole(GuestId guestId, AssignActorRoleRequest request) {
        return assignGuestRole(guestId, request, null);
    }

    /**
     * Assigns a role to a guest.
     */
    public AssignRoleResponse assignGuestRole(
            GuestId guestId, AssignActorRoleRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .addPathSegments("roles")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new FlatfileException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), AssignRoleResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 403:
                        throw new ForbiddenError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Removes a role from a guest.
     */
    public Success deleteGuestRole(GuestId guestId, ActorRoleId actorRoleId) {
        return deleteGuestRole(guestId, actorRoleId, null);
    }

    /**
     * Removes a role from a guest.
     */
    public Success deleteGuestRole(GuestId guestId, ActorRoleId actorRoleId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("guests")
                .addPathSegment(guestId.toString())
                .addPathSegments("roles")
                .addPathSegment(actorRoleId.toString())
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Success.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 403:
                        throw new ForbiddenError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                    case 404:
                        throw new NotFoundError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }

    /**
     * Guests can be created as a named guest on the Space or there’s a global link that will let anonymous guests into the space.
     */
    public Success invite(List<Invite> request) {
        return invite(request, null);
    }

    /**
     * Guests can be created as a named guest on the Space or there’s a global link that will let anonymous guests into the space.
     */
    public Success invite(List<Invite> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("invitations")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new FlatfileException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Success.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new FlatfileApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new FlatfileException("Network error executing HTTP request", e);
        }
    }
}
