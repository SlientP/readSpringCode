package com.spring.mvc.test.bean.Default;

/**
 * Created by wp41128 on 2018/5/28.
 */
public abstract class GetBeanTest {
	public String showMe(){
		return this.getBean().showMe();
	}
	public abstract User getBean();
}
