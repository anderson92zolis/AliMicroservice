package com.alibou.school;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {

    @Id
    private Integer schoolId;
    private String name;
    private String email;

}