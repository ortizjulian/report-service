package com.emazon.report_service.domain.domain;

import com.emazon.report_service.domain.api.ISaleReportServicePort;
import com.emazon.report_service.domain.model.SaleReport;
import com.emazon.report_service.domain.spi.ISaleReportPersistencePort;

public class SaleReportUseCase implements ISaleReportServicePort {

    private final ISaleReportPersistencePort saleReportPersistencePort;

    public SaleReportUseCase(ISaleReportPersistencePort saleReportPersistencePort) {
        this.saleReportPersistencePort = saleReportPersistencePort;
    }

    @Override
    public void createSale(SaleReport saleReport) {
        saleReportPersistencePort.createSaleReport(saleReport);
    }
}
