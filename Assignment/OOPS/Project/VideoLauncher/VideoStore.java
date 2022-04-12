public class VideoStore {
	static Video[] store=new Video[100];
	static int i=0;
	void addVideo(String name) {
		Video v=new Video(name);
		store[i]=v;
		i++;
	}
	void doCheckout(String name) {
		for(int j=0;j<i;j++) {
			if(store[j].getName().equals(name)){
				store[j].doCheckout();
				break;
			}
		}
	}
	void doReturn(String name) {
		for(int j=0;j<i;j++) {
			if(store[j].getName().equals(name)){
				store[j].doReturn();
				break;
			}
		}
	}
		void receiveRating(String name,int rating) {
		for(int j=0;j<i;j++) {
			if(store[j].getName().equals(name)){
				store[j].receiveRating(rating);
				break;
			}
		}
	}
	void listInventory() {
		for(int j=0;j<i;j++) {
			System.out.println(store[j].getName()+"\t\t|\t"+store[j].getCheckout()+"\t\t|\t"+store[j].getRating());
		}
			
		}
	}
	

