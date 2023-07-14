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
import java.awt.event.ActionEvent;

public class CIRCULARQUEUE extends JFrame {

	private JPanel contentPane;
	private JTextField cqsize;
	private JTextField element;
	private JTextField disbox;
	int cq[];
	int f = 0;
	int r = -1;
	int count = 0;
	int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CIRCULARQUEUE frame = new CIRCULARQUEUE();
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
	public CIRCULARQUEUE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(54, 11, 332, 21);
		contentPane.add(heading);

		JLabel sizelbl = new JLabel("ENTER THE QUEUE SIZE");
		sizelbl.setForeground(new Color(128, 0, 0));
		sizelbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sizelbl.setBounds(38, 69, 156, 17);
		contentPane.add(sizelbl);

		cqsize = new JTextField();
		cqsize.setForeground(new Color(0, 0, 0));
		cqsize.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cqsize.setBounds(229, 66, 126, 23);
		contentPane.add(cqsize);
		cqsize.setColumns(10);

		JButton ccqueue = new JButton("CREATE QUEUE");
		ccqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CREATE CIRCULAR QUEUE
				size = Integer.valueOf(cqsize.getText());
				cq = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Circular Queue of Size " + size + " Created");
			}
		});
		ccqueue.setForeground(new Color(0, 0, 0));
		ccqueue.setBackground(new Color(255, 165, 0));
		ccqueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		ccqueue.setBounds(139, 101, 142, 25);
		contentPane.add(ccqueue);

		JLabel elemlbl = new JLabel("ENTER AN ELEMENT");
		elemlbl.setForeground(new Color(128, 0, 0));
		elemlbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemlbl.setBounds(38, 134, 132, 17);
		contentPane.add(elemlbl);

		element = new JTextField();
		element.setForeground(new Color(0, 0, 0));
		element.setFont(new Font("Times New Roman", Font.BOLD, 14));
		element.setColumns(10);
		element.setBounds(197, 131, 126, 23);
		contentPane.add(element);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERTION LOGIC
				int elem;
				if (count == size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				} else {
					elem = Integer.valueOf(element.getText());
					r = (r + 1) % size;
					cq[r] = elem;
					String message = "Element " + elem + " Inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					count++;
				}
				element.setText("");
			}
		});
		insert.setForeground(new Color(0, 0, 0));
		insert.setBackground(new Color(0, 128, 0));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.setBounds(331, 130, 93, 25);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETION LOGIC
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + cq[f]);
					f = (f + 1) % size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(0, 0, 0));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.setBackground(new Color(255, 0, 0));
		delete.setBounds(331, 161, 93, 25);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY LOGIC
				String mesg = "";
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else {
					int f1 = f;
					if (count == 0) {
						JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					} else {
						for (int i = 1; i <= count; i++) {
							mesg = mesg + " " + cq[f1];
							disbox.setText(mesg);
							f1 = (f1 + 1) % size;
						}
					}
				}
			}
		});
		display.setForeground(new Color(0, 0, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBackground(new Color(205, 92, 92));
		display.setBounds(139, 186, 142, 25);
		contentPane.add(display);

		disbox = new JTextField();
		disbox.setForeground(new Color(0, 0, 0));
		disbox.setBackground(new Color(152, 251, 152));
		disbox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disbox.setColumns(10);
		disbox.setBounds(10, 227, 414, 23);
		contentPane.add(disbox);
	}

}
