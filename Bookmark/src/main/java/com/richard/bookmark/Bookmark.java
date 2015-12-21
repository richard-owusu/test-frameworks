/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.bookmark;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author CNARIO
 */
@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;
    @Id
    @GeneratedValue
    private Long id;
    private String uri;
    private String description;

    public Bookmark() {
    }

    public Bookmark(Account account, String uri, String description) {
        this.description = description;
        this.account = account;
        this.uri = uri;
    }

    public Account getAccount() {
        return account;
    }

    public String getUri() {
        return uri;
    }

    public String getDesription() {
        return description;
    }
}
