package com.mariohood.injectMocki;

public class VolumeUtil {

    private AudioManager audioManager;

    
    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
        
    }
}
