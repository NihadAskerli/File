/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ASUS
 */
public class NioFile {
    public static void writeBytes(byte[]data,String filename)throws Exception{
        Path filePath=Paths.get(filename);
        Files.write(filePath,data);
    }
    public static byte [] readBytes(String fileName)throws Exception{
 Path filePath =Paths.get(fileName);
 byte[] byteArray=Files.readAllBytes(filePath);
 return byteArray;
}
    public static void writeObjectfile(Serializable object,String name)throws Exception{
        try(FileOutputStream fout=new FileOutputStream(name);
                ObjectOutputStream oos=new ObjectOutputStream(fout) 
                ){
            oos.writeObject(object);
        }
    }
    public static Object readFileDeserilize(String filename)throws Exception{
        Object obj = null;
        try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(filename)) ){
          obj = in.readObject();
        }finally{
        return obj;
    }
    }
}