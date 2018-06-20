package com.spring.mvc.test.bean;

/**
 * Created by wp41128 on 2018/5/28.
 */
public class ConStructor {
	public ConStructor(String name,String text) {
		this.name=name;
		this.text=text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String name;
	private String text;
}
