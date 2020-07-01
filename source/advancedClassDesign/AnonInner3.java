package advancedClassDesign;

public class AnonInner3 {
	
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int pay() {
		return admission(5, new SaleTodayOnly() { // anonymous Inner Class
			
			@Override
			public int dollarsOff() {
				// TODO Auto-generated method stub
				return 3;
			}
		});
	}
	
	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}

}
