import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Save {
	
	public void SaveGame() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	SaveGame()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method writes the players information in a file and saves it 									
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		ObjectOutputStream Out= null;                                                   //initializing local variable
		
		try {
			
			//creating instances of
			FileOutputStream file_Out = new FileOutputStream(SplashScreen.playerinput + "Save.dat");
			Out = new ObjectOutputStream(file_Out);
			
			//writing out information on the files 
			Out.writeObject(SplashScreen.playerinput);
			Out.writeObject(Level.level);
			Out.writeObject(NumberCruncher.range);
			Out.writeObject(NumberCruncher.round);
			Out.writeObject(NumberCruncher.score);
			Out.writeObject(NumberCruncher.Guesses1);
			Out.writeObject(NumberCruncher.Guesses2);
			Out.writeObject(NumberCruncher.Guesses3);
			Out.writeObject(NumberCruncher.Guesses4);
			Out.writeObject(NumberCruncher.Guesses5);
			Out.writeObject(NumberCruncher.Guesses6);
			Out.writeObject(NumberCruncher.Guesses7);
			
			
		}
		
		catch(IOException e){
			JOptionPane.showMessageDialog(null,"Can't save  your game");                           //displays this message in case the file can't be save
		}
		finally {
			try {
				
				Out.close();                                                               //Closes the file after writing in it
			}
			catch(IOException e){
				JOptionPane.showMessageDialog(null,"Can't save  your game");                             //displays this message in case the file can't be save
			}
		}
	}
	
	public static boolean LoadGame(String playerInitials)  {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	LoadGame()
		//
		// Method parameters	:	String
		//
		// Method return		:	boolean
		//
		// Synopsis				:   This method reads files and load them									
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-06-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		try {
			
			 //creating an objects
			FileInputStream file_Input = new FileInputStream(playerInitials + "Save.dat");           
			ObjectInputStream In= new ObjectInputStream(file_Input);                 
			
			//reading information from the files
			SplashScreen.playerinput= (String)In.readObject();
			Level.level= (Integer)In.readObject();
			NumberCruncher.range = (Integer)In.readObject();
			NumberCruncher.round = (Integer)In.readObject();
			NumberCruncher.score= (Integer)In.readObject();
			NumberCruncher.Guesses1= (Integer)In.readObject();
			NumberCruncher.Guesses2= (Integer)In.readObject();
			NumberCruncher.Guesses3= (Integer)In.readObject();
			NumberCruncher.Guesses4= (Integer)In.readObject();
			NumberCruncher.Guesses5= (Integer)In.readObject();
			NumberCruncher.Guesses6= (Integer)In.readObject();
			NumberCruncher.Guesses7= (Integer)In.readObject();
			
		}
		catch(IOException e)
		{
			return false;                                                       //returns false if file is not found
		}
		catch(ClassNotFoundException e)
		{
			return false;                                                                  //returns false if file is not found
		}
		
		return true;                                                       //returns true if file is found
	}

}
