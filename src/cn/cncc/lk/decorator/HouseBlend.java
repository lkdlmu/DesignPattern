package cn.cncc.lk.decorator;

// HouseBlend 全家桶
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
