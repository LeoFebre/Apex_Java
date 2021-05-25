package exemplo03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		rdbtnJava.setBounds(93, 48, 109, 23);
		rdbtnJava.setActionCommand("Java");
		contentPane.add(rdbtnJava);
		
		JRadioButton rdbtncSHARP = new JRadioButton("C#");
		rdbtncSHARP.setToolTipText("");
		rdbtncSHARP.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		rdbtncSHARP.setBounds(237, 48, 109, 23);
		rdbtncSHARP.setActionCommand("C#");
		contentPane.add(rdbtncSHARP);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnJava);
		grupo.add(rdbtncSHARP);
		
		JButton btnVERIFICAR = new JButton("Verificar");
		btnVERIFICAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, grupo.getSelection().getActionCommand());
			}
		});
		btnVERIFICAR.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnVERIFICAR.setBounds(160, 98, 89, 23);
		contentPane.add(btnVERIFICAR);
		
		
	}
}
