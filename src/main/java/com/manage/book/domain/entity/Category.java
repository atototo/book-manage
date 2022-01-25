package com.manage.book.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name = "name", length = 50)
    private String name;
}
