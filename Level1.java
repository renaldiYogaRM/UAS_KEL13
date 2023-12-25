import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{   
    //menggunakan kelas GreenfootSound untuk memanggil objek Music.
    GreenfootSound Music = new GreenfootSound("bg_music.mp3");

    public Level1()
    {    
        //memanggil method prepare() dan act().
        prepare();
        act();
    }
    
    private void prepare()
    {
        //menambahkan object player 1.
        Player1 player1 = new Player1();
        addObject(player1,311,365);
        player1.setLocation(401,260);
    }
    
    public void act()
    {   
        /*memanggil method untuk menghasilkan nilai acak antara 0 - 499, jika mendapatkan nilai acak < 3
           maka lanjut pernyataan dibawah.*/
        if(Greenfoot.getRandomNumber(500)<3){
            //jika kondisi diatas terpenuhi maka akan menambahkan object secara acak posisi X (1000).
            addObject(new Enemy1(),Greenfoot.getRandomNumber(1000),1);
        } 
        
        /*memanggil method untuk menghasilkan nilai acak antara 0 - 449, jika mendapatkan nilai acak < 3
           maka lanjut pernyataan dibawah.*/
        if(Greenfoot.getRandomNumber(450)<3){
            //jika kondisi diatas terpenuhi maka akan menambahkan object secara acak posisi Y (500).
            addObject(new Food1(),1000,Greenfoot.getRandomNumber(500));
        }
        
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
    
    public void musicLose(){
        //memanggil method stopMusic untuk menghentikan music.
        stopMusic();
        
        //memutar lagu "loose.mp3".
        Greenfoot.playSound("loose.mp3");
    }
    
    public void musicWin(){
        //memanggil method stopMusic untuk menghentikan music.
        stopMusic();
        
        //memutar lagu "fanfare.wav".
        Greenfoot.playSound("fanfare.wav");
    }
}
