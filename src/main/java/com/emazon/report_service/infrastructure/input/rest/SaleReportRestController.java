package com.emazon.report_service.infrastructure.input.rest;

import com.emazon.report_service.application.dto.SaleReportDto;
import com.emazon.report_service.application.handler.ISaleReportHandler;
import com.emazon.report_service.infrastructure.output.security.entity.SecurityUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sale")
@RequiredArgsConstructor
@Validated
public class SaleReportRestController {

    private final ISaleReportHandler saleReportHandler;
    @Operation(summary = "Create a new sale report", description = "Adds a new sale report to mongo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Sale report created successfully"),
    })
    @PostMapping
    public ResponseEntity<Void> saveSaleReport(@Valid @RequestBody SaleReportDto saleReportDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        SecurityUser userDetails = (SecurityUser) authentication.getPrincipal();
        String user = userDetails.getUsername();
        saleReportDto.setBuyerEmail(user);
        saleReportHandler.createSaleReport(saleReportDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
