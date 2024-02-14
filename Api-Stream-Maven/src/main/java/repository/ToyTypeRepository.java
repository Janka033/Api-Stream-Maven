package repository;

import mapping.Dtos.ToyTypeDto;

import java.util.List;

public interface ToyTypeRepository {
    List<ToyTypeDto> getAllToys();
}
