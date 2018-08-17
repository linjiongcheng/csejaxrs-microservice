package com.service.csejaxrs;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

public class CsejaxrsApplication {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init(BeanUtils.DEFAULT_BEAN_RESOURCE, "classpath*:META-INF/spring/*.server.xml");
    }
}
