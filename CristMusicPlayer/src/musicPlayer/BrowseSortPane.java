package musicPlayer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
//import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

import javafx.embed.swing.JFXPanel;


import javafx.scene.media.MediaPlayer;

import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

@SuppressWarnings("serial")
public class BrowseSortPane extends JFXPanel{
	private MediaPlayer player;
	
	JPanel trackPane;
	
	private Boolean isPlaying = new Boolean(false);
	
	private JButton t1, t2, t3, t4, t5, t6, t7;
	private JLabel nowPlaying;
	
	TrackList tracklist = new TrackList();
	Track[] trackArray = new Track[7];
	private int listPosition = 0;
	
	public BrowseSortPane() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		TrackButtonListener listener = new TrackButtonListener();
		UpButtonListener up = new UpButtonListener();
		DownButtonListener down = new DownButtonListener();
		playPauseListener pp = new playPauseListener();
		
		for(int i = 0; i < 7; i++){
			trackArray[i] = tracklist.get(i + listPosition); 
		}
		
		player = new MediaPlayer(trackArray[0].getSong());
				
		this.setLayout(new BorderLayout());
		
		JPanel scrollPane = new JPanel();
		
		scrollPane.setLayout(new BoxLayout(scrollPane, BoxLayout.X_AXIS));
		
		JButton upArrow = new JButton("Scroll Up");
		JButton downArrow = new JButton("Scroll Down");
		
		JButton playPauseButton = new JButton("Play/Pause");
		
		upArrow.addActionListener(up);
		downArrow.addActionListener(down);
		
		playPauseButton.addActionListener(pp);
		
		scrollPane.add(upArrow);
		scrollPane.add(playPauseButton);
		scrollPane.add(downArrow);
		
		trackPane = new JPanel();
		
		trackPane.setLayout(new BoxLayout(trackPane, BoxLayout.Y_AXIS));
		
