package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.modulea;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest
class ModuleAIntegrationTest {

    @Autowired
    private ModuleAService moduleAService;

    @Test
    void testModuleADataIsLoaded() {
        // Verify that the module A entity table was created and data was inserted
        Iterable<ModuleAEntity> entities = moduleAService.findAll();
        assertThat(entities).isNotEmpty();
    }

    @Test
    void testSaveAndRetrieve() {
        // Test saving and retrieving data
        ModuleAEntity saved = moduleAService.save("Test Data");
        assertThat(saved).isNotNull();
        assertThat(saved.getId()).isNotNull();
    }
}
