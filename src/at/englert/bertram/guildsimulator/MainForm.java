package at.englert.bertram.guildsimulator;

import at.englert.bertram.guildsimulator.view.screen.MainTestDialog;

public class MainForm {
    public static void main(String[] args) {
        MainTestDialog dialog = new MainTestDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
