package com.spring.mvc.test.bean.Default;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

/**
 * Created by wp41128 on 2018/5/28.
 */
public class XMLBeanReader extends DefaultBeanDefinitionDocumentReader {

	@Override
	protected void preProcessXml(Element root) {
		super.preProcessXml(root);
	}

	@Override
	protected void postProcessXml(Element root) {
		super.postProcessXml(root);
	}
}
