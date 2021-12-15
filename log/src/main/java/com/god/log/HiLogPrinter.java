package com.god.log;

import androidx.annotation.NonNull;

public interface HiLogPrinter {
    void print(@NonNull HiLogConfig config, @HiLogType.TYPE int level, String tag, @NonNull String printString);
}
