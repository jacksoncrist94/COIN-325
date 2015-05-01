package com.example.jacksoncrist.cristmusicplayerandroid;

/**
 * Created by Jackson Crist on 4/30/2015.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

//import org.jaudiotagger.tag.Tag;
//import org.jaudiotagger.tag.id3.ID3v24Frames;
//import javafx.application.Application;
//import javafx.stage.Stage;

public class TrackList {
    LinkedList<Track> tracklist = new LinkedList<Track>();


    public TrackList() throws FileNotFoundException{

        File folder = new File("C:/Users/Jackson Crist/COIN-325/CristMusicPlayer/src/musicPlayer/music");


        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {

                tracklist.add(new Track(file.getName()));


            }
        }

    }




    public Track get(int index){
        return tracklist.get(index);
    }

    public Track getLast(){
        return tracklist.getLast();
    }
}
