/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.events;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commons.types.EventId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.events.requests.GetEventTokenRequest;
import com.flatfile.api.resources.events.requests.ListEventsRequest;
import com.flatfile.api.resources.events.types.CreateEventConfig;
import com.flatfile.api.resources.events.types.EventResponse;
import com.flatfile.api.resources.events.types.ListAllEventsResponse;
import com.flatfile.api.resources.spaces.types.EventTokenResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EventsClient {
    protected final ClientOptions clientOptions;

    public EventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Event topics that the Flatfile Platform emits.
     */
    public ListAllEventsResponse list() {
        return list(ListEventsRequest.builder().build());
    }

    /**
     * Event topics that the Flatfile Platform emits.
     */
    public ListAllEventsResponse list(ListEventsRequest request) {
        return list(request, null);
    }

    /**
     * Event topics that the Flatfile Platform emits.
     */
    public ListAllEventsResponse list(ListEventsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events");
        if (request.getEnvironmentId().isPresent()) {
            httpUrl.addQueryParameter(
                    "environmentId", request.getEnvironmentId().get().toString());
        }
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        if (request.getDomain().isPresent()) {
            httpUrl.addQueryParameter("domain", request.getDomain().get());
        }
        if (request.getTopic().isPresent()) {
            httpUrl.addQueryParameter("topic", request.getTopic().get());
        }
        if (request.getSince().isPresent()) {
            httpUrl.addQueryParameter("since", request.getSince().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
        }
        if (request.getIncludeAcknowledged().isPresent()) {
            httpUrl.addQueryParameter(
                    "includeAcknowledged",
                    request.getIncludeAcknowledged().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListAllEventsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EventResponse create(CreateEventConfig request) {
        return create(request, null);
    }

    public EventResponse create(CreateEventConfig request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EventResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EventResponse get(EventId eventId) {
        return get(eventId, null);
    }

    public EventResponse get(EventId eventId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events")
                .addPathSegment(eventId.toString())
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EventResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Success ack(EventId eventId) {
        return ack(eventId, null);
    }

    public Success ack(EventId eventId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("events")
                .addPathSegment(eventId.toString())
                .addPathSegments("ack")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Success.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get a token which can be used to subscribe to events for this space
     */
    public EventTokenResponse getEventToken() {
        return getEventToken(GetEventTokenRequest.builder().build());
    }

    /**
     * Get a token which can be used to subscribe to events for this space
     */
    public EventTokenResponse getEventToken(GetEventTokenRequest request) {
        return getEventToken(request, null);
    }

    /**
     * Get a token which can be used to subscribe to events for this space
     */
    public EventTokenResponse getEventToken(GetEventTokenRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("subscription");
        if (request.getScope().isPresent()) {
            httpUrl.addQueryParameter("scope", request.getScope().get());
        }
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), EventTokenResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
