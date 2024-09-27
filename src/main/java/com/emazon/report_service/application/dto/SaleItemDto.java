package com.emazon.report_service.application.dto;

import com.emazon.report_service.utils.Constants;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class SaleItemDto {
    @NotNull(message = Constants.EXCEPTION_ARTICLE_ID_NULL)
    private Long articleId;

    @Min(value = Constants.MIN_SALE_ITEM_QUANTITY, message = Constants.EXCEPTION_SALE_ITEM_QUANTITY_NEGATIVE)
    private Integer quantity;

    @DecimalMin(value = Constants.MIN_SALE_ITEM_PRICE, inclusive = false, message = Constants.EXCEPTION_SALE_ITEM_PRICE_NEGATIVE)
    private Double price;

    public SaleItemDto(Long articleId, Integer quantity, Double price) {
        this.articleId = articleId;
        this.quantity = quantity;
        this.price = price;
    }

    public @NotNull(message = Constants.EXCEPTION_ARTICLE_ID_NULL) Long getArticleId() {
        return articleId;
    }

    public void setArticleId(@NotNull(message = Constants.EXCEPTION_ARTICLE_ID_NULL) Long articleId) {
        this.articleId = articleId;
    }

    public @Min(value = Constants.MIN_SALE_ITEM_QUANTITY, message = Constants.EXCEPTION_SALE_ITEM_QUANTITY_NEGATIVE) Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(@Min(value = Constants.MIN_SALE_ITEM_QUANTITY, message = Constants.EXCEPTION_SALE_ITEM_QUANTITY_NEGATIVE) Integer quantity) {
        this.quantity = quantity;
    }

    public @DecimalMin(value = Constants.MIN_SALE_ITEM_PRICE, inclusive = false, message = Constants.EXCEPTION_SALE_ITEM_PRICE_NEGATIVE) Double getPrice() {
        return price;
    }

    public void setPrice(@DecimalMin(value = Constants.MIN_SALE_ITEM_PRICE, inclusive = false, message = Constants.EXCEPTION_SALE_ITEM_PRICE_NEGATIVE) Double price) {
        this.price = price;
    }
}
