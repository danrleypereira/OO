import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * JOptionPane showInputDialog example #3.
 * Using a combo box in an input dialog (showInputDialog).
 * 
 * @author alvin alexander, http://alvinalexander.com
 */
public class ComboxBoxShowInputDialogExample
{
  public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Veggie" };

  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Input Dialog Example 3");
    frame.setDefaultCloseOperation(WindowsConstants.EXIT_ON_CLOSE);
    
    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
        "What is your favorite pizza?",
        "Favorite Pizza",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        pizzas, 
        pizzas[0]);

    // favoritePizza will be null if the user clicks Cancel
    System.out.println("Favorite pizza is ." + favoritePizza);
    System.exit(0);
  }

}