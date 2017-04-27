/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;
import java.util.*;
/**
 *
 * @author Alejandro
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        FootballPlayer O = new FootballPlayer("Oliver");
        FootballPlayer L = new FootballPlayer("Benji");
        FootballPlayer I = new FootballPlayer("Steve");
        FootballPlayer V = new FootballPlayer("Juan");
        FootballPlayer E = new FootballPlayer("Diaz");
        
        FootballPlayer R = new FootballPlayer("Sanchez")
        FootballPlayer A = new FootballPlayer("PACO")
                
        BaseBallPlayer T = new BaseBallPlayer("Roberto");
        BaseBallPlayer U = new BaseBallPlayer("Cediño");
        Team<FootballPlayer> franco = new Team("Franco");
        Team<FootballPlayer> ale = new Team("Alemania");
        Team<BaseBallPlayer> niupi = new Team("Niupi");
        
        franco.addPlayer(O);
        franco.addPlayer(L);
        franco.addPlayer(I);
        franco.addPlayer(V);
        franco.addPlayer(E);
        
        ale.addPlayer(R);
        ale.addPlayer(A);
       
        niupi.addPlayer(T);
        niupi.addPlayer(U);
        franco.addTeam(franco);
        niupi.addTeam(niupi);
        
        
        LeagueTable<Team<FootballPlayer>> fut = new LeagueTable("fut");
        LeagueTable<Team<BaseBallPlayer>> baseball = new LeagueTable("baseball");
    }  
    }


