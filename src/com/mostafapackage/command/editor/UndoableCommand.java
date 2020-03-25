package com.mostafapackage.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
