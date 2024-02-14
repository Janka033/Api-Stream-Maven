package repository.impl;

import domain.enums.ToyType;
import domain.models.ToyTypes;
import mapping.Dtos.ToyTypeDto;
import mapping.Mapper.ToyTypeMapper;
import repository.ToyTypeRepository;

import java.util.ArrayList;
import java.util.List;

public class ToyTypeRepositoryImpl implements ToyTypeRepository {

    private List<ToyTypes> toyTypes;
    public ToyTypeRepositoryImpl() {
        toyTypes = new ArrayList<>();
        toyTypes.add(new ToyTypes(1,"Vegetta", ToyType.MALE,2.70,20));
        toyTypes.add(new ToyTypes(2,"Car", ToyType.MALE,1.70,20));
        toyTypes.add(new ToyTypes(3,"Make-up", ToyType.FEMALE,3.70,20));
        toyTypes.add(new ToyTypes(4,"Water gun", ToyType.UNISEX,3.20,20));
        toyTypes.add(new ToyTypes(5,"Barbie", ToyType.FEMALE,1.50,20));
        toyTypes.add(new ToyTypes(6,"musical piano", ToyType.UNISEX,3.0,20));
    }

    @Override
    public List<ToyTypeDto> getAllToys() {
        return ToyTypeMapper.mapFromDto(toyTypes);
    }
}
