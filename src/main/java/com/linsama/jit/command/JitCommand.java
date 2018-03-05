package com.linsama.jit.command;

public interface JitCommand {
    void validateArguments(String[] args);

    void call();
}
