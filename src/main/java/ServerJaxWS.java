import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJaxWS {
    public static void main(String[] args) {
        //la methode publish permet de demarrer un petit serveur http qui va utiliser le port 9191
        //0.0.0.0 pour que je puisse acceder a mon WS a partir de n'importe quel reseau local (n'importe quel @ip)
        //ce serveur http est utilise' uniquement pour consulter le webService "BanqueService()"
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service deloye sur http://0.0.0.0:9191/");

    }
}
