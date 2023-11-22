/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.core;

import java.util.HashMap;
import java.util.Map;

public final class RequestOptions {
    private final String token;

    private final String xDisableHooks;

    private RequestOptions(String token, String xDisableHooks) {
        this.token = token;
        this.xDisableHooks = xDisableHooks;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.token != null) {
            headers.put("Authorization", "Bearer " + this.token);
        }
        if (this.xDisableHooks != null) {
            headers.put("X-Disable-Hooks", this.xDisableHooks);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String token = null;

        private String xDisableHooks = null;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder xDisableHooks(String xDisableHooks) {
            this.xDisableHooks = xDisableHooks;
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(token, xDisableHooks);
        }
    }
}
