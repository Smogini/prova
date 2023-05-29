package mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates the exit button and adds it to the screen.
 */
public class ExitButton extends MenuDecorator {

    /**
     * 
     * @param simpleMenu
     */
    public ExitButton(final Menu simpleMenu) {
        super(simpleMenu);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(final JFrame container, final JPanel buttonPanel) {
        final JButton exit = new JButton("Exit");
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent arg0) {
                container.dispose();
            }

        });
        buttonPanel.add(exit);
        super.display(container, buttonPanel);
    }

    /**
     * 
     * @param args
     */
    public static void main(final String[] args) {
        final Menu simpleMenu = new SimpleMenu();
        final Menu menu = new PlayButton(new RulesButton(new ExitButton(simpleMenu)));

        final JFrame container = new JFrame();
        final JPanel panel = new JPanel();

        menu.display(container, panel);
    }
}
