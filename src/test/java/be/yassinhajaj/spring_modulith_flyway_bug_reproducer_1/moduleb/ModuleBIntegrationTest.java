package be.yassinhajaj.spring_modulith_flyway_bug_reproducer_1.moduleb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.assertj.core.api.Assertions.assertThat;

@ApplicationModuleTest
class ModuleBIntegrationTest {

    @Autowired
    private ModuleBService moduleBService;

    @Test
    void testModuleBDataIsLoaded() {
        // Verify that the module B entity table was created and data was inserted
        Iterable<ModuleBEntity> entities = moduleBService.findAll();
        assertThat(entities).isNotEmpty();
    }

    @Test
    void testSaveAndRetrieve() {
        // Test saving and retrieving data
        ModuleBEntity saved = moduleBService.save("Test Description");
        assertThat(saved).isNotNull();
        assertThat(saved.getId()).isNotNull();
    }
}

