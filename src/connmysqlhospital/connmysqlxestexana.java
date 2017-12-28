/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connmysqlhospital;

import entityPasiyent.Pasiyent;
import entityhekim.Hekim;
import entityqeydiyyat.qeydiyyat;
import entitysobe.sobe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 *
 * @author Rafael
 */
public class connmysqlxestexana {

    private Connection connection;

    public connmysqlxestexana() {

        try {
            String url = "jdbc:mysql://localhost:3306/hospital";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {

            System.out.println("Error connection" + e);
        }
    }

    public void insertupdatepasiyent(Pasiyent elaveet) {
        try {
            String sqlEmri;

            if (elaveet.getIdpasiyent() == 0) {
                sqlEmri = "insert into pasiyent(ad,soyad,pinKod,telefon,adres)values(?,?,?,?,?)";
            } else {
                sqlEmri = "update pasiyent set ad=?,soyad=?,pinKod=?,telefon=?,adres=? where idpasiyent=?";
            }
            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            pr.setString(1, elaveet.getAd());
            pr.setString(2, elaveet.getSoyad());
            pr.setString(3, elaveet.getPinkod());
            pr.setString(4, elaveet.getTelefon());
            pr.setString(5, elaveet.getAdres());
            if (elaveet.getIdpasiyent() > 0) {
                pr.setInt(6, elaveet.getIdpasiyent());
            }
            pr.execute();
        } catch (Exception e) {
            System.out.println("error insertpasyent " + e);
        }

    }

    public void deletepasiyent(int id) {
        try {
            String sqlEmri = "delete from pasiyent where idpasiyent = ?";
            PreparedStatement pr = connection.prepareStatement(sqlEmri);

            pr.setInt(1, id);
            pr.execute();
        } catch (Exception e) {

            System.out.println(" Error Delete pasiyent " + e);
        }

    }

    private List<Pasiyent> pasiyentemirleri(String emir) {
        try {
            String sqlEmri = "select * from pasiyent " + emir + " order by idpasiyent desc";
            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            List<Pasiyent> list = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                Pasiyent pas = new Pasiyent();
                pas.setIdpasiyent(rs.getInt("idpasiyent"));
                pas.setAd(rs.getString("ad"));
                pas.setSoyad(rs.getString("soyad"));
                pas.setPinkod(rs.getString("pinKod"));
                pas.setTelefon(rs.getString("telefon"));
                pas.setAdres(rs.getString("adres"));
                list.add(pas);

            }
            return list;

        } catch (Exception e) {
            System.out.println("Error Ekrana cixarma pasiyent " + e);
        }
        return null;
    }

    public List<Pasiyent> ekranacixarmaemripasiyent(String emir) {
        return pasiyentemirleri("");
    }

    public Pasiyent idyegoreekranacixarpas(int id) {
        return pasiyentemirleri("where idpasiyent =" + id).get(0);
    }

    public List<Pasiyent> adagoreekranacixarpas(String ad) {
        return pasiyentemirleri("where ad ='" + ad + "'");
    }

    public List<Pasiyent> soyadgoreekranacixpas(String soyad) {
        return pasiyentemirleri("where soyad ='" + soyad + "'");
    }

    public List<Pasiyent> pinkodgoreekranacixpas(String pinkod) {
        return pasiyentemirleri("where pinKod='" + pinkod + "'");
    }

    public List<Pasiyent> telefongoreekranacixpas(String telefon) {
        return pasiyentemirleri("where telefon = '" + telefon + "'");
    }

    public List<Pasiyent> adresegoreekrancixpas(String adres) {
        return pasiyentemirleri("where adren ='" + adres + "'");
    }

