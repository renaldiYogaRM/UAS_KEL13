import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    //menggunakan kelas GreenfootSound untuk memanggil objek Music.
    GreenfootSound Music = new GreenfootSound("bg_music.mp3");
    
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        //memanggil method prepare().
        prepare();
    }
    
    private void prepare()
    {
        //menambahkan object/ button play untuk memulai level 1.
        Play play = new Play();
        addObject(play,148,520);
        play.setLocation(171,390);
        
        //menambahkan object/ button about untuk berpindah ke dunia about_stage.
        About about = new About();
        addObject(about,475,515);
        about.setLocation(484,390);
        
        //menambahkan object/ button tutorial untuk berpindah ke dunia tutorial_stage.
        Tutorial tutorial = new Tutorial();
        addObject(tutorial,785,514);
        tutorial.setLocation(780,390);
        
        //menambahkan gambar logo game.
        Logo logo = new Logo();
        addObject(logo,464,163);
        logo.setLocation(490,201);
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
