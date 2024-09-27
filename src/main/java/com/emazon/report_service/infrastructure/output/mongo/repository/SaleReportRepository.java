package com.emazon.report_service.infrastructure.output.mongo.repository;

import com.emazon.report_service.infrastructure.output.mongo.entity.SaleReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleReportRepository extends MongoRepository<SaleReportEntity, String> {

}