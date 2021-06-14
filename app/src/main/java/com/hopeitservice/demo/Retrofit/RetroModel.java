package com.hopeitservice.demo.Retrofit;

import com.google.gson.annotations.SerializedName;

public class RetroModel {
    @SerializedName("albumId")
    private Integer albId;

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    @SerializedName("thumbnailUrl")
    private String tumnailUrl;

    public RetroModel(Integer albId, int id, String title, String url, String tumnailUrl) {
        this.albId = albId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.tumnailUrl = tumnailUrl;
    }

    public Integer getAlbId() {
        return albId;
    }

    public void setAlbId(Integer albId) {
        this.albId = albId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTumnailUrl() {
        return tumnailUrl;
    }

    public void setTumnailUrl(String tumnailUrl) {
        this.tumnailUrl = tumnailUrl;
    }
}
