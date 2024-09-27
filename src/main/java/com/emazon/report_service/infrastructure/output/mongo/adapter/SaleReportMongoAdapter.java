package com.emazon.report_service.infrastructure.output.mongo.adapter;


import com.emazon.report_service.domain.model.SaleReport;
import com.emazon.report_service.domain.spi.ISaleReportPersistencePort;
import com.emazon.report_service.infrastructure.output.mongo.entity.SaleReportEntity;
import com.emazon.report_service.infrastructure.output.mongo.mapper.SaleReportEntityMapper;
import com.emazon.report_service.infrastructure.output.mongo.repository.SaleReportRepository;
import lombok.AllArgsConstructor;

import java.time.ZoneId;
import java.util.Date;

@AllArgsConstructor
public class SaleReportMongoAdapter implements ISaleReportPersistencePort {

    private final SaleReportRepository saleReportRepository;
    private final SaleReportEntityMapper saleReportEntityMapper;
    @Override
    public void createSaleReport(SaleReport saleReport) {
        SaleReportEntity saleReportEntity = saleReportEntityMapper.toSaleReportEntity(saleReport);
        Date out = Date.from(saleReport.getPurchaseDate().atZone(ZoneId.systemDefault()).toInstant());
        saleReportEntity.setPurchaseDate(out);
        saleReportRepository.save(saleReportEntity);
    }
}
