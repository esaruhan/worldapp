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
public class Output {
    
    private ArrayList <Category> categories;
    private ArrayList <WorldContent> contents;
    private ArrayList <Extent> extents;
    private ArrayList <Owner> owners;
    private Category category;
    private Extent extent;
    private Owner owner;
    private WorldContent content;

    public Output() {
    }

    public ArrayList<Category> getKategoriler() {
        return categories;
    }

    public void setKategoriler(ArrayList<Category> kategoriler) {
        this.categories = kategoriler;
    }

    public WorldContent getIcerik() {
        return content;
    }

    public void setIcerik(WorldContent icerik) {
        this.content = icerik;
    }

    public Extent getKapsam() {
        return extent;
    }

    public void setKapsam(Extent kapsam) {
        this.extent = kapsam;
    }

    public Category getKategori() {
        return category;
    }

    public void setKategori(Category kategori) {
        this.category = kategori;
    }

    public Owner getSahip() {
        return owner;
    }

    public void setSahip(Owner sahip) {
        this.owner = sahip;
    }

    public ArrayList<WorldContent> getIcerikler() {
        return contents;
    }

    public void setIcerikler(ArrayList<WorldContent> icerikler) {
        this.contents = icerikler;
    }

    public ArrayList<Extent> getKapsamlar() {
        return extents;
    }

    public void setKapsamlar(ArrayList<Extent> kapsamlar) {
        this.extents = kapsamlar;
    }

    public ArrayList<Owner> getSahipler() {
        return owners;
    }

    public void setSahipler(ArrayList<Owner> sahipler) {
        this.owners = sahipler;
    }
    
}
