package com.caozl.util;

import org.aspectj.lang.JoinPoint;

/**
 * Function:拦截器方法
 *
 * @author caozl
 * @since JDK 1.7
 */
public class DataSourceExchange {

    /**
     * @param point
     */
    public void before(JoinPoint point) {

        //获取目标对象的类类型
        Class<?> aClass = point.getTarget().getClass();

        //获取包名用于区分不同数据源
        String whichDataSource = aClass.getName().substring(18, aClass.getName().lastIndexOf("."));
        if ("datasource1".equals(whichDataSource)) {
            DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
        } else {
            DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
        }

    }


    /**
     * 执行后将数据源置为空
     */
    public void after() {
        DataSourceHolder.setDataSources(null);
    }

}
