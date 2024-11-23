package org.designpattern._03_behavioral._2_internal_behavior._1_iterator.code;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
