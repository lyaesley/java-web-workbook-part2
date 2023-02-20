package com.lyae.workbook.workbook.service;

import com.lyae.workbook.jdbcex.dto.TodoDTO;
import com.lyae.workbook.jdbcex.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

@Log4j2
public class TodoServiceTests {

    private TodoService todoService;

    @BeforeEach void setUp() {
        todoService = TodoService.INSTANCE;
    }

    @Test void testRegister() throws Exception {

        TodoDTO todoDTO = TodoDTO.builder()
                .title("JDBC Test Title")
                .dueDate(LocalDate.now())
                .build();

        log.info("-------------------------------");
        log.info(todoDTO);
        todoService.register(todoDTO);
    }
}
