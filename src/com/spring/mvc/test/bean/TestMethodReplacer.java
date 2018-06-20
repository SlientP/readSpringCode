package com.spring.mvc.test.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by wp41128 on 2018/5/28.
 */
public class TestMethodReplacer implements MethodReplacer {


	@Override
	public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
		return "我替换了原有方法";
	}
}
