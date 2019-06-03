package com.example.demo.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<MySqlEntity, Integer> {
}
