package com.emazon.report_service.domain.api;

import com.emazon.report_service.domain.model.SaleReport;

public interface ISaleReportServicePort {

    void createSale(SaleReport saleReport);
}
