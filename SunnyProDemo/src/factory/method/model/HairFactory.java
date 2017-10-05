package factory.method.model;

import java.util.Map;

public class HairFactory {
	
	public static HairFactory getHairFactory(){
		return new HairFactory();
	}
	
	
	public HairInterface getHair(String key){
		if(key!=null)
			if(key.equals("left")){
				return new LeftHair();
			}else if(key.equals("right")){
				return new RightHair();
			}
		
		return null;
	}
	
	public HairInterface getHairByClass(String name){
		try {
			Map<String,String> map = new PropertiesReader().getProperties();
			
			
			HairInterface hair = (HairInterface) Class.forName(map.get(name)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
				}
	
}
