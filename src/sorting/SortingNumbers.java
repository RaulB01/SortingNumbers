package sorting;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class SortingNumbers implements ActionListener{
		private JTextField [] textField = new JTextField[10];
		private JFrame frame;
		private JPanel panel;
		private JLabel label1;
		private JLabel output,output1,output2,output3,output4,output5,output6,output7,output8,output9;
		private JButton button;
		public SortingNumbers(){
			frame = new JFrame("Sorting Numbers");
			
			panel = new JPanel();
			panel.setBackground(Color.GRAY);
			
			label1 = new JLabel();
			label1.setText("Enter 10 numbers");
			label1.setForeground(Color.WHITE);
			
			output = new JLabel();
			output.setText("------");
			output.setForeground(Color.WHITE);
			output1 = new JLabel();
			output1.setText("------");
			output1.setForeground(Color.WHITE);
			output2 = new JLabel();
			output2.setText("------");
			output2.setForeground(Color.WHITE);
			output3= new JLabel();
			output3.setText("------");
			output3.setForeground(Color.WHITE);
			output4= new JLabel();
			output4.setText("------");
			output4.setForeground(Color.WHITE);
			output5 = new JLabel();
			output5.setText("------");
			output5.setForeground(Color.WHITE);
			output6 = new JLabel();
			output6.setText("------");
			output6.setForeground(Color.WHITE);
			output7 = new JLabel();
			output7.setText("------");
			output7.setForeground(Color.WHITE);
			output8 = new JLabel();
			output8.setText("------");
			output8.setForeground(Color.WHITE);
			output9 = new JLabel();
			output9.setText("------");
			output9.setForeground(Color.WHITE);
			
			textField[0] = new JTextField(3);
			textField[1] = new JTextField(3);
			textField[2] = new JTextField(3);
			textField[3] = new JTextField(3);
			textField[4] = new JTextField(3);
			textField[5] = new JTextField(3);
			textField[6] = new JTextField(3);
			textField[7] = new JTextField(3);
			textField[8] = new JTextField(3);
			textField[9] = new JTextField(3);
			button = new JButton("Sort the numbers");
			button.addActionListener(this);
			
			panel.setLayout(new FlowLayout());
			
			frame.setVisible(true);
			frame.setSize(550,300);
			frame.add(panel);	
			panel.add(label1);
			panel.add(textField[0]);
			panel.add(textField[1]);
			panel.add(textField[2]);
			panel.add(textField[3]);
			panel.add(textField[4]);
			panel.add(textField[5]);
			panel.add(textField[6]);
			panel.add(textField[7]);
			panel.add(textField[8]);
			panel.add(textField[9]);
			panel.add(button);
			panel.add(output);
			panel.add(output1);	
			panel.add(output2);	
			panel.add(output3);	
			panel.add(output4);	
			panel.add(output5);	
			panel.add(output6);	
			panel.add(output7);	
			panel.add(output8);	
			panel.add(output9);	
			
			
		}
		
		public static int[] sortedList(int[] unsortedList){
			for(int i=0;i<unsortedList.length;i++)
				for(int j=0;j<unsortedList.length; j++)
					if(unsortedList[i]<unsortedList[j])
						swap(unsortedList,i,j);
			return unsortedList;
			
		}
		private static void swap(int[] unsortedList,int i, int j){
			int temp = unsortedList[i];
			unsortedList[i] = unsortedList[j];
			unsortedList[j] = temp;
		}
		
			
		public  void actionPerformed(ActionEvent e){		
			int n1 = Integer.parseInt(textField[0].getText());
			int n2 = Integer.parseInt(textField[1].getText());
			int n3 = Integer.parseInt(textField[2].getText());
			int n4 = Integer.parseInt(textField[3].getText());
			int n5 = Integer.parseInt(textField[4].getText());
			int n6 = Integer.parseInt(textField[5].getText());
			int n7 = Integer.parseInt(textField[6].getText());
			int n8 = Integer.parseInt(textField[7].getText());
			int n9 = Integer.parseInt(textField[8].getText());
			int n10 = Integer.parseInt(textField[9].getText());
			int set [] = {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
			
				int[] unsortedList=set;
				int[] sortedList = sortedList(unsortedList);
				for(int i=0;i<sortedList.length; i++){
					output.setText(String.valueOf(sortedList[0]));
					output1.setText(String.valueOf(sortedList[1]));
					output2.setText(String.valueOf(sortedList[2]));
					output3.setText(String.valueOf(sortedList[3]));
					output4.setText(String.valueOf(sortedList[4]));
					output5.setText(String.valueOf(sortedList[5]));
					output6.setText(String.valueOf(sortedList[6]));
					output7.setText(String.valueOf(sortedList[7]));
					output8.setText(String.valueOf(sortedList[8]));
					output9.setText(String.valueOf(sortedList[9]));
					
				}

			
			
		}

	}

