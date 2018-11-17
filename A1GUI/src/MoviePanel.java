import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;


public class MoviePanel extends JPanel implements ActionListener {
	JTable album;
	public MoviePanel() {
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		//f= new JFrame();
		//f.setTitle("JTable Example"); 
        String[][] movie_data = {{"","","","","","","","", "", ""}}; 
      
            // Column Names 
           
		String[] movie = {"Movie Name", "Directors", "Script Writers", "Cast",
							"Producers", "Composers", "Editors", "Costume Designers",
							"Release Year", "well-Know Price"};
		album = new JTable(movie_data, movie);
        // adding it to JScrollPane 
        JScrollPane movie_scrol = new JScrollPane(album); 
        movie_scrol.setPreferredSize(new Dimension(1000,300));
        add(movie_scrol);
        
        
        JButton M1 = new JButton("submit");
        add(M1);
        JButton M2 = new JButton("cancel");
        add(M2);
        M2.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				revalidate();
				repaint();
			}
        });
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}