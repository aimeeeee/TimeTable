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
	//��Java�У�ͨ�����������һ����������ʹ��this.getContentPane()�������ش˴����ContainerPane����
	Container contentPane=this.getContentPane();
	JPanel jPanel1 = new JPanel(new GridLayout(1,2));
	String[] fruit = {"Apple","Banana","Orange","Pearl","Mango"};
	
	JComboBox jComboBox1 = new JComboBox(fruit);
	jComboBox1.addItem("Others");
	
	jComboBox1.setBorder(BorderFactory.createTitledBorder("Your favourite fruit: "));
	jPanel1.add(jComboBox1);
	
	//����ComboBoxModel����JComboBox
	ComboBoxModel myModel = new MyModel();
	JComboBox jComboBox2 = new JComboBox(myModel);
	
	//����jList1����Ĵ�����߿�
	jComboBox2.setBorder(BorderFactory.createTitledBorder("Your hatest fruit: "));
	
	//����б��jComboBox2�����
	jPanel1.add(jComboBox2);
	
	//��������������
	contentPane.add(jPanel1);
	
	//���ñ�����ı���
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
