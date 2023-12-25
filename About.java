import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class About here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About extends Button
{

    public void act() 
{
    if(Greenfoot.mouseClicked(this)){
        // Mendeteksi klik pada objek saat ini

        World About = getWorld();
        About = new About_stage();
        // Membuat instance baru dari kelas About_stage

        About.started();
        // Memanggil metode started() dari kelas About_stage

        Greenfoot.setWorld(About);
        // Mengatur world saat ini ke instance baru dari About_stage

        Start Start= (Start)getWorld();
        Start.stopMusic();
        // Menghentikan musik di dunia yang sedang berjalan (Start world)
    }
}

    
}
