package com.emazon.report_service.application.mapper;

import com.emazon.report_service.application.dto.SaleReportDto;
import com.emazon.report_service.domain.model.SaleReport;
import com.emazon.report_service.utils.Constants;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = Constants.MAPPER_STRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SaleReportDtoMapper {
    SaleReport toSaleReport(SaleReportDto saleReportDto);
}
