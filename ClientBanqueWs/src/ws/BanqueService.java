/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface BanqueService extends java.rmi.Remote {
    public double conversionEuroToDH(double montant) throws java.rmi.RemoteException;
    public ws.Compte getCompte(int code) throws java.rmi.RemoteException;
    public ws.Compte[] listComptes() throws java.rmi.RemoteException;
}
