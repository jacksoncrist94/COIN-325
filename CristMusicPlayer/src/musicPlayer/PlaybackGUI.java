package musicPlayer;

import java.io.IOException;
//import java.util.concurrent.CountDownLatch;

//import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.SwingUtilities;

import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

public class PlaybackGUI{
	
	public static void main (String[] args) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException, InterruptedException{
//		final CountDownLatch latch = new CountDownLatch(1);
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				new JFXPanel();
//				latch.countDown();
//			}
//		});
//		latch.await();
		
		
		
		JFrame frame = new JFrame("CMP: Crist Music Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		final JFXPanel brSTPane = new BrowseSortPane();
		
		
		frame.getContentPane().add(brSTPane);
		
		frame.pack();
		frame.setVisible(true);
		
		 
	}
	
}
