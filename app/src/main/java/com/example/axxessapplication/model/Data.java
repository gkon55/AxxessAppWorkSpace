package com.example.axxessapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Data
{
    private String id;

    private String title;

    private String description;

    private int datetime;

    private String cover;

    private int cover_width;

    private int cover_height;

    private String account_url;

    private int account_id;

    private String privacy;

    private String layout;

    private int views;

    private String link;

    private int ups;

    private int downs;

    private int points;

    private int score;

    private boolean is_album;

    private String vote;

    private boolean favorite;

    private boolean nsfw;

    private String section;

    private int comment_count;

    private int favorite_count;

    private String topic;

    private int topic_id;

    private int images_count;

    private boolean in_gallery;

    private boolean is_ad;

    private List<String> tags;

    private int ad_type;

    private String ad_url;

    private boolean in_most_viral;

    private boolean include_album_ads;

    private List<Images> images;

    private AdConfig ad_config;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDatetime(int datetime){
        this.datetime = datetime;
    }
    public int getDatetime(){
        return this.datetime;
    }
    public void setCover(String cover){
        this.cover = cover;
    }
    public String getCover(){
        return this.cover;
    }
    public void setCover_width(int cover_width){
        this.cover_width = cover_width;
    }
    public int getCover_width(){
        return this.cover_width;
    }
    public void setCover_height(int cover_height){
        this.cover_height = cover_height;
    }
    public int getCover_height(){
        return this.cover_height;
    }
    public void setAccount_url(String account_url){
        this.account_url = account_url;
    }
    public String getAccount_url(){
        return this.account_url;
    }
    public void setAccount_id(int account_id){
        this.account_id = account_id;
    }
    public int getAccount_id(){
        return this.account_id;
    }
    public void setPrivacy(String privacy){
        this.privacy = privacy;
    }
    public String getPrivacy(){
        return this.privacy;
    }
    public void setLayout(String layout){
        this.layout = layout;
    }
    public String getLayout(){
        return this.layout;
    }
    public void setViews(int views){
        this.views = views;
    }
    public int getViews(){
        return this.views;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return this.link;
    }
    public void setUps(int ups){
        this.ups = ups;
    }
    public int getUps(){
        return this.ups;
    }
    public void setDowns(int downs){
        this.downs = downs;
    }
    public int getDowns(){
        return this.downs;
    }
    public void setPoints(int points){
        this.points = points;
    }
    public int getPoints(){
        return this.points;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public void setIs_album(boolean is_album){
        this.is_album = is_album;
    }
    public boolean getIs_album(){
        return this.is_album;
    }
    public void setVote(String vote){
        this.vote = vote;
    }
    public String getVote(){
        return this.vote;
    }
    public void setFavorite(boolean favorite){
        this.favorite = favorite;
    }
    public boolean getFavorite(){
        return this.favorite;
    }
    public void setNsfw(boolean nsfw){
        this.nsfw = nsfw;
    }
    public boolean getNsfw(){
        return this.nsfw;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String getSection(){
        return this.section;
    }
    public void setComment_count(int comment_count){
        this.comment_count = comment_count;
    }
    public int getComment_count(){
        return this.comment_count;
    }
    public void setFavorite_count(int favorite_count){
        this.favorite_count = favorite_count;
    }
    public int getFavorite_count(){
        return this.favorite_count;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    public String getTopic(){
        return this.topic;
    }
    public void setTopic_id(int topic_id){
        this.topic_id = topic_id;
    }
    public int getTopic_id(){
        return this.topic_id;
    }
    public void setImages_count(int images_count){
        this.images_count = images_count;
    }
    public int getImages_count(){
        return this.images_count;
    }
    public void setIn_gallery(boolean in_gallery){
        this.in_gallery = in_gallery;
    }
    public boolean getIn_gallery(){
        return this.in_gallery;
    }
    public void setIs_ad(boolean is_ad){
        this.is_ad = is_ad;
    }
    public boolean getIs_ad(){
        return this.is_ad;
    }
    public void setTags(List<String> tags){
        this.tags = tags;
    }
    public List<String> getTags(){
        return this.tags;
    }
    public void setAd_type(int ad_type){
        this.ad_type = ad_type;
    }
    public int getAd_type(){
        return this.ad_type;
    }
    public void setAd_url(String ad_url){
        this.ad_url = ad_url;
    }
    public String getAd_url(){
        return this.ad_url;
    }
    public void setIn_most_viral(boolean in_most_viral){
        this.in_most_viral = in_most_viral;
    }
    public boolean getIn_most_viral(){
        return this.in_most_viral;
    }
    public void setInclude_album_ads(boolean include_album_ads){
        this.include_album_ads = include_album_ads;
    }
    public boolean getInclude_album_ads(){
        return this.include_album_ads;
    }
    public void setImages(List<Images> images){
        this.images = images;
    }
    public List<Images> getImages(){
        return this.images;
    }
    public void setAd_config(AdConfig ad_config){
        this.ad_config = ad_config;
    }
    public AdConfig getAd_config(){
        return this.ad_config;
    }
}
