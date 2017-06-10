package io.github.olteanra.library.repository;

import io.github.olteanra.library.util.EnvironmentUtil;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Rares Oltean
 */
@RunWith(SpringRunner.class)
@ActiveProfiles(EnvironmentUtil.TEST)
@Transactional
abstract class AbstractRepositoryTest {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

}
