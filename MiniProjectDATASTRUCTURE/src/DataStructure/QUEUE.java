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

public class QUEUE extends JFrame {

	private JPanel contentPane;
	private JTextField qsize;
	private JTextField element;
	private JTextField disbox;
	private int size;
	private int r = -1;
	private int f = 0;
	private int[] q;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QUEUE frame = new QUEUE();
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
	public QUEUE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
		heading.setForeground(new Color(255, 255, 0));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(106, 11, 230, 21);
		contentPane.add(heading);

		JLabel lenfield = new JLabel("ENTER THE QUEUE SIZE");
		lenfield.setForeground(new Color(0, 255, 255));
		lenfield.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lenfield.setBounds(37, 64, 156, 17);
		contentPane.add(lenfield);

		JLabel elemlbl = new JLabel("ENTER AN ELEMENT");
		elemlbl.setBackground(new Color(255, 255, 255));
		elemlbl.setForeground(new Color(0, 255, 255));
		elemlbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemlbl.setBounds(37, 135, 132, 17);
		contentPane.add(elemlbl);

		qsize = new JTextField();
		qsize.setFont(new Font("Times New Roman", Font.BOLD, 14));
		qsize.setBounds(250, 61, 126, 23);
		contentPane.add(qsize);
		qsize.setColumns(10);

		JButton cqueue = new JButton("CREATE QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CREATE QUEUE
				size = Integer.valueOf(qsize.getText());
				q = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue of size " + size + " Created");
			}
		});
		cqueue.setBackground(new Color(221, 160, 221));
		cqueue.setForeground(new Color(0, 0, 128));
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cqueue.setBounds(149, 97, 141, 25);
		contentPane.add(cqueue);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 14));
		element.setColumns(10);
		element.setBounds(187, 132, 126, 23);
		contentPane.add(element);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERT LOGIC
				int elem;
				if (r == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion Not Possible");
				} else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					String message = "Element " + elem + " Inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insert.setBackground(new Color(0, 128, 0));
		insert.setForeground(new Color(0, 0, 0));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.setBounds(331, 131, 93, 25);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETION LOGIC
				if (r == -1 && f > r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				} else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + q[f]);
					f++;
				}
			}
		});
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.setBackground(new Color(255, 0, 0));
		delete.setBounds(331, 167, 93, 25);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY LOGIC
				String msg = "";
				if (r == -1 || f > r) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else {
					for (int i = f; i <= r; i++) {
						msg = msg + " " + q[i];
					}
					disbox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(0, 0, 128));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBackground(new Color(152, 251, 152));
		display.setBounds(149, 191, 141, 25);
		contentPane.add(display);

		disbox = new JTextField();
		disbox.setBackground(new Color(240, 255, 255));
		disbox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disbox.setColumns(10);
		disbox.setBounds(10, 227, 414, 23);
		contentPane.add(disbox);
	}

}
