/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anime;

/**
 *
 * @author Galuh
 */
class Shonen extends KarakterAnime {
    public Shonen(String nama) {
        super(nama);
    }

    @Override
    public void jurusSpesial() {
        System.out.println(nama + " menggunakan serangan super power khas shonen!");
    }
}
