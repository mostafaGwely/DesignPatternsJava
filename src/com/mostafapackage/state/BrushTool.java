package com.mostafapackage.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush Down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
