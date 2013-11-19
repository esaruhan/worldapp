/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.entity;

import java.util.ArrayList;

/**
 *
 * @author megane2
 */
public class Category {
    
    private Long categoryID;
    private Long upCategoryID;
    private String name;
    private Short state;      

    public Category() {
    }

    public String getAdi() {
        return name;
    }

    public void setAdi(String adi) {
        this.name = adi;
    }

    public Short getDurum() {
        return state;
    }

    public void setDurum(Short durum) {
        this.state = durum;
    }

    public Long getKategoriID() {
        return categoryID;
    }

    public void setKategoriID(Long kategoriID) {
        this.categoryID = kategoriID;
    }

    public Long getUstKategoriID() {
        return upCategoryID;
    }

    public void setUstKategoriID(Long ustKategoriID) {
        this.upCategoryID = ustKategoriID;
    }
    
}
