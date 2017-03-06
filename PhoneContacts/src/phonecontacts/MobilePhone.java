/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 */
public class MobilePhone {
    private ArrayList<Contacts>Contact;//Atributo de la clase
    
    public MobilePhone(){//constructor
        Contact = new ArrayList<Contacts>();      
    }
    public int findcontacts(String name){// se inicia una busqueda para encontrar el contacto o no
        for(int i=0;i<Contact.size();i++){//ciclo for con i igual al tamaño del array
            if(Contact.get(i).equals(name)){// si encuentra un termino igual al array retorna el numero de donde esta
                return i;
            }
        }
        return -1;
    }
    
    public boolean addcontacts (Contacts contacts){//añade el contacto
        if (findcontacts (contacts.getName())== -1){// si no encuentra el contacto al dar -1 se puede añadir
            Contact.add(contacts);//añade un valor al array
            return true;
        }
        return false;
    }
    public boolean addcontacts (String name, int number){
        return addcontacts(new Contacts (name,number));//añade los datos al array
    }
    public boolean removecontacts(Contacts contacts){
        int pos = findcontacts(contacts.getName());//usa la busqueda
        if(findcontacts(contacts.getName())==-1){//si la busqueda no coincide
            if(pos==-1){//checa si la posicion es igual al -1
                return false;
            }
            Contact.remove(pos);
        }
        return true;
    }
    public boolean removecontacts(String name, int number){
        return removecontacts (new Contacts(name,number));//remueve lo datos del array 
}
    public boolean removecontacts(String name){
        return removecontacts (new Contacts(name,123));
    }
    public boolean updatecontacts (Contacts contacts){
        int pos = findcontacts(contacts.getName());// utiliza el numero de la busqueda
        if(pos==-1){// para retornar un no encontrado
            return false;
        }
        Contact.get(pos).setName(contacts.getName());// cambia los valores de la posicion
        Contact.get(pos).setNumber(contacts.getNumber());
        return true;
    }
    public boolean updatecontacts(String name,int number){
        return updatecontacts(new Contacts(name,number));// devuelve los nuevos valores
    }
    public void listcontacts(){
        for(Contacts tempcontacts:Contact){
            System.out.println(tempcontacts.toString());
        }
    }
    public String querycontacts(String name){
        int pos = findcontacts(name);
        if (pos ==-1){
            return "Contact not found";
        }else{
            return Contact.get(pos).toString();
        }
    }
}