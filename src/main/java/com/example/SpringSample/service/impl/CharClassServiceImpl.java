package com.example.SpringSample.service.impl;

import com.example.SpringSample.models.CharClass;
import com.example.SpringSample.repository.CharClassRepository;
import com.example.SpringSample.service.CharClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CharClassServiceImpl implements CharClassService {

    public final CharClassRepository charClassRepository;

    @Autowired
    public CharClassServiceImpl(CharClassRepository charClassRepository) {
        this.charClassRepository = charClassRepository;
    }

    @Override
    public void save(CharClass classDND) {
        log.info("Saved!!");
        charClassRepository.save(classDND);
    }

    @Override
    public List<CharClass> getAll() {
        return charClassRepository.findAll();
    }

    @Override
    public CharClass getById(Long id) {
        return charClassRepository.findById(id).orElse(null);
    }
}
