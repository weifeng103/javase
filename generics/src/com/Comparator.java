package com;

@FunctionalInterface
public interface Comparator<T> {
      double compare(T userOne, T userTwo);
}
