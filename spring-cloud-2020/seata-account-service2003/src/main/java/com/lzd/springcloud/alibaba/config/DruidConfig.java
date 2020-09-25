package com.lzd.springcloud.alibaba.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import io.seata.rm.datasource.DataSourceProxy;

/**
 * Druid配置数据源
 * 
 * @author lzd
 * @date 2019年5月22日
 * @version
 */
@Configuration
public class DruidConfig {
	
	/**
	 * 包别名
	 */
	@Value("${mybatis.type-aliases-package}")
	private String typeAliasesPackage;
	  
	/**
	 * mapper映射文件
	 */
    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;
    
    /**
     * mybatis主配置文件
     */
    @Value("${mybatis.configLocation}")
    private String configLocation;
    
    
	@Bean
	@ConfigurationProperties("spring.datasource.druid")
	public DataSource dataSource() {
		DataSource dataSource=DruidDataSourceBuilder.create().build();
		return dataSource;
	}
	
	@Bean
	public DataSourceProxy dataSourceProxy(DataSource dataSource) {
        return new DataSourceProxy(dataSource);
    }   
	  
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSourceProxy dataSourceProxy) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
        //包别名
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
        //mapper映射文件
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
        //mybatis主配置文件
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configLocation));
        sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
        return sqlSessionFactoryBean.getObject();
    } 
	
}
