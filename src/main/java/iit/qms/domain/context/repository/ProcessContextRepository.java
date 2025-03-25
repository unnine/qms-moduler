package iit.qms.domain.context.repository;

import iit.qms.domain.context.entity.ProcessContext;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProcessContextRepository extends DataAccessRepository<ProcessContext> {
}
