/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.springjpadata;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author CNARIO
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName();
}
