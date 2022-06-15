package Game;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class playSound {
	public void playsound(String soundName)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName));
	    Clip clip = AudioSystem.getClip();
	    clip.open(audioInputStream);
	    FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	    gainControl.setValue(-15.0f);
	    clip.start();

	   }
	   catch(Exception e)
	   {
	     System.out.println("Error with playing sound.");
	     e.printStackTrace();
	   }
	 }
}