package VideoRent;

public class RentVideo {
	public static void main(String[] args) {
		Customer Apirl = new Customer("C001", "April");
		Customer Joe = new Customer("C002", "Joe");
		Movie WonderWoman = new Movie("M001", "神力女超人", MovieType.OLD);
		Movie JusticeLeague = new Movie("M002", "正義聯盟", MovieType.NEW);
		Movie Thor5 = new Movie("M003", "雷神索爾5", MovieType.NEW);
		Video VideoWonderWoman1 = new Video("V001", WonderWoman);
		Video VideoWonderWoman2 = new Video("V002", WonderWoman);
		Video VideoJusticeLeague = new Video("V003", JusticeLeague);
		Video VideoThor5 = new Video("V004", Thor5);
		RentRecord CustomerRentRecord = new RentRecord();
		CustomerRentRecord.rentVideo(Apirl, VideoWonderWoman1, 3);
		CustomerRentRecord.rentVideo(Joe, VideoWonderWoman2, 2);
		CustomerRentRecord.rentVideo(Apirl, VideoJusticeLeague, 5);
		CustomerRentRecord.rentVideo(Joe, VideoThor5, 1);
		
		CustomerRentRecord.printStatement(Apirl);
		CustomerRentRecord.printStatement(Joe);
		
	}
	
}
