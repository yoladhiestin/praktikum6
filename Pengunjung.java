/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absen;

/**
 *
 * @author Zidan
 */
class Pengunjung {
    
    public String namaLengkap;
    public String asalKota;
    public String nomorPonsel;

    public Pengunjung(String namaLengkap, String asalKota, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.asalKota = asalKota;
        this.nomorPonsel = nomorPonsel;
    }
public String getnamaLengkap()
    {
        return namaLengkap;
    }
    
    public String getasalKota()
    {
        return asalKota;
    }
    
    public String getnomorPonsel()
    {
        return nomorPonsel;
    }
}
