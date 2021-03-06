package TimeTable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;

import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Tinterface {

	private JFrame frame;
	String selectLevel;

	String selectCourse;
     ArrayList<String> list = new ArrayList();
     ArrayList<String> listC = new ArrayList();
    
  
     JComboBox cBoxCourse = new JComboBox();
 	 
     JComboBox cBoxStream = new JComboBox();
 	
	public void course() {
		cBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
				SelectStream SS = new SelectStream();
			    selectCourse = (String) cBoxCourse.getSelectedItem();
			    listC.clear();
			    listC.addAll(SS.matchLevel(selectCourse));
			 
			    cBoxStream.removeAllItems();
			    
			    for (String s: listC) {
			   System.out.println(s);
			 
			    cBoxStream.addItem(s);
			   
			     }
				 }	}
			
			
		});


		cBoxCourse.setToolTipText("123");
		cBoxCourse.setBounds(236, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
    
	}
	
	public void stream() {
		//cBoxCourse.setToolTipText("123");
		cBoxStream.setBounds(393, 7, 91, 24);
		frame.getContentPane().add(cBoxStream);}

    
 

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tinterface window = new Tinterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public Tinterface() {
		
		initialize();
		course();

		stream();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel levelLable = new JLabel("Level");
		levelLable.setBounds(12, 12, 60, 15);
		levelLable.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(levelLable);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(182, 12, 60, 15);
		frame.getContentPane().add(lblCourse);
		
		
		String[] levelNum = {"5", "6", "7"};
		JComboBox cBoxLevel = new JComboBox(levelNum);
		cBoxLevel.addItemListener(new ItemListener() {
		 
			public void itemStateChanged(ItemEvent e) {
				 if(e.getStateChange() == ItemEvent.SELECTED) {
			 
				SelectCourse SC = new SelectCourse();
			    selectLevel = (String) cBoxLevel.getSelectedItem();
			    list.clear();
			    list.addAll(SC.matchLevel(selectLevel));

			
			    cBoxCourse.removeAllItems();
			    
			    for (String s: list) {
			    	
			  //  String s = String.valueOf(list);
			    cBoxCourse.addItem(s);
			   
			     }

			 
				 }
			}
		});
	

		
		cBoxLevel.setBounds(59, 7, 94, 24);
		frame.getContentPane().add(cBoxLevel);
		
		

		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(346, 12, 60, 15);
		frame.getContentPane().add(lblStream);
		


	}
}
