
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mikael
 */
public class CaixaDeSom { //classe na qual é uma caixa de som onde se pode tocar musica
    public CaixaDeSom(){
        
    }
     public void tocarMusica (String nomeDoAudio){ //metodo para tocar musica
        URL url = getClass().getResource(nomeDoAudio+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
}
