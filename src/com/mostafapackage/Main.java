package com.mostafapackage;

import com.mostafapackage.command.*;
import com.mostafapackage.command.editor.*;
import com.mostafapackage.command.fx.Button;
import com.mostafapackage.iterator.BrowseHistory;
import com.mostafapackage.iterator.Iterator;
import com.mostafapackage.memento.Editor;import com.mostafapackage.memento.Editor;
import com.mostafapackage.observer.Chart;
import com.mostafapackage.observer.DataSource;
import com.mostafapackage.observer.SpreadSheet;
import com.mostafapackage.state.BrushTool;
import com.mostafapackage.state.Canvas;
import com.mostafapackage.state.EraserTool;
import com.mostafapackage.state.SelectionTool;
import com.mostafapackage.strategy.*;
import com.mostafapackage.template.AuditTrail;
import com.mostafapackage.template.GenerateReport;
import com.mostafapackage.template.TransferMoneyTask;
import org.w3c.dom.html.HTMLIsIndexElement;

public class Main {

    public static void main(String[] args) {
//    	var service = new CustomerService();
//    	var command = new AddCustomerCommand(service);
//    	var button = new Button(command);
//
//    	button.click();

//		var composite = new CompositeCommand();
//		composite.
//				add(new ResizeCommand()).
//				add(new BlackAndWhiteCommand());
//
//		composite.execute();
//		composite.execute();

//		var history = new History();
//		var document = new HtmlDocument();
//		var undoCommand = new UndoCommand(history);
//
//		document.setContent("hello World");
//		var boldCommand = new BoldCommand(document, history);
//		boldCommand.execute();
//
//		System.out.println(document.getContent());
//		undoCommand.execute();
//		System.out.println(document.getContent());

		var dataSource = new DataSource();
		var sheet1 = new SpreadSheet(dataSource);
		var sheet2 = new SpreadSheet(dataSource);
		var chart = new Chart(dataSource);

		dataSource.addObserver(sheet1);
		dataSource.addObserver(sheet2);
		dataSource.addObserver(chart);
		dataSource.setValue(60);

    }
}
