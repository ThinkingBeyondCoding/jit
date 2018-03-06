package com.linsama.jit.command;

import com.linsama.jit.runtime.JitRuntime;

@Command(
    name = "add",
    hasArgs = true,
    description = "add files to index"
)
public class AddCommand extends JitCommand {
    @Override
    public void validateArguments(String[] args) {
        if (args.length == 1) {
            validateArgumentsFailed();
        }
    }

    @Override
    public void call(String[] args, JitRuntime runtime) {
    }
}
