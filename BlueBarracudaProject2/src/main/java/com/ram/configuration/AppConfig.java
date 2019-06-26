package com.ram.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig
{

	@Bean
	public JavaMailSender getMailSender()
	{
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		// Using Gmail SMTP configuration.
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);

		
		mailSender.setUsername("buddymeinc@gmail.com");
		mailSender.setPassword("buddyp4ssw0rd");

		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}
}
