package musicPlayer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;


import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

@SuppressWarnings("serial")
public class BrowseSortPane extends JPanel{
	
	private JButton t1, t2, t3, t4, t5, t6, t7;
	
	TrackList tracklist = new TrackList();
	Track[] trackArray = new Track[7];
	private int listPosition = 1;
	
	public BrowseSortPane() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		TrackButtonListener listener = new TrackButtonListener();
		UpButtonListener up = new UpButtonListener();
		DownButtonListener down = new DownButtonListener();
		
		for(int i = 0; i < 7; i++){
			trackArray[i] = tracklist.get(i + listPosition); 
		}
		
		this.setLayout(new BorderLayout());
		
		JPanel scrollPane = new JPanel();
		
		scrollPane.setLayout(new BoxLayout(scrollPane, BoxLayout.PAGE_AXIS));
		JButton upArrow = new JButton("Scroll Up");
		JButton downArrow = new JButton("Scroll Down");
		
		upArrow.addActionListener(up);
		downArrow.addActionListener(down);
		
		scrollPane.add(upArrow);
		scrollPane.add(downArrow);
		
		JPanel trackPane = new JPanel();
		
		trackPane.setLayout(new BoxLayout(trackPane, BoxLayout.Y_AXIS));
		
		t1 = new JButton(trackArray[0].getArtist() + " - " + trackArray[0].getTrackName());
		t2 = new JButton(trackArray[1].getArtist() + " - " + trackArray[1].getTrackName());
		t3 = new JButton(trackArray[2].getArtist() + " - " + trackArray[2].getTrackName());
		t4 = new JButton(trackArray[3].getArtist() + " - " + trackArray[3].getTrackName());
		t5 = new JButton(trackArray[4].getArtist() + " - " + trackArray[4].getTrackName());
		t6 = new JButton(trackArray[5].getArtist() + " - " + trackArray[5].getTrackName());
		t7 = new JButton(trackArray[6].getArtist() + " - " + trackArray[6].getTrackName());
		
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
		
		JPanel sortPane = new JPanel();
		
		sortPane.setLayout(new BoxLayout(sortPane, BoxLayout.X_AXIS));
		
		
		
		
	}
	
	private class TrackButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == t1){
				trackArray[0].Play();
			}
			if(e.getSource() == t2){
				trackArray[1].Play();
			}
			if(e.getSource() == t3){
				trackArray[2].Play();
			}
			if(e.getSource() == t4){
				trackArray[3].Play();
			}
			if(e.getSource() == t5){
				trackArray[4].Play();
			}
			if(e.getSource() == t6){
				trackArray[5].Play();
			}
			if(e.getSource() == t7){
				trackArray[6].Play();
			}
			
		}
		
	}
	
	private class UpButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(listPosition > 1){
				listPosition--;
				
				for(int i = 0; i < 7; i++){
					trackArray[i] = tracklist.get(i + listPosition); 
				}
				
				t1.repaint();
				t2.repaint();
				t3.repaint();
				t4.repaint();
				t5.repaint();
				t6.repaint();
				t7.repaint();
			}
			
		}
		
	}
	
	private class DownButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(trackArray[7] != tracklist.tail.value){
				listPosition--;
								
				for(int i = 0; i < 7; i++){
					trackArray[i] = tracklist.get(i + listPosition); 
				}
				
				t1.repaint();
				t2.repaint();
				t3.repaint();
				t4.repaint();
				t5.repaint();
				t6.repaint();
				t7.repaint();
			}
			
		}
		
	}
	
}