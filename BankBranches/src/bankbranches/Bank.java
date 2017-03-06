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
public class Bank {
    private ArrayList<Branch> branches;
    public Bank(){//constructor
        this.branches = new ArrayList();
    }
    
    public int findBranch(String name){
        for(Branch temp : this.branches){// temp para buscar el branch
            if(temp.getName().equalsIgnoreCase(name)){// si lo encuentra
                return branches.indexOf(temp);
            }
        }
        return -1;//si no lo encuentra retorna -1
    } 
    public boolean addBranch(String name){
        int n = findBranch(name);;// metodo fing branch
        if(n==-1){
            this.branches.add(new Branch(name));// si no lo encuentra añadira el branch
            return true;
        }else{// si lo encuentra
            System.out.println("Existe");
            return false;
        }   
    }
    public void getCustomers(String name){
        int n = findBranch(name);// busca el Branch
        if(n == -1){
            System.out.println("no existe");
        }
        System.out.println("Customers at branch "+name);
        for(Customer temp : this.branches.get(n).getCustomers()){//usa temp para tomar los valores del array y ejecutar la busqueda
            System.out.println(temp.getName());// imprimira los nombres de acuerdo a los valores del ciclo for
        }
    }     
    public boolean addCustomer(String name, String customer, double amount){
        int i = findBranch(name);//busca el branch al cual pertenece
        if(i==-1){
            System.out.println("no existe");
            return false;
        }
        if(this.branches.get(i).addCustomer(customer, amount)){
        System.out.println("añadido");// se añaden los datos junto a la transaccion inicial
        return true;
        }
        return false;
    }
    public boolean getTransactions(String name, String customer){
        int i = findBranch(name);// busqueda de branch
        if(i==-1){
            System.out.println("no existe");
            return false;
        }
        if(this.branches.get(i).findCustomer(customer)!=-1){// si existe el branch
            for(double temp : this.branches.get(i).getTransactions(customer)){//obtiene las transacciones
                System.out.println(temp);// imprime los datos de la variable estructurada
            }
            return true;
        }
        System.out.println("el usuario no existe en este branch");
        return false;
    }
    public boolean addTransaction(String name, String customer, double amount){
        int i = findBranch(name);// encuentra el branch
        if(i==-1){
            System.out.println("no existe");
            return false;
        }
        if(this.branches.get(i).addTransaction(customer, amount)){//añade la transaccion al customer
        System.out.println("Transaction added");//
        return true;
        }
        return false;
    }
    public boolean getCustomersWithTransactions(String name){
        int n =findBranch(name);// find branch
        if(n ==-1){
            System.out.println("no existe");
            return false;
        }
        for(Customer temp : this.branches.get(n).getCustomers()){//obtiene customers
            getTransactions(name, temp.getName());// obtiene transactions
        }
        return true;
    }
 
}
