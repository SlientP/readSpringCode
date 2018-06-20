package com.spring.mvc.test.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by wp41128 on 2018/6/20.
 */
public class CarFactoryBean implements FactoryBean<Car>{
	public String getCarInfo() {
		return this.carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	private String carInfo;

	@Override
	public Car getObject() throws Exception {
		Car car=new Car();
		String[] infos=carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return  car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
