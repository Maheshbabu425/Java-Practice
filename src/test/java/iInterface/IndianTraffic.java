package iInterface;

public class IndianTraffic implements CentralTraffic, ContinentalTraffic {

	
	
	
	
	public void walking()
	{
		System.out.println("Walking");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic ct = new IndianTraffic();
		ct.greenGo();
		ct.redStop();
		ct.FlashYellow();
		IndianTraffic it = new IndianTraffic();
		it.walking();
		ContinentalTraffic c= new IndianTraffic();
		c.trainTraffic();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go");
	}
	


	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Slow");
	}



	@Override
	public void trainTraffic() {
		// TODO Auto-generated method stub
		System.out.println("Train Route");
	}

}
