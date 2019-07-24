/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminaldatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JAVA
 */
public class DaoCriminalImgDetail {

    public static int save(int criminalid, String eyecolor, String haircolor, String facedesc,
            String other_detail) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into criminalimgdesc(criminalid,eyecolor,haircolor,facedesc,other_detail) values(?,?,?,?,?)");
            ps.setInt(1, criminalid);
            ps.setString(2, eyecolor);
            ps.setString(3, haircolor);
            ps.setString(4, facedesc);
            ps.setString(5, other_detail);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(int criminalid, String eyecolor, String haircolor, String facedesc,
            String other_detail) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("update criminalimgdesc set criminalid=?,eyecolor=?,haircolor=?,facedesc=?,other_detail=? where criminalid=?");
            ps.setInt(1, criminalid);
            ps.setString(2, eyecolor);
            ps.setString(3, haircolor);
            ps.setString(4, facedesc);
            ps.setString(5, other_detail);
            ps.setInt(6, criminalid);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from criminalimgdesc where criminalid=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean checkData(int criminalid) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from criminalimgdesc where criminalid=?");
            ps.setInt(1, criminalid);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

}
