/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexcercises;

/**
 *
 * @author Alejandro
 */
public class DVDPlayer implements Player{

    public DVDPlayer() {
    }
    @Override
    public void play() {
        System.out.println("jugando.");
    }
    @Override
    public void stop() {
        System.out.println("se detuvo.");
    }
    @Override
    public void pause() {
        System.out.println("pausa");
    }
    @Override
    public void reverse() {
        System.out.println("de reversa mami.");
    }
    
}
