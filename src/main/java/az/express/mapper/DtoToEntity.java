package az.express.mapper;

import az.express.data.dto.request.RegisterRequestDto;
import az.express.data.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DtoToEntity {
    DtoToEntity INSTANCE = Mappers.getMapper(DtoToEntity.class);
    @Mapping(target = "id", ignore = true)
    User toEntity(RegisterRequestDto dto);
}
