/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.core;

import java.io.FilterInputStream;
import java.io.IOException;
import okhttp3.Response;

/**
 * A custom InputStream that wraps the InputStream from the OkHttp Response and ensures that the
 * OkHttp Response object is properly closed when the stream is closed.
 *
 * This class extends FilterInputStream and takes an OkHttp Response object as a parameter.
 * It retrieves the InputStream from the Response and overrides the close method to close
 * both the InputStream and the Response object, ensuring proper resource management and preventing
 * premature closure of the underlying HTTP connection.
 */
public class ResponseBodyInputStream extends FilterInputStream {
    private final Response response;

    /**
     * Constructs a ResponseBodyInputStream that wraps the InputStream from the given OkHttp
     * Response object.
     *
     * @param response the OkHttp Response object from which the InputStream is retrieved
     * @throws IOException if an I/O error occurs while retrieving the InputStream
     */
    public ResponseBodyInputStream(Response response) throws IOException {
        super(response.body().byteStream());
        this.response = response;
    }

    /**
     * Closes the InputStream and the associated OkHttp Response object. This ensures that the
     * underlying HTTP connection is properly closed after the stream is no longer needed.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        super.close();
        response.close(); // Ensure the response is closed when the stream is closed
    }
}