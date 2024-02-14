package serivces.impl;

import domain.enums.ToyType;
import mapping.Dtos.ToyTypeDto;
import repository.ToyTypeRepository;
import repository.impl.ToyTypeRepositoryImpl;
import serivces.ToyTypeService;

import java.util.List;

public class ToyTypeImpl implements ToyTypeService {
    List<ToyTypeDto> toyType;
    public  ToyTypeImpl(){
        ToyTypeRepository repoToyType = new ToyTypeRepositoryImpl();
        toyType = repoToyType.getAllToys();
    }

    @Override
    public List<ToyTypeDto> getAllToys(ToyType type) {
        return toyType;
    }
}
