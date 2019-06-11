import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
class App
{
	public static native int calcBill(int [] params);
	
	static
	{
		System.loadLibrary("calc");
	}
		public static void main(String args[])
		{
			/*MarvellousLogin mf=new MarvellousLogin();
			mf.setVisible(true);*/
			Frame1 obj=new Frame1();
			
			
			

			obj.setVisible(true);
		}
}
class Frame1 extends JFrame {

	private JPanel contentPane;
	private Hashtable <String,Integer>processors;
	private Hashtable <String,Integer>RAM;
	private Hashtable<String,Integer>GraphicsCard;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Frame1() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Select RAM:");
		lblNewLabel.setBounds(77, 182, 110, 15);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Select Processor: ");
		lblNewLabel_1.setBounds(77, 273, 141, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSelectGraphicCard = new JLabel("Select Graphic Card:");
		lblSelectGraphicCard.setBounds(77, 367, 152, 15);
		contentPane.add(lblSelectGraphicCard);
		
		JLabel lblNewLabel_2 = new JLabel("My Shopping Portal!");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(0, 12, 800, 57);
		contentPane.add(lblNewLabel_2);


		processors=new Hashtable<String,Integer>();
		processors.put("i3", 10000);
		processors.put("i5", 15000);
		processors.put("i7", 20000);
		Set<String>processorKeys=processors.keySet();
		JComboBox comboBox1 = new JComboBox(processorKeys.toArray());
		comboBox1.setBounds(252, 177, 76, 24);
		contentPane.add(comboBox1);
		
		
		
		RAM=new Hashtable<String,Integer>();
		RAM.put("4gb", 10000);
		RAM.put("8gb", 15000);
		RAM.put("16gb", 20000);
		Set<String>ramKeys=RAM.keySet();
		JComboBox comboBox2 = new JComboBox(ramKeys.toArray());
		comboBox2.setBounds(252, 268, 76, 24);
		contentPane.add(comboBox2);
		
		
		
		GraphicsCard=new Hashtable<String,Integer>();
		GraphicsCard.put("1050", 10000);
		GraphicsCard.put("1070", 15000);
		GraphicsCard.put("1080", 20000);
		Set<String>graphicsKeys=GraphicsCard.keySet();
		JComboBox comboBox3 = new JComboBox(graphicsKeys.toArray());
		comboBox3.setBounds(252, 362, 76, 24);
		contentPane.add(comboBox3);
		
		JButton CalcBill = new JButton("Calculate Bill!");
		CalcBill.setBounds(77, 450, 117, 25);
		contentPane.add(CalcBill);
		
		JLabel ResultLabel = new JLabel("");
		ResultLabel.setBounds(252, 450, 88, 15);
		contentPane.add(ResultLabel);
		CalcBill.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						int processorprice=processors.get((String)comboBox1.getSelectedItem());
						int ramprice=RAM.get((String)comboBox2.getSelectedItem());
						int graphicscardprice=GraphicsCard.get((String)comboBox3.getSelectedItem());
						int params[]=new int[3];
						params[0]=processorprice;
						params[1]=ramprice;
						params[2]=graphicscardprice;
						int result=App.calcBill(params);
						ResultLabel.setText(""+result);
					}
				});
	}
}

