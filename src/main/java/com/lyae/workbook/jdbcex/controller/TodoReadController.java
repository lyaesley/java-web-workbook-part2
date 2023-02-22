package com.lyae.workbook.jdbcex.controller;

import com.lyae.workbook.jdbcex.dto.TodoDTO;
import com.lyae.workbook.jdbcex.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "todoReadController", value = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;
    private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        log.info("todo read GET...");

        try {
            Long tno = Long.parseLong(req.getParameter("tno"));

            TodoDTO todoDTO = todoService.get(tno);

            //데이터담기
            req.setAttribute("dto", todoDTO);

            req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req,resp);

        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServletException("read error");
        }


    }


}
