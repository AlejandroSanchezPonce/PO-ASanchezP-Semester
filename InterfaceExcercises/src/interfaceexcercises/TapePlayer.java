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
public class TapePlayer implements IRecorder{

    public TapePlayer() {
    }

    @Override
    public void record() {
        System.out.println("TapePlayer recording.");
    }

    @Override
    public void play() {
        System.out.println("TapePlayer is playing.");
    }

    @Override
    public void stop() {
        System.out.println("TapePlayer stopped.");
    }

    @Override
    public void pause() {
        System.out.println("TapePlayer paused.");
    }

    @Override
    public void reverse() {
        System.out.println("TapePlayer reversed.");
    }
    
}
