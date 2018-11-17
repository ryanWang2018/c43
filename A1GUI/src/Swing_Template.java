import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing_Template extends JFrame {
    JTextArea output;
    JScrollPane scrollPane;
    JTextField display;

	
	public Swing_Template() {
        JMenuBar menuBar;
        JMenu menu, menu_Data, menu_Report;
        JMenuItem menuItem, menu_View, menu_Insert;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
        menuBar = new JMenuBar();
        //Container cp = getContentPane();
        Container cp = getContentPane();
        
        cp.setLayout(new FlowLayout());
        display = new JTextField("10", 10);
        display.setVisible(false);
        cp.add(display);
        
        
        JPanel contentPane = new View_Panel();
        contentPane.setVisible(false);
        cp.add(contentPane);
        
        
        JPanel book_view = new BookPanel();
        book_view.setVisible(false);
        cp.add(book_view);
        
        JPanel album_view = new AlbumPanel();
        album_view.setVisible(false);
        cp.add(album_view);
        
        
        JPanel movie_view = new MoviePanel();
        movie_view.setVisible(false);
        cp.add(movie_view);
    
        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
        
        menu_View = new JMenuItem("View");
        menu.add(menu_View);
        menu_View.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				contentPane.setVisible(true);
				cp.revalidate();
				cp.repaint();
			}
        });
        //a submenu
        menu.addSeparator();
        menu_Data = new JMenu("Data");
        

        
        
        menu_Insert = new JMenuItem("Insert");
        menu_Data.add(menu_Insert);
        menu.add(menu_Data);
        menu_Insert.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				book_view.setVisible(true);
				cp.revalidate();
				cp.repaint();
			}
        });
        
        
        
        
        menuItem = new JMenuItem("Update");
        menu_Data.add(menuItem);
        menu.add(menu_Data);
        menuItem.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				album_view.setVisible(true);
				cp.revalidate();
				cp.repaint();
			}
        });
        
        
        
        
        menuItem = new JMenuItem("Remove");
        menu_Data.add(menuItem);
        menu.add(menu_Data);
        menuItem.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				movie_view.setVisible(true);
				cp.revalidate();
				cp.repaint();
			}
        });

        
        
        
        //a submenu
        menu.addSeparator();
        menu_Report = new JMenu("Report");
        menu_Report.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("Row1");
        menu_Report.add(menuItem);
        menu.add(menu_Report);

        menuItem = new JMenuItem("Row2");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row3");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row4");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row5");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row6");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row7");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row8");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row9");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        menuItem = new JMenuItem("Row10");
        menu_Report.add(menuItem);
        menu.add(menu_Report);
        
        setJMenuBar(menuBar);
        


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setTitle("Swing template");
		setSize(1200, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Swing_Template();
			
			}
		});
		
		
		
		
	}
	
}
