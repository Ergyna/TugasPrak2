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
public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double luasPermukaan() {
        return 2*super.luas()+2*super.getPhi()*super.getJariJari()*tinggi;
    }

    @Override
    public double volume() {
        return super.luas()*tinggi;
    }
    
}
