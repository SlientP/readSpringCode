package com.spring.mvc.test.bean.Custome;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by Administrator on 2018/6/25 0025.
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {


    @Override
    protected Class<?> getBeanClass(Element element) {
        return CustomerUser.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName=element.getAttribute("userName");
        String email=element.getAttribute("email");
        if(StringUtils.hasText((userName))){
            builder.addPropertyValue("userName",userName);
        }
        if(StringUtils.hasText((email))){
            builder.addPropertyValue("email",email);
        }
    }
}
