package com.emazon.report_service.application.dto;

import com.emazon.report_service.utils.Constants;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public class SaleReportDto {

    private String buyerEmail;

    @Min(value = Constants.MIN_SELL_PRICE, message = Constants.EXCEPTION_TOTAL_COST_NEGATIVE)
    private double totalCost;

    @NotEmpty(message = Constants.EXCEPTION_PURCHASED_ITEMS_EMPTY)
    @Valid
    private List<SaleItemDto> purchasedItems;

    public SaleReportDto( String buyerEmail, double totalCost, List<SaleItemDto> purchasedItems) {

        this.buyerEmail = buyerEmail;
        this.totalCost = totalCost;
        this.purchasedItems = purchasedItems;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<SaleItemDto> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<SaleItemDto> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
}
