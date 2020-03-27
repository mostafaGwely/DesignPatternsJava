package com.mostafapackage.mediator;

public class ArticlesDialogBox extends DialogBox {
    private ListBox listBox = new ListBox(this);
    private Button button = new Button(this);
    private TextBox textBox = new TextBox(this);
    @Override
    public void changed(UIControl control) {
        if(control == listBox)
            articleSelected();
        else if (control == textBox)
            titleChanged();
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
