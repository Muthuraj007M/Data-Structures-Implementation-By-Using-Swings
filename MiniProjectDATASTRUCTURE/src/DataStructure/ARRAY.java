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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ARRAY extends JFrame {

	private JPanel window;
	private JTextField length;
	private JTextField elem;
	private JTextField pos;
	private JTextField delpos;
	private JTextField display;
	private int[] arr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ARRAY frame = new ARRAY();
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
	public ARRAY() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 384);
		window = new JPanel();
		window.setBackground(new Color(47, 79, 79));
		window.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(window);
		window.setLayout(null);

		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setForeground(new Color(0, 255, 255));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(153, 11, 232, 21);
		window.add(heading);

		JLabel array = new JLabel("ENTER ARRAY LENGTH");
		array.setForeground(new Color(255, 255, 255));
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setBounds(100, 66, 157, 18);
		window.add(array);

		length = new JTextField();
		length.setFont(new Font("Times New Roman", Font.BOLD, 14));
		length.setBounds(300, 61, 126, 23);
		window.add(length);
		length.setColumns(10);

		JButton carr = new JButton("CREATE ARRAY");
		carr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ENTER LENGTH OF ARRAY
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length " + len + " Created";
				JOptionPane.showMessageDialog(window, message);
			}
		});
		carr.setBackground(new Color(255, 99, 71));
		carr.setForeground(new Color(255, 255, 255));
		carr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		carr.setBounds(205, 105, 148, 25);
		window.add(carr);

		JLabel element = new JLabel("ENTER AN INTEGER ELEMENT");
		element.setForeground(Color.WHITE);
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(10, 155, 201, 18);
		window.add(element);

		elem = new JTextField();
		elem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elem.setBounds(221, 150, 69, 23);
		window.add(elem);
		elem.setColumns(10);

		JLabel position = new JLabel("POSITION");
		position.setFont(new Font("Constantia", Font.BOLD, 14));
		position.setForeground(new Color(255, 255, 255));
		position.setBounds(300, 155, 70, 18);
		window.add(position);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// INSERTION LOGIC
				int element = Integer.valueOf(elem.getText());
				int position = Integer.valueOf(pos.getText());
				arr[position] = element;
				String message = ("Element " + element + " Inserted at position " + position);
				JOptionPane.showMessageDialog(window, message);
				elem.setText("");
				pos.setText("");
			}
		});
		insert.setForeground(new Color(255, 255, 255));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.setBackground(new Color(0, 128, 0));
		insert.setBounds(457, 149, 90, 25);
		window.add(insert);

		pos = new JTextField();
		pos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pos.setColumns(10);
		pos.setBounds(378, 150, 58, 23);
		window.add(pos);

		JLabel delposition = new JLabel("ENTER THE POSITION");
		delposition.setForeground(Color.WHITE);
		delposition.setFont(new Font("Constantia", Font.BOLD, 14));
		delposition.setBounds(27, 195, 151, 18);
		window.add(delposition);

		delpos = new JTextField();
		delpos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delpos.setColumns(10);
		delpos.setBounds(205, 190, 126, 23);
		window.add(delpos);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETION LOGIC
				int delposition = Integer.valueOf(delpos.getText());
				arr[delposition] = 0;
				String message = "Element deleted at the position " + delposition;
				JOptionPane.showMessageDialog(window, message);
				delpos.setText("");
			}
		});
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.setBackground(new Color(255, 0, 0));
		delete.setBounds(396, 189, 90, 25);
		window.add(delete);

		JButton dis = new JButton("DISPLAY");
		dis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY LOGIC
				String mesg = "";
				for (int i = 0; i <= arr.length - 1; i++) {
					mesg = mesg + " " + arr[i];
				}
				display.setText(mesg);
			}
		});
		dis.setForeground(Color.WHITE);
		dis.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dis.setBackground(new Color(199, 21, 133));
		dis.setBounds(205, 234, 148, 25);
		window.add(dis);

		display = new JTextField();
		display.setBackground(new Color(224, 255, 255));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setColumns(10);
		display.setBounds(42, 286, 469, 23);
		window.add(display);
	}
}
