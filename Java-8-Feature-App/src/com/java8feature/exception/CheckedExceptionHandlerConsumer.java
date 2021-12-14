package com.java8feature.exception;

public interface CheckedExceptionHandlerConsumer<Target, ExObj extends Exception> {

	public void accept(Target target) throws ExObj;
}
