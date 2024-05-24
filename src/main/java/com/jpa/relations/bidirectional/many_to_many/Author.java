package com.jpa.relations.bidirectional.many_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bi_Author_many_to_many")
@Table(name = "bi_Author_many_to_many")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany( mappedBy =  "authors")
    private List< Book> books;




}
