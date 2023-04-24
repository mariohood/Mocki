package com.mariohood.injectMocki;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {

    @Mock
    AudioManager audioManager;

    @InjectMocks
    VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
       

        // 3 - Realizar uma chamada para o método maximizeVolume do objeto VolumeUtil
        volumeUtil.maximizeVolume(60);

        // 4 - Verificar se o método setVolume foi chamado uma única vez
        verify(audioManager, times(1)).setVolume(anyInt());
    }
  
   
}
   
