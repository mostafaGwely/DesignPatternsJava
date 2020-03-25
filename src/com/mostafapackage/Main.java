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
import com.mostafapackage.template.AuditTrail;
import com.mostafapackage.template.GenerateReport;
import com.mostafapackage.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
		TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
		transferMoneyTask.execute();

		GenerateReport generateReport = new GenerateReport();
		generateReport.execute();

    }
}
