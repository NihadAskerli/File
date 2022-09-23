/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.file;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        FileUtility.writeIntoFile("niko.text", "salam necesen kef hal"
//                + "haralardasan neyniyirsen");
////        String str =FileUtility.read("niko.docx");
////        System.out.println(str);
//        byte[] byt =FileUtility.readbytes("niko.text");
//        System.out.println(new String(byt));
//        for(int i=0;i<byt.length;i++){
//            System.out.println(byt[i]+"="+(char)byt[i]);
//            byte olaraq qarsiliqi
//       byte[] data= FileUtility.readbytes("şəkil.png");
//     FileUtility.writebyte("şəkil2.png", data);
 User u=new User();
    u.name="test";
    u.pasword="niko";
    NioFile.writeObjectfile(u, "test");
       User u2=(User)NioFile.readFileDeserilize("test");
        System.out.println(u2.name);
        System.out.println(u2.pasword);
        
    NioFile.writeObjectfile(u, "test");
//    User u=(User)NioFile.readFileDeserilize("test");
//        System.out.println(u.name);

        }
        
//  byte b=70;
//        System.out.println((char)b);
//        char c=70;
//        System.out.println(c);
     
    
    
    
   
            
            
            
            
            
            
            
    }

