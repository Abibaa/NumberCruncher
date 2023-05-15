import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Level extends JFrame {

	private JPanel contentPane;
	private final JLabel lblBackground = new JLabel();                                    //creating Jlabel
	private static ImageIcon Background = new ImageIcon("Images/background 1.png"); // establish path for image icon

	public static int level ;                       //declaring a data member
	//SplashScreen.
	//NumberCruncher game = new NumberCruncher();                  //creation of an object

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level frame = new Level();
					frame.setVisible(true);
					SplashScreen.design = 2;                                   //Initializing a variable
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Level() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1100, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("EASY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//contentPane.disable();
				//GamePane.enable();
				//contentPane.removeAll();
				//contentPane.revalidate();
				//contentPane.repaint();
				//SplashScreen.design = 2;
				level =1;                                                   //Initializing a variable
				
				NumberCruncher.main(null);                                             //calling the main of the object
				dispose();                                                    // closes the GUI
			}
		});
		btnNewButton.setBounds(435, 153, 151, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MODERATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				level = 2;                                              //Initializing a variable
				
				NumberCruncher.main(null);                                            //calling the main of the object
				dispose();                                                     // closes the GUI
				
			}
		});
		btnNewButton_1.setBounds(435, 260, 151, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DIFFICULT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				level = 3;                                                    //Initializing a variable
				
				NumberCruncher.main(null);                                                //calling the main of the object
				dispose();                                                             // closes the GUI
			}
		});
		btnNewButton_2.setBounds(435, 373, 151, 60);
		contentPane.add(btnNewButton_2);
		lblBackground.setIcon(Background);
		lblBackground.setBounds(0, 0, 1088, 800);
		contentPane.add(lblBackground);
		
		
		
		
	}
}
