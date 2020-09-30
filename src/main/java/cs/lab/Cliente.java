package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Cliente{

    double temperatura;
    double humedad;
    double viento;
    String username;

    static final Logger logger = Logger.getLogger(Cliente.class.getName());

    public Cliente(String _username) {
        username  = _username;
        logger.info("Starting analysis...");
    }
    
    public void update(double _temperatura, double _humedad, double _viento){
        temperatura = _temperatura;
        humedad = _humedad;
        viento = _viento;
    }

}