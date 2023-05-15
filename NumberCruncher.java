import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.Text;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class NumberCruncher extends JFrame {

	
	private JPanel contentPane;
	
	Save data = new Save();                               //creation of an object
	//creating Arraylist
	private static List<JTextField> text = new ArrayList<JTextField>();
	private static List<JLabel> labelss = new ArrayList<JLabel>();
	private static List<JLabel> Marks = new ArrayList<JLabel>();
	private static List<JLabel> ImageB = new ArrayList<JLabel>();
	private static List<JLabel> ImageS = new ArrayList<JLabel>();
	private static List<JLabel> History1 = new ArrayList<JLabel>();
	private static List<JLabel> gues = new ArrayList<JLabel>();
	
	
	
	// Creating Jlabels
	private static JPanel EasyPane1;
	private static JPanel EasyPane2;
	private static JPanel EasyPane3;
	
	private static JPanel MedPane4 = new JPanel();
	private static JPanel MedPane5  = new JPanel();
	private static JPanel DifPane6 = new JPanel();
	private static JPanel DifPane7 = new JPanel();
	
	//Creating textfields
	private static JTextField txtEasy1;
	private static JTextField txtEasy2;
	private static JTextField txtEasy3;
	private static JTextField txtModerate4;
	private static JTextField txtModerate5;
	private static JTextField txtDifficult6;
	private static JTextField txtDifficult7;
	
	
	//creating buttons
	private static JButton btn1 =new JButton("Submit");
	private static JButton btnStart = new JButton("Start");
	
	//creating Jlabels
	private final JLabel lblBackground = new JLabel();                            
	private static JLabel lblUserName = new JLabel("");
	private static JLabel lblGuess1;
	private static JLabel lblGuess2;
	private static JLabel lblGuess3;
	private static JLabel lblGuess4;
	private static JLabel lblGuess5;
	private static JLabel lblGuess6;
	private static JLabel lblGuess7;
	private static JLabel lblR1T6 = new JLabel("");
	private static JLabel lblround = new JLabel("");
	private static JLabel lblMark1 = new JLabel("");
	private static JLabel lblMark2 = new JLabel("");
	private static JLabel lblMark3 = new JLabel("");
	private static JLabel lblMark4 = new JLabel("");
	private static JLabel lblMark5 = new JLabel("");
	private static JLabel lblMark6 = new JLabel("");
	private static JLabel lblMark7 = new JLabel("");
	
	
	//declaring and initializing data members
	private static int[] Guess = new int[1000];
	private static Integer [] Answer = new Integer[7];
	private static Integer [] Gueses = new Integer[7];
	
//	private static int 
	//String file = SplashScreen.playerinput".txt";
	private static int maxOccur =0;
	public static int range =10;
	public static Integer score =0;
	private static Integer value = 0;
	public static Integer round = 1;
	private static Integer playerNumber = 0;
	public static Integer Guesses1 =0;
	public  static Integer Guesses2 =0;
	public  static Integer Guesses3 =0;
	public  static Integer Guesses4 =0;
	public  static Integer Guesses5 = 0;
	public  static Integer Guesses6 = 0;
	public static Integer Guesses7 = 0;
	public  static int history = 0;
	
	private static ImageIcon Background = new ImageIcon("Images/background2.png"); // establish path for image icon
	private static ImageIcon upB = new ImageIcon("Images/UP.png"); // establish path for image icon
	private static ImageIcon downB = new ImageIcon("Images/DOWN.png"); // establish path for image icon
	
	private static ImageIcon downS = new ImageIcon("Images/2.png"); // establish path for image icon
	private static ImageIcon UpS = new ImageIcon("Images/1.png"); // establish path for image icon
	private static ImageIcon X = new ImageIcon("Images/x.png"); // establish path for image icon
	private static ImageIcon Check = new ImageIcon("Images/checkmark.png"); // establish path for image icon
	
	
	
	//TRAC1 "HISTORY"
	//Creating Jlabels
	private static JLabel lblR1T1 = new JLabel("");
	private static JLabel lblR1T2 = new JLabel("");
	private static JLabel lblR1T3 = new JLabel("");
	private static JLabel lblR1T4 = new JLabel("");
	private static JLabel lblR1T5 = new JLabel("");
	private static JLabel lblImage = new JLabel("");
	
	private static JLabel lblImgE1 = new JLabel("");
	private static JLabel lblImgE2 = new JLabel("");
	private static JLabel lblImgE3 = new JLabel("");
	private static JLabel lblImgE4 = new JLabel("");
	private static JLabel lblImgE5 = new JLabel("");

	
	
	//TRAC2 "HISTORY"
		//Creating Jlabels
	
	private static JLabel lblR2T1 = new JLabel("");
	private static JLabel lblR2T2 = new JLabel("");
	private static JLabel lblR2T3 = new JLabel("");
	private static JLabel lblR2T4 = new JLabel("");
	private static JLabel lblR2T5 = new JLabel("");
	private static JLabel lblR2T6 = new JLabel("");
	private static JLabel lblImage_1 = new JLabel("");
	
	private static JLabel lblImgE1_1 = new JLabel("");
	private static JLabel lblImgE2_1 = new JLabel("");
	private static JLabel lblImgE3_1 = new JLabel("");
	private static JLabel lblImgE4_1 = new JLabel("");
	private static JLabel lblImgE5_1 = new JLabel("");
	
	
	//TRAC3 "HISTORY"
			//Creating Jlabels
	private static JLabel lblR3T1 = new JLabel("");
	private static JLabel lblR3T2 = new JLabel("");
	private static JLabel lblR3T3 = new JLabel("");
	private static JLabel lblR3T4 = new JLabel("");
	private static JLabel lblR3T5 = new JLabel("");
	private static JLabel lblR3T6 = new JLabel("");
	private static JLabel lblImage_2 = new JLabel("");
	
	private static JLabel lblImgE1_2 = new JLabel("");
	private static JLabel lblImgE2_2 = new JLabel("");
	private static JLabel lblImgE3_2 = new JLabel("");
	private static JLabel lblImgE4_2 = new JLabel("");
	private static JLabel lblImgE5_2 = new JLabel("");
	
	
	//TRAC4 "HISTORY"
			//Creating Jlabels
	private static JLabel lblR4T1 = new JLabel("");
	private static JLabel lblR4T2 = new JLabel("");
	private static JLabel lblR4T3 = new JLabel("");
	private static JLabel lblR4T4 = new JLabel("");
	private static JLabel lblR4T5 = new JLabel("");
	private static JLabel lblR4T6 = new JLabel("");
	private static JLabel lblImage_3 = new JLabel("");
	
	private static JLabel lblImgE1_3 = new JLabel("");
	private static JLabel lblImgE2_3 = new JLabel("");
	private static JLabel lblImgE3_3 = new JLabel("");
	private static JLabel lblImgE4_3 = new JLabel("");
	private static JLabel lblImgE5_3 = new JLabel("");
	
	
	//TRAC5 "HISTORY"
			//Creating Jlabels
	private static JLabel lblR5T1 = new JLabel("");
	private static JLabel lblR5T2 = new JLabel("");
	private static JLabel lblR5T3 = new JLabel("");
	private static JLabel lblR5T4 = new JLabel("");
	private static JLabel lblR5T5 = new JLabel("");
	private static JLabel lblR5T6 = new JLabel("");
	private static JLabel lblImage_4 = new JLabel("");
	
	private static JLabel lblImgE1_4 = new JLabel("");
	private static JLabel lblImgE2_4 = new JLabel("");
	private static JLabel lblImgE3_4 = new JLabel("");
	private static JLabel lblImgE4_4 = new JLabel("");
	private static JLabel lblImgE5_4 = new JLabel("");
	
	//TRAC6 "HISTORY"
			//Creating Jlabels
	
	private static JLabel lblR6T1 = new JLabel("");
	private static JLabel lblR6T2 = new JLabel("");
	private static JLabel lblR6T3 = new JLabel("");
	private static JLabel lblR6T4 = new JLabel("");
	private static JLabel lblR6T5 = new JLabel("");
	private static JLabel lblR6T6 = new JLabel("");
	private static JLabel lblImage_5 = new JLabel("");
	
	private static JLabel lblImgE1_5 = new JLabel("");
	private static JLabel lblImgE2_5 = new JLabel("");
	private static JLabel lblImgE3_5 = new JLabel("");
	private static JLabel lblImgE4_5 = new JLabel("");
	private static JLabel lblImgE5_5 = new JLabel("");
	
	
	//TRAC7 "HISTORY"
			//Creating Jlabels
	private static JLabel lblR7T1 = new JLabel("");
	private static JLabel lblR7T2 = new JLabel("");
	private static JLabel lblR7T3 = new JLabel("");
	private static JLabel lblR7T4 = new JLabel("");
	private static JLabel lblR7T5 = new JLabel("");
	private static JLabel lblR7T6 = new JLabel("");
	private static JLabel lblImage_6 = new JLabel("");
	
	private static JLabel lblImgE1_6 = new JLabel("");
	private static JLabel lblImgE2_6 = new JLabel("");
	private static JLabel lblImgE3_6 = new JLabel("");
	private static JLabel lblImgE4_6 = new JLabel("");
	private static JLabel lblImgE5_6 = new JLabel("");
	private final JLabel lblPointss = new JLabel("Score :");
	private final static JLabel lblscore = new JLabel("");
	private final JButton btnExit = new JButton("EXIT");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberCruncher frame = new NumberCruncher();
					frame.setVisible(true);
					lblUserName.setText(SplashScreen.playerinput);                                  //display player's initials on the screen
					
						CheckLevel();  
				
					                                                                   //calling a method
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public NumberCruncher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		EasyPane1 = new JPanel();
		EasyPane1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		EasyPane1.setEnabled(rootPaneCheckingEnabled);
		EasyPane1.setBounds(135, 153, 95, 343);
		contentPane.add(EasyPane1);
		EasyPane1.setLayout(null);
		
	
		lblR1T1.setBounds(10, 11, 57, 25);
		EasyPane1.add(lblR1T1);
		
		
		lblR1T2.setBounds(10, 47, 75, 25);
		EasyPane1.add(lblR1T2);
		
		
		lblR1T3.setBounds(10, 83, 75, 25);
		EasyPane1.add(lblR1T3);
		
		
		lblR1T4.setBounds(10, 119, 75, 25);
		EasyPane1.add(lblR1T4);
		
	
		lblR1T5.setBounds(10, 159, 75, 25);
		EasyPane1.add(lblR1T5);
		
		
		lblR1T6.setBounds(10, 318, 75, 25);
		EasyPane1.add(lblR1T6);
		labelss.add(lblR1T6);
		
		
		lblImgE1.setBounds(56, 14, 25, 25);
		EasyPane1.add(lblImgE1);
		
		
		lblImgE2.setBounds(56, 47, 25, 25);
		EasyPane1.add(lblImgE2);
		
		
		lblImgE3.setBounds(56, 83, 25, 25);
		EasyPane1.add(lblImgE3);
		
		
		lblImgE4.setBounds(56, 119, 25, 25);
		EasyPane1.add(lblImgE4);
		
		
		lblImgE5.setBounds(56, 155, 25, 25);
		EasyPane1.add(lblImgE5);
		
		
		lblImage.setBounds(10, 198, 75, 97);
		EasyPane1.add(lblImage);
		
		EasyPane2 = new JPanel();
		EasyPane2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		EasyPane2.setBounds(268, 153, 95, 343);
		contentPane.add(EasyPane2);
		EasyPane2.setLayout(null);
		

		lblR2T1.setBounds(10, 11, 75, 25);
		EasyPane2.add(lblR2T1);
		

		lblR2T2.setBounds(10, 47, 75, 25);
		EasyPane2.add(lblR2T2);
		

		lblR2T3.setBounds(10, 83, 75, 25);
		EasyPane2.add(lblR2T3);
		

		lblR2T4.setBounds(10, 119, 75, 25);
		EasyPane2.add(lblR2T4);
		

		lblR2T5.setBounds(10, 155, 75, 25);
		EasyPane2.add(lblR2T5);
		

		lblR2T6.setBounds(10, 318, 75, 25);
		EasyPane2.add(lblR2T6);
		labelss.add(lblR2T6);
		

		lblImgE1_1.setBounds(56, 11, 25, 25);
		EasyPane2.add(lblImgE1_1);
		

		lblImgE2_1.setBounds(56, 44, 25, 25);
		EasyPane2.add(lblImgE2_1);
		

		lblImgE3_1.setBounds(56, 80, 25, 25);
		EasyPane2.add(lblImgE3_1);
		

		lblImgE4_1.setBounds(56, 116, 25, 25);
		EasyPane2.add(lblImgE4_1);
		

		lblImgE5_1.setBounds(56, 152, 25, 25);
		EasyPane2.add(lblImgE5_1);

		
		lblImage_1.setBounds(10, 195, 75, 97);
		EasyPane2.add(lblImage_1);
		
		EasyPane3 = new JPanel();
		EasyPane3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		EasyPane3.setBounds(399, 153, 95, 343);
		contentPane.add(EasyPane3);
		EasyPane3.setLayout(null);
		

		lblR3T1.setBounds(10, 11, 75, 25);
		EasyPane3.add(lblR3T1);
		

		lblR3T2.setBounds(10, 47, 75, 25);
		EasyPane3.add(lblR3T2);
		

		lblR3T3.setBounds(10, 83, 75, 25);
		EasyPane3.add(lblR3T3);
		

		lblR3T4.setBounds(10, 119, 75, 25);
		EasyPane3.add(lblR3T4);
		

		lblR3T5.setBounds(10, 155, 75, 25);
		EasyPane3.add(lblR3T5);
		

		lblR3T6.setBounds(10, 318, 75, 25);
		EasyPane3.add(lblR3T6);
		labelss.add(lblR3T6);
		

		lblImgE1_2.setBounds(56, 11, 25, 25);
		EasyPane3.add(lblImgE1_2);
		

		lblImgE2_2.setBounds(56, 44, 25, 25);
		EasyPane3.add(lblImgE2_2);
		

		lblImgE3_2.setBounds(56, 80, 25, 25);
		EasyPane3.add(lblImgE3_2);
		

		lblImgE4_2.setBounds(56, 116, 25, 25);
		EasyPane3.add(lblImgE4_2);
		

		lblImgE5_2.setBounds(56, 152, 25, 25);
		EasyPane3.add(lblImgE5_2);
		

		lblImage_2.setBounds(10, 195, 75, 97);
		EasyPane3.add(lblImage_2);
		
		MedPane4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		MedPane4.setBounds(533, 153, 95, 343);
		MedPane4.setVisible(false);
		contentPane.add(MedPane4);
		MedPane4.setLayout(null);
		

		lblR4T1.setBounds(10, 11, 75, 25);
		MedPane4.add(lblR4T1);
		

		lblR4T2.setBounds(10, 47, 75, 25);
		MedPane4.add(lblR4T2);
		

		lblR4T3.setBounds(10, 83, 75, 25);
		MedPane4.add(lblR4T3);
		

		lblR4T4.setBounds(10, 119, 75, 25);
		MedPane4.add(lblR4T4);
		

		lblR4T5.setBounds(10, 155, 75, 25);
		MedPane4.add(lblR4T5);
		

		lblR4T6.setBounds(10, 318, 75, 25);
		MedPane4.add(lblR4T6);
		labelss.add(lblR4T6);
		

		lblImgE1_3.setBounds(56, 11, 25, 25);
		MedPane4.add(lblImgE1_3);
		

		lblImgE2_3.setBounds(56, 44, 25, 25);
		MedPane4.add(lblImgE2_3);
		

		lblImgE3_3.setBounds(56, 80, 25, 25);
		MedPane4.add(lblImgE3_3);
		

		lblImgE4_3.setBounds(56, 116, 25, 25);
		MedPane4.add(lblImgE4_3);
		

		lblImgE5_3.setBounds(56, 152, 25, 25);
		MedPane4.add(lblImgE5_3);
		

		lblImage_3.setBounds(10, 195, 75, 97);
		MedPane4.add(lblImage_3);
		

		MedPane5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		MedPane5.setBounds(665, 153, 95, 343);
		MedPane5.setVisible(false);
		contentPane.add(MedPane5);
		MedPane5.setLayout(null);
		

		lblR5T1.setBounds(10, 11, 75, 25);
		MedPane5.add(lblR5T1);

		
		lblR5T2.setBounds(10, 47, 75, 25);
		MedPane5.add(lblR5T2);
		

		lblR5T3.setBounds(10, 83, 75, 25);
		MedPane5.add(lblR5T3);
		

		lblR5T4.setBounds(10, 119, 75, 25);
		MedPane5.add(lblR5T4);
		

		lblR5T5.setBounds(10, 155, 75, 25);
		MedPane5.add(lblR5T5);
		

		lblR5T6.setBounds(10, 318, 75, 25);
		MedPane5.add(lblR5T6);
		labelss.add(lblR5T6);
		

		lblImgE1_4.setBounds(56, 11, 25, 25);
		MedPane5.add(lblImgE1_4);
		

		lblImgE2_4.setBounds(56, 44, 25, 25);
		MedPane5.add(lblImgE2_4);
		

		lblImgE3_4.setBounds(56, 80, 25, 25);
		MedPane5.add(lblImgE3_4);
		

		lblImgE4_4.setBounds(56, 116, 25, 25);
		MedPane5.add(lblImgE4_4);
		

		lblImgE5_4.setBounds(56, 152, 25, 25);
		MedPane5.add(lblImgE5_4);
		

		lblImage_4.setBounds(10, 195, 75, 97);
		MedPane5.add(lblImage_4);
		
	
		DifPane6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DifPane6.setBounds(800, 153, 95, 343);
		DifPane6.setVisible(false);
		contentPane.add(DifPane6);
		DifPane6.setLayout(null);
		

		lblR6T1.setBounds(10, 11, 75, 25);
		DifPane6.add(lblR6T1);
		

		lblR6T2.setBounds(10, 47, 75, 25);
		DifPane6.add(lblR6T2);
		

		lblR6T3.setBounds(10, 83, 75, 25);
		DifPane6.add(lblR6T3);
		

		lblR6T4.setBounds(10, 119, 75, 25);
		DifPane6.add(lblR6T4);
		

		lblR6T5.setBounds(10, 155, 75, 25);
		DifPane6.add(lblR6T5);
		

		lblR6T6.setBounds(10, 318, 75, 25);
		DifPane6.add(lblR6T6);
		labelss.add(lblR6T6);
		

		lblImgE1_5.setBounds(56, 11, 25, 25);
		DifPane6.add(lblImgE1_5);
		

		lblImgE2_5.setBounds(56, 44, 25, 25);
		DifPane6.add(lblImgE2_5);
		

		lblImgE3_5.setBounds(56, 80, 25, 25);
		DifPane6.add(lblImgE3_5);
		

		lblImgE4_5.setBounds(56, 116, 25, 25);
		DifPane6.add(lblImgE4_5);
		

		lblImgE5_5.setBounds(56, 152, 25, 25);
		DifPane6.add(lblImgE5_5);
		

		lblImage_5.setBounds(10, 195, 75, 97);
		DifPane6.add(lblImage_5);
		
	
		DifPane7 .setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DifPane7 .setBounds(936, 153, 95, 343);
		DifPane7.setVisible(false);
		contentPane.add(DifPane7 );
		DifPane7 .setLayout(null);
		

		lblR7T1.setBounds(10, 11, 75, 25);
		DifPane7 .add(lblR7T1);
		

		lblR7T2.setBounds(10, 47, 75, 25);
		DifPane7 .add(lblR7T2);
		

		lblR7T3.setBounds(10, 83, 75, 25);
		DifPane7 .add(lblR7T3);
		

		lblR7T4.setBounds(10, 119, 75, 25);
		DifPane7 .add(lblR7T4);
		

		lblR7T5.setBounds(10, 155, 75, 25);
		DifPane7 .add(lblR7T5);
		

		lblR7T6.setBounds(10, 318, 75, 25);
		DifPane7 .add(lblR7T6);
		labelss.add(lblR7T6);

		
		lblImgE1_6.setBounds(56, 11, 25, 25);
		DifPane7.add(lblImgE1_6);
		

		lblImgE2_6.setBounds(56, 44, 25, 25);
		DifPane7.add(lblImgE2_6);
		

		lblImgE3_6.setBounds(56, 80, 25, 25);
		DifPane7.add(lblImgE3_6);
		

		lblImgE4_6.setBounds(56, 116, 25, 25);
		DifPane7.add(lblImgE4_6);
		

		lblImgE5_6.setBounds(56, 152, 25, 25);
		DifPane7.add(lblImgE5_6);
		

		lblImage_6.setBounds(10, 195, 75, 97);
		DifPane7.add(lblImage_6);
		
		txtEasy1 = new JTextField();
		txtEasy1.setBounds(135, 521, 96, 20);
		contentPane.add(txtEasy1);
		txtEasy1.setEnabled(false);
		txtEasy1.setColumns(10);
		text.add(txtEasy1);
		
		txtEasy2 = new JTextField();
		txtEasy2.setColumns(10);
		txtEasy2.setBounds(267, 521, 96, 20);
		txtEasy2.setEnabled(false);
		contentPane.add(txtEasy2);
		text.add(txtEasy2);
		
		txtEasy3 = new JTextField();
		txtEasy3.setColumns(10);
		txtEasy3.setBounds(399, 521, 96, 20);
		txtEasy3.setEnabled(false);
		contentPane.add(txtEasy3);
		text.add(txtEasy3);
		
		txtModerate4 = new JTextField();
		txtModerate4.setEnabled(false);
		txtModerate4.setColumns(10);
		txtModerate4.setBounds(533, 521, 96, 20);
		txtModerate4.setVisible(false);
		contentPane.add(txtModerate4);
		text.add(txtModerate4);
		
		
		txtModerate5 = new JTextField();
		txtModerate5.setEnabled(false);
		txtModerate5.setColumns(10);
		txtModerate5.setBounds(665, 521, 96, 20);
		txtModerate5.setVisible(false);
		contentPane.add(txtModerate5);
		text.add(txtModerate5);
		
		txtDifficult6 = new JTextField();
		txtDifficult6.setEnabled(false);
		txtDifficult6.setColumns(10);
		txtDifficult6.setBounds(800, 521, 96, 20);
		txtDifficult6.setVisible(false);
		contentPane.add(txtDifficult6);
		text.add(txtDifficult6);
		
		txtDifficult7 = new JTextField();
		txtDifficult7.setEnabled(false);
		txtDifficult7.setColumns(10);
		txtDifficult7.setBounds(935, 521, 96, 20);
		txtDifficult7.setVisible(false);
		contentPane.add(txtDifficult7);
		text.add(txtDifficult7);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//calling methods
			START();
			Correct();
			
			
			}
		});
		
		
		
		btn1.setBounds(539, 686, 157, 48);
		btn1.setEnabled(false);
		contentPane.add(btn1);
		
		JLabel lbltitle = new JLabel("NUMBER CRUNCHER");
		lbltitle .setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle .setFont(new Font("Broadway", Font.PLAIN, 30));
		lbltitle .setBounds(399, 22, 342, 39);
		contentPane.add(lbltitle );
		
		JLabel lblNewLabel = new JLabel("Player :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(21, 84, 59, 20);
		contentPane.add(lblNewLabel);
		lblUserName.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		
		
		lblUserName.setBounds(526, 84, 60, 17);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel_1 = new JLabel("Guesses :");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(21, 125, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		lblGuess1 = new JLabel("");
		lblGuess1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess1.setBounds(161, 125, 48, 14);
		contentPane.add(lblGuess1);
		gues.add(lblGuess1);
		
		
		lblGuess2 = new JLabel("");
		lblGuess2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess2.setBounds(287, 126, 48, 14);
		contentPane.add(lblGuess2);
		gues.add(lblGuess2);
		
		lblGuess3 = new JLabel("");
		lblGuess3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess3.setBounds(418, 126, 48, 14);
		contentPane.add(lblGuess3);
		gues.add(lblGuess3);
		
		lblGuess4 = new JLabel("");
		lblGuess4.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess4.setBounds(556, 126, 48, 14);
		contentPane.add(lblGuess4);
		gues.add(lblGuess4);
		
		lblGuess5 = new JLabel("");
		lblGuess5.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess5.setBounds(686, 128, 48, 14);
		contentPane.add(lblGuess5);
		gues.add(lblGuess5);
		
		lblGuess6 = new JLabel("");
		lblGuess6.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess6.setBounds(828, 126, 48, 14);
		contentPane.add(lblGuess6);
		gues.add(lblGuess6);
		
		lblGuess7 = new JLabel("");
		lblGuess7.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblGuess7.setBounds(959, 126, 48, 14);
		contentPane.add(lblGuess7);
		gues.add(lblGuess7);
		
	
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblround.setText(round.toString());                                                         //Display on screen
				data.SaveGame();                                                                       //calls a method
				 //WipeHistory();
				
				
				if(round<10) {                                            //round is less than 10
					lblround.setText(round.toString());              //Display on screen
				
				DisplayNumGuess();                                    //calling a method
				
				}
				
				else if(round>9 && round <20)                           
				{
					
					Integer temp = round -9;                               //temporal variable
					lblround.setText(temp.toString());                    //Display on screen
					 Level.level=2;                                              //Initialise level to 2
					 
					DisplayNumGuess();                                    //calling a method
					
				}
				
				else if (round>19)                                       //If round is greater than 19
				{
					
					Integer temp = round -19;                                    //temporal variable
					lblround.setText(temp.toString());                                   //Update display on screen
					Level.level=3;                                          //Initialise level to 3
				
					DisplayNumGuess();                                    //calling a method
					
				}
				
			
				btnStart.setEnabled(false);
				System.out.println(round);
			}
		});
		btnStart.setBounds(219, 686, 157, 48);
		contentPane.add(btnStart);
		
		JLabel lblNewLabel_5 = new JLabel("Rounds :");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(21, 163, 70, 14);
		contentPane.add(lblNewLabel_5);
		lblround.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblround.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblround.setBounds(90, 163, 35, 14);
		contentPane.add(lblround);
		
		
		lblMark1.setBounds(135, 589, 95, 78);
		contentPane.add(lblMark1);
		
		
		lblMark2.setBounds(268, 589, 95, 78);
		contentPane.add(lblMark2);
		
		
		lblMark3.setBounds(399, 589, 95, 78);
		contentPane.add(lblMark3);
		
		
		lblMark4.setBounds(533, 589, 95, 78);
		contentPane.add(lblMark4);
		
		
		lblMark5.setBounds(665, 589, 95, 78);
		contentPane.add(lblMark5);
		
		
		lblMark6.setBounds(800, 589, 95, 78);
		contentPane.add(lblMark6);
		
		
		
		lblMark7.setBounds(936, 589, 95, 78);
		contentPane.add(lblMark7);
		
		
		//Addition of different JLabels to ArrayLists
		Marks.add(lblMark1);
		Marks.add(lblMark2);
		Marks.add(lblMark3);
		Marks.add(lblMark4);
		Marks.add(lblMark5);
		Marks.add(lblMark6);
		Marks.add(lblMark7);
		
		
		ImageB.add(lblImage);
		ImageB.add(lblImage_1);
		ImageB.add(lblImage_2);
		ImageB.add(lblImage_3);
		ImageB.add(lblImage_4);
		ImageB.add(lblImage_5);
		ImageB.add(lblImage_6);
	
		ImageS.add(lblImgE1);
		ImageS.add(lblImgE1_1);
		ImageS.add(lblImgE1_2);
		ImageS.add(lblImgE1_3);
		ImageS.add(lblImgE1_4);
		ImageS.add(lblImgE1_5);
		ImageS.add(lblImgE1_6);
		
		
		ImageS.add(lblImgE2); 
		ImageS.add(lblImgE2_1);
		ImageS.add(lblImgE2_2);
		ImageS.add(lblImgE2_3);
		ImageS.add(lblImgE2_4);
		ImageS.add(lblImgE2_5);
		ImageS.add(lblImgE2_6);
		
		
		ImageS.add(lblImgE3);
		ImageS.add(lblImgE3_1);
		ImageS.add(lblImgE3_2);
		ImageS.add(lblImgE3_3);
		ImageS.add(lblImgE3_4);
		ImageS.add(lblImgE3_5);
		ImageS.add(lblImgE3_6);
		
		
		ImageS.add(lblImgE4);
		ImageS.add(lblImgE4_1);
		ImageS.add(lblImgE4_2);
		ImageS.add(lblImgE4_3);
		ImageS.add(lblImgE4_4);
		ImageS.add(lblImgE4_5);
		ImageS.add(lblImgE4_6);
		
		ImageS.add(lblImgE5);
		ImageS.add(lblImgE5_1);
		ImageS.add(lblImgE5_2);
		ImageS.add(lblImgE5_3);
		ImageS.add(lblImgE5_4);
		ImageS.add(lblImgE5_5);
		ImageS.add(lblImgE5_6);
		
		History1.add(lblR1T1);
		History1.add(lblR2T1);
		History1.add(lblR3T1);
		History1.add(lblR4T1);
		History1.add(lblR5T1);
		History1.add(lblR6T1);
		History1.add(lblR7T1);
		
		History1.add(lblR1T2);
		History1.add(lblR2T2);
		History1.add(lblR3T2);
		History1.add(lblR4T2);
		History1.add(lblR5T2);
		History1.add(lblR6T2);
		History1.add(lblR7T2);
		
		
		History1.add(lblR1T3);
		History1.add(lblR2T3);
		History1.add(lblR3T3);
		History1.add(lblR4T3);
		History1.add(lblR5T3);
		History1.add(lblR6T3);
		History1.add(lblR7T3);
		
		History1.add(lblR1T4);
		History1.add(lblR2T4);
		History1.add(lblR3T4);
		History1.add(lblR4T4);
		History1.add(lblR5T4);
		History1.add(lblR6T4);
		History1.add(lblR7T4);
		
		
		History1.add(lblR1T5);
		History1.add(lblR2T5);
		History1.add(lblR3T5);
		History1.add(lblR4T5);
		History1.add(lblR5T5);
		History1.add(lblR6T5);
		History1.add(lblR7T5);
		lblPointss.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblPointss.setBounds(10, 690, 70, 14);
		
		contentPane.add(lblPointss);
		lblscore.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblscore.setBounds(90, 690, 70, 14);
		
		contentPane.add(lblscore);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		btnExit.setBounds(828, 686, 157, 48);
		contentPane.add(btnExit);
		
		lblBackground.setIcon(Background);
		lblBackground.setBounds(0, 0, 1088, 800);
		contentPane.add(lblBackground);
	}
	
	public static int[] makeArray() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	makeArray()
		//
		// Method parameters	:	none
		//
		// Method return		:	int []
		//
		// Synopsis				:   This method creates a random array of 1000 numbers
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		for (int x= 0; x<Guess.length; x++)
		{
		Random ras= new Random();                              //Instantiation
		int value = ras.nextInt(range) + 1;                      //randomization and assigning it to 'value'
		Guess[x] = value;                                            //number is stored in the array
		
		}
		//System.out.println(Arrays.toString(Guess));
		
		
		return Guess;                                             //returns an array
	}
	
	public static Boolean Mode() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Mode()
		//
		// Method parameters	:	none
		//
		// Method return		:	boolean
		//
		// Synopsis				:   This method finds the mode of an array of numbers
		//							and also check whether there is more than 1 mode in the array
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//declaring and initializing of local variables
		int occurance = 0;
		int same = 0;
		maxOccur = 0;                                                   //Initializing to 0
		
		
		 
		for (int x =0; x<Guess.length; x++) {
			int temporal = Guess[x];                                                        //stores the current number in position 'x' of the array in an integer
			
			for(int y= x; y<Guess.length; y++)
			{
				if (temporal==Guess[y])                                                               //checks whether the temporal is equals to the number in position 'y' of the array
				{
					occurance++;                                                                          //Increments
				}
				
				
			}	  
			  if (occurance>maxOccur)                                                     //if 'occurance' is greater than 'maxOccur'
			  { 
				  maxOccur = occurance;                                                    //set 'mamxOccur' to be the same as 'occurance'
				  value = temporal;                                                           //'value' equals 'temporal'
				  same = temporal;                                                                //'same' equals 'temporal'
			  }
			  
			  if (occurance == maxOccur)                                                      //this checks whether there is a second mode
				 { same =temporal;                                                          //'same' equals 'temporal'
				 }
			  
				
			//GuesArray[x]= occurance;
			occurance = 0;                                                                 //Initialise to 0
			//System.out.println(value);
			
			
		}
       
		
		//System.out.println("Max occurance " +maxOccur);
		
		//System.out.println(value);
		//System.out.println(same);
		
		
		if (same == value) {                                                       //if 'same' eqauls 'value'
			return false;                                                               //return false
		}
		else {
			return true;                                                              //return true
		}
		
		
	}
	public static int check() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	check()
		//
		// Method parameters	:	none
		//
		// Method return		:	int
		//
		// Synopsis				:   This method runs while there is more than 1 mode
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		while (Mode()) {                                                // continues to loop  while Mode() returns true
			makeArray();                                                    //calling a method
			
		}
		return value;                                                        //return an integer
	}
	public static void CheckLevel() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	CheckLevel()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method checks the player level and display the guesses accordingly
		//							it also set the visibility of the tracs
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		
		 
			
			
		
		
		if (Level.level==1)                                              //if level from the class Level equals to 1
		{
			
			if (SplashScreen.design == 2)
			{
             //Initializing variable
			Guesses1 += 5;
			Guesses2 +=5;
			Guesses3 += 5;
			}
			
			
			//display labels on screen
			lblGuess1.setText(Guesses1.toString());
			lblGuess2.setText(Guesses2.toString());
			lblGuess3.setText(Guesses3.toString());
			
			
			
			
		}
		else if (Level.level==2)                                              //if level from the class Level equals to 2
		{
			if (SplashScreen.design == 2)
			{
			//Initializing variable
			Guesses1 += 7;
			Guesses2 +=7;
			Guesses3 += 7;
			Guesses4 +=7;
			Guesses5 += 7;
			
			round = 10;
			range =100;
			}
			//display labels on screen
			lblGuess1.setText(Guesses1.toString());
			lblGuess2.setText(Guesses2.toString());
			lblGuess3.setText(Guesses3.toString());
			lblGuess4.setText(Guesses4.toString());
			lblGuess5.setText(Guesses5.toString());
			
			
			//Setting the visibility of panels to true
			MedPane4.setVisible(true);
			MedPane5.setVisible(true);
			
			//Setting the visibility of text fields to true
			txtModerate4.setVisible(true);
			txtModerate5.setVisible(true);
			
			
			
			
		}
		
		else if(Level.level ==3)                                                //if level from the class Level equals to 3
		{
			
			if (SplashScreen.design == 2)
			{
			//Initializing variable
			Guesses1 += 11;
			Guesses2 +=11;
			Guesses3 += 11;
			Guesses4 +=11;
			Guesses5 += 11;
			Guesses6 +=11;
			Guesses7 +=11;
			
			round = 20;
			range =1000;
			
			}
			//display labels on screen
			lblGuess1.setText(Guesses1.toString());
			lblGuess2.setText(Guesses2.toString());
			lblGuess3.setText(Guesses3.toString());
			lblGuess4.setText(Guesses4.toString());
			lblGuess5.setText(Guesses5.toString());
			lblGuess6.setText(Guesses6.toString());
			lblGuess7.setText(Guesses7.toString());
			
			
			
			//Setting the visibility of panels to true
			MedPane4.setVisible(true);
			MedPane5.setVisible(true);
			DifPane6.setVisible(true);
			DifPane7.setVisible(true);
			
			//Setting the visibility of text fields to true
			txtModerate4.setVisible(true);
			txtModerate5.setVisible(true);
			txtDifficult6.setVisible(true);
			txtDifficult7.setVisible(true);
			
			
			
			
			
		}
	}
	public static void START() {
		
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
				// Method				:	START()
				//
				// Method parameters	:	none
				//
				// Method return		:	void
				//
				// Synopsis				:   This method IS called when the button to submit is clicked.
		//                                  It receives player's inputand check whether it is greater than 0
				//							
				//
				// Modifications		:
				//							Date			Developer				Notes
				//							----			---------				-----
				//							2022-06-07		N.P. Lorrick		 Initial setup
				//
				// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		
		//Initializing local variable to 0
		int Easy1 = 0;
		
		
		if(Level.level ==1)
		{
			
			if (Guesses1>0  && Guesses2>0 && Guesses3>0 )                                             //if Guesses for the level is greater than 0
		{
				
				for(int y= 0; y<3;y++)                        
				{	
					int temp = verifyinput(text.get(y));                                               //store the values input by the player for the 1st 3 tracs
					
					if (temp>0)                                                                                  //check whether all values input are greater than 0
					{
						Easy1++;                                                                                    //Incrementing
					}
				}
				
				if (Easy1 ==3)                                                                 //If number of input greater than 0 is equals to 3
				{
					for(int i= 0; i<text.size();i++)                                              //Loop 
				{
					if (text.get(i).isEnabled())                                                  //check whether the text fields in array are enabled
					{
						
						
							
						int temp = verifyinput(text.get(i));                                        //store the values input by the player 
						
							Answer[i] = temp;                                                            //places the player's input in an array
							
							labelss.get(i).setText(Answer[i].toString());                               //display player's input on screen 
							
						
						
						
					}
					
				}
				history++;                                                                                    //Increment
				
				
				//calling methods
				Reduction();
				checkk(Answer, Gueses);
			    History();
				
				
				}
			}
		}
		
		if(Level.level ==2)                                                                    //if player is in level 2
		{
			if (Guesses1>0  && Guesses2>0 && Guesses3>0 && Guesses4>0 && Guesses5>0)
		{
		
				for(int y= 0; y<5;y++)                                                 //loops 5 times
				{	
					int temp = verifyinput(text.get(y));                                   //store the values input by the player for the 1st 3 tracs
					
					if (temp>0)                                                             //check whether all values input are greater than 0
					{
						Easy1++;                                                                   //Increment
					}
				}
				
				if (Easy1 ==5)                                                               //If all values are greater than 0
				{
					for(int i= 0; i<text.size();i++)
				{
					if (text.get(i).isEnabled())                                                 //check whether the text fields in arrayare enable
					{
	
						int temp = verifyinput(text.get(i));                                   //store inputs in temporal variable
						
							Answer[i] = temp;                                                  //place the values in an array
							
							labelss.get(i).setText(Answer[i].toString());                         //display on screen
						
						
					}
					
				}
				history++;                                                              //Increment
				
				
				//method calling
				Reduction();
				checkk(Answer, Gueses);
			    History();
				
				
				}
			}
		}
		
		if(Level.level ==3)                                                                            //level =3
		{
			if (Guesses1>0  && Guesses2>0 && Guesses3>0 && Guesses4>0 && Guesses5>0 && Guesses6>0 && Guesses7>0 )               //All guesses greater than 0
		{
				
				for(int y= 0; y<7;y++)                                                            //loops 7 times
				{	
					int temp = verifyinput(text.get(y));                                           //stores player input
					
					if (temp>0)                                                                           //checks whether greater than 2
					{
						Easy1++;                                                                        //Increment
					}
				}
				
				if (Easy1==7)                                                                          //If all textfields' values aregreater than 0
				{
					for(int i= 0; i<text.size();i++)
				{
					if (text.get(i).isEnabled())                                                       //checks i enabled
					{
	
						int temp = verifyinput(text.get(i));                                               //store inputs in temporal variable

						Answer[i] = temp;                                                                 //place the values in an array
							
							labelss.get(i).setText(Answer[i].toString());                                           //display on screen
						
					}
					
				}
				history++;                                                                           //Increment
				
				//method calling
				Reduction();
				checkk(Answer, Gueses);
			   History();
				
				
				}
			}
		}
	}
	
	public static void DisplayNumGuess() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	DisplayNumGuess()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method checks the level and calls methods						
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		if (Level.level==1)                                            //if level from the class Level equals to 1
		{
			
			//calling methods
			trac1();
			trac2();
			trac3();
			
			
			
		}
		else if (Level.level==2)                                          //if level from the class Level equals to 2
		{
			
			                                                      //Initializing variable
		
			//calling methods
			trac1();
			trac2();
			trac3();
			trac4();
			trac5();
		}
		
		else if(Level.level ==3)                                                 //if level from the class Level equals to 3
		{
			                                                         //Initializing variable
			
			//calling methods
			trac1();
			trac2();
			trac3();
			trac4();
			trac5();
			trac6();
			trac7();
		}
	}
	
	public static void trac1() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac1()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 1
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[0] = value;                                                                 //placing the  mode in an array
		
		//buttons on
		txtEasy1.setEnabled(true);
		btn1.setEnabled(true);
		
		
		
		
		//textField.setText(value.toString());                         //display and update label on screen
	}
	
	public static void trac2() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac2()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 2
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		//method calling
		makeArray();
		check();
		Gueses[1] = value;                                                          //placing the  mode in an array
		
		txtEasy2.setEnabled(true);                                            //textarea enabled
		//textField_1.setText(value.toString());                        //display and update label on screen
	}
	public static void trac3() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac3()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 3
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[2] = value;                                                                  //placing the  mode in an array
		
		txtEasy3.setEnabled(true);                                                         //enabled
		//textField_2.setText(value.toString());                                  //display and update label on screen
	}
	public static void trac4() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac4()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 4
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[3] = value;                                                                  //placing the  mode in an array
		txtModerate4.setEnabled(true);                                               //enabled
		//textField_3.setText(value.toString());                                  //display and update label on screen
	}
	public static void trac5() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac5()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 5
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[4] = value;                                                                              //placing the  mode in an array
		txtModerate5.setEnabled(true);                                                             //enabled
		
		
		//textField_4.setText(value.toString());                                         //display and update label on screen
	}
	public static void trac6() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac6()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 6
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[5] = value;                                                                        //placing the  mode in an array
		txtDifficult6.setEnabled(true);                                                 //enabled
		//textField_5.setText(value.toString());                      //display and update label on screen
	}
	public static void trac7() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	trac7()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method calls methods and update the display for track 7
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//calling methods
		makeArray();
		check();
		Gueses[6] = value;                                                                                //placing the  mode in an array
		
		txtDifficult7.setEnabled(true);                                                     //enabled
		//textField_6.setText(value.toString());                                                  //display and update label on screen
	}
	
	
	
	private static int verifyinput(JTextField text) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	void verifyinput()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method prompts the user to enter a number
		//							and checks whether the value entered is a number
		//							or not or whether the space is left empty.
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-31		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		//declaring temporal variable
		String value;
		playerNumber = 0;                                                             //Initializing to 0
		
		
		 
		
		 
		try {
			
			  value = text.getText();                                                          // allows to grab the text the user has input and built it value=
		  playerNumber = Integer.parseInt(value);                                                 //change the String to an interger and stores in variable
		  if (playerNumber<=0)                                                               //checks if player input is less than 0
		  {
			  JOptionPane.showMessageDialog(null, "ERROR - Re-input your number");                         //display message
			  text.setText("");
		  
		 }
		}
		 
		  catch(NumberFormatException e) {
			 
			  text.setText("");                                                              //wipe the textFields
		 
			  JOptionPane.showMessageDialog(null, "ERROR - Input error");                       //display on screen
			 
			  
			  
		  
		  
		  }
		
		
		 return playerNumber;                                                                 //return playerNumber
		
		 
	}

	public static void checkk(Integer[] answer2, Integer[] gueses2)
	{
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	checkk()
		//
		// Method parameters	:	int[] int[]
		//
		// Method return		:	void
		//
		// Synopsis				:   this methods checks whether the player's input is a number
		//							greater than, less than or equals to the number to guess
		//							and displays the appropriate image
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		for(int i=0; i< text.size();i++)                                         //Loops 7 times
		{
			if (text.get(i).isEnabled())                                              //checks for textfields which are enabled
			{
				
				   if(Answer[i]<Gueses[i])                                            //If the player's input is less than the number to be guessed
				   {
					   //displays images on labels
					   ImageB.get(i).setIcon(upB);
					   Marks.get(i).setIcon(X);
				   }
				   
				   else if(Answer[i]>Gueses[i])                              //If the player's input is greater than the number to be guessed
				   {
					   //displays images on labels
					   ImageB.get(i).setIcon(downB);
					   Marks.get(i).setIcon(X);
				   }
				   else                                                                           //If the player's input is equals to the number to be guessed
				   {
					   Marks.get(i).setIcon(Check);                                       //displays checkmark
					   ImageB.get(i).setIcon(null);                                        //display no image
					   text.get(i).setEnabled(false);                                   //disable the textField
				   }
				
			
				
			}
		}
		
	}
	
	public static void History() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method keeps track of the history
		//							of the player's input
		//							
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-05-04		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
			
		if (history==1) {                                                 //if history equals 1
			History1();                                                             //calls method  
			
		   }
		
		else if (history==2) {                                                    //if history equals 2
		 
		  
			History2();                                                            //calls a method
		  }
		  
		 
		else  if (history==3)                                                    //if history equals 3
		
		 { History3();                                                                       //calls a method
		 }
		
		else if (history==4)                           //if history equals 4
		 { 
			History4();                                                                    //calls a method
		 }
		else if(history==5)                                               //if history equals 5
		 { 
			History5();                                                                    //calls a method
		
		 } 
		else if (history>5)                                                   //if history is greater than 5
		 { 
			//calling methods
		 History1();
		
		 History2(); 
		
		 History3();
		 
		 History4();
		 
		 History5();
		 
		 }
		 
		
	}
	
	public static void History1() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History1()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 1st History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		
		if (history<6)                                                             //if history is less than 6
		{
			for(int i=0; i< text.size();i++)                                             //loops 7 times
			{
				if (text.get(i).isEnabled())                                         //check if textfields are enabled
				{
					History1.get(i).setText(Answer[i].toString());                        //Display the player's input on screen
					   if(Answer[i]<Gueses[i])                                               //If input is less than number to be guessed
					   {
						   ImageS.get(i).setIcon(UpS);                                      //display image
					   }
					   else if(Answer[i]==Gueses[i])                                              //If input is equals to number to be guessed
					   {
						   ImageS.get(i).setIcon(null);                                      //display nothing
					   }
					   else if(Answer[i]>Gueses[i])                                         //If input is greater than number to be guessed
					   {
						   ImageS.get(i).setIcon(downS);                                   //display image
					   }
					
				
					
				}
			}
		}
		
		
		
		else {                                                                   //history is greater than 5
			
			
			for(int i=0; i< text.size();i++)                                          //loops 7 times
			{
				if (text.get(i).isEnabled())                                             //check if textfields are enabled
				{
					History1.get(i).setText(History1.get(i+7).getText());              //displays the text of the label below
					   
					   ImageS.get(i).setIcon(ImageS.get(i+7).getIcon());	                    //displays the image of the label below
				}
			}
		}
		
	}
	
	
	public static void History2() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History2()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 2nd row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		if (history<6)                                                                               //if history is less than 6
		{
			for(int i=0; i< text.size();i++)                                                          //loops 7 times
			{
				if (text.get(i).isEnabled())                                                                //check if textfields are enabled
				{
					History1.get(i+7).setText(Answer[i].toString());                                         //Display the player's input on screen
					   
					if(Answer[i]<Gueses[i])                                                                    //If input is less than number to be guessed
					   {
						   ImageS.get(i+7).setIcon(UpS);                                                      //display image
					   }
					   else if(Answer[i]==Gueses[i])                                                        //If input is equals to number to be guessed
					   {
						   ImageS.get(i+7).setIcon(null);                                                  //display nothing
					   }
					   else if(Answer[i]>Gueses[i])                                                            //If input is greater than number to be guessed
					   {
						   ImageS.get(i+7).setIcon(downS);                                                        //display image
					   }
					
				
					
				}
			}
		}
		
		
		
		else {                                                                                               //history is greater than 5
			
			
			for(int i=0; i< text.size();i++)                                                                     //loops 7 times      
			{
				if (text.get(i).isEnabled())                                                                      //check if textfields are enabled        
				{
					History1.get(i+7).setText(History1.get(i+14).getText());                                         //displays the text of the label below          
					   
					   ImageS.get(i+7).setIcon(ImageS.get(i+14).getIcon());	                                        //displays the image of the label below       
				}
			}
		}
		
	}
	public static void History3() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History3()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 3rd row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		if (history<6)                                                                                      //if history is less than 6
		{
			for(int i=0; i< text.size();i++)                                                                //loops 7 times
			{
				if (text.get(i).isEnabled())                                                                    //check if textfields are enabled        
				{
					History1.get(i+14).setText(Answer[i].toString());                                              //Display the player's input on screen            
					   if(Answer[i]<Gueses[i])                                                                     //If input is less than number to be guessed
					   {
						   ImageS.get(i+14).setIcon(UpS);                                                          //display image
					   }
					   else if(Answer[i]==Gueses[i])                                                                     //If input is equals to number to be guessed
					   {
						   ImageS.get(i+14).setIcon(null);                                                             //display nothing
					   }
					   else if(Answer[i]>Gueses[i])                                                           //If input is greater than number to be guessed
					   {
						   ImageS.get(i+14).setIcon(downS);                                                                 //display image
					   }
					
				
					
				}
			}
		}
		
		
		
		else {                                                                                                          //history is greater than 5
			
			
			for(int i=0; i< text.size();i++)                                                                      //loops 7 times
			{
				if (text.get(i).isEnabled())                                                                              //check if textfields are enabled 
				{
					History1.get(i+14).setText(History1.get(i+21).getText());                                       //displays the text of the label below
					   
					   ImageS.get(i+14).setIcon(ImageS.get(i+21).getIcon());	                                   //displays the image of the label below
				}
			}
		}
		
		
	}
	public static void History4() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History4()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 4th row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		if (history<6)                                                                                       //if history is less than 6            
		{
			for(int i=0; i< text.size();i++)                                                                        //loops 7 times                 
			{
				if (text.get(i).isEnabled())                                                   //check if textfields are enabled        
				{
					History1.get(i+21).setText(Answer[i].toString());                                          //Display the player's input on screen 
					   if(Answer[i]<Gueses[i])                                                                  //If input is less than number to be guessed       
					   {
						   ImageS.get(i+21).setIcon(UpS);                                                                //display image      
					   }
					   else if(Answer[i]==Gueses[i])                                                               //If input is equal to number to be guessed          
					   {
						   ImageS.get(i+21).setIcon(null);                                                                   //display nothing           
					   }
					   else if(Answer[i]>Gueses[i])                                                                    //If input is greater than number to be guessed               
					   {
						   ImageS.get(i+21).setIcon(downS);                                                                       //display image                  
					   }
					
				
					
				}
			}
		}
		
		
		
		else {
			
			
			for(int i=0; i< text.size();i++)                                                                         //loops 7 times    
			{
				if (text.get(i).isEnabled())                                                                    //check if textfields are enabled            
				{
					History1.get(i+21).setText(History1.get(i+28).getText());                                 //displays the text of the label below                                                                   //displays the text of the label below
					   
					   ImageS.get(i+21).setIcon(ImageS.get(i+28).getIcon());	                                 //displays the image of the label below                                                                                   //displays the image of the label below
				}
			}
		}
		
		
	}
	public static void History5() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History5()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 5th row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
			
		
			for(int i=0; i< text.size();i++)                                                          //loops 7 times 
			{
				if (text.get(i).isEnabled())                                                      //check if textfields are enabled  
				{
					History1.get(i+28).setText(Answer[i].toString());                                    //Display the player's input on screen 
					   if(Answer[i]<Gueses[i])                                                                   //If input is less than number to be guessed       
					   {
						   ImageS.get(i+28).setIcon(UpS);                                                    //display image      
					   }
					   else if(Answer[i]==Gueses[i])                                              //If input is equal to number to be guessed       
					   {
						   ImageS.get(i+28).setIcon(null);                                     //display nothing 
					   }
					   else if(Answer[i]>Gueses[i])                                             //If input is greater than number to be guessed         
					   {
						   ImageS.get(i+28).setIcon(downS);                                             //display image  
					   }
					
				
					
				}
			}
		
		
	}
	
	
	public static void Correct() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Correct()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 5th row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		
		//Initializing variables to 0
		int total = 0;
		int scores = 0;
		
		Gameover();                                                                       //calling a method
		
				if(text.get(0).isEnabled()== false && text.get(1).isEnabled()== false && text.get(2).isEnabled()== false)  //if textfield is enabled
				{
					
					if(Level.level==1)                                                      //level =1
					{
					round++;                                                                                   //Increment
					
					//calculation
					total =  (Guesses1+ Guesses2 + Guesses3) *10;
					scores = (Guesses1+ Guesses2 + Guesses3)/3 *50;
					score += scores+ total;
					
					
					//Calculations
					Guesses1+=5;
					Guesses2+=5;
					Guesses3+=5;
					history = 0;
					 range+=10;
					 
					 //update display on screen
					 lblGuess1.setText(Guesses1.toString()); 
					 lblGuess2.setText(Guesses2.toString());
					 lblGuess3.setText(Guesses3.toString());
					 lblscore.setText(score.toString());
					 
					 WipeHistory();                                     //call method
					 
					btn1.setEnabled(false);                                                   //btn off
					 btnStart.setEnabled(true);                                               //btn on
					 
					 
					}
					
					if (Level.level==2)                                                                                      //level =2
					{
					
							if(text.get(3).isEnabled()== false && text.get(4).isEnabled()== false ) {                          //if textfield is enabled
								
								
								round++;                                                                      //Increment
								//calculation
								total =  (Guesses1+ Guesses2 + Guesses3 + Guesses4 +Guesses5) *10;
								scores = (Guesses1+ Guesses2 + Guesses3 + Guesses4 +Guesses5)/3 *50;
								score += scores+ total;	
								
								Guesses1+=7;
								Guesses2+=7;
								Guesses3+=7;
								Guesses4+=7;
								Guesses5+=7;
								 history = 0;
								 range+=100;
								 
								 //update display on screen
								 lblGuess1.setText(Guesses1.toString());
								 lblGuess2.setText(Guesses2.toString());
								 lblGuess3.setText(Guesses3.toString());
								 lblGuess4.setText(Guesses4.toString());
								 lblGuess5.setText(Guesses5.toString());
								 lblscore.setText(score.toString());
								
								 WipeHistory();                                   //calling method
								btn1.setEnabled(false);                     //btn on
								 btnStart.setEnabled(true);                   //btn off
								
							}
						
					}
					
					if (Level.level==3)                                                          //level =3
					{
					
							if(text.get(3).isEnabled()== false && text.get(4).isEnabled()== false && text.get(5).isEnabled()== false && text.get(6).isEnabled()== false)                            //if textfield is enabled
							{
								round++;                                                                      //Increment
								//calculation
								total =  (Guesses1+ Guesses2 + Guesses3 + Guesses4 +Guesses5 + Guesses6 + Guesses7) *10;
								scores = (Guesses1+ Guesses2 + Guesses3 + Guesses4 +Guesses5 + Guesses6 + Guesses7)/3 *50;
								score += scores+ total;
								
								//calculation
								Guesses1+=11;
								Guesses2+=11;
								Guesses3+=11;
								Guesses4+=11;
								Guesses5+=11;
								Guesses6+=11;
								Guesses7+=11;
								 range+=1000;
								 
								 history = 0;                                                 //Initialising variable to 0
								
								
								 //update display on screen
								 lblGuess1.setText(Guesses1.toString());
								 lblGuess2.setText(Guesses2.toString());
								 lblGuess3.setText(Guesses3.toString());
								 lblGuess4.setText(Guesses4.toString());
								 lblGuess5.setText(Guesses5.toString());
								 lblGuess6.setText(Guesses6.toString());
								 lblGuess7.setText(Guesses7.toString());
								 lblscore.setText(score.toString());
								 
								 WipeHistory();                                                    //call method
								
								btn1.setEnabled(false);                                                     //btn off
							 btnStart.setEnabled(true);                                                     //btn on
							 
							
							}
						
					}
					
					
				
				}
			

		
		
		
	}
	public static void WipeHistory() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
				// Method				:	WipeHistory()
				//
				// Method parameters	:	none
				//
				// Method return		:	void
				//
				// Synopsis				:   This method wipes the history when the player moves to the next round
				//
				// Modifications		:
				//							Date			Developer				Notes
				//							----			---------				-----
				//							2022-06-07		N.P. Lorrick		 Initial setup
				//
				// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
			for (int i=0; i<29; i++)
			{
				History1.get(i).setText(null);                                                    //Set label's text to null
				ImageS.get(i).setIcon(null);                                                    //Set label's image to null
				
				i+=6;                                                                           //calculations
			}
			for (int i=1; i<30; i++)
			{
				History1.get(i).setText(null);                                             //Set label's text to null
				ImageS.get(i).setIcon(null);                                                    //Set label's image to null
				
				i+=6;                                                                           //calculations
			}
			for (int i=2; i<31; i++)
			{
				History1.get(i).setText(null);                                      //Set label's text to null
				ImageS.get(i).setIcon(null);                                                    //Set label's image to null
				i+=6;                                                                              //calculations
			}
			for (int i =0; i< Marks.size(); i++)
			{
				Marks.get(i).setIcon(null);                                                            //Set label's image to null
				text.get(i).setText(null);                                                           //Set label's text to null
			}
		
		
		if (Level.level ==2)
		{
			for (int i=3; i<32; i++)
			{
				History1.get(i).setText(null);                                               //Set label's text to null
				ImageS.get(i).setIcon(null);                                                 //Set label's image to null
				i= i+6;                                                                                   //calculations
			}
			for (int i=4; i<33; i++)
			{
				History1.get(i).setText(null);                                           //Set label's text to null  
				ImageS.get(i).setIcon(null);                                                 //Set label's image to null
				i+=6;                                                                                  //calculations
			}
		}
		
		if (Level.level ==3)
		{
			for (int i=3; i<32; i++) 
			{ 
				History1.get(i).setText(null);                                                //Set label's text to null
				ImageS.get(i).setIcon(null);                                                        //Set label's image to null
				i+=6;                                                                                     //calculations
			}
			for (int i=4; i<33; i++)
			{
				History1.get(i).setText(null);                                            //Set label's text to null
				ImageS.get(i).setIcon(null);                                                   //Set label's image to null
				i+=6;                                                                                    //calculations
			}
			for (int i=5; i<34; i++)
			{
				History1.get(i).setText(null);                                            //Set label's text to null
				ImageS.get(i).setIcon(null);                                                //Set label's image to null
				i+=6;                                                                                         //calculations
			}
			for (int i=6; i<35; i++)
			{
				History1.get(i).setText(null);                                              //Set label's text to null
				ImageS.get(i).setIcon(null);                                                  //Set label's image to null
				i+=6;                                                                                   //calculations
			}
		}
	}
	
	public static void Reduction()
	{
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	History5()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays the 5th row of the History of the player's input
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		if(txtEasy1.isEnabled())                                                     //if textfield is enabled
		{
			
			Guesses1--;                                                          //Decrement
			
			lblGuess1.setText(Guesses1.toString());                                     //Update display on screen              
			
		}
		if(txtEasy2.isEnabled())                                                //if textfield is enabled
		{                                      
			Guesses2--;                                                //Decrement
			lblGuess2.setText(Guesses2.toString());                                       //Update display on screen
			
			
		}
		if(txtEasy3.isEnabled())                                                       //if textfield is enabled 
		{
			Guesses3--;                                                           //Decrement
			lblGuess3.setText(Guesses3.toString());                                         //Update display on screen 
			
		}
		
		if(txtModerate4.isEnabled())                                              //if textfield is enabled
		{
			Guesses4--;                                           //Decrement
			lblGuess4.setText(Guesses4.toString());                                        //Update display on screen                                       
			
		}
		
		if(txtModerate5.isEnabled())                                                 //if textfield is enabled                 
		{
			Guesses5--;                                                         //Decrement
			lblGuess5.setText(Guesses5.toString());                                       //Update display on screen               
			
		}
		
		if(txtDifficult6.isEnabled())                                              //if textfield is enabled       
		{
			Guesses6--;                                                          //Decrement
			lblGuess6.setText(Guesses6.toString());                                       //Update display on screen  
			
		}
		if(txtDifficult7.isEnabled())                                              //if textfield is enabled  
		{
			Guesses7--;                                            //Decrement
			lblGuess7.setText(Guesses7.toString());                                     //Update display on screen            
			
			
		}
		
	}
	
	public static void Gameover()
	{
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Gameover()
		//
		// Method parameters	:	none
		//
		// Method return		:	boolean
		//
		// Synopsis				:   This method checks whether any tracs have guesses equals to 0, which is a gameover
		//                          and displays a message on screen
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-05		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		                                                                                          //if level equals 1
			if(Guesses1 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			if(Guesses2 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			if(Guesses3 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
		
		if (Level.level==2) {                                                                              
			if(Guesses4 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
			if(Guesses5 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
		}
		if (Level.level==3) {                                                                                                                 
			if(Guesses4 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
			if(Guesses5 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
			if(Guesses6 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
			if(Guesses7 ==0 )                                                   //if any guess equals 0
			{
				JOptionPane.showMessageDialog(null, "YOU HAVE LOST!!");                                                //display message  
				 System.exit(-1);                                                                                        //exit the game
			}
			
		
		}
		
	}
}
