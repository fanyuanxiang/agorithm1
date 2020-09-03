package com.cx;

@FunctionalInterface
public interface IConvert<T,F> {
    T convert (F from);
}
