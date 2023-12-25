import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    int lastNameNo = 1; // Variabel untuk menyimpan nomor terakhir dari gambar Piranha
    int animationDelay = 10; // Delay untuk animasi
    
    public Enemy2()
    {
        GreenfootImage img = this.getImage();
        img.scale(75,75);
        this.setImage(img);
        // Konstruktor: Mengatur gambar dan mengubah ukuran gambar objek Enemy2
    }
    
    public void act()
    {
        setLocation(getX() + 5,getY());
        // Memindahkan objek Enemy2 ke kanan sebesar 5 pixel per act
    
        if(getX() >= 949){
            getWorld().removeObject(this);
            // Jika objek mencapai posisi x >= 949, hapus objek dari dunia
        }
        animate();
        // Panggil metode animate() pada setiap act
    }
    
    public void animate()
    {
        if(animationDelay<10){
            animationDelay++;
            return;
            // Jika animationDelay kurang dari 10, tambahkan 1 pada animationDelay dan keluar dari metode
        }
        
        animationDelay = 0;
        // Reset animationDelay
    
        if(lastNameNo==2){
            lastNameNo = 1;
        }else{
            lastNameNo++;
            // Mengubah nomor gambar Piranha yang digunakan
        }
        
        this.setImage(new GreenfootImage("Piranha"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(75,75);
        this.setImage(img);
        // Mengubah gambar objek Enemy2 sesuai dengan nomor gambar yang baru diambil, kemudian mengubah ukurannya
    }

}
