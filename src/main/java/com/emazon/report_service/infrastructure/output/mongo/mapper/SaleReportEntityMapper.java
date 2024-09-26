package com.emazon.report_service.infrastructure.output.mongo.mapper;

import com.emazon.report_service.domain.model.SaleReport;
import com.emazon.report_service.infrastructure.output.mongo.entity.SaleReportEntity;
import com.emazon.report_service.utils.Constants;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = Constants.MAPPER_STRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface SaleReportEntityMapper {
    SaleReportEntity toSaleReportEntity(SaleReport saleReport);
}
