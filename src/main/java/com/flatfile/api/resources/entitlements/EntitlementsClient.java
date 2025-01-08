/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.entitlements;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.FlatfileApiException;
import com.flatfile.api.core.FlatfileException;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commons.errors.BadRequestError;
import com.flatfile.api.resources.commons.errors.NotFoundError;
import com.flatfile.api.resources.commons.types.Errors;
import com.flatfile.api.resources.entitlements.requests.ListEntitlementsRequest;
import com.flatfile.api.resources.entitlements.types.ListEntitlementsResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class EntitlementsClient {
    protected final ClientOptions clientOptions;

    public EntitlementsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns all entitlements matching a filter for resourceId
     */
    public ListEntitlementsResponse list(ListEntitlementsRequest request) {
        return list(request, null);
    }

    /**
     * Returns all entitlements matching a filter for resourceId
     */
    public ListEntitlementsResponse list(ListEntitlementsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("entitlements");
        httpUrl.addQueryParameter("resourceId", request.getResourceId());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListEntitlementsResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new BadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
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
}
