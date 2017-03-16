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
public class CDPlayer implements Player{

    public CDPLayer() {
    }
    @Override
    public void play() {
        System.out.println("pa delante");
    }

    @Override
    public void stop() {
         System.out.println("parado");
    }

    @Override
    public void pause() {
       System.out.println("finge que esta parado");
    }

    @Override
    public void reverse() {
        System.out.println("pa tras");
    }
    
}
