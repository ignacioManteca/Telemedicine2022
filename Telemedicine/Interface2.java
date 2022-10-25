package operations;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objects.Test;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JList;

public class Interface2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton ButtonEMG,ButtonEDA;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface2 frame = new Interface2();
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
	public Interface2() {
		
		Test test = new Test();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 5, 666, 488);
		panel_1.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce your name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(191, 111, 276, 115);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(201, 207, 233, 58);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(263, 275, 121, 49);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Select the signal you are testing");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(131, 35, 433, 73);
		panel_2.add(lblNewLabel_1);
		
		ButtonEMG = new JButton("Electromyography (EMG)");
		ButtonEMG.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ButtonEMG.setBounds(205, 291, 284, 147);
		panel_2.add(ButtonEMG);
		
		ButtonEDA = new JButton("Electrodermal Activity (EDA)");
		ButtonEDA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ButtonEDA.setBounds(205, 118, 285, 163);
		panel_2.add(ButtonEDA);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TEST DONE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(269, 156, 144, 100);
		panel_3.add(lblNewLabel_2);
	}
	
	public void action_select(JButton box, int n) {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			

		}
	};
}
