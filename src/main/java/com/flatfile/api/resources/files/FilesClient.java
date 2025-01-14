/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.files;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.FlatfileApiException;
import com.flatfile.api.core.FlatfileException;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.core.ResponseBodyInputStream;
import com.flatfile.api.resources.commons.errors.BadRequestError;
import com.flatfile.api.resources.commons.errors.NotFoundError;
import com.flatfile.api.resources.commons.types.Errors;
import com.flatfile.api.resources.commons.types.FileId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.files.requests.CreateFileRequest;
import com.flatfile.api.resources.files.requests.ListFilesRequest;
import com.flatfile.api.resources.files.requests.UpdateFileRequest;
import com.flatfile.api.resources.files.types.FileResponse;
import com.flatfile.api.resources.files.types.ListFilesResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FilesClient {
    protected final ClientOptions clientOptions;

    public FilesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ListFilesResponse list() {
        return list(ListFilesRequest.builder().build());
    }

    public ListFilesResponse list(ListFilesRequest request) {
        return list(request, null);
    }

    public ListFilesResponse list(ListFilesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files");
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
        }
        if (request.getMode().isPresent()) {
            httpUrl.addQueryParameter("mode", request.getMode().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListFilesResponse.class);
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

    public FileResponse upload(File file, CreateFileRequest request) {
        return upload(file, request, null);
    }

    public FileResponse upload(File file, CreateFileRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files")
                .build();
        MultipartBody.Builder body = new MultipartBody.Builder().setType(MultipartBody.FORM);
        try {
            body.addFormDataPart("spaceId", ObjectMappers.JSON_MAPPER.writeValueAsString(request.getSpaceId()));
            body.addFormDataPart(
                    "environmentId", ObjectMappers.JSON_MAPPER.writeValueAsString(request.getEnvironmentId()));
            if (request.getMode().isPresent()) {
                body.addFormDataPart("mode", ObjectMappers.JSON_MAPPER.writeValueAsString(request.getMode()));
            }
            String fileMimeType = Files.probeContentType(file.toPath());
            MediaType fileMimeTypeMediaType = fileMimeType != null ? MediaType.parse(fileMimeType) : null;
            body.addFormDataPart("file", file.getName(), RequestBody.create(fileMimeTypeMediaType, file));
            if (request.getActions().isPresent()) {
                body.addFormDataPart("actions", ObjectMappers.JSON_MAPPER.writeValueAsString(request.getActions()));
            }
            if (request.getOrigin().isPresent()) {
                body.addFormDataPart("origin", ObjectMappers.JSON_MAPPER.writeValueAsString(request.getOrigin()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl)
                .method("POST", body.build())
                .headers(Headers.of(clientOptions.headers(requestOptions)));
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FileResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new BadRequestError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Errors.class));
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

    public FileResponse get(String fileId) {
        return get(fileId, null);
    }

    public FileResponse get(String fileId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files")
                .addPathSegment(fileId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FileResponse.class);
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

    public Success delete(String fileId) {
        return delete(fileId, null);
    }

    public Success delete(String fileId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files")
                .addPathSegment(fileId)
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
     * Update a file, to change the workbook id for example
     */
    public FileResponse update(String fileId, UpdateFileRequest request) {
        return update(fileId, request, null);
    }

    /**
     * Update a file, to change the workbook id for example
     */
    public FileResponse update(String fileId, UpdateFileRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files")
                .addPathSegment(fileId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), FileResponse.class);
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

    public InputStream download(FileId fileId) {
        return download(fileId, null);
    }

    public InputStream download(FileId fileId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("files")
                .addPathSegment(fileId.toString())
                .addPathSegments("download")
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
        try {
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new ResponseBodyInputStream(response);
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
