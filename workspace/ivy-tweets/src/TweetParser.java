import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TweetParser {
	static ArrayList<Tweet> tweets = new ArrayList<Tweet>();

	public ArrayList<Tweet> readTweets(String filename) {
		try {
			BufferedReader tweetReader = new BufferedReader(new FileReader(
					filename));
			String line = "";
			// structure of data is: latitude, longitude, separator, collector,
			// separator, date, separator, content
			while ((line = tweetReader.readLine()) != null) {
				String[] elements = line.split("\t");
				String[] coordinates = elements[0].split(",");
				double latitude = Double.parseDouble(coordinates[0].replace(
						"[", ""));
				double longitude = Double.parseDouble(coordinates[1].replace(
						"]", ""));
				String content = "";
				content = elements[3];
				// constructing the tweet adds to all hashmaps
				Tweet newTweet = new Tweet(latitude, longitude, content);
				tweets.add(newTweet);
			}
			tweetReader.close();
		} catch (FileNotFoundException e) {
			System.exit(0);
		} catch (IOException e) {
			System.exit(0);
		}
		return tweets; 
	}

}
