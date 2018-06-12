/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mikael
 */
public class Despertador { //classe para criar o despertador
    
    public int horas;
    public int minutos;
    public int segundos;
    public boolean videoLigado;
    
    
    public Despertador(int h, int m, boolean video){
        this.horas = h;
        this.minutos = m;
        this.videoLigado = true;
        this.segundos = 0;
    }
    
    public void ligarVideo(){
        this.videoLigado = true;
    }
    
    public void desligarVideo(){
        this.videoLigado = false;
    }
    
    
}
