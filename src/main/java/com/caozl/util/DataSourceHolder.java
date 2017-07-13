package com.caozl.util;

/**
 * Function:动态数据源
 *
 * @author caozl
 * @since JDK 1.7
 */
public class DataSourceHolder {
    private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

    public static void setDataSources(String dataSource) {
        dataSources.set(dataSource);
    }

    public static String getDataSources() {
        return dataSources.get();
    }
}
