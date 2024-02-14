package serivces;

import domain.enums.ToyType;
import mapping.Dtos.ToyTypeDto;

import java.util.List;

public interface ToyTypeService {
    List<ToyTypeDto> getAllToys(ToyType type);
}
