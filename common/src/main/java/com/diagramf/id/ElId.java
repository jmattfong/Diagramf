/*
 * Copyright (c) 2016 Matthew Fong
 */

package com.diagramf.id;

public enum ElId {
    neuron,
    ;

    public Id newId() {
        return Id.newId(name());
    }
}
