package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.modulea;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleARepository extends CrudRepository<ModuleAEntity, Long> {
}

