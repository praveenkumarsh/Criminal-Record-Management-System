/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminaldatabase;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author JAVA
 */
public class ResourceImagesClass {
    public ImageIcon ResizeImage(String imagepath,byte[] pic,int width,int height){
        ImageIcon myImage=null;
        if(imagepath!=null){
            myImage=new ImageIcon(imagepath);
        }else{
            myImage=new ImageIcon(pic);
        }
         
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    }
}
