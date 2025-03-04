package pholimorpysm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Galuh
 */

    class Persegi extends PholimorpysmBangunDatar {
	        private double sisi;
	
	        public Persegi(double sisi) {
	            this.sisi = sisi;
	        }
	
	        @Override
	        public double luas() {
	            return sisi * sisi;
	        }
	
	        @Override
	        public double keliling() {
	            return 4 * sisi;
	        }
	    }

    

