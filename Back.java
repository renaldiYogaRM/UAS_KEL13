import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
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

        About_stage About = (About_stage) getWorld();
        // Mengambil dunia saat ini dan mengonversinya menjadi objek About_stage

        About.stopMusic();
        // Memanggil metode stopMusic() dari kelas About_stage untuk menghentikan musik
    }
}

}
