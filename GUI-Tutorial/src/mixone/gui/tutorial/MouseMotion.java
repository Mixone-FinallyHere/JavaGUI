package mixone.gui.tutorial;

import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class MouseMotion extends Frame
      implements MouseListener, MouseMotionListener {
      // This class acts as MouseListener and MouseMotionListener
 
   // To display the (x, y) of the mouse-clicked
   private TextField tfMouseClickX;
   private TextField tfMouseClickY;
   // To display the (x, y) of the current mouse-pointer position
   private TextField tfMousePositionX;
   private TextField tfMousePositionY;
 
   // Constructor to setup the GUI components and event handlers
   public MouseMotion() {
      setLayout(new FlowLayout()); // "super" frame sets to FlowLayout
 
      add(new Label("X-Click: "));
      tfMouseClickX = new TextField(10);
      tfMouseClickX.setEditable(false);
      add(tfMouseClickX);
      add(new Label("Y-Click: "));
      tfMouseClickY = new TextField(10);
      tfMouseClickY.setEditable(false);
      add(tfMouseClickY);
 
      add(new Label("X-Position: "));
      tfMousePositionX = new TextField(10);
      tfMousePositionX.setEditable(false);
      add(tfMousePositionX);
      add(new Label("Y-Position: "));
      tfMousePositionY = new TextField(10);
      tfMousePositionY.setEditable(false);
      add(tfMousePositionY);
 
      addMouseListener(this);
      addMouseMotionListener(this);
      addWindowListener( new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent we) {
              System.exit(0);
          }
      });
        // "super" frame (source) fires MouseEvent.
        // "super" frame adds "this" object as MouseListener and MouseMotionListener.
 
      setTitle("MouseMotion Demo"); // "super" Frame sets title
      setSize(400, 120);            // "super" Frame sets initial size
      setVisible(true);             // "super" Frame shows
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new MouseMotion();  // Let the constructor do the job
   }
 
   /** MouseListener handlers */
   // Called back when a mouse-button has been clicked
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseClickX.setText(evt.getX() + "");
      tfMouseClickY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
 
   /** MouseMotionEvent handlers */
   // Called back when the mouse-pointer has been moved
   @Override
   public void mouseMoved(MouseEvent evt) {
      tfMousePositionX.setText(evt.getX() + "");
      tfMousePositionY.setText(evt.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void mouseDragged(MouseEvent evt) { }
}