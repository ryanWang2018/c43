import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;


public class AlbumPanel extends JPanel implements ActionListener {
	JTable album;
	public AlbumPanel() {
		//f= new JFrame();
		//f.setTitle("JTable Example"); 
        String[][] data = {{"","","","","","","","", ""}}; 
      
            // Column Names 
           
		String[] column = {"Disk Name", "Published Year", "Tracks_name", "Language",
				 			"Singer", "Composer", "Producer","Arrangement", "Song Writer"};
		album = new JTable(data, column);
        // adding it to JScrollPane 
        JScrollPane album_scrol = new JScrollPane(album); 
        album_scrol.setPreferredSize(new Dimension(900,900));
        add(album_scrol);
        
        JButton A1 = new JButton("submit");
        add(A1);
        JButton A2 = new JButton("cancel");
        add(A2);
        A2.addActionListener(new ActionListener() {
        	
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