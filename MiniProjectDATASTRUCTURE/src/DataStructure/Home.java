package DataStructure;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel Home;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Home = new JPanel();
		Home.setForeground(new Color(0, 0, 0));
		Home.setBackground(new Color(0, 128, 128));
		Home.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));

		setContentPane(Home);
		Home.setLayout(null);

		JLabel Heading = new JLabel("CHOOSE A DATA STRUCTURE");
		Heading.setBackground(new Color(255, 255, 255));
		Heading.setForeground(new Color(124, 252, 0));
		Heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Heading.setBounds(83, 11, 262, 21);
		Home.add(Heading);

		JButton Array = new JButton("ARRAY");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ARRAY().setVisible(true);
			}
		});
		Array.setForeground(new Color(0, 0, 255));
		Array.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Array.setBounds(173, 53, 89, 25);
		Home.add(Array);

		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new STACK().setVisible(true);
			}
		});
		stack.setForeground(new Color(148, 0, 211));
		stack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		stack.setBounds(49, 101, 89, 25);
		Home.add(stack);

		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new QUEUE().setVisible(true);
			}
		});
		queue.setForeground(new Color(199, 21, 133));
		queue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		queue.setBounds(295, 101, 79, 25);
		Home.add(queue);

		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CIRCULARQUEUE().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(165, 42, 42));
		cqueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cqueue.setBounds(10, 156, 164, 25);
		Home.add(cqueue);

		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SINGLYLINKEDLIST().setVisible(true);
			}
		});
		sll.setForeground(new Color(255, 69, 0));
		sll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sll.setBounds(241, 156, 181, 25);
		Home.add(sll);

		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DOUBLYLINKEDLIST().setVisible(true);
			}
		});
		dll.setForeground(new Color(0, 128, 0));
		dll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dll.setBounds(123, 211, 188, 25);
		Home.add(dll);
	}
}
