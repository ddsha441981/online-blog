package org.spring.onlineblogingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "{org.spring.onlineblogingbackend.dto}")
@EnableTransactionManagement
public class HibernateConfig {

	// Change the our requirement different 2 database
	private final static String DATABASE_URL = "jdbc:mysql://localhost/onlineblog";
	private final static String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD = "441981";

	// DataSource Bean will be available
	@Bean(name ="dataSource")
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();

		// Providing database connection information
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		System.out.println(" *************************************************************************** In hibernate config file and dataSource method calling successfully **************************************************************************" + dataSource);

		return dataSource;
	}

	// SessionFactory Bean will be available
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

		builder.addProperties(getHibernateProperties());
		builder.scanPackages("org.spring.onlineblogingbackend.dto");

		return builder.buildSessionFactory();
	}

	// All the hibernate properties will returned in this method
	private Properties getHibernateProperties() {
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		return properties;
	}
	
	// TransactionManagement Bean will be available
		@Bean
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			
			return transactionManager;
		}

}
