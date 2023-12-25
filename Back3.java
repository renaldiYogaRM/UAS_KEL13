import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back3 extends Button
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
    }
}

}
