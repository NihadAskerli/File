/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class User implements Serializable{
    public String name;
    public transient String pasword;
    private static final long serialVersionUID=1L;
//     bu elan deyisiklik olsa bele eror vermir
       public int i;
}
