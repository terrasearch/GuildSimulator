package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.viewmodel.IPropertyChangedListener;
import at.englert.bertram.guildsimulator.viewmodel.PlayerViewModel;

import javax.swing.*;

public class MainTestDialog extends JDialog implements IPropertyChangedListener {
    private final PlayerViewModel viewModel = new PlayerViewModel();
    private JPanel contentPane;
    private JTextPane goldBox;

    public MainTestDialog() {
        setContentPane(contentPane);
        setModal(true);
        viewModel.registerPropertyChangedListener(this);
    }

    @Override
    public void onPropertyChanged() {
        goldBox.setText(String.valueOf(viewModel.getGold()));
    }
}
