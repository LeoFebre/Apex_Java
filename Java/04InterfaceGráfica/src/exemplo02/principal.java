package exemplo02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
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
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbxCidades = new JComboBox();
		cbxCidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(cbxCidades.getSelectedIndex()) {
				
				case 0:
					JOptionPane.showMessageDialog(null, "Informe uma cidade");
				break;
				
				case 1:
					JOptionPane.showMessageDialog(null, "Pólo de tecnologia da informação");
				break;
				
				case 2:
					JOptionPane.showMessageDialog(null, "Capital do estado de Santa Catarina");
				break;
				
				case 3:
					JOptionPane.showMessageDialog(null, "Maior cidade do estado Catarinense");	
				break;
				
				}
			}
		});
		cbxCidades.setForeground(Color.DARK_GRAY);
		cbxCidades.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbxCidades.setModel(new DefaultComboBoxModel(new String[] {"Cidade", "Blumenau", "Florian\u00F3polis", "Joinville"}));
		cbxCidades.setBounds(49, 27, 346, 22);
		contentPane.add(cbxCidades);
	}
}
