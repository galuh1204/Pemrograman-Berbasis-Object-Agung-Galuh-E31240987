/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pholimorpysm;

/**
 *
 * @author Galuh
 */
class Lingkaran extends PholimorpysmBangunDatar {
	        private double r;
	
	        public Lingkaran(double r) {
	            this.r = r;
	        }
	
	        @Override
	        public double luas() {
	            return Math.PI * r * r;
	        }
	
	        @Override
	        public double keliling() {
	            return 2 * Math.PI * r;
	        }
	    }

