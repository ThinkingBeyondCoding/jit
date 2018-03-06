package com.linsama.jit.command;

import com.linsama.jit.runtime.JitRuntime;
import org.apache.commons.cli.*;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private final Options options = new Options();
    private final Map<String, JitCommand> commandMap = new HashMap<>();

    private JitCommand[] commands = new JitCommand[] {
        new InitCommand(),
        new AddCommand()
    };

    public CommandHandler() {
        for (JitCommand command : commands) {
            Command commandAnnotation = command.getClass().getAnnotation(Command.class);
            commandMap.put(commandAnnotation.name(), command);
            options.addOption(commandAnnotation.name(), commandAnnotation.hasArgs(), commandAnnotation.description());
        }
    }

    public void parse(String[] args, JitRuntime runtime) {
        HelpFormatter formatter = new HelpFormatter();
        if (args.length == 0) {
            formatter.printHelp( "jit", options );
            System.exit(1);
        }

        String commandName = args[0];

        if (!commandMap.containsKey(commandName)) {
            formatter.printHelp( "jit", options );
            System.exit(1);
        }

        commandMap.get(commandName).call(args, runtime);
    }
}
