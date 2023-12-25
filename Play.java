import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    
    public void act() 
{
    if(Greenfoot.mouseClicked(this)){
        // Mendeteksi klik pada objek saat ini

        Level1 Level1 = new Level1();
        // Membuat instance baru dari kelas Level1

        Greenfoot.setWorld(Level1);
        // Mengatur world saat ini ke instance baru dari Level1

        Level1.started();
        // Memanggil metode started() dari kelas Level1

        Start Start= (Start)getWorld();
        // Mengambil referensi ke dunia saat ini sebagai objek dari kelas Start

        Start.stopMusic();
        // Memanggil metode stopMusic() dari kelas Start untuk menghentikan musik
    }
}

}
