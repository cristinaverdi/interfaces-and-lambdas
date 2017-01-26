package com.codethen.interfaces.transform;

@FunctionalInterface
public interface Transformer<In, Out> {

    /** transforms the argument x and returns a value */
    Out transform(In x);
}
