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
<<<<<<< HEAD
	String selectCourse;
     ArrayList<String> list = new ArrayList();
     ArrayList<String> listC = new ArrayList();
    
    // String[] cString  = { "please select level"};
     JComboBox cBoxCourse = new JComboBox();
 	 
     JComboBox cBoxStream = new JComboBox();
 	
	public void course() {
		cBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				SelectStream SS = new SelectStream();
			    selectCourse = (String) cBoxCourse.getSelectedItem();
			    listC.clear();
			    listC.addAll(SS.matchLevel(selectCourse));
			   // System.out.print(list);
			   
			    cBoxStream.removeAllItems();
			    
			    for (String s: listC) {
			    	
			  //  String s = String.valueOf(list);
			    cBoxStream.addItem(s);
			   
			     }
				 }	
			
			
		});


		cBoxCourse.setToolTipText("123");
		cBoxCourse.setBounds(236, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
    
	}
	
	public void stream() {
		
		cBoxStream.setBounds(393, 7, 91, 24);
		frame.getContentPane().add(cBoxStream);
=======
     ArrayList list = new ArrayList();
    
    String[] cString  = { "please select level"};
     JComboBox cBoxCourse = new JComboBox(cString);
 	 
 	
	public void course() {
		cBoxCourse.setToolTipText("123");
		cBoxCourse.setBounds(236, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
    
>>>>>>> refs/remotes/origin/master
	}
	
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
<<<<<<< HEAD
		stream();
=======
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
			   // System.out.print(list);
			    int l = list.size();
			    cBoxCourse.removeAllItems();
			    
			    for (String s: list) {
			    	
			  //  String s = String.valueOf(list);
			    cBoxCourse.addItem(s);
			   
			     }
=======
			    course();
			    cBoxCourse.removeAllItems();
			    cBoxCourse.addItem(list);
			    System.out.println(list);
>>>>>>> refs/remotes/origin/master
				 }
			}
		});
	

		
		cBoxLevel.setBounds(59, 7, 94, 24);
		frame.getContentPane().add(cBoxLevel);
		
		
<<<<<<< HEAD
		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(346, 12, 60, 15);
		frame.getContentPane().add(lblStream);
		
		
=======
	//JComboBox cBoxCourse = new JComboBox();
		/*cBoxCourse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				cBoxCourse.addItem(list);
				//System.out.print(list);
			}
			
		});*/
	/*	cBoxCourse.setToolTipText("");
		cBoxCourse.setBounds(236, 7, 94, 24);
		frame.getContentPane().add(cBoxCourse);
		cBoxCourse.addItem("please select level");*/
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(346, 12, 60, 15);
		frame.getContentPane().add(lblStream);
		
		JComboBox cBoxStream = new JComboBox();
		cBoxStream.setBounds(393, 7, 91, 24);
		frame.getContentPane().add(cBoxStream);
>>>>>>> refs/remotes/origin/master
	}
}
