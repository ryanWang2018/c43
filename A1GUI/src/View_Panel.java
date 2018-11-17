import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class View_Panel extends JPanel implements ActionListener {
	
    private String newline = "\n";
    protected static final String textFieldString = "JTextField";
    protected static final String passwordFieldString = "JPasswordField";
    protected static final String ftfString = "JFormattedTextField";
    protected static final String buttonString = "JButton";
    protected JLabel actionLabel;
    
    JCheckBoxMenuItem cbMenuItem;
    
    
    public View_Panel() {
    	setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    	
    	JRadioButton Book = new JRadioButton("BOOK");
    	Book.setMnemonic(KeyEvent.VK_B);
    	Book.setActionCommand("BOOK");
    	Book.setSelected(false);
    	add(Book);
	
    	JRadioButton Music = new JRadioButton("MUSIC");
    	Book.setMnemonic(KeyEvent.VK_B);
    	Book.setActionCommand("MUSIC");
    	Book.setSelected(false);
    	add(Music);
    	
    	JRadioButton Movie = new JRadioButton("MOVIE");
    	Book.setMnemonic(KeyEvent.VK_B);
    	Book.setActionCommand("MOVIE");
    	Book.setSelected(false);
    	add(Movie);
    	
    	add(new JLabel("Name:"));
        JTextField name_field = new JTextField(10);
        name_field.setActionCommand("name");
        name_field.addActionListener(this);
        add(name_field);
        
        add(new JLabel("Year:"));
        JTextField year_field = new JTextField(10);
        year_field.setActionCommand("year");
        year_field.addActionListener(this);
        add(year_field);
        
        JButton b1 = new JButton("submit");
        add(b1);
        JButton b2 = new JButton("cancel");
        add(b2);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TextSamplerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new View_Panel());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 //Turn off metal's use of bold fonts
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		createAndShowGUI();
            }
        });
    }
    */
    
}
