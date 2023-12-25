import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food2 extends Food
{
    public Food2()
    {
        GreenfootImage img = this.getImage();
        img.scale(70,50);
        this.setImage(img);
        // Konstruktor: Mengatur gambar dan mengubah ukuran gambar objek Food2
    }
    
    public void act()
    {
        setLocation(getX(), getY()+1);
        // Memindahkan objek Food2 ke bawah (menambahkan 1 pada sumbu Y)
    
        if(isAtEdge())
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            // Jika objek berada di tepi layar, pindahkan ke posisi acak di bagian atas layar
    }

}
