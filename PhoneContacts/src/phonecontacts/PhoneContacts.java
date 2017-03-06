/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.*;
/**
 *
 * @author Alejandro
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static MobilePhone myphone=new MobilePhone();// instancia myphone como mobilePhone
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        printmenu();
        Scanner teclado = new Scanner(System.in);
        option = teclado.nextInt();
        while(option>0 && option<7){
            switch(option){// genera la seleccion de caso para que el usuario uede decidir que hacer en el menu
                case 1:
                    addcontacts();
                    break;
                case 2:
                    updatecontacts();
                    break;
                case 3:
                    deletecontact();
                    break;
                case 4:
                    querycontacts();
                    break;
                case 5:
                    listAll();
                    break;
                case 6:
                    printmenu();
                    break;
                default:
                    break;
                                    
            }
        }
    }
    public static void printmenu(){
        System.out.println("Menu :");
        System.out.println("0 Quit");
        System.out.println("1 Add");
        System.out.println("2 Update");
        System.out.println("3 Delete");
        System.out.println("4 Query");
        System.out.println("5 List");
        System.out.println("6 Print Options");
        System.out.println("Option ?");
        
    }
    public static void addcontacts(){
        String name;
        int number;
        Scanner teclado = new Scanner(System.in);// llama al usuario
        System.out.println("Contact :");
        name=teclado.next();
        System.out.println("Number :");
        number = teclado.nextInt();
        if(myphone.addcontacts(name,number)){
            System.out.println("Contact Succesfully Added");
        }else{
            System.out.println("Already on list");
        }
    }

    public static void updatecontacts(){
            String name;
            int number;
            Scanner teclado = new Scanner(System.in);
            name = teclado.nextLine();
            System.out.println("Contact :");
            number = teclado.nextInt();
            System.out.println("number:");
            if(myphone.addcontacts(name,number)){
            System.out.println("Updated");
        }else{
            System.out.println("not found");
        
        }
    }
    public static void deletecontact(){
            String name;
            int number;
            Scanner teclado = new Scanner(System.in);
            name = teclado.nextLine();
            System.out.println("Contact :");
            number = teclado.nextInt();
            System.out.println("number:");
            if(myphone.addcontacts(name,123)){
            System.out.println("Deleted");
        }else{
            System.out.println("not found");
        
        }
    }
    public static void querycontacts(){
        Scanner teclado = new Scanner(System.in);
        String name;
        System.out.println("Contact:");
        name = teclado.nextLine();
        System.out.println(myphone.querycontacts(name));
        
    }
    public static void listAll(){
            myphone.listcontacts();
    }    
}