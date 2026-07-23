package org.example.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

// JPA
@Entity
@Table(name = "books")
// Lombok
@ToString
@Getter // 모듈화, 은닉성 ... DB에서 중시하는 요소들 때문에 속성들을 private 처리함. (접근제어자)
// 생성자 계열
// NoArgsConstructor -> 기본생성자가 있어야 Entity -> JPA
@NoArgsConstructor(access = AccessLevel.PROTECTED) // new Book() <- 외부에서 이걸 허용하는 걸 싫어하는 개발 패턴
// 메서드 체이닝 등의 형태로 생성하는 패턴 -> DTO 변환 등에 편함
@Builder // 기본 생성자가 아닌 것을 추가해줌 -> 기본 생성자가 비활성화
@AllArgsConstructor(access = AccessLevel.PRIVATE) // lombok 어노테이션을 통해 생성된 생성자는 접근제어자 설정을 할 수 있음
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name", nullable = false, length = 100, unique = true)
    private String title;
    private String author;
}
