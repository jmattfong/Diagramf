/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.retry;

public class NotRetryableException extends Exception {

    public NotRetryableException(String message) {
        super(message);
    }

    public NotRetryableException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotRetryableException(Throwable cause) {
        super(cause);
    }
}
