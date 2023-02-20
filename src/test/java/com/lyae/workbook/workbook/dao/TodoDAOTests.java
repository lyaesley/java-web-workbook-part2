package com.lyae.workbook.workbook.dao;

import com.lyae.workbook.jdbcex.dao.TodoDAO;
import com.lyae.workbook.jdbcex.domain.TodoVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test void testTime() {
        System.out.println(todoDAO.getTime());
    }

    @Test void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("sample title...")
                .dueDate(LocalDate.of(2021,12,31))
                .build();

        todoDAO.insert(todoVO);
    }

    @Test void testList() throws Exception {

        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(System.out::println);
    }

    @Test void testSelectOne() throws Exception {
        Long tno = 1L;

        TodoVO vo = todoDAO.selectOne(tno);

        System.out.println(vo);
    }

    @Test void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("update title...")
                .dueDate(LocalDate.of(2023, 2,20))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}
