/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPasiyent;

/**
 *
 * @author Rafael
 */
public class Pasiyent {
 private int idpasiyent;
 private String ad;
 private String soyad;
 private String pinkod;
 private String telefon;
 private String adres;

    public Pasiyent() {
    }

    public Pasiyent(int idpasiyent, String ad, String soyad, String pinkod, String telefon, String adres) {
        this.idpasiyent = idpasiyent;
        this.ad = ad;
        this.soyad = soyad;
        this.pinkod = pinkod;
        this.telefon = telefon;
        this.adres = adres;
    }

    public int getIdpasiyent() {
        return idpasiyent;
    }

    public void setIdpasiyent(int idpasiyent) {
        this.idpasiyent = idpasiyent;
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

    public String getPinkod() {
        return pinkod;
    }

    public void setPinkod(String pinkod) {
        this.pinkod = pinkod;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
 
 
 
}
