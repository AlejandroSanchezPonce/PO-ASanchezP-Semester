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
public class Customer {
    private ArrayList<Double> transactions = new ArrayList();//autoboxing
    private String name;
    
    public Customer(String name, double initialAmount){//constructor default con el amount inicial
        this.name=name;
        this.transactions.add(initialAmount);// valor default de la transaccion de inscripcion
    }
    public void addTransaction(double amount){//añade las transacciones
        this.transactions.add(amount);
    }
    public ArrayList<Double> getTransactions() {// obtiene las transacciones del customer
        return transactions;
    }
    public String getName() {//obtiene el nombre
        return name;
    }
}
