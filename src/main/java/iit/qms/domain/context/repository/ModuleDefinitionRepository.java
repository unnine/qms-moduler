package iit.qms.domain.context.repository;

import iit.qms.domain.context.entity.ModuleDefinition;
import iit.qms.domain.module.ModuleType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModuleDefinitionRepository extends DataAccessRepository<ModuleDefinition, ModuleType> {

    ModuleDefinition findBy(ModuleType moduleType);

}
