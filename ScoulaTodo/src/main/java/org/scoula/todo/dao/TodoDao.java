package org.scoula.todo.dao;

import org.scoula.todo.domain.TodoVO;
import org.scoula.todo.dto.PageRequest;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface TodoDao {
    // 총 데이터 건수
    int getTotalCount(String userId) throws SQLException;

    // Todo 등록
    int create(TodoVO todo) throws SQLException;

    // Todo 목록 조회
    List<TodoVO> getList(String userId) throws SQLException;

    // Todo 정보 조회
    Optional<TodoVO> get(String userId, Long id) throws SQLException;

    // 검색
    List<TodoVO> search(String userId, String keyword) throws SQLException;

    // Todo 수정
    int update(String userId, TodoVO todo) throws SQLException;

    // Todo 삭제
    int delete(String userId, Long id) throws SQLException;

    // 페이지네이션
    List<TodoVO> getPage(String userId, PageRequest request) throws SQLException;
}
