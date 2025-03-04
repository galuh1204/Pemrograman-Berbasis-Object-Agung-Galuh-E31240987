/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anime;

/**
 *
 * @author Galuh
 */
public class Main {
    public static void main(String[] args) {
        KarakterAnime[] karakter = {
            new Shonen("Luffy"),
            new Isekai("Kirito"),
            new Mecha("Amuro Ray")
        };

        for (KarakterAnime k : karakter) {
            k.jurusSpesial();
        }
    }
}
