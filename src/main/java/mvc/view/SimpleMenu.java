package mvc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * {@inheritDoc}.
 */
public class SimpleMenu implements Menu {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    /**
     * Creates a simple menu interface.
     * @param container
     * @param buttonPanel contains all the buttons added by PlayButton, RulesButton, ExitButton classes.
     */
    private void createSimpleMenu(final JFrame container, final JPanel buttonPanel) {
        final JLabel label = new JLabel("Polycut");
        final JPanel mainPanel = new JPanel();

        label.setHorizontalAlignment(SwingConstants.CENTER);

        buttonPanel.setLayout(new GridLayout(3, 1, 0, 10));
        buttonPanel.setBorder(new EmptyBorder(150, 150, 150, 150));

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(label, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        container.setIconImage(null);
        container.setTitle("Polycut");
        container.setSize(WIDTH, HEIGHT);
        container.add(mainPanel, BorderLayout.CENTER);
        container.setBackground(Color.DARK_GRAY);
        container.setLocationRelativeTo(null);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setResizable(false);
        container.pack();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(final JFrame container, final JPanel panel) {
        createSimpleMenu(container, panel);
        container.setVisible(true);
    }

}
