package com.emazon.report_service.application.handler;

import com.emazon.report_service.application.dto.SaleReportDto;

public interface ISaleReportHandler {
    void createSaleReport(SaleReportDto saleReportDto);
}
