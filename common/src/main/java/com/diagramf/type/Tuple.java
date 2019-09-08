/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.type;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Tuple<T> {

    private final List<T> elements;

    @SafeVarargs
    private Tuple(T... elements) {
        this(Arrays.asList(elements));
    }

    @SuppressWarnings("unchecked")
    public <U extends T> U get(int index) {
        return (U) elements.get(index);
    }

    public int size() {
        return elements.size();
    }
}
