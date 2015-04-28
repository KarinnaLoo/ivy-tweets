
import java.util.ArrayList;
import java.util.HashMap;

public class Campus {
	String name; 
	int numberOfTweets;  
	HashMap<String, Integer> mostPopularHashtags; 
	ArrayList<Tweet> campusTweets = new ArrayList<Tweet>(); 
	double latitude; 
	double longitude; 

	public Campus(String name, double latitude, double longitude) {
		this.name = name; 
		this.latitude = latitude; 
		this.longitude = longitude; 
		numberOfTweets = 0; 
		mostPopularHashtags = new HashMap<String, Integer>();  
	}
	
	public void addTweetToCampus(Tweet t) {
		campusTweets.add(t); 
	}
	
	
}
