/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityqeydiyyat;

/**
 *
 * @author Rafael
 */
public class qeydiyyat {
   private int idqeydiyyat;
   private int idpasiyent;
   private int idhekim;
   private String tarix;
   private String odenis;
   private String ilkinDiaqnoz;
   private String sonDiaqnoz;

    public qeydiyyat() {
    }

    public qeydiyyat(int idqeydiyyat, int idpasiyent, int idhekim, String tarix, String odenis, String ilkinDiaqnoz, String sonDiaqnoz) {
        this.idqeydiyyat = idqeydiyyat;
        this.idpasiyent = idpasiyent;
        this.idhekim = idhekim;
        this.tarix = tarix;
        this.odenis = odenis;
        this.ilkinDiaqnoz = ilkinDiaqnoz;
        this.sonDiaqnoz = sonDiaqnoz;
    }

    public int getIdqeydiyyat() {
        return idqeydiyyat;
    }

    public void setIdqeydiyyat(int idqeydiyyat) {
        this.idqeydiyyat = idqeydiyyat;
    }

    public int getIdpasiyent() {
        return idpasiyent;
    }

    public void setIdpasiyent(int idpasiyent) {
        this.idpasiyent = idpasiyent;
    }

    public int getIdhekim() {
        return idhekim;
    }

    public void setIdhekim(int idhekim) {
        this.idhekim = idhekim;
    }

    public String getTarix() {
        return tarix;
    }

    public void setTarix(String tarix) {
        this.tarix = tarix;
    }

    public String getOdenis() {
        return odenis;
    }

    public void setOdenis(String odenis) {
        this.odenis = odenis;
    }

    public String getIlkinDiaqnoz() {
        return ilkinDiaqnoz;
    }

    public void setIlkinDiaqnoz(String ilkinDiaqnoz) {
        this.ilkinDiaqnoz = ilkinDiaqnoz;
    }

    public String getSonDiaqnoz() {
        return sonDiaqnoz;
    }

    public void setSonDiaqnoz(String sonDiaqnoz) {
        this.sonDiaqnoz = sonDiaqnoz;
    }
   
   
}
