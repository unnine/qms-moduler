package iit.qms.domain.module.capa.repository;

import iit.qms.domain.module.ModuleRepository;
import iit.qms.domain.module.capa.entity.Capa;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CapaRepository extends ModuleRepository<Capa, Long> {
}
