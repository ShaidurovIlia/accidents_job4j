package ru.job4j.accidents.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accidents.model.AccidentType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AccidentTypeMem implements AccidentTypeRepository {

    private final List<AccidentType> types = new ArrayList<>();

    public AccidentTypeMem() {
        types.add(new AccidentType(0, " human car"));
        types.add(new AccidentType(1, "man and car"));
        types.add(new AccidentType(2, "car and bike"));
    }
    @Override
    public void add(AccidentType accidentType) {
        types.add(accidentType);
    }

    @Override
    public List<AccidentType> findAll() {
        return types;
    }

    @Override
    public Optional<AccidentType> findById(int id) {
        return Optional.ofNullable(types.get(id));
    }
}
