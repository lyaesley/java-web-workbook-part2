package com.lyae.workbook.jdbcex.service;

import com.lyae.workbook.jdbcex.dao.TodoDAO;
import com.lyae.workbook.jdbcex.domain.TodoVO;
import com.lyae.workbook.jdbcex.dto.TodoDTO;
import com.lyae.workbook.jdbcex.util.MapperUtil;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public enum TodoService {
    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService() {
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public void register(TodoDTO todoDTO) throws Exception {
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);

//        System.out.println("todoVO: " + todoVO);
        log.info(todoVO);

        dao.insert(todoVO);;
    }

    public List<TodoDTO> listAll() throws Exception {
        List<TodoVO> voList = dao.selectAll();

        log.info("todo list....................");
        log.info(voList);

        List<TodoDTO> dtoList = voList.stream()
                .map(vo -> modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }
}
