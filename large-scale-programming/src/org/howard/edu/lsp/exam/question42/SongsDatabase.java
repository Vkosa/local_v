package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * public class called SongsDatabase
 * Keeps track of the genre and song titles
 * @author esther.lisanza
 *
 */

public class SongsDatabase {

	/**
	 * this code initializes the HashMap
	 */
    private Map<String,Set<String>>genreMap = new HashMap<String,Set<String>>();
    
    
    /**
     * this function adds the song titles
     * @param genre
     * @param songTitle
     */
    public void addSong(String genre,String songTitle){
        
        /**
         * obtains the set of songs if it is there in the map 
         * If the song is not in the map, the code initializes it with a new HashSet since set is an abstract class 
         */
        Set<String> songs = genreMap.getOrDefault(genre,new HashSet<String>());
        
        /**
         * adds a song title into the set
         */
        songs.add(songTitle);
        
        /**
         * inserts the new song into the map
         */
        genreMap.put(genre,songs);
        System.out.println("Song " + songTitle + " has been added into " + genre);
    }
    public Set<String> getSongs(String genre){
        
        /**
         * obtains the set of songs if it is there in the map 
         * If the song is not in the map, the code initializes it with a new HashSet since Set is an abstract class 
         */
        return genreMap.getOrDefault(genre,new HashSet<String>());
    }
   /**
    * returns the genre, given a song title
    * @param songTitle
    * @return
    */
    public String getGenreOfSong(String songTitle){
       String result = "";
       
       /**
        * for loop that goes over each genre and their songTtitle
        * Returns the genre 
        */
        for(String genre : genreMap.keySet()){
            if(genreMap.get(genre).contains(songTitle)){
                result =  genre;
                break;
            }
        }
        return result;
    }
public Object getName() {
	// TODO Auto-generated method stub
	return null;
}

}
