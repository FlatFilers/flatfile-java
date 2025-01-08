/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.FlatfileApiException;
import com.flatfile.api.core.FlatfileException;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.commons.types.JobId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.jobs.requests.ListJobsRequest;
import com.flatfile.api.resources.jobs.types.JobAckDetails;
import com.flatfile.api.resources.jobs.types.JobCancelDetails;
import com.flatfile.api.resources.jobs.types.JobCompleteDetails;
import com.flatfile.api.resources.jobs.types.JobConfig;
import com.flatfile.api.resources.jobs.types.JobExecutionPlanConfigRequest;
import com.flatfile.api.resources.jobs.types.JobExecutionPlanRequest;
import com.flatfile.api.resources.jobs.types.JobPlanResponse;
import com.flatfile.api.resources.jobs.types.JobResponse;
import com.flatfile.api.resources.jobs.types.JobSplitDetails;
import com.flatfile.api.resources.jobs.types.JobUpdate;
import com.flatfile.api.resources.jobs.types.ListJobsResponse;
import com.flatfile.api.resources.jobs.types.MutateJobConfig;
import com.flatfile.api.resources.records.types.DiffRecordsResponse;
import java.io.IOException;
import java.util.Optional;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class JobsClient {
    protected final ClientOptions clientOptions;

    public JobsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ListJobsResponse list() {
        return list(ListJobsRequest.builder().build());
    }

    public ListJobsResponse list(ListJobsRequest request) {
        return list(request, null);
    }

    public ListJobsResponse list(ListJobsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs");
        if (request.getEnvironmentId().isPresent()) {
            httpUrl.addQueryParameter(
                    "environmentId", request.getEnvironmentId().get().toString());
        }
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        if (request.getWorkbookId().isPresent()) {
            httpUrl.addQueryParameter(
                    "workbookId", request.getWorkbookId().get().toString());
        }
        if (request.getFileId().isPresent()) {
            httpUrl.addQueryParameter("fileId", request.getFileId().get().toString());
        }
        if (request.getParentId().isPresent()) {
            httpUrl.addQueryParameter("parentId", request.getParentId().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
        }
        if (request.getSortDirection().isPresent()) {
            httpUrl.addQueryParameter(
                    "sortDirection", request.getSortDirection().get().toString());
        }
        if (request.getExcludeChildJobs().isPresent()) {
            httpUrl.addQueryParameter(
                    "excludeChildJobs", request.getExcludeChildJobs().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListJobsResponse.class);
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

    public JobResponse create(JobConfig request) {
        return create(request, null);
    }

    public JobResponse create(JobConfig request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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

    public JobResponse get(JobId jobId) {
        return get(jobId, null);
    }

    public JobResponse get(JobId jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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

    public JobResponse update(JobId jobId) {
        return update(jobId, JobUpdate.builder().build());
    }

    public JobResponse update(JobId jobId, JobUpdate request) {
        return update(jobId, request, null);
    }

    public JobResponse update(JobId jobId, JobUpdate request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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

    public Success delete(JobId jobId) {
        return delete(jobId, null);
    }

    public Success delete(JobId jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
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
     * Execute a job and return the job
     */
    public Success execute(String jobId) {
        return execute(jobId, null);
    }

    /**
     * Execute a job and return the job
     */
    public Success execute(String jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("execute")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
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
     * Returns a single job's execution plan
     */
    public JobPlanResponse getExecutionPlan(JobId jobId) {
        return getExecutionPlan(jobId, null);
    }

    /**
     * Returns a single job's execution plan
     */
    public JobPlanResponse getExecutionPlan(JobId jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("plan")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobPlanResponse.class);
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
     * Update a job's entire execution plan
     */
    public JobPlanResponse updateExecutionPlan(JobId jobId, JobExecutionPlanRequest request) {
        return updateExecutionPlan(jobId, request, null);
    }

    /**
     * Update a job's entire execution plan
     */
    public JobPlanResponse updateExecutionPlan(
            JobId jobId, JobExecutionPlanRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("plan")
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
                .method("PUT", body)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobPlanResponse.class);
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
     * Update one or more individual fields on a job's execution plan
     */
    public JobPlanResponse updateExecutionPlanFields(String jobId, JobExecutionPlanConfigRequest request) {
        return updateExecutionPlanFields(jobId, request, null);
    }

    /**
     * Update one or more individual fields on a job's execution plan
     */
    public JobPlanResponse updateExecutionPlanFields(
            String jobId, JobExecutionPlanConfigRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("plan")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobPlanResponse.class);
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
     * Acknowledge a job and return the job
     */
    public JobResponse ack(JobId jobId) {
        return ack(jobId, Optional.empty());
    }

    /**
     * Acknowledge a job and return the job
     */
    public JobResponse ack(JobId jobId, Optional<JobAckDetails> request) {
        return ack(jobId, request, null);
    }

    /**
     * Acknowledge a job and return the job
     */
    public JobResponse ack(JobId jobId, Optional<JobAckDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("ack")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Acknowledge a job outcome and return the job
     */
    public JobResponse ackOutcome(JobId jobId) {
        return ackOutcome(jobId, null);
    }

    /**
     * Acknowledge a job outcome and return the job
     */
    public JobResponse ackOutcome(JobId jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("outcome/ack")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Complete a job and return the job
     */
    public JobResponse complete(JobId jobId) {
        return complete(jobId, Optional.empty());
    }

    /**
     * Complete a job and return the job
     */
    public JobResponse complete(JobId jobId, Optional<JobCompleteDetails> request) {
        return complete(jobId, request, null);
    }

    /**
     * Complete a job and return the job
     */
    public JobResponse complete(JobId jobId, Optional<JobCompleteDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("complete")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Fail a job and return the job
     */
    public JobResponse fail(JobId jobId) {
        return fail(jobId, Optional.empty());
    }

    /**
     * Fail a job and return the job
     */
    public JobResponse fail(JobId jobId, Optional<JobCompleteDetails> request) {
        return fail(jobId, request, null);
    }

    /**
     * Fail a job and return the job
     */
    public JobResponse fail(JobId jobId, Optional<JobCompleteDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("fail")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Cancel a job and return the job
     */
    public JobResponse cancel(JobId jobId) {
        return cancel(jobId, Optional.empty());
    }

    /**
     * Cancel a job and return the job
     */
    public JobResponse cancel(JobId jobId, Optional<JobCancelDetails> request) {
        return cancel(jobId, request, null);
    }

    /**
     * Cancel a job and return the job
     */
    public JobResponse cancel(JobId jobId, Optional<JobCancelDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("cancel")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Retry a failt job and return the job
     */
    public JobResponse retry(JobId jobId) {
        return retry(jobId, null);
    }

    /**
     * Retry a failt job and return the job
     */
    public JobResponse retry(JobId jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("retry")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
     * Preview the results of a mutation
     */
    public DiffRecordsResponse previewMutation(MutateJobConfig request) {
        return previewMutation(request, null);
    }

    /**
     * Preview the results of a mutation
     */
    public DiffRecordsResponse previewMutation(MutateJobConfig request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegments("preview-mutation")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), DiffRecordsResponse.class);
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
     * Split a job and return the job
     */
    public JobResponse split(JobId jobId, JobSplitDetails request) {
        return split(jobId, request, null);
    }

    /**
     * Split a job and return the job
     */
    public JobResponse split(JobId jobId, JobSplitDetails request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId.toString())
                .addPathSegments("split")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), JobResponse.class);
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
