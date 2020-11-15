package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.ArrayList;
import java.util.Date;

import metier.Compte;
  /*
   POJO creation d une classe sans modele 
   */
/* par default il va prendre le nom de classe */
@WebService(serviceName = "BanqueWs")
public class BanqueService {
	
@WebMethod(operationName = "ConversionEuroToDH")

/* par default il va prendre renomer le parametre par arg0 sion activer store info lors de la compilation*/
	 public double Conversion(@WebParam (name = "montant" )double mtn) {
		 return mtn*11;
	 }
	
@WebMethod
	public Compte getCompte(@WebParam (name = "code" )int code) {
		return new Compte(code,Math.random()*9000,new Date());
		
		
	}
@WebMethod
	public List<Compte> listComptes(){
		List<Compte> comptes =new ArrayList<Compte>()	;
	  comptes.add(new Compte(1,Math.random()*9000,new Date()));
	  comptes.add(new Compte(2,Math.random()*9000,new Date()));
	  comptes.add(new Compte(3,Math.random()*9000,new Date()));
	  comptes.add(new Compte(4,Math.random()*9000,new Date()));
	  return comptes;
		
}
}