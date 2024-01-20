/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhmang1.Tuan2;

/**
 *
 * @author hoang
 */
public class VongDonLuong {
    public static void main(String[] args) {
        //Tao luong moi
        Thread th1 = new Thread(new DNRunable2());
        th1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        th1.interrupt();
        
    }
}
class DNRunable2 implements Runnable{
    @Override 
    public void run(){
        System.out.println("Luong dang chay - Trang thai: " + Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Luong bi ngat - Trang thai: " + Thread.currentThread().getState());
        }
        System.out.println("Luong da ket thuc - Trang thai: " + Thread.currentThread().getState());
    }
}