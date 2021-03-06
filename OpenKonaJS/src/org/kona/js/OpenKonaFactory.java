package org.kona.js;

import java.util.HashMap;

import org.kona.js.exceptions.KonaException;
import org.kona.js.sendgrid.SendGridService;
import org.kona.js.sendgrid.SendGridServiceImpl;

public class OpenKonaFactory extends HashMap<String, String> {

	private static final long serialVersionUID = -8247540165161495010L;

	public OpenKonaFactory() {
		// notifications = new NotificationsService("","");
	}

	public ImgService img = new ImgServiceImp(); // kona.img.qr(

	public SendGridService sendgrid = new SendGridServiceImpl();

	public void error(String msg) throws KonaException {
		KonaException e = new KonaException(msg);
		throw e;
	}

}
