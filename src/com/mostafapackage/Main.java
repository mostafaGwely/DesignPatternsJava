package com.mostafapackage;

import com.mostafapackage.memento.Editor;
import com.mostafapackage.memento.History;
import com.mostafapackage.state.BrushTool;
import com.mostafapackage.state.Canvas;
import com.mostafapackage.state.EraserTool;
import com.mostafapackage.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
	    var canvas = new Canvas();
	    canvas.setCurrentTool(new EraserTool());
	    canvas.mouseDown();
	    canvas.mouseUp();

    }
}
