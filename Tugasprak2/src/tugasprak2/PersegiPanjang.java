/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak2;

/**
 *
 * @author HP series
 */
public class PersegiPanjang implements MenghitungBidang{
    double panjang;
    double lebar;

    public PersegiPanjang(double pamjang, double lebar) {
        this.panjang = pamjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang*lebar;
        
    }

    @Override
    public double keliling() {
        return 2*panjang+2*lebar;
    }
    
    public double luas(double a, double b){
        return a*b;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
}
