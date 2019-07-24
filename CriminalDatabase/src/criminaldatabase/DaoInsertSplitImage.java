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
public class DaoInsertSplitImage {

    public static int save(int criminalid, String hair, String forehead, String eye, String nose, String mouth, String chin) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into criminalsplitimage(criminalid,hair,forehead,eye,nose,mouth,chin) values(?,?,?,?,?,?,?)");
            ps.setInt(1, criminalid);
            ps.setString(2, hair);
            ps.setString(3, forehead);
            ps.setString(4, eye);
            ps.setString(5, nose);
            ps.setString(6, mouth);
            ps.setString(7, chin);

            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(int criminalid, String hair, String forehead, String eye, String nose, String mouth, String chin) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("update criminalsplitimage set criminalid=?,hair=?,forehead=?,eye=?,nose=?,mouth=?,chin=? where criminalid=?");
            ps.setInt(1, criminalid);
            ps.setString(2, hair);
            ps.setString(3, forehead);
            ps.setString(4, eye);
            ps.setString(5, nose);
            ps.setString(6, mouth);
            ps.setString(7, chin);
            ps.setInt(8, criminalid);
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
            PreparedStatement ps = con.prepareStatement("delete from criminalsplitimage where criminalid=?");
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
            PreparedStatement ps = con.prepareStatement("select * from criminalsplitimage where criminalid=?");
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
