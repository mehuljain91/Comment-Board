
package com.example.webapp.repo;

import com.example.webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author mehul jain
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
