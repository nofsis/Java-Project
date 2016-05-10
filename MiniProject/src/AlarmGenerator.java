import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Tue May 10 17:26:34 CEST 2016
 */

import project.MoniteurA;
import project.MoniteurB;
import project.SourceAlarm;
import project.TypeAlarmGaz;



/**
 * @author Abderrahman Uahid
 */
public class AlarmGenerator extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlarmGenerator() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Abderrahman Uahid
		label1 = new JLabel();
		label2 = new JLabel();
		comboBox1 = new JComboBox();
		label3 = new JLabel();
		comboBox2 = new JComboBox();
		label4 = new JLabel();
		comboBox3 = new JComboBox();
		button1 = new JButton();
		comboBox4 = new JComboBox();
		comboBox4.setVisible(false);
		
		comboBox1.addItem("c139");
		comboBox1.addItem("c127");
		comboBox1.addItem("c130");
		comboBox1.addItem("c119");
		
		comboBox2.addItem("Feu");
		comboBox2.addItem("Gaz");
		comboBox2.addItem("Radiation");
		
		comboBox2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		
		comboBox3.addItem("1");
		comboBox3.addItem("2");
		comboBox3.addItem("3");
		
		
		
		//======== this ========
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Alarme G\u00e9nerateur");

		//---- label2 ----
		label2.setText("B\u00e2timent    :");

		//---- label3 ----
		label3.setText("Type          :");

		//---- label4 ----
		label4.setText("Niveau d'importance :");

		//---- button1 ----
		button1.setText("Generer Alarme");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.add(contentPaneLayout.createParallelGroup()
						.add(contentPaneLayout.createSequentialGroup()
							.add(208, 208, 208)
							.add(label1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.add(contentPaneLayout.createSequentialGroup()
							.add(38, 38, 38)
							.add(contentPaneLayout.createParallelGroup()
								.add(label3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.add(label2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.add(label4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.add(43, 43, 43)
							.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
								.add(GroupLayout.LEADING, comboBox2, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.add(GroupLayout.LEADING, comboBox1, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.add(comboBox3, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
							.add(27, 27, 27)
							.add(comboBox4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(76, Short.MAX_VALUE))
				.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
					.add(0, 206, Short.MAX_VALUE)
					.add(button1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.add(186, 186, 186))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
					.add(28, 28, 28)
					.add(label1)
					.add(47, 47, 47)
					.add(contentPaneLayout.createParallelGroup()
						.add(contentPaneLayout.createSequentialGroup()
							.add(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.RELATED)
							.add(label3)
							.add(18, 18, 18)
							.add(label4))
						.add(contentPaneLayout.createSequentialGroup()
							.add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.UNRELATED)
							.add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
								.add(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.add(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.UNRELATED)
							.add(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.add(13, 13, 13)
					.add(button1)
					.addContainerGap(142, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Abderrahman Uahid
	private JLabel label1;
	private JLabel label2;
	private JComboBox comboBox1;
	private JLabel label3;
	private JComboBox comboBox2;
	private JLabel label4;
	private JComboBox comboBox3;
	private JButton button1;
	private JComboBox comboBox4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	public static void main(String[] args) {
		
		AlarmGenerator a = new AlarmGenerator();
		a.setVisible(true);

	    
	}





}
