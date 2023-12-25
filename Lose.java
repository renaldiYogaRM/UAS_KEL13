import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        //memanggil method prepare.
        prepare();
    }
    
    private void prepare()
    {
        //menambahkan object/ button play again untuk kembali level 1.
        playAgain playAgain = new playAgain();
        addObject(playAgain,50,50);
        playAgain.setLocation(350,349);
        
        //menambahkan object/ button back start.
        Back3 back3 = new Back3();
        addObject(back3,50,50);
        back3.setLocation(600,349);
    }
}
