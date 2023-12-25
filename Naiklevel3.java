import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Naiklevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Naiklevel3 extends Naiklevel
{

    public Naiklevel3()
    {
        //memanggil method act.
        act();
    }
    
    public void act()
    {   
        //membuat kondisi jika enter ditekan maka melanjutkan program.
        if(Greenfoot.isKeyDown("Enter"))
        {
            //jika kondisi diatas terpenuhi maka mengganti tampilan ke dunia level 3.
            Level3 level3 = new Level3();
            level3.started();
            Greenfoot.setWorld(level3);
        }
    }
}