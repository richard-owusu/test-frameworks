/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.bookmark;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CNARIO
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    Collection<Bookmark> findByAccountUsername();
}
