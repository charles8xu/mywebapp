package com.abbyyocr.client;

/**
 * Authentication settings for Cloud OCR SDK client.
 * <p/>
 * Please provide your application id and password here.
 */
public class ClientSettings {
    //创建的应用名称
    public static final String APPLICATION_ID = "charlesocr";
    //ABBYY OCR应用的密码,最初在e-mail中
    public static final String PASSWORD = "lNe/XSxSSL+/zYSeinFR21Qp";

    public static void setupProxy() {
        //如果你使用代理，则将注释取消
        /*
        String host = "";
		String port = "";
		final String user = "";
		final String password = "";

		Authenticator.setDefault(
			new Authenticator() {
		 		public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication( user, password.toCharArray());
				}
 			}
		);

		System.getProperties().put("http.proxyHost", host );
		System.getProperties().put("https.proxyHost", host );
		System.getProperties().put("http.proxyPort", port);
		System.getProperties().put("https.proxyPort", port);
		System.getProperties().put("http.proxyUser", user);
		System.getProperties().put("https.proxyUser", user);
		System.getProperties().put("http.proxyPassword", password);
		System.getProperties().put("https.proxyPassword", password);
		*/
    }
}
