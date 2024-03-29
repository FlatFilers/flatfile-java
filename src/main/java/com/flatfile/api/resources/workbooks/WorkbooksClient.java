/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.workbooks;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commits.types.ListCommitsResponse;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.commons.types.WorkbookId;
import com.flatfile.api.resources.workbooks.requests.ListWorkbookCommitsRequest;
import com.flatfile.api.resources.workbooks.requests.ListWorkbooksRequest;
import com.flatfile.api.resources.workbooks.types.CreateWorkbookConfig;
import com.flatfile.api.resources.workbooks.types.ListWorkbooksResponse;
import com.flatfile.api.resources.workbooks.types.WorkbookResponse;
import com.flatfile.api.resources.workbooks.types.WorkbookUpdate;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class WorkbooksClient {
    protected final ClientOptions clientOptions;

    public WorkbooksClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns all workbooks matching a filter for an account or space
     */
    public ListWorkbooksResponse list() {
        return list(ListWorkbooksRequest.builder().build());
    }

    /**
     * Returns all workbooks matching a filter for an account or space
     */
    public ListWorkbooksResponse list(ListWorkbooksRequest request) {
        return list(request, null);
    }

    /**
     * Returns all workbooks matching a filter for an account or space
     */
    public ListWorkbooksResponse list(ListWorkbooksRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks");
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        if (request.getIncludeCounts().isPresent()) {
            httpUrl.addQueryParameter(
                    "includeCounts", request.getIncludeCounts().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListWorkbooksResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a workbook and adds it to a space
     */
    public WorkbookResponse create(CreateWorkbookConfig request) {
        return create(request, null);
    }

    /**
     * Creates a workbook and adds it to a space
     */
    public WorkbookResponse create(CreateWorkbookConfig request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), WorkbookResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a single workbook
     */
    public WorkbookResponse get(WorkbookId workbookId) {
        return get(workbookId, null);
    }

    /**
     * Returns a single workbook
     */
    public WorkbookResponse get(WorkbookId workbookId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks")
                .addPathSegment(workbookId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), WorkbookResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes a workbook and all of its record data permanently
     */
    public Success delete(WorkbookId workbookId) {
        return delete(workbookId, null);
    }

    /**
     * Deletes a workbook and all of its record data permanently
     */
    public Success delete(WorkbookId workbookId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks")
                .addPathSegment(workbookId.toString())
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
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
     * Updates a workbook
     */
    public WorkbookResponse update(WorkbookId workbookId) {
        return update(workbookId, WorkbookUpdate.builder().build());
    }

    /**
     * Updates a workbook
     */
    public WorkbookResponse update(WorkbookId workbookId, WorkbookUpdate request) {
        return update(workbookId, request, null);
    }

    /**
     * Updates a workbook
     */
    public WorkbookResponse update(WorkbookId workbookId, WorkbookUpdate request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks")
                .addPathSegment(workbookId.toString())
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
                .method("PATCH", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), WorkbookResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the commits for a workbook
     */
    public ListCommitsResponse getWorkbookCommits(WorkbookId workbookId) {
        return getWorkbookCommits(
                workbookId, ListWorkbookCommitsRequest.builder().build());
    }

    /**
     * Returns the commits for a workbook
     */
    public ListCommitsResponse getWorkbookCommits(WorkbookId workbookId, ListWorkbookCommitsRequest request) {
        return getWorkbookCommits(workbookId, request, null);
    }

    /**
     * Returns the commits for a workbook
     */
    public ListCommitsResponse getWorkbookCommits(
            WorkbookId workbookId, ListWorkbookCommitsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workbooks")
                .addPathSegment(workbookId.toString())
                .addPathSegments("commits");
        if (request.getCompleted().isPresent()) {
            httpUrl.addQueryParameter("completed", request.getCompleted().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListCommitsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
