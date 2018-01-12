package observer;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterData testWaterData = new WaterData();
		DisplayDevice testDisplayDevice = new DisplayDevice(testWaterData);
		testWaterData.setWaterData(0, 1, 2);
		testWaterData.setWaterData(1, 2, 3);
	}

}
