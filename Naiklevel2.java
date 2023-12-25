import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Naiklevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Naiklevel2 extends Naiklevel
{
    
    public Naiklevel2()
    {
        //memanggil method act
        act();
    }
    
    public void act()
    {
        //membuat kondisi jika enter ditekan maka melanjutkan program.
        if(Greenfoot.isKeyDown("Enter"))
        {
            //jika kondisi diatas terpenuhi maka mengganti tampilan ke dunia level 2
            Level2 level2 = new Level2();
            level2.started();
            Greenfoot.setWorld(level2);
        }
    }
}
