package musicPlayer;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
//import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v1Tag;


//import org.jaudiotagger.tag.id3.ID3v24Frames;


//import javafx.application.Application;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
//import javafx.stage.Stage;


public class Track{
	private Media song;
	private File songfile;
	//private MediaPlayer player;
	
	public Track(String filename){
		File mFile = new File("C:/Users/Jackson Crist/COIN-325/CristMusicPlayer/src/musicPlayer/music/" + filename);
		URI u = mFile.toURI();
		Media mSong = new Media(u.toString());
		//MediaPlayer mPlayer = new MediaPlayer(mSong);
		song = mSong;
		songfile = mFile;
		//player = mPlayer;
	}
	
	public String getArtist() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
			MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
			
			if (mp3file.hasID3v1Tag()){
				ID3v1Tag v1tag = mp3file.getID3v1Tag();
				return v1tag.getFirstArtist();
			}else{
				AbstractID3v2Tag v2tag = mp3file.getID3v2Tag();
				return v2tag.getFirst(FieldKey.ARTIST);
			}
			
	}
	
	public String getTrackName() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
		
		if (mp3file.hasID3v1Tag()){
			ID3v1Tag v1tag = mp3file.getID3v1Tag();
			return v1tag.getFirstTitle();
		}else{
			AbstractID3v2Tag v2tag = mp3file.getID3v2Tag();
			return v2tag.getFirst(FieldKey.TITLE);
		}
		
	}
	
	public String getAlbumName() throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		
		MP3File mp3file = (MP3File) AudioFileIO.read(songfile);
		
		if (mp3file.hasID3v1Tag()){
			ID3v1Tag v1tag = mp3file.getID3v1Tag();
			return v1tag.getFirstAlbum();
		}else{
			AbstractID3v2Tag v2tag = mp3file.getID3v2Tag();
			return v2tag.getFirst(FieldKey.ALBUM);
		}
		
	}
	
	public void Play(MediaPlayer player){
		player.play();
	}
	
	public void Pause(MediaPlayer player){
		player.pause();
	}
	
	public void Stop(MediaPlayer player){
		player.stop();
	}
	
	public Media getSong(){
		return song;
	}
}