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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double luasPermukaan() {
        return 2*(super.luas()+super.luas(super.getPanjang(), tinggi)+super.luas(super.getLebar(), tinggi));
    }

    @Override
    public double volume() {
        return super.luas()*tinggi;
    }
    
}
