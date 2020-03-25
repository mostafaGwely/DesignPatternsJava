package com.mostafapackage.command.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
