import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{   //private int score = 0; // Inisialisasi skor awal
    int lastNameNo = 1; // Nomor terakhir untuk animasi
    int animationDelay = 5; // Penundaan animasi
    public int jumlahFoodDimakan = 0; // Jumlah makanan yang dimakan
    public int enemyDimakan = 5; // Jumlah musuh yang bisa dimakan
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1(){
        setImage("gurita.png");
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    
    public void act()
    {   
        control();//memanggil fungsi control() (interaksi antar objek)
        animate();//memanggil fungsi animate()
        eatFood();//memanggil fungsi eatFood()
        eatEnemy();//memanggil fungsi eatEnemy()
        Checked();//memanggil fungsi checked untuk mengecek menang atau kalah
    }
    public void control(){
        // Aksi yang dijalankan saat permainan berlangsung
        // Menggerakkan objek sesuai input pengguna
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+6);
        }
        
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-6);
        }
        
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-6, getY());
        }
        
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+6, getY());
        }
    }
    public void animate(){
        // Metode untuk menganimasikan objek Player1
        // Mengganti gambar dengan interval tertentu
        if(animationDelay<5){
            animationDelay++;
            return;
        }
        
        animationDelay = 0;
        if(lastNameNo==17){
            lastNameNo = 1;
        }else{
            lastNameNo++;
        }
        
        this.setImage(new GreenfootImage("gurita"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void eatFood(){
        // Metode untuk memakan objek Food1
        // Menghapus makanan dari layar, memainkan suara, dan meningkatkan jumlah makanan yang dimakan
        Actor getFood1 = getOneIntersectingObject(Food1.class);
        
        if(getFood1 != null)
        {
            getWorld().removeObject(getFood1);
            Greenfoot.playSound("eating.wav");
            jumlahFoodDimakan++;
        }
        getWorld().showText("Score="+ jumlahFoodDimakan, 100, 50); // Menampilkan skor
    }
    public void eatEnemy(){
        // Metode untuk memakan objek Enemy1
        // Menghapus musuh dari layar, memainkan suara, dan mengurangi jumlah musuh yang bisa dimakan
        Actor getEnemy1 = getOneIntersectingObject(Enemy1.class);
        
        if(getEnemy1 != null)
        {
            getWorld().removeObject(getEnemy1);
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
            Level1 level1 = (Level1)getWorld();
            level1.musicWin(); // Memainkan musik menang
            
            Naiklevel2 naiklevel2 = new Naiklevel2();
            Greenfoot.setWorld(naiklevel2);
        }
    }
}
