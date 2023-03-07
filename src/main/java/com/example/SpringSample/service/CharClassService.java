package com.example.SpringSample.service;


import com.example.SpringSample.models.CharClass;

import java.util.List;

public interface CharClassService {
    void save(CharClass classDND);
    List<CharClass> getAll();
    CharClass getById(Long id);
}
