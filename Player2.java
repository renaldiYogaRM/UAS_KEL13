import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Player1
{
    public Player2(){
        // Konstruktor untuk objek Player2, mengatur gambar dan ukurannya
        setImage("gurita.png");
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    
    public void act()
    {
        super.control();// memanggil method control dari superclass
        super.animate();// memanggil method animate dari superclass
        eatEnemy();// memanggil method eatEnemy
        eatFood();// memanggil method eatFood
        Checked();// memanggil method Checked
    }
    public void eatFood(){
        // Metode untuk memakan objek Food1 dan Food2
        // Menghapus makanan dari layar, memainkan suara, dan meningkatkan jumlah makanan yang dimakan
        Actor getFood1 = getOneIntersectingObject(Food1.class);
        Actor getFood2 = getOneIntersectingObject(Food2.class);
        
        if(getFood1 != null || getFood2 != null)
        {
            getWorld().removeObject(getFood1);
            getWorld().removeObject(getFood2);
            Greenfoot.playSound("eating.wav");
            jumlahFoodDimakan++;
        }
        getWorld().showText("Score="+ jumlahFoodDimakan, 100, 50); // Menampilkan skor
        }
    
    public void eatEnemy(){
        // Metode untuk memakan objek Enemy1 dan Enemy2
        // Menghapus musuh dari layar, memainkan suara, dan mengurangi jumlah musuh yang bisa dimakan
        Actor getEnemy1 = getOneIntersectingObject(Enemy1.class);
        Actor getEnemy2 = getOneIntersectingObject(Enemy2.class);
    
        if(getEnemy1 != null || getEnemy2!= null)
        {
            getWorld().removeObject(getEnemy1);
            getWorld().removeObject(getEnemy2);
            Greenfoot.playSound("hit_enemy.mp3");
            enemyDimakan--;
        }
        getWorld().showText("Health="+ enemyDimakan, 850, 50); // Menampilkan jumlah kesehatan musuh
    }
    
    public void Checked(){
        // Metode untuk memeriksa kondisi permainan
        World world=getWorld();
    
        // Menampilkan layar kalah jika musuh habis
        if(enemyDimakan == 0)
        {
            Lose lose = new Lose();
            Greenfoot.setWorld(lose);
            
            Level2 level2 = (Level2) getWorld();
            level2.musicLose(); // Memainkan musik kalah
        }
        
        // Menampilkan layar menang jika jumlah makanan mencapai 20
        if(jumlahFoodDimakan == 2)
        {
            Level2 level2 = (Level2)getWorld();
            level2.musicWin(); // Memainkan musik menang
            
            Naiklevel3 naiklevel3 = new Naiklevel3();
            Greenfoot.setWorld(naiklevel3);
        }
    }

}
