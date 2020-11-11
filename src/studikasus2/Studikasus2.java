/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;

/**
 *
 * @author ASUS X450JN
 */
public class Studikasus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel 
       String nama = "Salsabila rahmawati ningsih  ";
       char huruf = 'i';
       int counter=0;
       
       //looping ke setiap huruf di variabel nama
       for(int i = 0; i<nama.length(); i++){
           
           //cek apakah huruf ke-i = huruf yang dicari
           if(nama.charAt(i)== huruf){
               
               //jika iya maka dihitung satu
               counter++;
               
           }
       }
       
       //menampilkan hasil perhitungan
       System.out.println("Jumlah huruf i : "+counter);
    }
}