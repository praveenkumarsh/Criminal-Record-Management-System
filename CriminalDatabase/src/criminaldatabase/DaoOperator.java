package criminaldatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoOperator {

    public static int save(String name, String password, String email, String address, String city, String contact, String imgpath) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into operator(name,password,email,address,city,contact,profilepic) values(?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, city);
            ps.setString(6, contact);
            InputStream img = new FileInputStream(new File(imgpath));
            ps.setBlob(7, img);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(String name) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from operator where name=?");
            ps.setString(1, name);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static boolean validate(String name, String password) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from operator where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static boolean checkData(String name) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from operator where name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(String name, String password, String email, String address, String city, String contact, String imgpath) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE Operator SET name=?,password=?,email=?,address=?,city=?,contact=?,profilepic=? WHERE name=?");
            System.out.println("hello");
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, city);
            ps.setString(6, contact);
            InputStream img = new FileInputStream(new File(imgpath));
            ps.setBlob(7, img);
            ps.setString(8, name);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

}
