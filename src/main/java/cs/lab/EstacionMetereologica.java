package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstacionMetereologica{

    static final Logger logger = Logger.getLogger(EstacionMetereologica.class.getName());

    public EstacionMetereologica(){
        //Default constructor
    }

    public static class Client {

        public static double humidity;
        public static double temperature;
        public static double wind;
        public static String username;

        final Logger logger = Logger.getLogger(Client.class.getName());

        public Client(String user) {
            username  = user;
            logger.info("Starting analysis...");
        }

        public Client(){}

        public void update(double Temperatura, double Humedad, double Viento){
            temperature = Temperatura;
            humidity = Humedad;
            wind = Viento;
        }

        public double getHumedad() {
            return humidity;
        }

        public double getTemperatura() {
            return temperature;
        }

        public double getViento() {
            return wind;
        }

    }

    List<Client> clients = new ArrayList<>();

    public void addUser(Client client){
        clients.add(client);
    }

    public void update(double temperatura, double humedad, double viento){
        for(Client i: clients){
            i.update(temperatura, humedad, viento);
        }
    }
    public boolean compare(){
        return true;
    }

    public static void main(String[] args) {
        Client client1 = new Client();
        client1.username = "marlon";
        Client client2 = new Client();
        client2.username = "Luis";
        EstacionMetereologica clima = new EstacionMetereologica();
        clima.addUser(client1);
        clima.addUser(client2);
        clima.update(10, 23, 100);
        for(Client Prueba1:clima.clients){
            logger.info(Prueba1.username);
            logger.info(String.valueOf(Prueba1.temperature));
            logger.info(String.valueOf(Prueba1.humidity));
            logger.info(String.valueOf(Prueba1.wind));
        }
        clima.update(15,20,260);
        for(Client Prueba1:clima.clients){
            logger.info(Prueba1.username);
            logger.info(String.valueOf(Prueba1.temperature));
            logger.info(String.valueOf(Prueba1.humidity));
            logger.info(String.valueOf(Prueba1.wind));
        }


    }

}