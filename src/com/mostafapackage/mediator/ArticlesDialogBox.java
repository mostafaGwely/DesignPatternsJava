package com.mostafapackage.mediator;

public class ArticlesDialogBox {
    private ListBox listBox = new ListBox( );
    private Button button = new Button( );
    private TextBox textBox = new TextBox( );

    public ArticlesDialogBox() {
        listBox.attach(this::articleSelected);
        textBox.attach(this::titleChanged);
    }

    public void simulateUserInteraction(){
        listBox.setSelection("Article 1");
        textBox.setContent("");
        System.out.println("Textbox: "+ textBox.getContent());
        System.out.println("Button: "+ button.isEnabled());
    }
    private void titleChanged(){
        var content = textBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }
    private void articleSelected(){
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
