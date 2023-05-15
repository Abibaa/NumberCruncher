import java.awt.*;
import javax.swing.*;

public class SplashScreen extends JWindow {
   
	//declaring variables
	Image splashScreen;
   ImageIcon imageIcon;
   public static String playerinput;                                     //creating an array of characters
   /**
    * @wbp.nonvisual location=-377,18
    */
   //private static boolean filefound = true;
   //private final JProgressBar progressBar = new JProgressBar();
   public static int design = 1;                                                     //Instantiating a variable                
   //static JProgressBar progressBar=new JProgressBar();//Creating an object of JProgressBar
 
   public SplashScreen() {
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	// Method				:	SplashScreen()
	//
	// Method parameters	:	none
	//
	// Method return		:	none
	//
	// Synopsis				:   This is the construct								
	//
	// Modifications		:
	//							Date			Developer				Notes
	//							----			---------				-----
	//							2022-05-31		N.P. Lorrick		 Initial setup
	//
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	   
      splashScreen = Toolkit.getDefaultToolkit().getImage("Images/B1.png"); 
     
      imageIcon = new ImageIcon(splashScreen);                                               // Create ImageIcon from Image
      
      setSize(imageIcon.getIconWidth(),imageIcon.getIconHeight());                          // Set JWindow size from image size
     
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();                      // Get current screen size
      
      int x = (screenSize.width-getSize().width)/2;                            // Get x coordinate on screen for make JWindow locate at center
    
      int y = (screenSize.height-getSize().height)/2;                            // Get y coordinate on screen for make JWindow locate at center
   
      setLocation(x,y);                                                             // Set new location for JWindow
      
      
      // Make JWindow visible
      setVisible(true);
   }
   // Paint image onto JWindow
   public void paint(Graphics g) {
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	// Method				:	paint()
	//
	// Method parameters	:	Graphics g
	//
	// Method return		:	void
	//
	// Synopsis				:   This method prompts displays a graphic									
	//
	// Modifications		:
	//							Date			Developer				Notes
	//							----			---------				-----
	//							2022-05-31		N.P. Lorrick		 Initial setup
	//
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
      super.paint(g);                                        //paints
      
      g.drawImage(splashScreen, 0, 0, this);                   //draws
      //g.draw (progressBar, 0, 0, this);
     
   }
   public static void main(String[]args) {
      SplashScreen splash = new SplashScreen();
      try {
         // Make JWindow appear for 2 seconds before disappear
         Thread.sleep(2000);
         splash.dispose();
         //addProgressBar();
         //calling a method
         Initials();
         
         boolean filefound;                                              //declaring variable
         filefound = Save.LoadGame(playerinput);                                  //Instantiating variable   
         if(filefound)                                                           //If true
         {
        	 NumberCruncher.main(args);                                                  //call method
         }
         else {                                                                       //If false
         Level.main(args);                                                      //call method
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   
	
   public static  String Initials() {
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
			// Method				:	Initials()
			//
			// Method parameters	:	none
			//
			// Method return		:	char []
			//
			// Synopsis				:   This method prompts the user to enter his initials
			//							and checks whether the value entered is a Letter
			//							
			//
			// Modifications		:
			//							Date			Developer				Notes
			//							----			---------				-----
			//							2022-05-31		N.P. Lorrick		 Initial setup
			//
			// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	 
	                                            
	   String input = "";                                                                 //declaring and initializing local variable
	   
		  
		   while(!input.matches("^[a-zA-Z]+$") || !check(input))                            //loops while the player's initial is not a letter or the method check is false
	   {
				   
				  
					   input = JOptionPane.showInputDialog("Please enter a 3 letter initial");        //Prompts the user to input
				   
		 
		   
	   }
		    
	   playerinput = input;                                                            // Convert the string into a character array 
	   //System.out.println(playerinput);
		 
		    //}
		   return playerinput;                                                 //return player's input

   }
   
   public static boolean check(String s) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
				// Method				:	check()
				//
				// Method parameters	:	char[] and String
				//
				// Method return		:	boolean
				//
				// Synopsis				:   This method checks whether the length an array is 
				//							the same as that of a String
				//							
				//
				// Modifications		:
				//							Date			Developer				Notes
				//							----			---------				-----
				//							2022-05-31		N.P. Lorrick		 Initial setup
				//
				// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
   
   if( s.length() == 3)                            
   {
	   return true;                                              // returns true
   }
   else
   {
	   return false;                  //returns false
   }
   }
   
   
   
   
}
