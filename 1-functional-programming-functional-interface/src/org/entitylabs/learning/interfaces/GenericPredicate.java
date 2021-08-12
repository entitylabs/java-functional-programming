package org.entitylabs.learning.interfaces;

@FunctionalInterface
public interface GenericPredicate<T> {

	boolean test(T t);
}
