package com.linsama.jit;

import com.linsama.jit.command.CommandHandler;

public class Main {

    public static void main(String[] args) {
        CommandHandler cmdHandler = new CommandHandler();
        cmdHandler.parse(args);
    }
}
