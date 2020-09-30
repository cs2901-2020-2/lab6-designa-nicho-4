package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstacionMetereologica{
    static final Logger logger = Logger.getLogger(EstacionMetereologica.class.getName());

    double humedad;
    double temperatura;
    double viento;

    public EstacionMetereologica(){}

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

        public double humedad;
        public double temperatura;
        public double viento;
        public String username;

        final Logger logger = Logger.getLogger(Cliente.class.getName());

        public Cliente(String _username) {
            username  = _username;
            logger.info("Starting analysis...");
        }

        public Cliente(){}

        public void update(double _temperatura, double _humedad, double _viento){
            temperatura = _temperatura;
            humedad = _humedad;
            viento = _viento;
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

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.username = "marlon";

        EstacionMetereologica clima = new EstacionMetereologica();
        clima.update(10, 23, 100);

    }

}