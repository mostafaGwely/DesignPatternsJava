package com.mostafapackage.command.editor;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand){
        commands.add(undoableCommand);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }
    public int size(){
        return commands.size();
    }
}
