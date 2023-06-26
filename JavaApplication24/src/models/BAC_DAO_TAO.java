/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class BAC_DAO_TAO {
    private String MaBac;
    private String TenBac;
    private Boolean Flag;

    public String getMaBac() {
        return MaBac;
    }

    public String getTenBac() {
        return TenBac;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaBac(String MaBac) {
        this.MaBac = MaBac;
    }

    public void setTenBac(String TenBac) {
        this.TenBac = TenBac;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    public BAC_DAO_TAO(String MaBac){
    
    };
    public BAC_DAO_TAO(){
    
    };

    public BAC_DAO_TAO(String MaBac, String TenBac, Boolean Flag) {
        this.MaBac = MaBac;
        this.TenBac = TenBac;
        this.Flag = Flag;
    }
    
}
