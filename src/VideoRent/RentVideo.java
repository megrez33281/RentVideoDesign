package VideoRent;

import VideoRent.MovieTypes.OldMovie;

public class RentVideo {
	public static void main(String[] args) {
		//建立顧客物件
		Customer Ualn = new Customer("倫倫");
		Customer SixFlower = new Customer("六花醬");
		Customer Kon = new Customer("K昂");
		Customer SJY = new Customer("史家瑩");
		//建立電影物件
		Movie MyName = new Movie("我的名字", MovieType.NEW);
		Movie  KO = new Movie("K-O", MovieType.OLD);
		Movie Summer = new Movie("涼宮春日的", MovieType.OLD);
		Movie Given = new Movie("GIVEN", MovieType.CHILD);
		
		//建立片子物件
		Video MyNameVideo = new Video(MyName);
		Video KOVideo = new Video(KO);
		Video SummerVideo= new Video(Summer);
		Video GivenVideo = new Video(Given);
		
		//建立租片紀錄
		RentRecord CustomerRentRecord = new RentRecord();
		
		//顧客租借片子
		CustomerRentRecord.rentVideo(Ualn, GivenVideo, 8);
		CustomerRentRecord.rentVideo(Ualn, MyNameVideo, 7);
		CustomerRentRecord.rentVideo(SixFlower, MyNameVideo, 8);
		CustomerRentRecord.rentVideo(SixFlower, KOVideo, 7);
		CustomerRentRecord.rentVideo(SixFlower, SummerVideo, 8);
		CustomerRentRecord.rentVideo(Kon, KOVideo, 7);
		CustomerRentRecord.rentVideo(SJY, GivenVideo, 8);

		
		//查看顧客的租借紀錄
		Ualn.statement();
		SixFlower.statement();
		Kon.statement();
		SJY.statement();
		
		//2個月後......
		MyName.ChangeMovieType(new OldMovie());
		
	}
	
}
