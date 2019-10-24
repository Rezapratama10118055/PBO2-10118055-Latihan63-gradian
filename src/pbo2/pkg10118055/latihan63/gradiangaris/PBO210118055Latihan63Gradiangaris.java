/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan63.gradiangaris;

/**
 *
 * @author User
 */
public class PBO210118055Latihan63Gradiangaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koordinat k1 = new koordinat(2,10,5,7);
        koordinat k2 = new koordinat(5,1,3,12);
        System.out.println("garis yang melalui titik("+k1.getX1()+","+k1.getY1()+")dan"
                + "("+k1.getX2()+","+k1.getY2()+")"
                + "memiliki gradian sebesar "+k1.hitunggradian());
        System.out.println("garis yang melalui titik("+k2.getX1()+","+k2.getY1()+")dan"
                + "("+k2.getX2()+","+k2.getY2()+")"
                + "memiliki gradian sebesar "+k2.hitunggradian());
    }
    
}
