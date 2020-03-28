package com.mostafapackage;

import com.mostafapackage.chainOfResponsibility.*;
import com.mostafapackage.chainOfResponsibility.Compressor;
import com.mostafapackage.command.*;
import com.mostafapackage.command.editor.*;
import com.mostafapackage.command.fx.Button;
import com.mostafapackage.iterator.BrowseHistory;
import com.mostafapackage.iterator.Iterator;
import com.mostafapackage.mediator.ArticlesDialogBox;
import com.mostafapackage.memento.Editor;
import com.mostafapackage.memento.Editor;
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
import com.mostafapackage.visitor.AnchorNode;
import com.mostafapackage.visitor.HeadingNode;
import com.mostafapackage.visitor.HighlightOperation;
import com.mostafapackage.visitor.HtmlDocument;
import com.sun.security.jgss.AuthorizationDataEntry;
import org.w3c.dom.html.HTMLIsIndexElement;

public class Main {

    public static void main(String[] args) {
      var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());
    }
}
