/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityhekim;

/**
 *
 * @author Rafael
 */
public class Hekim {
    private int idhekim;
    private String ad;
    private String soyad;
    private String telefon;
    private String vezife;
    private int idsobe;

    public Hekim() {
    }

    public Hekim(int idhekim, String ad, String soyad, String telefon, String vezife, int idsobe) {
        this.idhekim = idhekim;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.vezife = vezife;
        this.idsobe = idsobe;
    }

    public int getIdhekim() {
        return idhekim;
    }

    public void setIdhekim(int idhekim) {
        this.idhekim = idhekim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getVezife() {
        return vezife;
    }

    public void setVezife(String vezife) {
        this.vezife = vezife;
    }

    public int getIdsobe() {
        return idsobe;
    }

    public void setIdsobe(int idsobe) {
        this.idsobe = idsobe;
    }
    
    
    
    
    
    
}
