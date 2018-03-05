package com.linsama.jit.command;

@Command(
    name = "add",
    hasArgs = true,
    description = "add files to index"
)
public class AddCommand implements JitCommand {
    @Override
    public void validateArguments(String[] args) {

    }

    @Override
    public void call() {

    }
}
