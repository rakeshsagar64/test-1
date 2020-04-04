package com.yt.backendbeta.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public final class ConnectorClass {
  public static SessionFactory getConnection() {
	  Configuration configuration =  new Configuration()
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Batch.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.BatchStudentList.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Course.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Enquiry.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.EnquiryFollowUp.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Faculty.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Package.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Price.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Registration.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.Student.class)
			  .addAnnotatedClass(com.yt.backendbeta.Entity.StudentFollowUp.class)
			  .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
			  .setProperty("hibernate.connection.url", "jdbc:postgresql://ec2-54-195-247-108.eu-west-1.compute.amazonaws.com:5432/d7qtiamb0gjujv")
			  .setProperty("hibernate.connection.username", "ewknqcomndhiwf")
			  .setProperty("hibernate.connection.password", "eef59fd63a0717262b95f763a1d3df62343a3fa25f1b720023b0b9214d7f7bbc")
			  .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
			  .setProperty("hibernate.show_sql",Boolean.TRUE.toString())
			  .setProperty("hibernate.current_session_context_class","thread")
			  .setProperty("hibernate.temp.use_jdbc_metadata_defaults", Boolean.FALSE.toString());
//			  .setProperty("hibernate.hbm2ddl.auto","validate");
			  
	  ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	  SessionFactory session = configuration.buildSessionFactory(reg);
	  
	  return session;
  }
}
