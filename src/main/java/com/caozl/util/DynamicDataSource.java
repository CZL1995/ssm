package com.caozl.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Function:
 *
 * @author caozl
 * @since JDK 1.7
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSources();
    }
}
