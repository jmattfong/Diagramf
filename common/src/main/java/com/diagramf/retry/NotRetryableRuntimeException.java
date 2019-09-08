/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.retry;

public class NotRetryableRuntimeException extends RuntimeException {

    public NotRetryableRuntimeException(String message) {
        super(message);
    }

    public NotRetryableRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRetryableRuntimeException(Throwable cause) {
        super(cause);
    }
}
