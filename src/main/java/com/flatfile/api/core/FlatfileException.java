/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.flatfile.api.core;

/**
 * This class serves as the base exception for all errors in the SDK.
 */
public class FlatfileException extends RuntimeException {
    public FlatfileException(String message) {
        super(message);
    }

    public FlatfileException(String message, Exception e) {
        super(message, e);
    }
}
