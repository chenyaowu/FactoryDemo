package factory.method.model;

import chouxiang.factory.model.MCFactory;
import chouxiang.factory.model.PersonFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
	
		HairFactory factory = HairFactory.getHairFactory();
		HairInterface left = factory.getHairByClass("in");
		left.draw();
		
		PersonFactory personFacoty = new MCFactory();
		personFacoty.getBoy().drawBoy();;
	}

}
