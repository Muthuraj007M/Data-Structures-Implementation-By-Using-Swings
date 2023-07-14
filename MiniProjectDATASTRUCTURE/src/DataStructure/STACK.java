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

public class STACK extends JFrame {

	private JPanel contentPane;
	private JTextField stsize;
	private JTextField element;
	private JTextField disbox;
	private int st[];
	private int top = -1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STACK frame = new STACK();
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
	public STACK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setBounds(105, 11, 229, 21);
		contentPane.add(heading);

		JLabel stacksize = new JLabel("ENTER THE STACK SIZE");
		stacksize.setForeground(new Color(128, 0, 128));
		stacksize.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stacksize.setBounds(30, 59, 157, 17);
		contentPane.add(stacksize);

		stsize = new JTextField();
		stsize.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stsize.setBounds(197, 56, 126, 23);
		contentPane.add(stsize);
		stsize.setColumns(10);

		JButton cstack = new JButton("CREATE STACK");
		cstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(stsize.getText());
				st = new int[size];
				String message = "Stack of size " + size + " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		cstack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cstack.setForeground(new Color(255, 69, 0));
		cstack.setBackground(new Color(250, 235, 215));
		cstack.setBounds(142, 87, 143, 25);
		contentPane.add(cstack);

		JLabel elemlable = new JLabel("ENTER AN ELEMENT");
		elemlable.setForeground(new Color(128, 0, 128));
		elemlable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemlable.setBounds(30, 125, 157, 17);
		contentPane.add(elemlable);

		element = new JTextField();
		element.setFont(new Font("Times New Roman", Font.BOLD, 14));
		element.setColumns(10);
		element.setBounds(193, 122, 126, 23);
		contentPane.add(element);

		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PUSH LOGIC
				int elem;
				if (top == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Push not Possible");
				} else {
					elem = Integer.valueOf(element.getText());
					++top;
					st[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(0, 0, 0));
		push.setFont(new Font("Times New Roman", Font.BOLD, 14));
		push.setBackground(new Color(0, 128, 0));
		push.setBounds(329, 121, 80, 25);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// POP LOGIC
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Pop Not Possible");
				} else {
					String message = "Element deleted is " + st[top];
					JOptionPane.showMessageDialog(contentPane, message);
					top--;
				}
			}
		});
		pop.setForeground(new Color(0, 0, 0));
		pop.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pop.setBackground(new Color(255, 0, 0));
		pop.setBounds(329, 157, 80, 25);
		contentPane.add(pop);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY LOGIC
				String mesg = "";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
				} else {
					for (int i = top; i >= 0; i--) {
						mesg = mesg + " " + st[i];
					}
					disbox.setText(mesg);
				}
			}
		});
		display.setForeground(new Color(0, 128, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBackground(new Color(152, 251, 152));
		display.setBounds(30, 178, 104, 25);
		contentPane.add(display);

		disbox = new JTextField();
		disbox.setBackground(new Color(238, 232, 170));
		disbox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		disbox.setColumns(10);
		disbox.setBounds(30, 227, 379, 23);
		contentPane.add(disbox);
	}

}
