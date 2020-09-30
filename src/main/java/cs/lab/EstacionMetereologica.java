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

        double humidity;
        double temperature;
        double wind;
        String username;

        final Logger logger = Logger.getLogger(Client.class.getName());

        public Client(String user) {
            username  = user;
            logger.info("Starting analysis...");
        }

        public Client(){}

        public void update(double temperatura, double humedad, double viento){
            temperature = temperatura;
            humidity = humedad;
            wind = viento;
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
        //Trying some tests
    }

}