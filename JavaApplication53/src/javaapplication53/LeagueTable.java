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
public class LeagueTable<T extends Team>{
    String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println("Team " + team.getName() + "ya esta");
            return false;
        }else{
            league.add(team);
            System.out.println("Team " + team.getName() + "añadido");
            return true;
        }
    }
    
    public void print(){
        Collections.sort(league); 
        for(Team t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
