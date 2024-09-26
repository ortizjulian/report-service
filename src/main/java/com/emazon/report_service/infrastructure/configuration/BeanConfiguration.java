package com.emazon.report_service.infrastructure.configuration;


import com.emazon.report_service.domain.api.ISaleReportServicePort;
import com.emazon.report_service.domain.domain.SaleReportUseCase;
import com.emazon.report_service.domain.spi.ISaleReportPersistencePort;
import com.emazon.report_service.infrastructure.output.mongo.adapter.SaleReportMongoAdapter;
import com.emazon.report_service.infrastructure.output.mongo.mapper.SaleReportEntityMapper;
import com.emazon.report_service.infrastructure.output.mongo.repository.SaleReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final SaleReportRepository saleReportRepository;
    private final SaleReportEntityMapper saleReportEntityMapper;
    @Bean
    public ISaleReportPersistencePort saleReportPersistencePort(){
        return new SaleReportMongoAdapter(saleReportRepository,saleReportEntityMapper);
    }

    @Bean
    public ISaleReportServicePort saleReportServicePort(){
        return new SaleReportUseCase(saleReportPersistencePort());
    }
}
