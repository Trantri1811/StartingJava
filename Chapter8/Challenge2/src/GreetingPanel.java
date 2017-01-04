/**
 * Author: Andrew Laing
 * Email:  parisianconnections@gmail.com
 * Date:   09/11/2016.
 */

import javax.swing.*;
import java.awt.*;

/**
 * The GreetingPanel class creates a panel with a greeting
 * banner inside of it
 */
public class GreetingPanel extends JPanel
{
    private JLabel greeting;   // to display a greeting

    // Constructor
    public GreetingPanel()
    {
        // Create the label
        greeting = new JLabel("Payroll Application");
        greeting.setFont(new Font("Sans", Font.PLAIN, 20));
        greeting.setHorizontalAlignment(SwingConstants.CENTER);
        // add the label to this panel
        add(greeting);
    }
}