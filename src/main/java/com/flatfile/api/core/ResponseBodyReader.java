/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.core;

import java.io.FilterReader;
import java.io.IOException;
import okhttp3.Response;

/**
 * A custom Reader that wraps the Reader from the OkHttp Response and ensures that the
 * OkHttp Response object is properly closed when the reader is closed.
 *
 * This class extends FilterReader and takes an OkHttp Response object as a parameter.
 * It retrieves the Reader from the Response and overrides the close method to close
 * both the Reader and the Response object, ensuring proper resource management and preventing
 * premature closure of the underlying HTTP connection.
 */
public class ResponseBodyReader extends FilterReader {
    private final Response response;

    /**
     * Constructs a ResponseBodyReader that wraps the Reader from the given OkHttp Response object.
     *
     * @param response the OkHttp Response object from which the Reader is retrieved
     * @throws IOException if an I/O error occurs while retrieving the Reader
     */
    public ResponseBodyReader(Response response) throws IOException {
        super(response.body().charStream());
        this.response = response;
    }

    /**
     * Closes the Reader and the associated OkHttp Response object. This ensures that the
     * underlying HTTP connection is properly closed after the reader is no longer needed.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {
        super.close();
        response.close(); // Ensure the response is closed when the reader is closed
    }
}