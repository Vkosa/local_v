package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import com.sun.tools.javac.util.List;

class SongsDatabaseTest {
	
	@Test
	@DisplayName ("test case for adding song ")
	void test() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Flawless");
		db.addSong("Jazz", "Relax");
		db.addSong("Jazz", "Always");

		assertEquals(db.getSongs("Rap").toString(), "[Savage, Flawless]");
	
	} 
	
	
		//SongsDatabase db = new SongsDatabase();
		//db.addSong("Rap", "What a time to be Alive");
		
		
		//assertEquals(db.getSongs("Rap").toString(), "[What a time to be Alive]");
	
	
	   

	 
		//}
}

