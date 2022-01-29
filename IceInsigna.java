import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.Timer;   // Timer object
import javax.swing.JLabel;
import java.util.ArrayList;

public class IceInsigna implements KeyListener, MouseListener
{
    // number of rows and columns in grid
    private final int FRAME_WIDTH=640;
    private final int FRAME_HEIGHT=480;
    public static final int ROWS=15;
    public static final int COLS=20;
    //key constants
    final int UP = 38;
    final int DOWN = 40;
    final int LEFT = 37;
    final int RIGHT = 39;
    private final int STOP = -1;
    final int SLOW = 1000;
    final int MED = 500;
    final int FAST = 100;
    
    JFrame frame = new JFrame();
    JButton[][] button = new JButton[ROWS][COLS];
    JPanel panel = new JPanel();
    private JLabel[] status = new JLabel[COLS];
    //images
    ImageIcon red = new ImageIcon("red.jpg");
    public ImageIcon lord = new ImageIcon("Lord.png");
    public ArrayList<Character> Char = new ArrayList<Character>();
    GridLayout grid;
    public ArrayList<Character> playable = new ArrayList<Character>();
    
    
    IceInsigna()
    {
      grid = new GridLayout( ROWS,COLS );
      frame.setLayout( grid );
      playable.add(new Character(1,22,7,6,3,8,false,lord,11,3)); 
      //Create JButtons initialize to red, activate listeners, 
      for (int r=0; r < button.length; r++)
      {
          for(int c=0; c < button[r].length; c++)
          {
            button[r][c] = new JButton();
            button[r][c].addKeyListener(this);
            button[r][c].setBorderPainted(true);
            frame.add(button[r][c]);
          }
      }
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      for(Character p:playable)
      {
          int ROW = p.getRow();
          int COL = p.getCol();
          
          button[ROW][COL].setIcon(p.getPic());
          
          
      }
      frame.setVisible(true);
    }
    public void keyPressed(KeyEvent ke)
    {
        
    }
    public void keyReleased(KeyEvent ke)
    {
    }
    
    //must be overriden for KeyListener interface
    public void keyTyped(KeyEvent ke)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
        for(int r=0; r < button.length;r++)
        {
            for(int c=0; c< button[r].length;c++)
            {
                if(button[r][c] == e.getSource())
                {
                    if(button[r][c].getIcon() == lord)
                    {
                        
                    }
                }
            }
        }
    }
    // must be overriden for MouseListener interface
    public void mouseEntered(MouseEvent e)
    {
    }
    // must be overriden for MouseListener interface
    public void mouseExited(MouseEvent e)
    {
    }
    //set icon to different color if JButton is clicked
    public void mousePressed(MouseEvent e)
    {
        for (int r=0; r < button.length; r++)
       {
          for(int c=0; c < button[r].length; c++)
          {
              //check which JButton is pressed and switch color
              if(e.getSource().equals(button[r][c]))
              {
                  if(button[r][c].getIcon() == lord)
                  {
                      
                  }
                  
              }
          }
       }
    }
    // must be overriden for MouseListener interface
    public void mouseReleased(MouseEvent e)
    {
    }
}
