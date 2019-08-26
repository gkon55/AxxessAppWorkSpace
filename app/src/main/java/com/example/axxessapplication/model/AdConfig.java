package com.example.axxessapplication.model;

import java.util.List;
public class AdConfig {
    private List<String> safeFlags;

    private List<String> highRiskFlags;

    private List<String> unsafeFlags;

    private boolean showsAds;

    public void setSafeFlags(List<String> safeFlags){
        this.safeFlags = safeFlags;
    }
    public List<String> getSafeFlags(){
        return this.safeFlags;
    }
    public void setHighRiskFlags(List<String> highRiskFlags){
        this.highRiskFlags = highRiskFlags;
    }
    public List<String> getHighRiskFlags(){
        return this.highRiskFlags;
    }
    public void setUnsafeFlags(List<String> unsafeFlags){
        this.unsafeFlags = unsafeFlags;
    }
    public List<String> getUnsafeFlags(){
        return this.unsafeFlags;
    }
    public void setShowsAds(boolean showsAds){
        this.showsAds = showsAds;
    }
    public boolean getShowsAds(){
        return this.showsAds;
    }
}