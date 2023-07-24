package com.example.app.practice.practice12;

public class Stationery {
    private String genre;
    // 売上
    private int proceeds;
    private GoodsDetails goodsDetails;

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getProceeds() {
        return proceeds;
    }
    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }
    public GoodsDetails getGoodsDetails() {
        return goodsDetails;
    }
    public void setGoodsDetails(GoodsDetails goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

}
