package mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Creates the rules button and adds it to the screen.
 */
public class RulesButton extends MenuDecorator {

    private static final String RULES = "ISTRUZIONI:\n"
                                        + "\nciao";

    /**
     * 
     * @param simpleMenu
     */
    public RulesButton(final Menu simpleMenu) {
        super(simpleMenu);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(final JFrame container, final JPanel buttonPanel) {
        final JButton rulesButton = new JButton("Rules");
        rulesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, RULES);
            }

        });
        buttonPanel.add(rulesButton);
        super.display(container, buttonPanel);
    }

}
