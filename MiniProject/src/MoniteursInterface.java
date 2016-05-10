import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
/*
 * Created by JFormDesigner on Wed May 11 00:00:25 CEST 2016
 */



/**
 * @author Abderrahman Uahid
 */
public class MoniteursInterface extends JFrame {
    public MoniteursInterface() {
	initComponents();
    }

    private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
	// Generated using JFormDesigner Evaluation license - Abderrahman Uahid
	separator1 = new JSeparator();
	label1 = new JLabel();
	label2 = new JLabel();
	label3 = new JLabel();
	scrollPane1 = new JScrollPane();
	list1 = new JList();
	label4 = new JLabel();
	scrollPane2 = new JScrollPane();
	list2 = new JList();
	button1 = new JButton();
	button2 = new JButton();

	//======== this ========
	Container contentPane = getContentPane();

	//---- label1 ----
	label1.setText("Moniteur A");

	//---- label2 ----
	label2.setText("Moniteur B");

	//---- label3 ----
	label3.setText("\u00c9v\u00e9nements re\u00e7us et non trait\u00e9s");

	//======== scrollPane1 ========
	{
	    scrollPane1.setViewportView(list1);
	}

	//---- label4 ----
	label4.setText("\u00c9v\u00e9nements re\u00e7us et non trait\u00e9s");

	//======== scrollPane2 ========
	{
	    scrollPane2.setViewportView(list2);
	}

	//---- button1 ----
	button1.setText("D\u00e9tails");

	//---- button2 ----
	button2.setText("D\u00e9tails");

	GroupLayout contentPaneLayout = new GroupLayout(contentPane);
	contentPane.setLayout(contentPaneLayout);
	contentPaneLayout.setHorizontalGroup(
	    contentPaneLayout.createParallelGroup()
		.add(contentPaneLayout.createSequentialGroup()
		    .add(contentPaneLayout.createParallelGroup()
			.add(contentPaneLayout.createSequentialGroup()
			    .add(253, 253, 253)
			    .add(label1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
			.add(contentPaneLayout.createSequentialGroup()
			    .add(203, 203, 203)
			    .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
				.add(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.add(scrollPane1))
			    .addPreferredGap(LayoutStyle.RELATED)
			    .add(button1)))
		    .addPreferredGap(LayoutStyle.RELATED, 195, Short.MAX_VALUE)
		    .add(separator1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
		    .add(contentPaneLayout.createParallelGroup()
			.add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
			    .addPreferredGap(LayoutStyle.RELATED, 184, Short.MAX_VALUE)
			    .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
				.add(scrollPane2, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
				.add(label4, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
			    .addPreferredGap(LayoutStyle.RELATED)
			    .add(button2)
			    .add(163, 163, 163))
			.add(contentPaneLayout.createSequentialGroup()
			    .add(325, 325, 325)
			    .add(label2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
			    .addContainerGap(209, Short.MAX_VALUE))))
	);
	contentPaneLayout.setVerticalGroup(
	    contentPaneLayout.createParallelGroup()
		.add(GroupLayout.TRAILING, separator1, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
		.add(contentPaneLayout.createSequentialGroup()
		    .addContainerGap()
		    .add(contentPaneLayout.createParallelGroup()
			.add(label1)
			.add(label2))
		    .add(contentPaneLayout.createParallelGroup()
			.add(contentPaneLayout.createSequentialGroup()
			    .add(49, 49, 49)
			    .add(label3)
			    .add(contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
				    .add(18, 18, 18)
				    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.add(contentPaneLayout.createSequentialGroup()
				    .add(54, 54, 54)
				    .add(button1))))
			.add(contentPaneLayout.createSequentialGroup()
			    .add(48, 48, 48)
			    .add(label4)
			    .add(contentPaneLayout.createParallelGroup()
				.add(contentPaneLayout.createSequentialGroup()
				    .addPreferredGap(LayoutStyle.UNRELATED)
				    .add(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.add(contentPaneLayout.createSequentialGroup()
				    .add(47, 47, 47)
				    .add(button2)))))
		    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	pack();
	setLocationRelativeTo(getOwner());
	// JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Abderrahman Uahid
    private JSeparator separator1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel label4;
    private JScrollPane scrollPane2;
    private JList list2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
