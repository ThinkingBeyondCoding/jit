package com.linsama.jit.command;

import org.apache.commons.cli.*;

public class CommandHandler {
    private final Options options = new Options();

    public CommandHandler() {
        options.addOption("init", false, "init a jit repo");
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
            System.out.println(cmd.hasOption("init"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
