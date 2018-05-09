/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochody {
    private String marka;
    private String nazwa;
    private int v_max;
    private int cena;

    public Samochody(String marka, String nazwa, int v_max, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.v_max = v_max;
        this.cena = cena;
    }
    public void display(){
        System.out.println("marka"+ marka + " nazwa" + nazwa + " vmax "+ v_max+" cena " + cena);
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getV_max() {
        return v_max;
    }

    public void setV_max(int v_max) {
        this.v_max = v_max;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
}
