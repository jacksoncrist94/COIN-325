package musicPlayer;

import java.io.File;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;


public class Track{
	private Media song;
	private File songfile;
	private MediaPlayer player;
	
	public Track(String filename){
		File mFile = new File(filename);
		Media mSong = new Media("C:/Users/Jackson Crist/COIN-325/CristMusicPlayer/src/musicPlayer/music/" + filename);
		MediaPlayer mPlayer = new MediaPlayer(mSong);
		song = mSong;
		songfile = mFile;
		player = mPlayer;
	}
	
	public String getArtist() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
			MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
			Tag tag = mp3file.getTag();
			ID3v1Tag v1tag = (ID3v1Tag) tag;
			return v1tag.getFirstArtist();
		
	}
	
	public String getTrackName() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
		Tag tag = mp3file.getTag();
		ID3v1Tag v1tag = (ID3v1Tag) tag;
		return v1tag.getFirstTitle();
		
	}
	
	public String getAlbumName() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
		Tag tag = mp3file.getTag();
		ID3v1Tag v1tag = (ID3v1Tag) tag;
		return v1tag.getFirstAlbum();
		
	}
	
	public void Play(){
		player.play();
	}
	
	public void Pause(){
		player.pause();
	}
	
}