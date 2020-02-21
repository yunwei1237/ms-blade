package com.tcf.ms.command.core.base;

public class BladeException extends RuntimeException {

    public BladeException(String message) {
        super(message);
    }

    public BladeException(String message, Throwable cause) {
        super(message, cause);
    }
}
