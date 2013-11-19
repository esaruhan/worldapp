/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.entity;

/**
 *
 * @author megane2
 */
public class Owner {
    
    private Long id;
    private String name;
    private Short state;

    public Owner() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
