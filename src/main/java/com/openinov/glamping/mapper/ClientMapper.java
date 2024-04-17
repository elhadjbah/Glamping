package com.openinov.glamping.mapper;

import com.openinov.glamping.entity.ClientDto;
import com.openinov.glamping.entity.Clients;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientDto toDto(Clients lot);
    Clients toEntity(ClientDto clientDto);

    List<ClientDto> toDtos(List<Clients> clients);
    List<Clients> toEntitys(List<ClientDto> clientDtos);
}
