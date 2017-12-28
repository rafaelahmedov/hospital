/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitysobe;

/**
 *
 * @author Rafael
 */
public class sobe {
   private int idsobe;
   private String ad;
   private String melumat;

    public sobe() {
    }

    public sobe(int idsobe, String ad, String melumat) {
        this.idsobe = idsobe;
        this.ad = ad;
        this.melumat = melumat;
    }

    public int getIdsobe() {
        return idsobe;
    }

    public void setIdsobe(int idsobe) {
        this.idsobe = idsobe;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMelumat() {
        return melumat;
    }

    public void setMelumat(String melumat) {
        this.melumat = melumat;
    }
   
    
}
