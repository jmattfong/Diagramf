/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.exception;

import com.diagramf.id.Id;

public class InvalidFormatException extends RuntimeException {

    public InvalidFormatException(String id) {
        super("ID " + id + " is invalid. It must match " + Id.ID_FORMAT_REGEX);
    }

    public InvalidFormatException(String id, Exception cause) {
        super("ID " + id + " is invalid. It must match " + Id.ID_FORMAT_REGEX, cause);
    }

    public InvalidFormatException(Exception cause) {
        super(cause);
    }
}