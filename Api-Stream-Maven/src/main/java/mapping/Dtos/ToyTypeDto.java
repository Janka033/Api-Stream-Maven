package mapping.Dtos;

import domain.enums.ToyType;

public record ToyTypeDto(long nameId, String name, ToyType type, double price, int quantityInStock) {
}
