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
		
		
		comboBox1.addItem("");

		comboBox1.addItem("c333");
		comboBox1.addItem("c444");
		comboBox1.addItem("c555");
		pipeee:
		comboBox2.addItem("");
		comboBox2.addItem("Feu");
		comboBox2.addItem("Gaz");
		comboBox2.addItem("Radiation");
		
		comboBox3.addItem("");
		comboBox3.addItem("5");
		comboBox3.addItem("2");
		comboBox3.addItem("3");
		
		comboBox4.setVisible(false);
		comboBox2.addActionListener(new ActionListener() {
		    
		    public void actionPerformed(ActionEvent e) {
			
			rellenar((String) comboBox2.getSelectedItem());
			
		    }
		});
		button1.addActionListener(new ActionListener() {
		    
		    public void actionPerformed(ActionEvent e) {
			generateEvent();
			
			
		    }
		});

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
			    .add(38, 38, 38)
			    .add(contentPaneLayout.createParallelGroup()
				.add(label2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				.add(label4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				.add(label3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
			    .add(43, 43, 43)
			    .add(contentPaneLayout.createParallelGroup()
				.add(label1)
				.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
				    .add(contentPaneLayout.createSequentialGroup()
					.add(button1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(206, Short.MAX_VALUE))
				    .add(contentPaneLayout.createSequentialGroup()
					.add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
					    .add(GroupLayout.LEADING, comboBox1, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					    .add(GroupLayout.LEADING, comboBox2, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					    .add(GroupLayout.LEADING, comboBox3, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
					.add(27, 27, 27)
					.add(comboBox4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.add(253, 253, 253)))))
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
				    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
					.add(label3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.add(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				    .addPreferredGap(LayoutStyle.UNRELATED)
				    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
					.add(label4)
					.add(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.add(contentPaneLayout.createSequentialGroup()
				    .add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addPreferredGap(LayoutStyle.UNRELATED)
				    .add(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
			    .addPreferredGap(LayoutStyle.RELATED, 17, Short.MAX_VALUE)
			    .add(button1)
			    .add(34, 34, 34))
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
	public void rellenar (String seleccionEnCombo2){
	    // Se borran los valores previos
	    comboBox4.removeAllItems();
	    

	    // Se rellena según la opción en combo1
	    if (seleccionEnCombo2.equals("Gaz")) {
	       comboBox4.addItem("--type--");
	       comboBox4.addItem("Hydrogene");
	       comboBox4.addItem("Helium");
	       comboBox4.addItem("CO2");
	       comboBox4.setVisible(true);
	    } 
	    if (seleccionEnCombo2.equals("Radiation")) {
		comboBox4.addItem("--niveau--");
	       for(Integer i= 1;i<101;i++){
		   comboBox4.addItem(i.toString());
		   
	       }
	       comboBox4.setVisible(true);
	 }
	    if  (seleccionEnCombo2.equals("Feu"))
		comboBox4.setVisible(false);
	    }
	
	public void generateEvent(){
	    String localisation;
	    String typeAlarme=null;
	    String typeAlarmes=null;
	    String niveau;
	    
	    localisation=comboBox1.getSelectedItem().toString();
	    typeAlarme=comboBox2.getSelectedItem().toString();
	    niveau=comboBox3.getSelectedItem().toString();
	    int nv = Integer.parseInt(niveau);
	    
	    
	    if(localisation==""){
		throw new IllegalArgumentException("Il faut mettre une localisation!");
		
	    }
	    if(typeAlarme==""){
		throw new IllegalArgumentException("Il faut mettre une type d'alarme!");
		
	    }
	    if(typeAlarmes=="--type--"){
		throw new IllegalArgumentException("Il faut mettre le type d'alarme de gaz!");
		
	    }
	    if(typeAlarmes=="--niveau--"){
		throw new IllegalArgumentException("Il faut mettre le niveau de radiation!");
		
	    }
	SourceAlarm sa= new SourceAlarm(localisation);
	MoniteurA monA= new MoniteurA();
	MoniteurB monB= new MoniteurB();
	sa.addAlarmFeuListener(monA);
	sa.addAlarmGazListener(monA);
	sa.addAlarmGazListener(monB);
	sa.addAlarmRadiationListener(monB);
	
	if(typeAlarme=="Gaz"){
	    typeAlarmes=comboBox4.getSelectedItem().toString().toUpperCase();
	    sa.generateAlarmGazEvent(nv,TypeAlarmGaz.valueOf(typeAlarmes));
	}
	if(typeAlarme=="Feu"){
	    sa.generateAlarmFeuEvent(nv);
	}
	if(typeAlarme=="Radiation"){
	    typeAlarmes=comboBox4.getSelectedItem().toString();
	    int nvr = Integer.parseInt(typeAlarmes);
	    sa.generateAlarmRadiationEvent(nv,nvr);

	}
	}
	
	    
	
	}






