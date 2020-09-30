package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstacionMetereologica{
    static final Logger logger = Logger.getLogger(EstacionMetereologica.class.getName());

    double humedad;
    double temperatura;
    double viento;

    public EstacionMetereologica(){
        //Default constructor
    }

    public double getHumedad() {
        return humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public double getViento() {
        return viento;
    }

    public static class Cliente{

        public static const double humedad;
        public static const double temperatura;
        public static const double viento;
        public static const String username;

        final Logger logger = Logger.getLogger(Cliente.class.getName());

        public Cliente(String user) {
            username  = user;
            logger.info("Starting analysis...");
        }

        public Cliente(){}

        public void update(double Temperatura, double Humedad, double Viento){
            temperatura = Temperatura;
            humedad = Humedad;
            viento = Viento;
        }

    }

    List<Cliente> clientes = new ArrayList<>();

    public void addUser(Cliente cliente){
        clientes.add(cliente);
    }

    public void update(double temperatura, double humedad, double viento){
        for(Cliente i: clientes){
            i.update(temperatura, humedad, viento);
        }
    }
    public boolean compare(){
        return true;
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.username = "marlon";
        Cliente cliente2 = new Cliente();
        cliente2.username = "Luis";
        EstacionMetereologica clima = new EstacionMetereologica();
        clima.addUser(cliente1);
        clima.addUser(cliente2);
        clima.update(10, 23, 100);
        for(Cliente Prueba1:clima.clientes){
            logger.info(Prueba1.username);
            logger.info(String.valueOf(Prueba1.temperatura));
            logger.info(String.valueOf(Prueba1.humedad));
            logger.info(String.valueOf(Prueba1.viento));
        }
        clima.update(15,20,260);
        for(Cliente Prueba1:clima.clientes){
            logger.info(Prueba1.username);
            logger.info(String.valueOf(Prueba1.temperatura));
            logger.info(String.valueOf(Prueba1.humedad));
            logger.info(String.valueOf(Prueba1.viento));
        }


    }

}