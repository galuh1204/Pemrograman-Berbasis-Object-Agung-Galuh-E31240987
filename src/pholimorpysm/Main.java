/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pholimorpysm;

/**
 *
 * @author Galuh
 */
	public class Main {
	    public static void main(String[] args) {
	        PholimorpysmBangunDatar[] daftarBangunDatar = {
	            new Persegi(8),
	            new Lingkaran(14),
	            new Segitiga(7, 8)
	        };
	
	        for (PholimorpysmBangunDatar bangun : daftarBangunDatar) {
    System.out.println("Luas: " + bangun.luas());
    System.out.println("Keliling: " + bangun.keliling());
    System.out.println("-------------------");
}
            }
        }
	


