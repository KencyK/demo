package com.example.demo.mysql;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySqlService {
    private static final Logger logger = LoggerFactory.getLogger(MySqlService.class);

    @Autowired
    MySqlRepository mySqlRepository;

    public void updateMany() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ClassLoader classLoader = getClass().getClassLoader();
            List<MySqlEntity> mySqlEntities = mapper.readValue(classLoader.getResourceAsStream("mysql-entities.json"), new TypeReference<List<MySqlEntity>>() {
            });
            mySqlRepository.saveAll(mySqlEntities);
        } catch (Exception e) {
            logger.error("Error while updating mysql entities In DB {}", e);
        }
    }
}
