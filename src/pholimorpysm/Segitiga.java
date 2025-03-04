/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pholimorpysm;

/**
 *
 * @author Galuh
 */
class Segitiga extends PholimorpysmBangunDatar {
	        private double alas;
	        private double tinggi;
	
	        public Segitiga(double alas, double tinggi) {
	            this.alas = alas;
	            this.tinggi = tinggi;
	        }
	
	        @Override
	        public double luas() {
	            return (alas * tinggi) / 2;
	        }
	
	        @Override
	        public double keliling() {
	            double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
	            return alas + tinggi + sisiMiring;
	        }
	    }

