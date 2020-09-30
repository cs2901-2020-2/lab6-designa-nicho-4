package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstacionMetereologica{

    static final Logger logger = Logger.getLogger(Cliente.class.getName());

    List<Cliente> clientes = new ArrayList<Cliente>();

    public EstacionMetereologica(){

    }

    public void addUser(Cliente cliente){
        clientes.add(cliente);
    }

    public void removeUser(Cliente user){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes[i].username == user.username){
                clientes.remove(i);
            }
        }
    }

    public void update(String filename){
        
    }

}