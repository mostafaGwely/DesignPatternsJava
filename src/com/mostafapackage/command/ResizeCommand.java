package com.mostafapackage.command;

import com.mostafapackage.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("resizing");
    }
}
