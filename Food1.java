import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food1 extends Food
{
    int lastNameNo = 1; // Variabel untuk menyimpan nomor terakhir dari gambar ikan (Fish)
    int animationDelay = 5; // Delay untuk animasi

    public Food1()
    {
        GreenfootImage img = this.getImage();
        img.scale(50,50);
        this.setImage(img);
        // Konstruktor: Mengatur gambar dan mengubah ukuran gambar objek Food1
    }
    
    public void act()
    {
        move(-2);
        // Memindahkan objek Food1 ke kiri sebesar 2 pixel per act
    
        if (getX() <= 0) {
            getWorld().removeObject(this);
            // Jika objek mencapai posisi x <= 0, hapus objek dari dunia
        }
        
        animate();
        // Panggil metode animate() pada setiap act
    }
    
    private void animate()
    {
        if(animationDelay<5){
            animationDelay++;
            return;
            // Jika animationDelay kurang dari 5, tambahkan 1 pada animationDelay dan keluar dari metode
        }
        
        animationDelay = 0;
        // Reset animationDelay
    
        if(lastNameNo==2){
            lastNameNo = 1;
        }else{
            lastNameNo++;
            // Mengubah nomor gambar ikan (Fish) yang digunakan
        }
        
        this.setImage(new GreenfootImage("Fish"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(75,75);
        this.setImage(img);
        // Mengubah gambar objek Food1 sesuai dengan nomor gambar yang baru diambil, kemudian mengubah ukurannya
    }

}
