/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anime;

/**
 *
 * @author Galuh
 */
abstract class KarakterAnime {
    protected String nama;
    
    public KarakterAnime(String nama) {
        this.nama = nama;
    }
    
    public abstract void jurusSpesial();
}

