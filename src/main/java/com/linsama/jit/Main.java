package com.linsama.jit;

import com.linsama.jit.command.CommandHandler;
import com.linsama.jit.runtime.JitRuntime;

public class Main {

    public static void main(String[] args) {
        JitRuntime runtime = new JitRuntime();

        CommandHandler cmdHandler = new CommandHandler();
        cmdHandler.parse(args, runtime);
    }
}
