package iit.qms.domain.module.capa.repository;

import iit.qms.domain.module.capa.entity.CapaReceiptStep;
import iit.qms.domain.step.StepRepository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CapaReceiptStepRepository extends StepRepository<CapaReceiptStep, Long> {
}
