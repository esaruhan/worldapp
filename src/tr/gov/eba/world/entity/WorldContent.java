/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 *
 * @author megane2
 */
public class WorldContent {

    Long contentID;
    String title;
    String niceURL;
    String shortDescription;
    String longDescription;
    String helpDescription;
    String keywords;
    String featuredPicture;
    String landingPicture;
    String screenShotPicture;
    String contentLink;
    String supportLink;
    String type;
    Long categoryID;
    Long extentID;
    Long ownerID;
    Short state;
    Short featured;
    Timestamp dateTime;
    Set<String> tags;

    public WorldContent() {
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public String getContentLink() {
        return contentLink;
    }

    public void setContentLink(String contentLink) {
        this.contentLink = contentLink;
    }

    public Long getExtentID() {
        return extentID;
    }

    public void setExtentID(Long extentID) {
        this.extentID = extentID;
    }

    public String getFeaturedPicture() {
        return featuredPicture;
    }

    public void setFeaturedPicture(String featuredPicture) {
        this.featuredPicture = featuredPicture;
    }

    public String getHelpDescription() {
        return helpDescription;
    }

    public void setHelpDescription(String helpDescription) {
        this.helpDescription = helpDescription;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLandingPicture() {
        return landingPicture;
    }

    public void setLandingPicture(String landingPicture) {
        this.landingPicture = landingPicture;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getNiceURL() {
        return niceURL;
    }

    public void setNiceURL(String niceURL) {
        this.niceURL = niceURL;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public String getScreenShotPicture() {
        return screenShotPicture;
    }

    public void setScreenShotPicture(String screenShotPicture) {
        this.screenShotPicture = screenShotPicture;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getSupportLink() {
        return supportLink;
    }

    public void setSupportLink(String supportLink) {
        this.supportLink = supportLink;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Short getFeatured() {
        return featured;
    }

    public void setFeatured(Short featured) {
        this.featured = featured;
    }
    
}
