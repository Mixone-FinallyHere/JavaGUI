package mixone.gui.tutorial;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class Accumulator extends Frame implements ActionListener {
   private Label lblInput;     // Declare input Label
   private Label lblOutput;    // Declare output Label
   private TextField tfInput;  // Declare input TextField
   private TextField tfOutput; // Declare output TextField
   private Button btnReset;    // Declare a Button component
   private int sum = 0;        // Accumulated sum, initialised to 0
 
   // Constructor to setup the GUI components and event handlers
   public Accumulator() {
      setLayout(new FlowLayout());
      // FlowLayout: arranges the components from left-to-right, 
      // and flow to next row from top-to-bottom.
 
      lblInput = new Label("Enter an Integer: "); // Construct Label
      add(lblInput);               // Frame adds Label
 
      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // Frame adds TextField
      
 
      tfInput.addActionListener(this);
	 // tfInput is the source object that fires ActionEvent when entered.
	 // The source add "this" instance as an ActionEvent listener, which provides
	 //  an ActionEvent handler called actionPerformed().
	 // Hitting enter on tfInput invokes actionPerformed().
 
      lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
      add(lblOutput);               // Frame adds Label
 
      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // Frame adds TextField
      
      btnReset = new Button("Reset");   // construct the Button component
      add(btnReset);                    // Frame adds Button
      btnReset.addActionListener(new BtnResetListener());
      
      // Add an Window Listener so that we can actually close the window.
      addWindowListener( new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent we) {
              System.exit(0);
          }
      } );
 
      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an anonymous instance
      new Accumulator();
   }
 
   // ActionEvent handler - Called back upon hitting enter key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + ""); // Display sum on the output TextField
                                  // convert int to String
   }
   
   private class BtnResetListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
         sum = 0;
         tfOutput.setText(sum + "");
      }
   }
}