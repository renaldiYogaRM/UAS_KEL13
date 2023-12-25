import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgain extends Button
{
    
    public void act()
{
    if(Greenfoot.mouseClicked(this)){
        // Mendeteksi klik pada objek saat ini

        World Level1 = getWorld();
        // Mengambil referensi dunia saat ini

        Level1 = new Level1();
        // Membuat instance baru dari kelas Level1, tetapi menyimpannya dalam variabel yang sebelumnya menampung dunia saat ini

        Level1.started();
        // Memanggil metode started() dari kelas Level1

        Greenfoot.setWorld(Level1);
        // Mengatur world saat ini ke instance baru dari Level1, yang seharusnya menjadi dunia baru
    }
}

}
