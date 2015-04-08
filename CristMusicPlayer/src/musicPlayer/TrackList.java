package musicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrackList{
	
	Node head, tail;
	
	public TrackList() throws FileNotFoundException{
		
		File file = new File("C:/Users/Jackson Crist/COIN-325/CristMusicPlayer/src/musicPlayer/music");
		Scanner scan = new Scanner(file);
		scan.next();
		
		while(scan.hasNext()){
				
			Node node = new Node();
			node.value = new Track(scan.next());
			
			
			if (head == null && tail == null){
				node.next = null;
				head = tail = node;
			} else {
				// We assume both head and tail are not null.
				if (head != null && tail != null){
					node.next = null;
					tail.next = node;
					tail = node;
				} else {
					System.err.println("Invalid state only one is null: head, tail");
				}
			}
			
			
			
		}
		
		scan.close();
	}
	
	public Track get(int index){
		Node here = new Node();
		here = head;
		for(int i = 1; i < index; i++){	
			here = here.next;
		}
		return here.value;
	}
	
	class Node{
		Track value;
		Node next;
	}
	
}

