package test;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {
/*  AXIS  */
	public static void main(String[] args) throws Exception {
   BanqueServiceProxy stub=new    BanqueServiceProxy();
   /* Invocation par distance*/
   System.out.println(stub.conversionEuroToDH(800));
    Compte compte=stub.getCompte(3);
    System.out.println("Code="+compte.getCode());
    System.out.println("Solde="+compte.getSolde());
Compte[] cptes=stub.listComptes();
for(Compte cp:cptes) {
	   System.out.println("--------------");
	   System.out.println("Code="+cp.getCode());
	    System.out.println("Solde="+cp.getSolde());
}
	}

}