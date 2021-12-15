package com.god.log;

public interface HiLogFormatter<T> {
    String format(T data);
}