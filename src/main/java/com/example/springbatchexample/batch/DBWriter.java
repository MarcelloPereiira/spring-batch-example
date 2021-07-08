package com.example.springbatchexample.batch;

import com.example.springbatchexample.model.User;
import com.example.springbatchexample.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        log.info("Data Salved for Users: {}", users);
        userRepository.saveAll(users);
    }
}
