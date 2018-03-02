package com.linsama.jit.command;

public interface Command {

    String getName();

    void validateArguments(String[] args);

    void call();
}
