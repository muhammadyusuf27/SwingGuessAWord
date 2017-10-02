/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama ="Matt Robinson";
        System.out.println(nama.indexOf('o'));//mencari berdasarkan indeks yg pertama ditemukan
        System.out.println(nama.lastIndexOf('o'));
        
        nama=nama.replace('M', 'r');//mengubah charakter
        System.out.println(nama);
        
        char[] vokal= {'a','i','u','e','o'};
            for (int i = 0; i < vokal.length; i++) {
                nama = nama.replace(vokal[i], '_'); //cara cepat untuk mengubah huruf
            }
            System.out.println(nama);
        
        
//        for (int i = 0; i < vokal.length; i++) {
//            if(nama.indexOf(vokal[i])==-1){
//            }
//            else{
//                int idx = nama.indexOf(vokal[i]);//cara mengubah huruf dengan mencari satu persatu
                
            }
            
        }
        
        
        
        
        
//        //mengganti char(karakter)
//        String nama="Matt Robin";
//        nama = nama.replace('t', 'z');
//        System.out.println(nama);
//        
        
        
        
        
        
        
//        String nama="Matt Robin";
//        char idx5=nama.charAt(5);
//        System.out.println(idx5);
//        int uni5=nama.codePointAt(5);//unicode
//        System.out.println(uni5);
//        
//        int a='c';
//        char d= 10009;
//        
//        System.out.println(Character.getNumericValue('R'));//ascii
//    
   
    

