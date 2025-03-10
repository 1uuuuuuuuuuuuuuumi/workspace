package com.green.First;

public class Order {
  private int itemNum;
  private String itemName;
  private String itemPrice;
  private int cnt;
  private String totalPrice;
  private String userId;

  public Order(int itemNum, String itemName, String itemPrice, int cnt, String totalPrice, String userId) {
    this.itemNum = itemNum;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.cnt = cnt;
    this.totalPrice = totalPrice;
    this.userId = userId;
  }

  public int getItemNum() {
    return itemNum;
  }

  public void setItemNum(int itemNum) {
    this.itemNum = itemNum;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
