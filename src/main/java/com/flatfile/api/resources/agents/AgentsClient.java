/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.resources.agents;

import com.flatfile.api.core.ApiError;
import com.flatfile.api.core.ClientOptions;
import com.flatfile.api.core.MediaTypes;
import com.flatfile.api.core.ObjectMappers;
import com.flatfile.api.core.RequestOptions;
import com.flatfile.api.resources.agents.requests.CreateAgentsRequest;
import com.flatfile.api.resources.agents.requests.DeleteAgentRequest;
import com.flatfile.api.resources.agents.requests.GetAgentLogRequest;
import com.flatfile.api.resources.agents.requests.GetAgentLogsRequest;
import com.flatfile.api.resources.agents.requests.GetAgentRequest;
import com.flatfile.api.resources.agents.requests.GetEnvironmentAgentExecutionsRequest;
import com.flatfile.api.resources.agents.requests.GetEnvironmentAgentLogsRequest;
import com.flatfile.api.resources.agents.requests.ListAgentsRequest;
import com.flatfile.api.resources.agents.types.AgentResponse;
import com.flatfile.api.resources.agents.types.GetAgentLogsResponse;
import com.flatfile.api.resources.agents.types.GetDetailedAgentLogResponse;
import com.flatfile.api.resources.agents.types.GetDetailedAgentLogsResponse;
import com.flatfile.api.resources.agents.types.GetExecutionsResponse;
import com.flatfile.api.resources.agents.types.ListAgentsResponse;
import com.flatfile.api.resources.commons.types.ActorRoleId;
import com.flatfile.api.resources.commons.types.AgentId;
import com.flatfile.api.resources.commons.types.EventId;
import com.flatfile.api.resources.commons.types.Success;
import com.flatfile.api.resources.roles.types.AssignActorRoleRequest;
import com.flatfile.api.resources.roles.types.AssignRoleResponse;
import com.flatfile.api.resources.roles.types.ListActorRolesResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AgentsClient {
    protected final ClientOptions clientOptions;

    public AgentsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ListAgentsResponse list(ListAgentsRequest request) {
        return list(request, null);
    }

    public ListAgentsResponse list(ListAgentsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents");
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListAgentsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AgentResponse create(CreateAgentsRequest request) {
        return create(request, null);
    }

    public AgentResponse create(CreateAgentsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents");
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AgentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AgentResponse get(AgentId agentId) {
        return get(agentId, GetAgentRequest.builder().build());
    }

    public AgentResponse get(AgentId agentId, GetAgentRequest request) {
        return get(agentId, request, null);
    }

    public AgentResponse get(AgentId agentId, GetAgentRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString());
        if (request.getEnvironmentId().isPresent()) {
            httpUrl.addQueryParameter(
                    "environmentId", request.getEnvironmentId().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AgentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Lists roles assigned to an agent.
     */
    public ListActorRolesResponse listAgentRoles(AgentId agentId) {
        return listAgentRoles(agentId, null);
    }

    /**
     * Lists roles assigned to an agent.
     */
    public ListActorRolesResponse listAgentRoles(AgentId agentId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString())
                .addPathSegments("roles")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListActorRolesResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Assigns a role to a agent.
     */
    public AssignRoleResponse assignAgentRole(AgentId agentId, AssignActorRoleRequest request) {
        return assignAgentRole(agentId, request, null);
    }

    /**
     * Assigns a role to a agent.
     */
    public AssignRoleResponse assignAgentRole(
            AgentId agentId, AssignActorRoleRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString())
                .addPathSegments("roles")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AssignRoleResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Removes a role from an agent.
     */
    public Success deleteAgentRole(AgentId agentId, ActorRoleId actorRoleId) {
        return deleteAgentRole(agentId, actorRoleId, null);
    }

    /**
     * Removes a role from an agent.
     */
    public Success deleteAgentRole(AgentId agentId, ActorRoleId actorRoleId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString())
                .addPathSegments("roles")
                .addPathSegment(actorRoleId.toString())
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

    public GetAgentLogsResponse getAgentLogs(AgentId agentId, GetAgentLogsRequest request) {
        return getAgentLogs(agentId, request, null);
    }

    public GetAgentLogsResponse getAgentLogs(
            AgentId agentId, GetAgentLogsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString())
                .addPathSegments("logs");
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), GetAgentLogsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetDetailedAgentLogResponse getAgentLog(EventId eventId, GetAgentLogRequest request) {
        return getAgentLog(eventId, request, null);
    }

    public GetDetailedAgentLogResponse getAgentLog(
            EventId eventId, GetAgentLogRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegments("log")
                .addPathSegment(eventId.toString());
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), GetDetailedAgentLogResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetDetailedAgentLogsResponse getEnvironmentAgentLogs(GetEnvironmentAgentLogsRequest request) {
        return getEnvironmentAgentLogs(request, null);
    }

    public GetDetailedAgentLogsResponse getEnvironmentAgentLogs(
            GetEnvironmentAgentLogsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegments("logs");
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        if (request.getSuccess().isPresent()) {
            httpUrl.addQueryParameter("success", request.getSuccess().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), GetDetailedAgentLogsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public GetExecutionsResponse getEnvironmentAgentExecutions(GetEnvironmentAgentExecutionsRequest request) {
        return getEnvironmentAgentExecutions(request, null);
    }

    public GetExecutionsResponse getEnvironmentAgentExecutions(
            GetEnvironmentAgentExecutionsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegments("executions");
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
        if (request.getSpaceId().isPresent()) {
            httpUrl.addQueryParameter("spaceId", request.getSpaceId().get().toString());
        }
        if (request.getSuccess().isPresent()) {
            httpUrl.addQueryParameter("success", request.getSuccess().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("pageSize", request.getPageSize().get().toString());
        }
        if (request.getPageNumber().isPresent()) {
            httpUrl.addQueryParameter(
                    "pageNumber", request.getPageNumber().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), GetExecutionsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes a single agent
     */
    public Success delete(AgentId agentId, DeleteAgentRequest request) {
        return delete(agentId, request, null);
    }

    /**
     * Deletes a single agent
     */
    public Success delete(AgentId agentId, DeleteAgentRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("agents")
                .addPathSegment(agentId.toString());
        httpUrl.addQueryParameter("environmentId", request.getEnvironmentId().toString());
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
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
}
