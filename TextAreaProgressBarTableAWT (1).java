import java.awt.*;
import java.awt.event.*;

public class TextAreaProgressBarTableAWT extends Frame {
    private TextArea textArea;
    private Scrollbar progressBar;
    private List table;
    private final int maxTextLength = 100;

    public TextAreaProgressBarTableAWT() {
        // Frame setup
        setTitle("Text Area with Progress Bar and Table (AWT)");
        setSize(600, 400);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        
        // Text Area
        textArea = new TextArea("", 5, 40, TextArea.SCROLLBARS_VERTICAL_ONLY);
        add(textArea);
        
        // Progress Bar (Scrollbar as progress bar)
        progressBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, maxTextLength + 1);
        progressBar.setEnabled(false); // Make it act as a progress bar
        progressBar.setPreferredSize(new Dimension(400, 20));
        add(progressBar);
        
        // Submit Button
        Button submitButton = new Button("Add to Table");
        add(submitButton);
        
        // Table (List as table rows)
        table = new List(10, false);
        add(table);

        // Add Listeners
        textArea.addTextListener(e -> {
            // Update progress bar
            int length = textArea.getText().length();
            progressBar.setValue(Math.min(length, maxTextLength));
        });

        submitButton.addActionListener(e -> {
            String text = textArea.getText().trim();
            if (!text.isEmpty()) {
                table.add(text);
                textArea.setText("");
                progressBar.setValue(0);
            } else {
                showMessageDialog("Please enter some text.");
            }
        });

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Method to show a dialog for alerts
    private void showMessageDialog(String message) {
        Dialog dialog = new Dialog(this, "Alert", true);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(300, 100);
        Label label = new Label(message);
        dialog.add(label);
        Button okButton = new Button("OK");
        dialog.add(okButton);
        okButton.addActionListener(e -> dialog.setVisible(false));
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        TextAreaProgressBarTableAWT app = new TextAreaProgressBarTableAWT();
        app.setVisible(true);
    }
}
