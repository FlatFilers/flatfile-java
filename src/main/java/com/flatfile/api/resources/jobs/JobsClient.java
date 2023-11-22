/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.jobs;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
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
import java.io.IOException;
import java.util.Optional;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class JobsClient {
    protected final ClientOptions clientOptions;

    public JobsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ListJobsResponse list() {
        return list(ListJobsRequest.builder().build());
    }

    public ListJobsResponse list(ListJobsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs");
        if (request.getEnvironmentId().isPresent()) {
            httpUrl.addQueryParameter(
                    "environmentId", request.getEnvironmentId().get());
        }
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get());
        }
        if (request.getWorkbookId().isPresent()) {
            httpUrl.addQueryParameter("workbookId", request.getWorkbookId().get());
        }
        if (request.getFileId().isPresent()) {
            httpUrl.addQueryParameter("fileId", request.getFileId().get());
        }
        if (request.getParentId().isPresent()) {
            httpUrl.addQueryParameter("parentId", request.getParentId().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListJobsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ListJobsResponse list(ListJobsRequest request) {
        return list(request, null);
    }

    public JobResponse create(JobConfig request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JobResponse create(JobConfig request) {
        return create(request, null);
    }

    public JobResponse get(String jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JobResponse get(String jobId) {
        return get(jobId, null);
    }

    public JobResponse update(String jobId) {
        return update(jobId, JobUpdate.builder().build());
    }

    public JobResponse update(String jobId, JobUpdate request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JobResponse update(String jobId, JobUpdate request) {
        return update(jobId, request, null);
    }

    public Success delete(String jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
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

    public Success delete(String jobId) {
        return delete(jobId, null);
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
     * Execute a job and return the job
     */
    public Success execute(String jobId) {
        return execute(jobId, null);
    }

    /**
     * Returns a single job's execution plan
     */
    public JobPlanResponse getExecutionPlan(String jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("plan")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobPlanResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a single job's execution plan
     */
    public JobPlanResponse getExecutionPlan(String jobId) {
        return getExecutionPlan(jobId, null);
    }

    /**
     * Update a job's entire execution plan
     */
    public JobPlanResponse updateExecutionPlan(
            String jobId, JobExecutionPlanRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("plan")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobPlanResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Update a job's entire execution plan
     */
    public JobPlanResponse updateExecutionPlan(String jobId, JobExecutionPlanRequest request) {
        return updateExecutionPlan(jobId, request, null);
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
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobPlanResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Update one or more individual fields on a job's execution plan
     */
    public JobPlanResponse updateExecutionPlanFields(String jobId, JobExecutionPlanConfigRequest request) {
        return updateExecutionPlanFields(jobId, request, null);
    }

    /**
     * Acknowledge a job and return the job
     */
    public JobResponse ack(String jobId) {
        return ack(jobId, Optional.empty());
    }

    /**
     * Acknowledge a job and return the job
     */
    public JobResponse ack(String jobId, Optional<JobAckDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("ack")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Acknowledge a job and return the job
     */
    public JobResponse ack(String jobId, Optional<JobAckDetails> request) {
        return ack(jobId, request, null);
    }

    /**
     * Acknowledge a job outcome and return the job
     */
    public JobResponse ackOutcome(String jobId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("outcome/ack")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Acknowledge a job outcome and return the job
     */
    public JobResponse ackOutcome(String jobId) {
        return ackOutcome(jobId, null);
    }

    /**
     * Complete a job and return the job
     */
    public JobResponse complete(String jobId) {
        return complete(jobId, Optional.empty());
    }

    /**
     * Complete a job and return the job
     */
    public JobResponse complete(String jobId, Optional<JobCompleteDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("complete")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Complete a job and return the job
     */
    public JobResponse complete(String jobId, Optional<JobCompleteDetails> request) {
        return complete(jobId, request, null);
    }

    /**
     * Fail a job and return the job
     */
    public JobResponse fail(String jobId) {
        return fail(jobId, Optional.empty());
    }

    /**
     * Fail a job and return the job
     */
    public JobResponse fail(String jobId, Optional<JobCompleteDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("fail")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Fail a job and return the job
     */
    public JobResponse fail(String jobId, Optional<JobCompleteDetails> request) {
        return fail(jobId, request, null);
    }

    /**
     * Cancel a job and return the job
     */
    public JobResponse cancel(String jobId) {
        return cancel(jobId, Optional.empty());
    }

    /**
     * Cancel a job and return the job
     */
    public JobResponse cancel(String jobId, Optional<JobCancelDetails> request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("cancel")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Cancel a job and return the job
     */
    public JobResponse cancel(String jobId, Optional<JobCancelDetails> request) {
        return cancel(jobId, request, null);
    }

    /**
     * Split a job and return the job
     */
    public JobResponse split(String jobId, JobSplitDetails request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("jobs")
                .addPathSegment(jobId)
                .addPathSegments("split")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), JobResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Split a job and return the job
     */
    public JobResponse split(String jobId, JobSplitDetails request) {
        return split(jobId, request, null);
    }
}