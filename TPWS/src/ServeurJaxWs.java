import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWs {

	public static void main(String[] args) {
		/* publish va demarer un serveur en local*/
		/*  acceder a partir toutes les machines    */
		String url="http://0.0.0.0:8686/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("web service deploye sur :"+url);
		

	}

}
