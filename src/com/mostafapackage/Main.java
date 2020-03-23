package com.mostafapackage;

import com.mostafapackage.iterator.BrowseHistory;
import com.mostafapackage.iterator.Iterator;
import com.mostafapackage.memento.Editor;import com.mostafapackage.memento.Editor;

import com.mostafapackage.memento.History;
import com.mostafapackage.state.BrushTool;
import com.mostafapackage.state.Canvas;
import com.mostafapackage.state.EraserTool;
import com.mostafapackage.state.SelectionTool;
import com.mostafapackage.strategy.*;

public class Main {

    public static void main(String[] args) {
		Compressor compressor = new JpegCompressor();
    	Filter filter = new BlackAndWhiteFilter();

    	var imageStore = new ImageStorage(compressor, filter);

		imageStore.store("filename");
		//we can use this
		//var imageStore = new ImageStorage();
		//imageStore.store(filename, new JpegCompressor(), new BlackAndWhiteFilter());
    }
}
