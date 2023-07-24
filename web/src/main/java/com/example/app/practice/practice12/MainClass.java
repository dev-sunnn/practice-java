package com.example.app.practice.practice12;

public class MainClass {
    public static void main(String[] args) {
        // Stationeryクラスのインスタンスを作成
        Stationery stationery = new Stationery();
        stationery.setGenre("ボールペン");
        stationery.setProceeds(10000);

        // GoodsDetailsクラスのインスタンスを作成
        GoodsDetails goodsDetails = new GoodsDetails();
        goodsDetails.setBrand("ぺんてる");
        goodsDetails.setPrice(100);
        goodsDetails.setUnitSales(100);

        // GoodsDetailsクラスの情報をStationeryクラスにセット
        stationery.setGoodsDetails(goodsDetails);

        System.out.println("種類：" + stationery.getGenre()
        + "\nブランド：" + stationery.getGoodsDetails().getBrand()
        + "\n売上金：" + stationery.getProceeds() + "円"
        + "\n価格：" + stationery.getGoodsDetails().getPrice() + "円"
        + "\n販売数：" + stationery.getGoodsDetails().getUnitSales() + "本");
    }
}

