package com.manage.book.domain.entity;

import lombok.Builder;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="book")
public class Book implements Serializable {

    @Id // 해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity 전략 : DB가 아이디를 자동생성해주는 것
    @Column(name = "book_id") //@Column 별도의 아이디 지정시 지정한 name 으로 컬럼 생성된다
    private Long id;

    private String title;

    private String author;

    private boolean activated;

    @Column(name="is_new")
    private boolean isNew;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "category_name", referencedColumnName = "name")})
    @BatchSize(size = 20)
    @Builder.Default
    private Set<Category> categories = new HashSet<>();
}
