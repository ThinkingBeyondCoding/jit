package com.linsama.jit.command;

import com.linsama.jit.runtime.JitRuntime;

public abstract class JitCommand {

    private JitRuntime jitRuntime;

    public JitRuntime getJitRuntime() {
        return jitRuntime;
    }

    public void setJitRuntime(JitRuntime jitRuntime) {
        this.jitRuntime = jitRuntime;
    }

    abstract void validateArguments(String[] args);

    public abstract void call(String[] args, JitRuntime runtime);

    void validateArgumentsFailed() {
        System.out.println("validate arguments failed");
        System.exit(1);
    }
}