		t1 = new JButton(trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
		t2 = new JButton(trackArray[1].getArtist() + " - " + trackArray[1].getTrackName());
		t3 = new JButton(trackArray[2].getArtist() + " - " + trackArray[2].getTrackName());
		t4 = new JButton(trackArray[3].getArtist() + " - " + trackArray[3].getTrackName());
		t5 = new JButton(trackArray[4].getArtist() + " - " + trackArray[4].getTrackName());
		t6 = new JButton(trackArray[5].getArtist() + " - " + trackArray[5].getTrackName());
		t7 = new JButton(trackArray[6].getArtist() + " - " + trackArray[6].getTrackName());
		
		Dimension buttonSize = new Dimension();
		buttonSize.setSize(new Integer(300), new Integer(20));
		
		trackPane.setMaximumSize(buttonSize);
		
		t1.setMaximumSize(buttonSize);
		t2.setMaximumSize(buttonSize);
		t3.setMaximumSize(buttonSize);
		t4.setMaximumSize(buttonSize);
		t5.setMaximumSize(buttonSize);
		t6.setMaximumSize(buttonSize);
		t7.setMaximumSize(buttonSize);
		
		t1.addActionListener(listener);
		t2.addActionListener(listener);
		t3.addActionListener(listener);
		t4.addActionListener(listener);
		t5.addActionListener(listener);
		t6.addActionListener(listener);
		t7.addActionListener(listener);
		
		trackPane.add(t1);
		trackPane.add(t2);
		trackPane.add(t3);
		trackPane.add(t4);
		trackPane.add(t5);
		trackPane.add(t6);
		trackPane.add(t7);
		
		nowPlaying = new JLabel("Now Playing: " + trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
		
		this.add(trackPane, BorderLayout.NORTH);
		this.add(scrollPane, BorderLayout.SOUTH);
		this.add(nowPlaying, BorderLayout.CENTER);
		
		trackPane.setBackground(Color.CYAN);
		scrollPane.setBackground(Color.CYAN);
		nowPlaying.setBackground(Color.CYAN);
		
		this.setBackground(Color.CYAN);
		
		this.setVisible(true);
		
		
	}
	
	private class TrackButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
			if(e.getSource() == t1){
				player.stop();
				player = new MediaPlayer(trackArray[0].getSong());
				trackArray[0].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
			}
			if(e.getSource() == t2){
				player.stop();
				player = new MediaPlayer(trackArray[1].getSong());
				trackArray[1].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[1].getArtist() + " - " + trackArray[1].getTrackName());
			}
			if(e.getSource() == t3){
				player.stop();
				player = new MediaPlayer(trackArray[2].getSong());
				trackArray[2].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[2].getArtist() + " - " + trackArray[2].getTrackName());
			}
			if(e.getSource() == t4){
				player.stop();
				player = new MediaPlayer(trackArray[3].getSong());
				trackArray[3].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[3].getArtist() + " - " + trackArray[3].getTrackName());
			}
			if(e.getSource() == t5){
				player.stop();
				player = new MediaPlayer(trackArray[4].getSong());
				trackArray[4].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[4].getArtist() + " - " + trackArray[4].getTrackName());
			}
			if(e.getSource() == t6){
				player.stop();
				player = new MediaPlayer(trackArray[5].getSong());
				trackArray[5].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[5].getArtist() + " - " + trackArray[5].getTrackName());
			}
			if(e.getSource() == t7){
				player.stop();
				player = new MediaPlayer(trackArray[6].getSong());
				trackArray[6].Play(player);
				isPlaying = true;
				nowPlaying.setText("Now Playing: " + trackArray[6].getArtist() + " - " + trackArray[6].getTrackName());
			}
			
			} catch (CannotReadException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			} catch (TagException e1) {
				
				e1.printStackTrace();
			} catch (ReadOnlyFileException e1) {
				
				e1.printStackTrace();
			} catch (InvalidAudioFrameException e1) {
				
				e1.printStackTrace();
			}
			
		}
		
	}
	
	private class UpButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(listPosition > 0){
				listPosition--;
				
				for(int i = 0; i < 7; i++){
					trackArray[i] = tracklist.get(i + listPosition); 
				}
				
				try {
					t1.setText(trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
					t2.setText(trackArray[1].getArtist() + " - " + trackArray[1].getTrackName());
					t3.setText(trackArray[2].getArtist() + " - " + trackArray[2].getTrackName());
					t4.setText(trackArray[3].getArtist() + " - " + trackArray[3].getTrackName());
					t5.setText(trackArray[4].getArtist() + " - " + trackArray[4].getTrackName());
					t6.setText(trackArray[5].getArtist() + " - " + trackArray[5].getTrackName());
					t7.setText(trackArray[6].getArtist() + " - " + trackArray[6].getTrackName());
				} catch (CannotReadException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} catch (TagException e1) {
					
					e1.printStackTrace();
				} catch (ReadOnlyFileException e1) {
					
					e1.printStackTrace();
				} catch (InvalidAudioFrameException e1) {
					
					e1.printStackTrace();
				}
				
				t1.repaint();
				t2.repaint();
				t3.repaint();
				t4.repaint();
				t5.repaint();
				t6.repaint();
				t7.repaint();
				
				
				BrowseSortPane.this.trackPane.repaint();
				BrowseSortPane.this.repaint();
				
			}
			
		}
		
	}
	
	private class DownButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!(trackArray[6].equals( tracklist.getLast()))){
				listPosition++;
								
				for(int i = 0; i < 7; i++){
					trackArray[i] = tracklist.get(i + listPosition); 
				}
				
				try {
					t1.setText(trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
					t2.setText(trackArray[1].getArtist() + " - " + trackArray[1].getTrackName());
					t3.setText(trackArray[2].getArtist() + " - " + trackArray[2].getTrackName());
					t4.setText(trackArray[3].getArtist() + " - " + trackArray[3].getTrackName());
					t5.setText(trackArray[4].getArtist() + " - " + trackArray[4].getTrackName());
					t6.setText(trackArray[5].getArtist() + " - " + trackArray[5].getTrackName());
					t7.setText(trackArray[6].getArtist() + " - " + trackArray[6].getTrackName());
				} catch (CannotReadException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} catch (TagException e1) {
					
					e1.printStackTrace();
				} catch (ReadOnlyFileException e1) {
					
					e1.printStackTrace();
				} catch (InvalidAudioFrameException e1) {
					
					e1.printStackTrace();
				}
				
				t1.repaint();
				t2.repaint();
				t3.repaint();
				t4.repaint();
				t5.repaint();
				t6.repaint();
				t7.repaint();
				
				BrowseSortPane.this.trackPane.repaint();
				BrowseSortPane.this.repaint();
				
			}
			
		}
		
	}
	
	private class playPauseListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(isPlaying && !(player.getCurrentTime().equals(player.getStopTime()))){
			player.pause();
			isPlaying = false;
			return;
		}
		if(isPlaying && (player.getCurrentTime().equals(player.getStopTime()))){
			player.play();
			return;
		}
		if(!isPlaying){
			player.play();
			isPlaying = true;
			return;
		}
	}
	}
}