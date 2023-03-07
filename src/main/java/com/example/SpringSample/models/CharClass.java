package com.example.SpringSample.models;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Getter
@Setter
@EqualsAndHashCode(exclude = "Id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "class_data")
public class CharClass{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreationTimestamp
    @Column(name = "added_dtm")
    private LocalDateTime addedDateDate;

    @Column(name = "name")
    private String className;

    @Column(name = "hit_dice")
    private Integer hitDice;

}
