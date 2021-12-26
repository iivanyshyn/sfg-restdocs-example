package com.ivn.sfgrestdoctexample.web.mappers;

import com.ivn.sfgrestdoctexample.domain.Beer;
import com.ivn.sfgrestdoctexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
