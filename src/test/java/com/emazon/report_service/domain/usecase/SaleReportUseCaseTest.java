package com.emazon.report_service.domain.usecase;

import com.emazon.report_service.domain.model.SaleReport;
import com.emazon.report_service.domain.spi.ISaleReportPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SaleReportUseCaseTest {
    @Mock
    private ISaleReportPersistencePort saleReportPersistencePort;

    @InjectMocks
    private SaleReportUseCase saleReportUseCase;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void SaleReportUseCase_CreateSale_ShouldSetPurchaseDateAndSaveSaleReport() {

        SaleReport saleReport = new SaleReport();
        saleReport.setBuyerEmail("julian@ortixs.com");
        saleReport.setTotalCost(100.0);

        saleReportUseCase.createSale(saleReport);

        Mockito.verify(saleReportPersistencePort).createSaleReport(Mockito.argThat(savedSaleReport ->
                savedSaleReport.getPurchaseDate() != null &&
                        savedSaleReport.getBuyerEmail().equals("julian@ortixs.com") &&
                        savedSaleReport.getTotalCost() == 100.0
        ));
    }

}