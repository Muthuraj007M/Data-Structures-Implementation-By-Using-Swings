package DataStructure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SINGLYLINKEDLIST extends JFrame {

	private JPanel contentPane;
	private JTextField relem;
	private JTextField felem;
	private JTextField disbox;
	private Node first;

	class Node {
		int data;
		Node link;

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SINGLYLINKEDLIST frame = new SINGLYLINKEDLIST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SINGLYLINKEDLIST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 69, 19));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		heading.setForeground(new Color(255, 255, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(39, 11, 356, 21);
		contentPane.add(heading);

		JLabel elemlbl = new JLabel("ENTER THE ELEMENT");
		elemlbl.setForeground(new Color(255, 255, 0));
		elemlbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemlbl.setBounds(10, 59, 139, 17);
		contentPane.add(elemlbl);

		relem = new JTextField();
		relem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		relem.setBounds(164, 56, 113, 23);
		contentPane.add(relem);
		relem.setColumns(10);

		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setForeground(new Color(255, 255, 0));
		lblEnterTheElement.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterTheElement.setBounds(10, 105, 139, 17);
		contentPane.add(lblEnterTheElement);

		felem = new JTextField();
		felem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		felem.setColumns(10);
		felem.setBounds(164, 102, 113, 23);
		contentPane.add(felem);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.setForeground(new Color(0, 0, 0));
		insertrear.setBackground(new Color(102, 205, 170));
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT REAR
				int elem;
				Node temp;
				elem = Integer.valueOf(relem.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " inserted rear");
				} else {
					temp = first;
					while (temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + newnode.data + " inserted rear");
				}
				relem.setText("");
			}
		});
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertrear.setBounds(287, 55, 137, 25);
		contentPane.add(insertrear);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT FRONT
				int elem;
				elem = Integer.valueOf(felem.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " inserted front");
				} else {
					newnode.link = first;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " inserted front");
				}
				felem.setText("");
			}
		});
		insertfront.setForeground(new Color(0, 0, 0));
		insertfront.setBackground(new Color(32, 178, 170));
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertfront.setBounds(287, 101, 137, 25);
		contentPane.add(insertfront);

		JButton delrear = new JButton("DELETE REAR");
		delrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE REAR
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else if (first.link == null) {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = null;
				} else {
					temp = first;
					while (temp.link.link != null) {
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element " + temp.link.data + " Deleted");
					temp.link = null;
				}
				relem.setText("");
			}
		});
		delrear.setForeground(new Color(0, 0, 0));
		delrear.setBackground(new Color(250, 128, 114));
		delrear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delrear.setBounds(52, 144, 137, 25);
		contentPane.add(delrear);

		JButton delfront = new JButton("DELETE FRONT");
		delfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE FRONT
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else if (first.link == null) {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = null;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = first.link;
				}
				felem.setText("");
			}
		});
		delfront.setForeground(new Color(0, 0, 0));
		delfront.setBackground(new Color(233, 150, 122));
		delfront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delfront.setBounds(252, 144, 143, 25);
		contentPane.add(delfront);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY
				Node temp;
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else if (first.link == null) {
					mesg = mesg + " " + first.data;
					disbox.setText(mesg);
				} else {
					temp = first;
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						disbox.setText(mesg);
						temp = temp.link;
					}
				}

			}
		});
		display.setForeground(new Color(0, 0, 0));
		display.setBackground(new Color(152, 251, 152));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBounds(164, 180, 113, 25);
		contentPane.add(display);

		disbox = new JTextField();
		disbox.setBackground(new Color(250, 250, 210));
		disbox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disbox.setColumns(10);
		disbox.setBounds(10, 227, 414, 23);
		contentPane.add(disbox);
	}
}
