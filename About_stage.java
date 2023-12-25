import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class About_stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About_stage extends World
{
    //menggunakan kelas GreenfootSound untuk memanggil objek Music.
    GreenfootSound Music = new GreenfootSound("about_music.mp3");

    public About_stage()
    {    
        // Membuat dunia baru dengan sel 50x500 dengan ukuran sel 1x1 piksels.
        super(950, 500, 1); 
        //memanggil method prepare().
        prepare();
    }
    
    private void prepare()
    {
        //Menambahkan tombol button Back untuk kembali ke tampilan sebelumnya.
        Back back = new Back();
        addObject(back,785,514);
        back.setLocation(800,450);
    }
    
    
    public void started(){
        //memanggil method music
        music();
    }
    
    public void music()
    {        
        /*Memuat kondisi untuk menghindari pemutaran yang tumpang tindih*/
        if(!Music.isPlaying()){
            
        //Memutar musik secara berulang
        Music.playLoop();
        
        //Mengatur volume musik menjadi 70
        Music.setVolume(70);
        }
    }

    public void stopMusic(){
        //Untuk menghentikan pemutaran music
        Music.stop();
    }
}
