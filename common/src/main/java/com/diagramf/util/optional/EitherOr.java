/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.util.optional;

import com.google.common.base.Preconditions;
import lombok.Data;

import javax.annotation.Nullable;

/**
 * It's either this or that
 *
 * @param <T> This type
 * @param <V> That type
 */
@Data
public class EitherOr<T, V> {

    @Nullable
    private final T thisThing;

    @Nullable
    private final V thatThing;

    public EitherOr(T thisThing, V thatThing) {
        Preconditions.checkArgument(thisThing != null || thatThing != null, "At least one thing " +
                "must not be null! Got this: " + thisThing + ", and that: " + thatThing);
        this.thisThing = thisThing;
        this.thatThing = thatThing;
    }

    public boolean hasThisThing() {
        return thisThing != null;
    }

    public boolean hasThatThing() {
        return thatThing != null;
    }

    public T getThisThing() {
        return thisThing;
    }

    public V getThatThing() {
        return thatThing;
    }
}
