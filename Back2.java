import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back2 extends Button
{
    
    public void act() 
{
    if(Greenfoot.mouseClicked(this)){
        // Mendeteksi klik pada objek saat ini

        Start Start = new Start();
        // Membuat instance baru dari kelas Start

        Greenfoot.setWorld(Start);
        // Mengatur world saat ini ke instance baru dari Start

        Start.started();
        // Memanggil metode started() dari kelas Start

        Tutorial_stage Tutorial = (Tutorial_stage) getWorld();
        // Mengambil dunia saat ini dan mengonversinya menjadi objek Tutorial_stage

        Tutorial.stopMusic();
        // Memanggil metode stopMusic() dari kelas Tutorial_stage untuk menghentikan musik
    }
}

}
