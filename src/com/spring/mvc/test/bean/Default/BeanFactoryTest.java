package com.spring.mvc.test.bean.Default;

import com.spring.mvc.test.bean.Custome.CustomerUser;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



/**
 * Created by wp41128 on 2018/4/26.
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public String testSimpleload(){
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("../test/bean/beans.xml"));
		// #1 简单配置
		//MyTestBean bean=(MyTestBean)bf.getBean("myTestBean");
		//return bean.getTeststr();
		// #2
		//GetBeanTest bean2=(GetBeanTest)bf.getBean("getBeanTest");
		//return bean2.showMe();
		//#3
		//TestChangeMethod bean3=(TestChangeMethod)bf.getBean("testChangeMethod");
		//return bean3.changeMe();
		//#4
		//ConStructor bean4=(ConStructor)bf.getBean("con");
		//return bean4.getName()+bean4.getText();
		//CarFactoryBean car=(CarFactoryBean)bf.getBean("&car");
		//return car.getCarInfo();
		//#5
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("../test/bean/customerbeans.xml"));
		CustomerUser customer=(CustomerUser)bf.getBean("customerbean");
		return  customer.getUserName()+customer.getEmail();
	}
}
