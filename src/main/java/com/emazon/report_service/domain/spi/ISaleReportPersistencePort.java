package com.emazon.report_service.domain.spi;

import com.emazon.report_service.domain.model.SaleReport;

public interface ISaleReportPersistencePort {
    void createSaleReport(SaleReport saleReport);
}
