import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.TableColumnModel;



public class BookPanel extends JPanel implements ActionListener {
	JTable j;
	public BookPanel() {
		//f= new JFrame();
		//f.setTitle("JTable Example"); 
		
		
        String[][] data = {{"01","liuZhe","Root","10","250","2018","panweibo","best seller"}}; 
      
            // Column Names 
           
		String[] column = {"ISBN", "Book Name", "Publisher Name",
				"Edition Number", "Number Pages", "Publication Year",
				"List KeyWords", "Book Description"};
		j = new JTable(data, column);
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        sp.setPreferredSize(new Dimension(900,900));
        add(sp);
        
        
        JButton B1 = new JButton("submit");
        add(B1);
        JButton B2 = new JButton("cancel");
        add(B2);
        B2.addActionListener(new ActionListener() {
        	
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
