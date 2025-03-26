package iit.qms.domain.context.repository;

import iit.qms.domain.context.entity.Workflow;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface WorkflowRepository extends DataAccessRepository<Workflow, Long> {

    Optional<Workflow> findByProcessId(Long processId);

}
