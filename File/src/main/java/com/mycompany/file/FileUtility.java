/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class FileUtility {

    public static void writeIntoFile(String filename, String text) throws Exception {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) {
            bw.write(text);
//        filename qabagina true yazsaq soradan yazdigimiz davam edecek
        }
    }



    public static String read(String fileName) throws Exception {
        try ( InputStream in = new FileInputStream(fileName);  InputStreamReader r = new InputStreamReader(in);  BufferedReader bf = new BufferedReader(r)) {
            String line = null;
            String result = "";
            while ((line = bf.readLine()) != null) {
                result += line + "\n";

            }
            return result;
        }
    }
    public static byte[]readbytes(String fileName)  {
        File file =new File(fileName);
        try(FileInputStream fis=new FileInputStream(file);){
        byte[] byteArray = new byte[(int)file.length()];
        
        fis.read(byteArray);
        return byteArray;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }finally{
            System.out.println("method isini xeta bas versede vermesede bitirdi");
        }
    }
        public static void writebyte(String fileName, byte[] data) throws Exception {

//        File file = new File(fileName);
        FileOutputStream fop = new FileOutputStream(fileName);
        
//        byte[] contentInBytes = content.getBytes();
        fop.write(data);
        fop.flush();
        fop.close();

    }


        
}
