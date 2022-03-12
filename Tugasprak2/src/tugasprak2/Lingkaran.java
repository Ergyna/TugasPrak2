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
public class Lingkaran implements MenghitungBidang{
    double jariJari;
    double phi=3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    
    @Override
    public double luas() {
        return phi*jariJari*jariJari;
     
    }

    @Override
    public double keliling() {
        return 2*phi*jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getPhi() {
        return phi;
    }
    
}
