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
import com.sun.security.jgss.AuthorizationDataEntry;
import org.w3c.dom.html.HTMLIsIndexElement;

public class Main {

    public static void main(String[] args) {
        //authenticator -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("mostfafa", "123"));
    }
}
