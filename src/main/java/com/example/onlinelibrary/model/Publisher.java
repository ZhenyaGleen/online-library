package com.example.onlinelibrary.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Size(min = 10, max = 30)
    private String contact;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new LinkedHashSet<>();
}
