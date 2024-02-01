package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//bima anana khdemna b java17, Jax-ws makayench par défaut fa terrina najouterw "jaxws-ri" fdeps dyal pom.xml
//koun khdemna b java 8, 7 aw 6 makonach n7tajo najouterw jaxws-ri
//bach n9der nste3mel l'annotation @WebService, khasni darouri jax-ws
@WebService(serviceName = "BanqueWS")
public class BanqueService
{
    //kolla methode dyal mon Service khasni n3ele9 liha l'annotation @WebMethod
    @WebMethod(operationName = "Convert")
    public double conversion (@WebParam(name = "montant") double mt)
    {
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code)
    {
        return new Compte(code, Math.random()*10777, new Date());
    }

    @WebMethod
    public List<Compte> ListeCompte ()
    {
        return List.of(
                new Compte(1, Math.random()*10777, new Date()),
                new Compte(2, Math.random()*10777, new Date()),
                new Compte(3, Math.random()*10777, new Date())
        );
    }
}
