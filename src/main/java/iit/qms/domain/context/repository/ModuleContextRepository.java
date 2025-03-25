package iit.qms.domain.context.repository;

import iit.qms.domain.context.entity.ModuleContext;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModuleContextRepository extends DataAccessRepository<ModuleContext> {
}
