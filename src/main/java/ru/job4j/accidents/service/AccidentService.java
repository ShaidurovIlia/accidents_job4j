package ru.job4j.accidents.service;

import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.Accident;

import java.util.Collection;
import java.util.Optional;

@Service
public interface AccidentService {

    void add(Accident accident);
    Collection<Accident> findAll();
    boolean update(Accident accident);
    Optional<Accident> findById(int id);
}
