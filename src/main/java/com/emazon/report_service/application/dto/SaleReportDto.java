package com.emazon.report_service.application.dto;

import com.emazon.report_service.utils.Constants;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;

public class SaleReportDto {

    @NotBlank(message = Constants.EXCEPTION_USER_EMAIL_MANDATORY)
    @Email(message = Constants.EXCEPTION_USER_EMAIL_INVALID)
    private String buyerEmail;

    @NotNull(message = Constants.EXCEPTION_PURCHASE_DATE_NULL)
    private LocalDateTime purchaseDate;

    @Min(value = Constants.MIN_SELL_PRICE, message = Constants.EXCEPTION_TOTAL_COST_NEGATIVE)
    private double totalCost;

    @NotEmpty(message = Constants.EXCEPTION_PURCHASED_ITEMS_EMPTY)
    @Valid
    private List<SaleItemDto> purchasedItems;

    public SaleReportDto( String buyerEmail, LocalDateTime purchaseDate, double totalCost, List<SaleItemDto> purchasedItems) {

        this.buyerEmail = buyerEmail;
        this.purchaseDate = purchaseDate;
        this.totalCost = totalCost;
        this.purchasedItems = purchasedItems;
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

    public List<SaleItemDto> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<SaleItemDto> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
}
