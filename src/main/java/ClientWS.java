import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS
{
    public static void main(String[] args) {
        //had stub howa lMiddleware dyali
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7500));

        Compte cp = stub.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        //hna man9drouch nweslo l la date de creation 7it derna liha @XmlTransient au niveau du Service
    }
}
