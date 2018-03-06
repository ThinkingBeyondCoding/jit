package com.linsama.jit.command;

import com.linsama.jit.runtime.JitRuntime;

@Command(
    name = "init",
    description = "init a jit repo"
)
public class InitCommand extends JitCommand {
    @Override
    public void validateArguments(String[] args) {
        if (args.length > 1) {
            validateArgumentsFailed();
        }
    }

    @Override
    public void call(String[] args, JitRuntime runtime) {

    }
}
