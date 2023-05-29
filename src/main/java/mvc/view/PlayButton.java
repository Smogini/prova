package mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates the play button and adds it to the screen.
 */
public class PlayButton extends MenuDecorator {

    /**
     * 
     * @param simpleMenu
     */
    public PlayButton(final Menu simpleMenu) {
        super(simpleMenu);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(final JFrame container, final JPanel buttonPanel) {
        final JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO open the game screen
            }
            
        });
        buttonPanel.add(playButton);
        super.display(container, buttonPanel);
    }

}
