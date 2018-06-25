package com.spring.mvc.test.bean.Default;

/**
 * Created by wp41128 on 2018/5/28.
 */
public class Property {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + "]";
	}
}
