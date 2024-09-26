package com.emazon.report_service.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class SaleReport {
    private String id;
    private String buyerEmail;
    private LocalDateTime purchaseDate;
    private double totalCost;
    private List<SaleItem> purchasedItems;

    public SaleReport(String id, String buyerEmail, LocalDateTime purchaseDate, double totalCost, List<SaleItem> purchasedItems) {
        this.id = id;
        this.buyerEmail = buyerEmail;
        this.purchaseDate = purchaseDate;
        this.totalCost = totalCost;
        this.purchasedItems = purchasedItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<SaleItem> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<SaleItem> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
}
