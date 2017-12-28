/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.xesdexanam;

import connmysqlhospital.connmysqlxestexana;
import entityPasiyent.Pasiyent;
import entityhekim.Hekim;
import entityqeydiyyat.qeydiyyat;
import entitysobe.sobe;

/**
 *
 * @author Rafael
 */
public class HospitalXesdexanam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connmysqlxestexana conn = new connmysqlxestexana();
        Pasiyent pas = new Pasiyent(0, "rafael", "ahmedov", "101a1", "5617765", "7mkr fmelikov ev mdmd menzil enen");
        pas.getAd();
        pas.getSoyad();
        pas.getTelefon();
        pas.getAdres();
      
        conn.insertupdatepasiyent(pas); 
             Hekim hek = new Hekim(0, "saleh", "salehov", "5555555", "cerrah", 1);
        hek.getAd();
        hek.getSoyad();
        hek.getTelefon();
        hek.getVezife();
        hek.getIdsobe();
        conn.insertupdatehekim(hek);
            qeydiyyat qeyd =  new qeydiyyat(0, 1, 1, "11.12.2017", "50azn", "sag dassagi yoxdu", "dassagi yerindedi");
        
          qeyd.getIdpasiyent();
          qeyd.getIdhekim();
          qeyd.getTarix();
          qeyd.getOdenis();
          qeyd.getIlkinDiaqnoz();
          qeyd.getSonDiaqnoz();
          conn.insertupdateqeydiyyat(qeyd);
          
          
          sobe s = new sobe(0, "cerrahiyye", "cerrahi melumatlar bura var djskjnfjsflSFBSKJFkjskS KJ;BSBSJ SJFBSDJ FSJBJFS BSDOBF'KL B'DNF'LsfnS");
          s.getAd();
          s.getMelumat();
          conn.insertupdatesobe(s);
        
    }
    
}
