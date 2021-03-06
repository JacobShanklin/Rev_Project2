package com.bluebarracuda.email;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

/**
 * @author  Arnold C. Sinko
 * 			Jacob Shanklin
 * 			Graham L Tyree
 * 			Mert Altun
 * 			Michael G. Perkins
 *
 */
@Service("mailService")
public class MailServiceImpl implements MailService
{

	/**
	 * JavaMailSender is a Spring managed dependancy of MailServiceImpl
	 */
	@Autowired
	JavaMailSender mailSender;

	/**
	 *
	 */
	public void sendEmail(final String senderEmailId, final String receiverEmailId,
			final String subject, final String message)
	{

		MimeMessagePreparator preparator = new MimeMessagePreparator()
		{

			/**
			 *
			 */
			public void prepare(MimeMessage mimeMessage) throws Exception
			{
				mimeMessage.setFrom(senderEmailId);
				mimeMessage.setRecipient(Message.RecipientType.TO,
						new InternetAddress(receiverEmailId));
				mimeMessage.setSubject(subject);
				mimeMessage.setText(message);

			}
		};

		try
		{
			mailSender.send(preparator);
			System.out.println("Message Sent...Hurrey");
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
	}
}
