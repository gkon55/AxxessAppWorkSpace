package com.example.axxessapplication.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
public class Image {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("datetime")
        @Expose
        private Integer datetime;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("animated")
        @Expose
        private Boolean animated;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("size")
        @Expose
        private Integer size;
        @SerializedName("views")
        @Expose
        private Integer views;
        @SerializedName("bandwidth")
        @Expose
        private Double bandwidth;
        @SerializedName("vote")
        @Expose
        private String vote;
        @SerializedName("favorite")
        @Expose
        private Boolean favorite;
        @SerializedName("nsfw")
        @Expose
        private String nsfw;
        @SerializedName("section")
        @Expose
        private String section;
        @SerializedName("account_url")
        @Expose
        private String accountUrl;
        @SerializedName("account_id")
        @Expose
        private String accountId;
        @SerializedName("is_ad")
        @Expose
        private Boolean isAd;
        @SerializedName("in_most_viral")
        @Expose
        private Boolean inMostViral;
        @SerializedName("has_sound")
        @Expose
        private Boolean hasSound;
        @SerializedName("tags")
        @Expose
        private List<String> tags = null;
        @SerializedName("ad_type")
        @Expose
        private Integer adType;
        @SerializedName("ad_url")
        @Expose
        private String adUrl;
        @SerializedName("edited")
        @Expose
        private String edited;
        @SerializedName("in_gallery")
        @Expose
        private Boolean inGallery;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("comment_count")
        @Expose
        private String commentCount;
        @SerializedName("favorite_count")
        @Expose
        private String favoriteCount;
        @SerializedName("ups")
        @Expose
        private String ups;
        @SerializedName("downs")
        @Expose
        private String downs;
        @SerializedName("points")
        @Expose
        private String points;
        @SerializedName("score")
        @Expose
        private String score;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDatetime() {
            return datetime;
        }

        public void setDatetime(Integer datetime) {
            this.datetime = datetime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getAnimated() {
            return animated;
        }

        public void setAnimated(Boolean animated) {
            this.animated = animated;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getViews() {
            return views;
        }

        public void setViews(Integer views) {
            this.views = views;
        }

        public Double getBandwidth() {
            return bandwidth;
        }

        public void setBandwidth(Double bandwidth) {
            this.bandwidth = bandwidth;
        }

        public String getVote() {
            return vote;
        }

        public void setVote(String vote) {
            this.vote = vote;
        }

        public Boolean getFavorite() {
            return favorite;
        }

        public void setFavorite(Boolean favorite) {
            this.favorite = favorite;
        }

        public String getNsfw() {
            return nsfw;
        }

        public void setNsfw(String nsfw) {
            this.nsfw = nsfw;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getAccountUrl() {
            return accountUrl;
        }

        public void setAccountUrl(String accountUrl) {
            this.accountUrl = accountUrl;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public Boolean getIsAd() {
            return isAd;
        }

        public void setIsAd(Boolean isAd) {
            this.isAd = isAd;
        }

        public Boolean getInMostViral() {
            return inMostViral;
        }

        public void setInMostViral(Boolean inMostViral) {
            this.inMostViral = inMostViral;
        }

        public Boolean getHasSound() {
            return hasSound;
        }

        public void setHasSound(Boolean hasSound) {
            this.hasSound = hasSound;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public Integer getAdType() {
            return adType;
        }

        public void setAdType(Integer adType) {
            this.adType = adType;
        }

        public String getAdUrl() {
            return adUrl;
        }

        public void setAdUrl(String adUrl) {
            this.adUrl = adUrl;
        }

        public String getEdited() {
            return edited;
        }

        public void setEdited(String edited) {
            this.edited = edited;
        }

        public Boolean getInGallery() {
            return inGallery;
        }

        public void setInGallery(Boolean inGallery) {
            this.inGallery = inGallery;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }

        public String getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(String favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public String getUps() {
            return ups;
        }

        public void setUps(String ups) {
            this.ups = ups;
        }

        public String getDowns() {
            return downs;
        }

        public void setDowns(String downs) {
            this.downs = downs;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

    }