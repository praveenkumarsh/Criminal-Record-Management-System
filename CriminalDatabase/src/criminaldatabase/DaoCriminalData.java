package criminaldatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class DaoCriminalData {

    
    public static int save(int criminalid, String firstname, String lastname, String middlename,
            String dateofbirth, String gender, int age, String criminaladdress, String city,
            String state, String date_of_arrest, String crimeinvolved, int eyewitnessid,
            String eyewitnessname, String eyewitnessaddress, int complaintno, String imgpath) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into CriminalData(criminalid,"
                    + "firstname,lastname,middlename,dateofbirth,gender,age,criminaladdress,city,"
                    + "state,date_of_arrest,crimeinvolved,eyewitnessid,eyewitnessname,eyewitnessaddress,"
                    + "complaintno,criminalimage) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, criminalid);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, middlename);
            ps.setString(5, dateofbirth);
            ps.setString(6, gender);
            ps.setInt(7, age);
            ps.setString(8, criminaladdress);
            ps.setString(9, city);
            ps.setString(10, state);
            ps.setString(11, date_of_arrest);
            ps.setString(12, crimeinvolved);
            ps.setInt(13, eyewitnessid);
            ps.setString(14, eyewitnessname);
            ps.setString(15, eyewitnessaddress);
            ps.setInt(16, complaintno);

            //InputStream image = new FileInputStream(new File(imgpath));
//private void createDirectoryForSaving(String dir) {
            String dir = "./Images/Criminalimg/" + criminalid + firstname;
//		this.targetDir = dir;
            if (!(new File(dir).mkdirs())) {
                System.err.println("Directory could not be created");
            }
//	}

            Path FROM = Paths.get(imgpath);
            String imglocation = dir + "/" + criminalid + firstname + ".png";
            Path TO = Paths.get(imglocation);
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            java.nio.file.Files.copy(FROM, TO, options);
            System.out.println(imgpath);
            ps.setString(17, imglocation);
            //ps.setBlob(17, image);
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
            PreparedStatement ps = con.prepareStatement("delete from CriminalData where criminalid=?");
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
            PreparedStatement ps = con.prepareStatement("select * from CriminalData where criminalid=?");
            ps.setInt(1, criminalid);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static boolean checkAnyDataInt(String header, int data ) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from CriminalData where " + header + " =?");
            ps.setInt(1, data);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static boolean checkAnyDataString(String header, String data) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from CriminalData where " + header + " =?");
            ps.setString(1, data);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int update(int criminalid, String firstname, String lastname, String middlename,
            String dateofbirth, String gender, int age, String criminaladdress, String city,
            String state, String date_of_arrest, String crimeinvolved, int eyewitnessid,
            String eyewitnessname, String eyewitnessaddress, int complaintno, String imgpath) {
        int status = 0;
        try {
            Connection con = DB.getConnection();

//            int i = DaoCriminalData.update(criminalid, firstname, lastname, middlename, dob, gender, age,
//                    criminaladdress, city, state, dateofarrest, crimeinvolved, eyewitnessid, eyewitnessname,
//                    eyewitnessaddress, complaintno, imgpath);
            PreparedStatement ps = con.prepareStatement("UPDATE CriminalData SET criminalid=?,firstname = ?,lastname= ?,middlename=?,"
                    + "dateofbirth=?,gender=?,age=?,criminaladdress=?,city=?,state=?,date_of_arrest=?,crimeinvolved=?,"
                    + "eyewitnessid=?,eyewitnessname=?,eyewitnessaddress=?,complaintno=?,criminalimage=? WHERE criminalid = ?");
            System.out.println("hello");
            ps.setInt(1, criminalid);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, middlename);
            ps.setString(5, dateofbirth);
            ps.setString(6, gender);
            ps.setInt(7, age);
            ps.setString(8, criminaladdress);
            ps.setString(9, city);
            ps.setString(10, state);
            ps.setString(11, date_of_arrest);
            ps.setString(12, crimeinvolved);
            ps.setInt(13, eyewitnessid);
            ps.setString(14, eyewitnessname);
            ps.setString(15, eyewitnessaddress);
            ps.setInt(16, complaintno);
            System.out.println("after");
//            InputStream image = new FileInputStream(new File(imgpath));
//          String dir="./Images/Criminalimg/" + criminalid+firstname;
//		this.targetDir = dir;
            String dir = "./Images/Criminalimg/" + criminalid + firstname;
            if (!(new File(dir).mkdirs())) {
                System.err.println("Directory could not be created");
            }
//	}

            Path FROM = Paths.get(imgpath);
            String imp = dir + "/" + criminalid + firstname + ".png";
            Path TO = Paths.get(imp);
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            java.nio.file.Files.copy(FROM, TO, options);
            System.out.println(imgpath);
            ps.setString(17, imp);
            ps.setInt(18, criminalid);
            //ps.setBlob(17, image);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
//    public static  boolean  update(int id){
//        boolean status=false;
//        try{
//            Connection con=DB.getConnection();
//            PreparedStatement ps= con.prepareStatement("select * from InsertCriminalData where id=?");
//            
//            save(int criminalid,String firstname,String lastname,String middlename,String dateofbirth,String gender,int age,String criminaladdress,String city,String state,String date_of_arrest,String crimeinvloved,int eyewitnessid,String eyewitnessname,String eyewitnessaddress,int complaintno)
//            ps.setString(1, name);
//            ps.setString(2, password);
//            ResultSet rs =ps.executeQuery();
//            status= rs.next();
//            con.close();
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        return status;
//    }
}
