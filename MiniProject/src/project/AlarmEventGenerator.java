package project;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;








public class AlarmEventGenerator extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SourceAlarm sa1;
	public JTextField localisation= new JTextField();
	public JLabel titre= new JLabel();
	public JLabel batimentLabel= new JLabel();
	public JTextField batimentText= new JTextField();
	public JLabel label3= new JLabel();
	public JLabel label4= new JLabel();
	
	
	public AlarmEventGenerator(){
		Container contentPane = getContentPane();
		
		titre.setText("Generation Alarme");
		contentPane.add(titre, BorderLayout.NORTH);
		batimentLabel.setText("Batiment :");
		contentPane.add(batimentLabel,BorderLayout.LINE_START);
		contentPane.add(batimentText,BorderLayout.LINE_START);
		
		contentPane.add(localisation,BorderLayout.LINE_START);
		JButton b1 = new JButton("Generate");
		contentPane.add(b1, BorderLayout.SOUTH);
		this.setVisible(true);
		sa1 = new SourceAlarm(this.localisation.getText());
		 
		 
		
		b1.addActionListener(this);
		
	}
	public static void main(String[] args) {
		AlarmEventGenerator fenetre = new AlarmEventGenerator(); 
	    
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
