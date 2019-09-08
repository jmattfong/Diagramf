/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.id;

import com.diagramf.exception.InvalidFormatException;
import lombok.Data;

import java.util.UUID;
import java.util.regex.Pattern;

@Data
public class Id {

    public static final String ID_FORMAT_REGEX = "elid-\\d{1,50}-[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final Pattern ID_PATTERN = Pattern.compile(ID_FORMAT_REGEX);

    private static final String ID_FORMAT = "elid-%s-%s";

    private final String id;

    public Id(String id) throws InvalidFormatException {
        if (!isValidId(id)) {
            throw new InvalidFormatException(id);
        }
        this.id = id;
    }

    public static Id newId(String type) {
        String id = String.format(ID_FORMAT, type, UUID.randomUUID().toString());
        try {
            return new Id(id);
        } catch (InvalidFormatException e) {
            throw new RuntimeException("Oops, calculated invalid ID " + id, e);
        }
    }

    public static boolean isValidId(String id) {
        return ID_PATTERN.matcher(id).matches();
    }
}