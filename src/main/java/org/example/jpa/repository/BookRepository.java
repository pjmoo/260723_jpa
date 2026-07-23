package org.example.jpa.repository;

import org.example.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface BookRepository extends JpaRepository<E, PK> {
public interface BookRepository extends JpaRepository<Book, Long> {
    // 1. 의존성 주입을 위해서 컴포넌트 스캔 등록 안해요?
    // - @NoRepositoryBean
    // 2. CRUD -> CrudRepository 계열 등에서 이미 구현된 상태 -> SQL (Hibernate)
    // - findAll, findById, save, deleteByID
    // 복잡한 조건 등이 들어있는 쿼리는 이후 쿼리메서드, JPQL, Native Query, QueryDSL... 직접 구현
}
