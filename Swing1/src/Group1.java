
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Group1 {

	private JFrame frmSquareEquattion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing window = new swing();
					window.frmSquareEquattion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swing() {
		Initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Initialize() {
		frmSquareEquattion = new JFrame();
		frmSquareEquattion.setTitle("Diện tích");
		frmSquareEquattion.setBounds(100, 100, 450, 300);
		frmSquareEquattion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSquareEquattion.getContentPane().setLayout(null);
		
		
		btnExit.setBounds(263, 74, 131, 37);
		frmSquareEquattion.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		button.setBounds(263, 122, 131, 37);
		frmSquareEquattion.getContentPane().add(button);
	}

	protected int pow(int a, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}

