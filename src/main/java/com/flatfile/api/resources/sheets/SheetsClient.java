/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.sheets;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commits.types.ListCommitsResponse;
import com.flatfile.api.resources.commons.types.SheetId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.sheets.requests.GetFieldValuesRequest;
import com.flatfile.api.resources.sheets.requests.GetRecordCountsRequest;
import com.flatfile.api.resources.sheets.requests.GetRecordsCsvRequest;
import com.flatfile.api.resources.sheets.requests.ListSheetCommitsRequest;
import com.flatfile.api.resources.sheets.requests.ListSheetsRequest;
import com.flatfile.api.resources.sheets.types.CellsResponse;
import com.flatfile.api.resources.sheets.types.ListSheetsResponse;
import com.flatfile.api.resources.sheets.types.RecordCountsResponse;
import com.flatfile.api.resources.sheets.types.SheetResponse;
import com.flatfile.api.resources.sheets.types.SheetUpdateRequest;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SheetsClient {
    protected final ClientOptions clientOptions;

    public SheetsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns sheets in a workbook
     */
    public ListSheetsResponse list(ListSheetsRequest request) {
        return list(request, null);
    }

    /**
     * Returns sheets in a workbook
     */
    public ListSheetsResponse list(ListSheetsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets");
        httpUrl.addQueryParameter("workbookId", request.getWorkbookId().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListSheetsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a sheet in a workbook
     */
    public SheetResponse get(SheetId sheetId) {
        return get(sheetId, null);
    }

    /**
     * Returns a sheet in a workbook
     */
    public SheetResponse get(SheetId sheetId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), SheetResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes a specific sheet from a workbook
     */
    public Success delete(SheetId sheetId) {
        return delete(sheetId, null);
    }

    /**
     * Deletes a specific sheet from a workbook
     */
    public Success delete(SheetId sheetId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
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
     * Trigger data hooks and validation to run on a sheet
     */
    public Success validate(SheetId sheetId) {
        return validate(sheetId, null);
    }

    /**
     * Trigger data hooks and validation to run on a sheet
     */
    public Success validate(SheetId sheetId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("validate")
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
     * Returns records from a sheet in a workbook as a csv file
     */
    public InputStream getRecordsAsCsv(SheetId sheetId) {
        return getRecordsAsCsv(sheetId, GetRecordsCsvRequest.builder().build());
    }

    /**
     * Returns records from a sheet in a workbook as a csv file
     */
    public InputStream getRecordsAsCsv(SheetId sheetId, GetRecordsCsvRequest request) {
        return getRecordsAsCsv(sheetId, request, null);
    }

    /**
     * Returns records from a sheet in a workbook as a csv file
     */
    public InputStream getRecordsAsCsv(SheetId sheetId, GetRecordsCsvRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("download");
        if (request.getVersionId().isPresent()) {
            httpUrl.addQueryParameter("versionId", request.getVersionId().get());
        }
        if (request.getCommitId().isPresent()) {
            httpUrl.addQueryParameter("commitId", request.getCommitId().get().toString());
        }
        if (request.getSinceVersionId().isPresent()) {
            httpUrl.addQueryParameter(
                    "sinceVersionId", request.getSinceVersionId().get().toString());
        }
        if (request.getSinceCommitId().isPresent()) {
            httpUrl.addQueryParameter(
                    "sinceCommitId", request.getSinceCommitId().get().toString());
        }
        if (request.getSortField().isPresent()) {
            httpUrl.addQueryParameter("sortField", request.getSortField().get().toString());
        }
        if (request.getSortDirection().isPresent()) {
            httpUrl.addQueryParameter(
                    "sortDirection", request.getSortDirection().get().toString());
        }
        if (request.getFilter().isPresent()) {
            httpUrl.addQueryParameter("filter", request.getFilter().get().toString());
        }
        if (request.getFilterField().isPresent()) {
            httpUrl.addQueryParameter(
                    "filterField", request.getFilterField().get().toString());
        }
        if (request.getSearchValue().isPresent()) {
            httpUrl.addQueryParameter(
                    "searchValue", request.getSearchValue().get().toString());
        }
        if (request.getSearchField().isPresent()) {
            httpUrl.addQueryParameter(
                    "searchField", request.getSearchField().get().toString());
        }
        if (request.getIds().isPresent()) {
            httpUrl.addQueryParameter("ids", request.getIds().get().toString());
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
                return response.body().byteStream();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns counts of records from a sheet
     */
    public RecordCountsResponse getRecordCounts(SheetId sheetId) {
        return getRecordCounts(sheetId, GetRecordCountsRequest.builder().build());
    }

    /**
     * Returns counts of records from a sheet
     */
    public RecordCountsResponse getRecordCounts(SheetId sheetId, GetRecordCountsRequest request) {
        return getRecordCounts(sheetId, request, null);
    }

    /**
     * Returns counts of records from a sheet
     */
    public RecordCountsResponse getRecordCounts(
            SheetId sheetId, GetRecordCountsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("counts");
        if (request.getVersionId().isPresent()) {
            httpUrl.addQueryParameter("versionId", request.getVersionId().get());
        }
        if (request.getSinceVersionId().isPresent()) {
            httpUrl.addQueryParameter(
                    "sinceVersionId", request.getSinceVersionId().get().toString());
        }
        if (request.getCommitId().isPresent()) {
            httpUrl.addQueryParameter("commitId", request.getCommitId().get().toString());
        }
        if (request.getSinceCommitId().isPresent()) {
            httpUrl.addQueryParameter(
                    "sinceCommitId", request.getSinceCommitId().get().toString());
        }
        if (request.getFilter().isPresent()) {
            httpUrl.addQueryParameter("filter", request.getFilter().get().toString());
        }
        if (request.getFilterField().isPresent()) {
            httpUrl.addQueryParameter(
                    "filterField", request.getFilterField().get().toString());
        }
        if (request.getSearchValue().isPresent()) {
            httpUrl.addQueryParameter(
                    "searchValue", request.getSearchValue().get().toString());
        }
        if (request.getSearchField().isPresent()) {
            httpUrl.addQueryParameter(
                    "searchField", request.getSearchField().get().toString());
        }
        if (request.getByField().isPresent()) {
            httpUrl.addQueryParameter("byField", request.getByField().get().toString());
        }
        if (request.getQ().isPresent()) {
            httpUrl.addQueryParameter("q", request.getQ().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), RecordCountsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the commit versions for a sheet
     */
    public ListCommitsResponse getSheetCommits(SheetId sheetId) {
        return getSheetCommits(sheetId, ListSheetCommitsRequest.builder().build());
    }

    /**
     * Returns the commit versions for a sheet
     */
    public ListCommitsResponse getSheetCommits(SheetId sheetId, ListSheetCommitsRequest request) {
        return getSheetCommits(sheetId, request, null);
    }

    /**
     * Returns the commit versions for a sheet
     */
    public ListCommitsResponse getSheetCommits(
            SheetId sheetId, ListSheetCommitsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
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

    /**
     * Locks a sheet
     */
    public Success lockSheet(SheetId sheetId) {
        return lockSheet(sheetId, null);
    }

    /**
     * Locks a sheet
     */
    public Success lockSheet(SheetId sheetId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("lock")
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
     * Removes a lock from a sheet
     */
    public Success unlockSheet(SheetId sheetId) {
        return unlockSheet(sheetId, null);
    }

    /**
     * Removes a lock from a sheet
     */
    public Success unlockSheet(SheetId sheetId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("unlock")
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
     * Returns record cell values grouped by all fields in the sheet
     */
    public CellsResponse getCellValues(SheetId sheetId, GetFieldValuesRequest request) {
        return getCellValues(sheetId, request, null);
    }

    /**
     * Returns record cell values grouped by all fields in the sheet
     */
    public CellsResponse getCellValues(SheetId sheetId, GetFieldValuesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
                .addPathSegments("cells");
        if (request.getFieldKey().isPresent()) {
            httpUrl.addQueryParameter("fieldKey", request.getFieldKey().get().toString());
        }
        if (request.getSortField().isPresent()) {
            httpUrl.addQueryParameter("sortField", request.getSortField().get().toString());
        }
        if (request.getSortDirection().isPresent()) {
            httpUrl.addQueryParameter(
                    "sortDirection", request.getSortDirection().get().toString());
        }
        if (request.getFilter().isPresent()) {
            httpUrl.addQueryParameter("filter", request.getFilter().get().toString());
        }
        if (request.getFilterField().isPresent()) {
            httpUrl.addQueryParameter(
                    "filterField", request.getFilterField().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
        }
        httpUrl.addQueryParameter("distinct", request.getDistinct().toString());
        if (request.getIncludeCounts().isPresent()) {
            httpUrl.addQueryParameter(
                    "includeCounts", request.getIncludeCounts().get().toString());
        }
        if (request.getSearchValue().isPresent()) {
            httpUrl.addQueryParameter(
                    "searchValue", request.getSearchValue().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), CellsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Updates Sheet
     */
    public SheetResponse updateSheet(SheetId sheetId) {
        return updateSheet(sheetId, SheetUpdateRequest.builder().build());
    }

    /**
     * Updates Sheet
     */
    public SheetResponse updateSheet(SheetId sheetId, SheetUpdateRequest request) {
        return updateSheet(sheetId, request, null);
    }

    /**
     * Updates Sheet
     */
    public SheetResponse updateSheet(SheetId sheetId, SheetUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("sheets")
                .addPathSegment(sheetId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), SheetResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
