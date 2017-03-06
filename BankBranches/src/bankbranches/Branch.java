/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;
import java.util.*;
/**
 *
 * @author Alejandro
 */
public class Branch {//atributos de la clase
    private ArrayList<Customer> customers;
    private String name;
  
    public Branch(String name){//constructor
        this.name= name;
        this.customers = new ArrayList();
    }
    public String getName() {
        return name;
    }
    public int findCustomer(String name){
        for(Customer temp : this.customers){//temp variable local con un elemento de mi array
            if(temp.getName().equalsIgnoreCase(name)){
                return customers.indexOf(temp);//devuelve el valor del index osea que si existe
            }
        }
        return -1;// si no existe devuelve -1
    }
    public boolean addCustomer(String name, double amount){//
        int n = findCustomer(name);//llama el metodo FindCustomer
        if(n == -1){// si no esta ya añadido
            System.out.println("Existe");
            return false;
        }
        this.customers.add(new Customer(name,amount));
        return true;// si no esta añade los datos
    }  
    public boolean addTransaction(String name, double amount){
        int n = findCustomer(name);
        if(n == -1){// el valor lo obtiene del metodo de busqueda
            System.out.println("Customer doesn't exist");
            return false;
        }
        this.customers.get(n).addTransaction(amount);//si lo encuentra añado una transaccion
        return true;
    }
    public ArrayList<Double> getTransactions(String name) {// toma las transacciones del customer
        int n = findCustomer(name);//encuentra al customer
        if(n == -1){
            System.out.println("Customer doesn't exist");
            return null;
        }
        return this.customers.get(n).getTransactions();//añade la transaccion
    }//Unboxing
    public ArrayList<Customer> getCustomers() { //
        if(this.customers.isEmpty()) System.out.println("There are no customers in this branch");
        return customers;
    }//Unboxing

}