package DataStructure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class DOUBLYLINKEDLIST extends JFrame {

	private JPanel contentPane;
	private JTextField elem2;
	private JTextField elem1;
	private JTextField disbox;
	private Node first;

	class Node {
		int data;
		Node prelink;
		Node nextlink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DOUBLYLINKEDLIST frame = new DOUBLYLINKEDLIST();
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
	public DOUBLYLINKEDLIST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		heading.setForeground(new Color(255, 255, 0));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(35, 11, 364, 21);
		contentPane.add(heading);

		JLabel elemlbl = new JLabel("ENTER THE ELEMENT");
		elemlbl.setForeground(new Color(255, 255, 255));
		elemlbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemlbl.setBounds(10, 55, 139, 17);
		contentPane.add(elemlbl);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT REAR
				Node temp;
				int elem;
				elem = Integer.valueOf(elem1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " inserted rear");
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
					JOptionPane.showMessageDialog(contentPane, "Element " + newnode.data + " inserted rear");
				}
				elem1.setText("");
			}
		});
		insertrear.setForeground(Color.BLACK);
		insertrear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertrear.setBackground(new Color(102, 205, 170));
		insertrear.setBounds(292, 51, 137, 25);
		contentPane.add(insertrear);

		JLabel elem1lbl = new JLabel("ENTER THE ELEMENT");
		elem1lbl.setForeground(new Color(255, 255, 255));
		elem1lbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elem1lbl.setBounds(10, 89, 139, 17);
		contentPane.add(elem1lbl);

		elem2 = new JTextField();
		elem2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elem2.setColumns(10);
		elem2.setBounds(169, 86, 113, 23);
		contentPane.add(elem2);

		elem1 = new JTextField();
		elem1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elem1.setColumns(10);
		elem1.setBounds(169, 52, 113, 23);
		contentPane.add(elem1);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT FRONT
				int elem;
				elem = Integer.valueOf(elem2.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Inserted front");
				} else {
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Inserted front");
				}
				elem2.setText("");
			}
		});
		insertfront.setForeground(Color.BLACK);
		insertfront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insertfront.setBackground(new Color(32, 178, 170));
		insertfront.setBounds(292, 83, 137, 25);
		contentPane.add(insertfront);

		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE REAR
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = null;
				} else {
					temp = first;
					while (temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element " + temp.nextlink.data + " Deleted");
					temp.nextlink = null;
				}
			}
		});
		deleterear.setForeground(Color.BLACK);
		deleterear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deleterear.setBackground(new Color(250, 128, 114));
		deleterear.setBounds(292, 118, 137, 25);
		contentPane.add(deleterear);

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE FRONT
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = null;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Element " + first.data + " Deleted");
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		deletefront.setForeground(Color.BLACK);
		deletefront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		deletefront.setBackground(new Color(233, 150, 122));
		deletefront.setBounds(292, 156, 137, 25);
		contentPane.add(deletefront);

		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY FORWARD
				Node temp;
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else if (first.nextlink == null) {
					mesg = mesg + " " + first.data;
					disbox.setText(mesg);
				} else {
					temp = first;
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						disbox.setText(mesg);
						;
						temp = temp.nextlink;
					}
				}
			}
		});
		displayforward.setForeground(Color.BLACK);
		displayforward.setFont(new Font("Times New Roman", Font.BOLD, 14));
		displayforward.setBackground(new Color(152, 251, 152));
		displayforward.setBounds(10, 118, 181, 25);
		contentPane.add(displayforward);

		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY REVERSE
				Node temp;
				String mesg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else if (first.nextlink == null) {
					mesg = mesg + " " + first.data;
					disbox.setText(mesg);
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while (temp != null) {
						mesg = mesg + " " + temp.data;
						disbox.setText(mesg);
						temp = temp.prelink;
					}
				}
			}
		});
		displayreverse.setForeground(Color.BLACK);
		displayreverse.setFont(new Font("Times New Roman", Font.BOLD, 14));
		displayreverse.setBackground(new Color(152, 251, 152));
		displayreverse.setBounds(10, 156, 181, 25);
		contentPane.add(displayreverse);

		disbox = new JTextField();
		disbox.setBackground(new Color(250, 250, 210));
		disbox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disbox.setColumns(10);
		disbox.setBounds(10, 215, 414, 23);
		contentPane.add(disbox);
	}
}
