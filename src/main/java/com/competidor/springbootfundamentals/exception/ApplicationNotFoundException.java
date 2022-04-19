package com.competidor.springbootfundamentals.exception;

public class ApplicationNotFoundException extends RuntimeException {

  public ApplicationNotFoundException(String exception) {
    super(exception);
  }
}
