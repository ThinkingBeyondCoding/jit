package com.linsama.jit.command;

import org.apache.commons.cli.*;

public class CommandHandler {
    private final Options options = new Options();
    private Class[] commandClass = new Class[] {
        InitCommand.class,
        AddCommand.class
    };

    public CommandHandler() {
        for (Class clazz : commandClass) {
            Command command = (Command) clazz.getAnnotation(Command.class);
            options.addOption(command.name(), command.hasArgs(), command.description());
        }
    }

    public void parse(String[] args) {
        if (args.length == 0) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "jit", options );
            return;
        }
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            for (Class clazz : commandClass) {
                Command command = (Command) clazz.getAnnotation(Command.class);
                if (cmd.hasOption(command.name())) {
                    System.out.println(String.format("parse %s successfully", command.name()));
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
