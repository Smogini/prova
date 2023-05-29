package mvc.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Box;

/**
 * MenuDecorator class models a simple menu without nothing but the screen, is used for decorate the menu with other objects.
 */
public class MenuDecorator extends SimpleMenu {

    private final Menu simpleMenu;

    /**
     * 
     * @param simpleMenu
     */
    public MenuDecorator(final Menu simpleMenu) {
        this.simpleMenu = simpleMenu;
    }

    /**
     * Creates a gap on Y axis.
     * @param panel
     * @param y
     */
    protected void createYGap(final JPanel panel, final int y) {
        panel.add(Box.createRigidArea(new Dimension(0, y)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(final JFrame container, final JPanel buttonPanel) {
        simpleMenu.display(container, buttonPanel);
    }

}
