package com.emazon.report_service.utils;

public class Constants {
    private Constants () {
        throw new UnsupportedOperationException(UTILITY_CLASS_SHOULD_NOT_BE_INSTANTIATED);
    }

    public static final String UTILITY_CLASS_SHOULD_NOT_BE_INSTANTIATED = "Utility class should not be instantiated";

    public static final String MAPPER_STRING = "spring";
    public static final String RESPONSE_MESSAGE_KEY = "Message";

    public static final int MIN_SELL_PRICE = 0;
    public static final String EXCEPTION_PURCHASE_DATE_NULL = "The purchase date cannot be null.";
    public static final String EXCEPTION_TOTAL_COST_NEGATIVE = "The total cost cannot be negative.";
    public static final String EXCEPTION_PURCHASED_ITEMS_EMPTY = "The list of purchased items cannot be empty.";
    public static final String EXCEPTION_USER_EMAIL_MANDATORY = "Email is mandatory";
    public static final String EXCEPTION_USER_EMAIL_INVALID = "Email should be valid";
    //SaleItemDto
    public static final String EXCEPTION_ARTICLE_ID_NULL = "The article ID cannot be null.";
    public static final String EXCEPTION_SALE_ITEM_QUANTITY_NEGATIVE = "The sale item quantity must be a non-negative number.";
    public static final String EXCEPTION_SALE_ITEM_PRICE_NEGATIVE = "The sale item price must be a positive number.";
    public static final int MIN_SALE_ITEM_QUANTITY = 1;
    public static final String MIN_SALE_ITEM_PRICE = "0.0";
}