    public void insertupdatehekim(Hekim elaveet) {

        try {
            String sqlEmri;
            if (elaveet.getIdhekim() == 0) {
                sqlEmri = "insert into hekim(ad,soyad,telefon,vezife,idsobe)values(?,?,?,?,?)";
            } else {
                sqlEmri = "update hekim set ad=?,soyad=?,telefon=?,vezife=?,idsobe=? where idhekim=?";
            }

            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            pr.setString(1, elaveet.getAd());
            pr.setString(2, elaveet.getSoyad());
            pr.setString(3, elaveet.getTelefon());
            pr.setString(4, elaveet.getVezife());
            pr.setInt(5, elaveet.getIdsobe());
            if (elaveet.getIdhekim() > 0) {
                pr.setInt(6, elaveet.getIdhekim());
            }
            pr.execute();

        } catch (Exception e) {

            System.out.println("Error insert hekim " + e);
        }
    }

    public void deletehekim(int id) {
        try {
            String sqlemri = "delete from hekim where idhekim = ? ";
            PreparedStatement pr = connection.prepareStatement(sqlemri);
            pr.setInt(1, id);
            pr.execute();
        } catch (Exception e) {
            System.out.println("Error deletehekim " + e);
        }

    }

    private List<Hekim> hekimemirleri(String emir) {

        try {
            String sqlEmri = "select * from hekim " + emir + " order by idhekim desc";
            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            List<Hekim> list = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                Hekim hek = new Hekim();
                hek.setIdhekim(rs.getInt("idhekim"));
                hek.setAd(rs.getString("ad"));
                hek.setSoyad(rs.getString("soyad"));
                hek.setTelefon(rs.getString("telefon"));
                hek.setVezife(rs.getString("vezife"));
                hek.setIdsobe(rs.getInt("idsobe"));
                list.add(hek);

            }
            return list;
        } catch (Exception e) {
            System.out.println("Error ekrana cixarma hekim " + e);
        }
        return null;

    }

    public List<Hekim> ekranacixarmaemrihekim(String emir) {
        return hekimemirleri("");
    }

    public Hekim idGoreEkranaCixHek(int id) {
        return hekimemirleri("where idhekim=" + id).get(0);
    }

    public List<Hekim> adagoreekranacixhek(String ad) {
        return hekimemirleri("where ad='" + ad + "'");
    }

    public List<Hekim> soyadgoreekrancixarhek(String soyad) {
        return hekimemirleri("where soyad = '" + soyad + "'");
    }

    public List<Hekim> telefgorecixarhek(String telefon) {
        return hekimemirleri("where telefon='" + telefon + "'");
    }

    public List<Hekim> vezifegorecixarhek(String vezife) {
        return hekimemirleri("where vezife='" + vezife + "'");
    }

    public List<Hekim> idsobeyegorecixarhek(int idsobe) {
        return hekimemirleri("where idsobe='" + idsobe + "'");
    }

    public void insertupdateqeydiyyat(qeydiyyat elaveet) {
        try {
            String sqlEmri;
            if (elaveet.getIdqeydiyyat() == 0) {
                sqlEmri = "insert into qeydiyyat(idpasiyent,idhekim,tarix,odenis,ilkinDiaqnoz,sonDiaqnoz)values(?,?,?,?,?,?)";
            } else {
                sqlEmri = "update qeydiyyat set idpasiyent=?,idhekim=?,tarix=?,odenis=?,ilkinDiaqnoz=?,sonDiaqnoz=? where idqeydiyyat=?";
            }

            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            pr.setInt(1, elaveet.getIdpasiyent());
            pr.setInt(2, elaveet.getIdhekim());
            pr.setString(3, elaveet.getTarix());
            pr.setString(4, elaveet.getOdenis());
            pr.setString(5, elaveet.getIlkinDiaqnoz());
            pr.setString(6, elaveet.getSonDiaqnoz());
            if (elaveet.getIdqeydiyyat() > 0) {
                pr.setInt(7, elaveet.getIdqeydiyyat());
            }
            pr.execute();
        } catch (Exception e) {
            System.out.println(" Error insert qeydiyyat" + e);
        }
    }

    public void deleteqeydiyyat(int id) {
        try {
            String sqlemiri = "delete from qeydiyyat where idqeydiyyat = ?";
            PreparedStatement pr = connection.prepareStatement(sqlemiri);
            pr.setInt(1, id);
            pr.execute();
        } catch (Exception e) {
            System.out.println("Error deleteqeydiyyat" + e);
        }

    }

    private List<qeydiyyat> qeydiyyatemirlerim(String emir) {
        try {
            String sqlEmri = "select * from qeydiyyat " + emir + " order by idqeydiyyat desc";
            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            List<qeydiyyat> list = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                qeydiyyat qeyd = new qeydiyyat();
                qeyd.setIdpasiyent(rs.getInt("idpasiyent"));
                qeyd.setIdhekim(rs.getInt("idhekim"));
                qeyd.setTarix(rs.getString("tarix"));
                qeyd.setOdenis(rs.getString("odenis"));
                qeyd.setIlkinDiaqnoz(rs.getString("ilkinDiaqnoz"));
                qeyd.setSonDiaqnoz(rs.getString("sonDiaqnoz"));
                list.add(qeyd);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error emirlerimqeydiyyat " + e);
        }
        return null;
    }

    public List<qeydiyyat> ekranacixarmaqeydiyyat(String emir) {
        return qeydiyyatemirlerim("");
    }

    public List<qeydiyyat> idpasiyenteyegorecixarqeyd(int idpasiyent) {
        return qeydiyyatemirlerim("where idpasiyent='" + idpasiyent + "'");
    }

    public List<qeydiyyat> idhekimegorecixarqeyd(int idhekim) {
        return qeydiyyatemirlerim("where idhekim='" + idhekim + "'");
    }

    public List<qeydiyyat> tarixgorecixarqeyd(String tarix) {
        return qeydiyyatemirlerim("where tarix='" + tarix + "'");
    }

    public List<qeydiyyat> odenisegorecixarqeyd(String odenis) {
        return qeydiyyatemirlerim("where odenis='" + odenis + "'");
    }

    public List<qeydiyyat> ilkindiaqnozagorecixarqeyd(String diaqnoz) {
        return qeydiyyatemirlerim("where ilkinDiaqnoz='" + diaqnoz + "'");
    }

    public List<qeydiyyat> sondiaqnozagoreekranacixqeyd(String diaqnoz) {
        return qeydiyyatemirlerim("where sonDiaqnoz='" + diaqnoz + "'");
    }

    public void insertupdatesobe(sobe elaveet) {
        try {
            String sqlEmri;
            if (elaveet.getIdsobe() == 0) {
                sqlEmri = "insert into sobe(ad,melumat)values(?,?)";
            } else {
                sqlEmri = "update sobe set ad=?,melumat=? where idsobe=?";
            }

            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            pr.setString(1, elaveet.getAd());
            pr.setString(2, elaveet.getMelumat());
            if (elaveet.getIdsobe() > 0) {
                pr.setInt(3, elaveet.getIdsobe());
            }
            pr.execute();
        } catch (Exception e) {
            System.out.println("Error insert sobe " + e);
        }
    }

    public void deletesobe(int id) {
        try {
            String sqlemir = "delete from sobe where idsobe = ?";
            PreparedStatement pr = connection.prepareStatement(sqlemir);
            pr.setInt(1, id);
            pr.execute();
        } catch (Exception e) {
            System.out.println("Error deletesobe " + e);
        }

    }

    private List<sobe> emirlerimsobe(String emir) {
        try {
            String sqlEmri = "select * from sobe " + emir + " order by idsobe desc";
            PreparedStatement pr = connection.prepareStatement(sqlEmri);
            List<sobe> list = new ArrayList<>();
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                sobe s = new sobe();
                s.setIdsobe(rs.getInt("idsobe"));
                s.setAd(rs.getString("ad"));
                s.setMelumat(rs.getString("melumat"));
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.println("Error sobeemirlerim " + e);
        }
        return null;

    }

    public List<sobe> ekranacixarmasobe(String emir) {
        return emirlerimsobe("");
    }

    public List<sobe> idgoreekrancixarsobe(int idsobe) {
        return emirlerimsobe("where idsobe='" + idsobe + "'");
    }

    public List<sobe> adgoreekranacixarsobe(String ad) {
        return emirlerimsobe("where ad='" + ad + "'");
    }

}
