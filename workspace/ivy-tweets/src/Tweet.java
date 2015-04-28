public class Tweet {
	String university;
	Double latitude;
	Double longitude;
	String content;
	public Campus Campus;

	public Tweet(double latitude, double longitude, String content) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.content = content;
	}
}
