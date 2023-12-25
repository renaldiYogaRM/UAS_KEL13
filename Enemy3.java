import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemy
{
    int lastNameNo = 1; // Variabel untuk menyimpan nomor terakhir dari gambar Shark
    int animationDelay = 10; // Delay untuk animasi

    public Enemy3()
        {
        GreenfootImage img = this.getImage();
        img.scale(100,75);
        this.setImage(img);
        // Konstruktor: Mengatur gambar dan mengubah ukuran gambar objek Enemy3
        }

    public void act()
        {
        move(-2);
        // Memindahkan objek Enemy3 ke kiri sebesar 2 pixel per act
    
        if (getX() <= 0) {
            getWorld().removeObject(this);
            // Jika objek mencapai posisi x <= 0, hapus objek dari dunia
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
        // Mengubah nomor gambar Shark yang digunakan
        }
    
        GreenfootImage newImage = new GreenfootImage("Shark" + lastNameNo + ".png");
        newImage.mirrorHorizontally(); // Membalik gambar secara horizontal
        this.setImage(newImage);
        GreenfootImage img = this.getImage();
        img.scale(150, 130);
        this.setImage(img);
        // Mengubah gambar objek Enemy3 sesuai dengan nomor gambar yang baru diambil, membalik gambarnya, kemudian mengubah ukurannya
        }

}
