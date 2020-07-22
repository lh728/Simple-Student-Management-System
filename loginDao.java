package com.example.dao;
import com.example.entity.login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface loginDao extends CrudRepository<login,Long>{
    List<login> findByNameAndPassword(String name, int password);
}
