public class Video {
	String videoName;
	boolean checkout;
	int rating;
	Video(String name){
		this.videoName=name;
	}
	
	String getName() {
		return videoName;
	}
	void doCheckout(){
		this.checkout=true;
	}
	void doReturn(){
		this.checkout=false;
	}
	void receiveRating(int rating) {
		this.rating=rating;
	}
	int getRating() {
		return rating;
	}
	boolean getCheckout() {
		return checkout;
	}
	
}
