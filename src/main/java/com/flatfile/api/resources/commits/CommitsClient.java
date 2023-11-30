/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.commits;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commits.types.CommitResponse;
import com.flatfile.api.resources.commons.types.CommitId;
import com.flatfile.api.resources.commons.types.Success;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CommitsClient {
    protected final ClientOptions clientOptions;

    public CommitsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns the details of a commit version
     */
    public CommitResponse get(CommitId commitId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("commits")
                .addPathSegment(commitId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), CommitResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the details of a commit version
     */
    public CommitResponse get(CommitId commitId) {
        return get(commitId, null);
    }

    /**
     * Completes a commit version. This marks the commit as complete and acknowledges that the changes have been applied to the sheet.
     */
    public Success complete(CommitId commitId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("commits")
                .addPathSegment(commitId.toString())
                .addPathSegments("complete")
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
     * Completes a commit version. This marks the commit as complete and acknowledges that the changes have been applied to the sheet.
     */
    public Success complete(CommitId commitId) {
        return complete(commitId, null);
    }

    /**
     * Replays a commit:created event.
     */
    public Success replay(CommitId commitId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("commits")
                .addPathSegment(commitId.toString())
                .addPathSegments("replay")
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
     * Replays a commit:created event.
     */
    public Success replay(CommitId commitId) {
        return replay(commitId, null);
    }
}
