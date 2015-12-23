/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.bookmark;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CNARIO
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
