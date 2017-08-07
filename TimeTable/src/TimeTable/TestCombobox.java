package TimeTable;

import java.awt.*;
//import java.awt.GridLayout;

import javax.swing.*;
//import javax.swing.JPanel;

public class TestCombobox extends JFrame {
	public static void main(String args[]) {
		TestCombobox test = new TestCombobox();
	}
	
public TestCombobox(){
	//在Java中，通常将组件放在一定的容器内使用this.getContentPane()方法返回此窗体的ContainerPane对象
	Container contentPane=this.getContentPane();
	JPanel jPanel1 = new JPanel(new GridLayout(1,2));
	String[] fruit = {"Apple","Banana","Orange","Pearl","Mango"};
	
	JComboBox jComboBox1 = new JComboBox(fruit);
	jComboBox1.addItem("Others");
	
	jComboBox1.setBorder(BorderFactory.createTitledBorder("Your favourite fruit: "));
	jPanel1.add(jComboBox1);
	
	//利用ComboBoxModel建立JComboBox
	ComboBoxModel myModel = new MyModel();
	JComboBox jComboBox2 = new JComboBox(myModel);
	
	//设置jList1对象的带标题边框
	jComboBox2.setBorder(BorderFactory.createTitledBorder("Your hatest fruit: "));
	
	//添加列表框jComboBox2至面板
	jPanel1.add(jComboBox2);
	
	//添加面板至父容器
	contentPane.add(jPanel1);
	
	//设置本窗体的标题
	this.setTitle("JComboBoxDemo");
	this.setSize(350,120);
	this.setLocation(300, 200);
	this.setVisible(true);	
}

class MyModel extends DefaultComboBoxModel{
	String[] fruit = {"Apple","Banana","Orange","Pearl","Mango"};
	
	MyModel(){
	for(int i = 0; i<fruit.length;i++){
		this.addElement(fruit[i]);
		
	}
	}
}


}
