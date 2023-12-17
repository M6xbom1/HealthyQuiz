import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;	

public class BGmusic{
	public void bgmusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		File file = new File("/Sound/BGM.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip sound = AudioSystem.getClip();
		sound.open(audioStream);
		FloatControl gainControl = 
    		(FloatControl) sound.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-25.0f);

		sound.start();
		sound.loop(Clip.LOOP_CONTINUOUSLY);
	}
}