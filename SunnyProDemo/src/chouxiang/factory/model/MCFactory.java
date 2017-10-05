package chouxiang.factory.model;

public class MCFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	@Override
	public Gril getGirl() {
		// TODO Auto-generated method stub
		return new MCGril();
	}

}
