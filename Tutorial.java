import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Button
{

    public void act() 
{
    if(Greenfoot.mouseClicked(this)){
        // Mendeteksi klik pada objek saat ini

        World Tutorial = getWorld();
        // Mengambil referensi dunia saat ini

        Tutorial = new Tutorial_stage();
        // Membuat instance baru dari kelas Tutorial_stage

        Tutorial.started();
        // Memanggil metode started() dari kelas Tutorial_stage

        Greenfoot.setWorld(Tutorial);
        // Mengatur world saat ini ke instance baru dari Tutorial_stage

        Start Start= (Start)getWorld();
        // Mengambil referensi ke dunia saat ini sebagai objek dari kelas Start

        Start.stopMusic();
        // Memanggil metode stopMusic() dari kelas Start untuk menghentikan musik
    }
}

}
