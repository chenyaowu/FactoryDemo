package chouxiang.factory.model;

public class HNFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new HNBoy();
	}

	@Override
	public Gril getGirl() {
		// TODO Auto-generated method stub
		return new HNGril();
	}

}
