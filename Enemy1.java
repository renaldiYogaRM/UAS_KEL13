import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{

    public Enemy1()
    {
        setImage("enemy_1.png");
        GreenfootImage img = this.getImage();
        img.scale(50,50);
        this.setImage(img);
        // Konstruktor: Mengatur gambar dan mengubah ukuran gambar objek Enemy1
    }

    public void act()
    {
        setLocation(getX(), getY()+1);
        // Memindahkan objek Enemy1 ke bawah (menambahkan 1 pada sumbu Y)

        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        // Jika objek berada di tepi layar, pindahkan ke posisi acak di bagian atas layar
    }

}
