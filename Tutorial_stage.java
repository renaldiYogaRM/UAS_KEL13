import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial_stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial_stage extends World
{
    //menggunakan kelas GreenfootSound untuk memanggil objek Music.
    GreenfootSound Music = new GreenfootSound("tutorial_music.mp3");
    
    public Tutorial_stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
        //Menambahkan tombol button Back2 untuk kembali ke tampilan sebelumnya.
        Back2 back2 = new Back2();
        addObject(back2,785,514);
        back2.setLocation(800,450);
    }
    
    public void started(){
        //memanggil method music.
        music();
    }
    
    public void music()
    {       
        /*Memuat kondisi untuk menghindari pemutaran yang tumpang tindih.*/
        if(!Music.isPlaying()){
            
        //Memutar musik secara berulang.
        Music.playLoop();
        
        //Mengatur volume musik menjadi 70.
        Music.setVolume(70);
        }
    }
    
    public void stopMusic(){
        //Untuk menghentikan pemutaran music.
        Music.stop();
    }
}
