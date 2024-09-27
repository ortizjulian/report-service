package com.emazon.report_service.infrastructure.output.mongo.entity;

import com.emazon.report_service.domain.model.SaleItem;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;

@Document(collection = "sales")
@NoArgsConstructor
@Data
@Getter
@Setter
public class SaleReportEntity {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String buyerEmail;
    private Date purchaseDate;
    private double totalCost;
    private List<SaleItem> purchasedItems;
}