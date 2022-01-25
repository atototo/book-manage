package com.manage.book.domain.dto;

import com.manage.book.domain.entity.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class BookDto {

    private String title;

    private String author;

    private boolean activated;

    private boolean isNew;

    private Set<Category> categories;
}
