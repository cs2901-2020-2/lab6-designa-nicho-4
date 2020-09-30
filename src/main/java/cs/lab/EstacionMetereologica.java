package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstacionMetereologica{

    public class Cliente{

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

    static final Logger logger = Logger.getLogger(EstacionMetereologica.class.getName());

    List<Cliente> clientes = new ArrayList<Cliente>();

    public EstacionMetereologica(){}

    public void addUser(Cliente cliente){
        clientes.add(cliente);
    }

    public void removeUser(Cliente user){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).username == user.username){
                clientes.remove(i);
            }
        }
    }

    public void update(String filename){
        
    }

    public static void main(String[] args) {
        
    }

}