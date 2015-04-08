package musicPlayer;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

public class PlaybackGUI{
	
	public static void main (String[] args) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		JFrame frame = new JFrame("CMP: Crist Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel brSTPane = new BrowseSortPane();
		
		
		frame.getContentPane().add(brSTPane);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
