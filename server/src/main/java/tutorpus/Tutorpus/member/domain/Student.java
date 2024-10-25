package tutorpus.Tutorpus.member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private String color;

    //icon 주소 저장
    @Column(nullable = false)
    private String icon;
}
