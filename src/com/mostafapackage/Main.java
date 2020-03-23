package com.mostafapackage;

import com.mostafapackage.iterator.BrowseHistory;
import com.mostafapackage.iterator.Iterator;
import com.mostafapackage.memento.Editor;import com.mostafapackage.memento.Editor;

import com.mostafapackage.memento.History;
import com.mostafapackage.state.BrushTool;
import com.mostafapackage.state.Canvas;
import com.mostafapackage.state.EraserTool;
import com.mostafapackage.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
	    var history = new BrowseHistory();
		history.push("a");
		history.push("b");
		history.push("c");

		Iterator historyIterator = history.createIterator();
		while (historyIterator.hasNext()){
			System.out.println(historyIterator.current());
			historyIterator.next();
		}
    }
}
