package at.englert.bertram.guildsimulator.view.screen;

import at.englert.bertram.guildsimulator.model.HeroGroup;
import at.englert.bertram.guildsimulator.model.character.Hero;
import at.englert.bertram.guildsimulator.viewmodel.IPropertyChangedListener;
import at.englert.bertram.guildsimulator.viewmodel.PlayerViewModel;

import javax.swing.*;

public class MainTestDialog extends JDialog implements IPropertyChangedListener {
    private final PlayerViewModel viewModel = new PlayerViewModel();
    private JPanel contentPane;
    private JTextPane gold;
    private JTextPane level;
    private JTextPane goldNeededForLevelUp;
    private JButton levelUpButton;
    private JButton area2Button;
    private JButton area3Button;
    private JButton area4Button;
    private JButton area5Button;
    private JTextField goldNeededToCreateGroup;
    private JPanel groupPanel;
    private JButton addGroupButton;
    private JTextPane goldGainTextPane;

    public MainTestDialog() {
        setContentPane(contentPane);
        setModal(true);
        viewModel.registerPropertyChangedListener(this);
        levelUpButton.addActionListener(e -> viewModel.upgradeLevel());
        addGroupButton.addActionListener(e -> viewModel.addGroup());
    }

    @Override
    public void onPropertyChanged() {
        gold.setText(String.valueOf(viewModel.getGold()));
        level.setText(String.valueOf(viewModel.getLevel()));
        goldNeededForLevelUp.setText(String.valueOf(viewModel.getGoldNeededForLevelUp()));
        levelUpButton.setEnabled(viewModel.canUpgradeLevel());
        goldNeededToCreateGroup.setText(String.valueOf(viewModel.getAddGroupCost()));
        addGroupButton.setEnabled(viewModel.canAddGroup());
        goldGainTextPane.setText(String.valueOf(viewModel.getGoldGain()));
    }

    @Override
    public void onPropertyChanged(String identifier) {
        if (identifier.equals(PlayerViewModel.groupSize)) {
            renderGroups();
        }
    }

    private void renderGroups() {
        groupPanel.removeAll();
        for (HeroGroup group : viewModel.getHeroGroups()) {
            final JPanel panel = new JPanel();
            groupPanel.add(panel);
            for (Hero hero : group.getHeroes()) {
                final JLabel label = new JLabel();
                label.setText(String.valueOf(hero.getStats().getRarity()));
                panel.add(label);
            }
        }
    }
}
