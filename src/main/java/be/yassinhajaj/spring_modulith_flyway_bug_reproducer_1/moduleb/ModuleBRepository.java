package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.moduleb;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleBRepository extends CrudRepository<ModuleBEntity, Long> {
}

