package com.mostafapackage.command;

import com.mostafapackage.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public CompositeCommand add(Command command){ commands.add(command); return this;}

    @Override
    public void execute() {
        for(var command : commands){command.execute();}
    }
}
