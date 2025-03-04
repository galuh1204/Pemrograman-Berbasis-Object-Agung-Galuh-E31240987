/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anime;

/**
 *
 * @author Galuh
 */
class Isekai extends KarakterAnime {
    public Isekai(String nama) {
        super(nama);
    }

    @Override
    public void jurusSpesial() {
        System.out.println(nama + " menggunakan kekuatan overpower dari dunia lain!");
    }
}
