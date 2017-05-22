package cn.cncc.lk.jdkobserver;

/**
 * Head First 设计模式 
 * 使用jdk类实现观察者模式
 * 1. 被观察者继承Observable类
 * 2. 观察者实现Observer接口
 * 
 * */

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
