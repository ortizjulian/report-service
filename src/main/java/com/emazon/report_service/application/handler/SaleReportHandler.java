package com.emazon.report_service.application.handler;

import com.emazon.report_service.application.dto.SaleReportDto;
import com.emazon.report_service.application.mapper.SaleReportDtoMapper;
import com.emazon.report_service.domain.api.ISaleReportServicePort;
import com.emazon.report_service.domain.model.SaleReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SaleReportHandler implements ISaleReportHandler{

    private final ISaleReportServicePort saleReportServicePort;
    private final SaleReportDtoMapper saleReportDtoMapper;
    @Override
    public void createSaleReport(SaleReportDto saleReportDto) {
        SaleReport saleReport = saleReportDtoMapper.toSaleReport(saleReportDto);
        saleReportServicePort.createSale(saleReport);
    }
}
