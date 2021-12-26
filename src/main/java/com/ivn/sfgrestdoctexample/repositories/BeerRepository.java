package com.ivn.sfgrestdoctexample.repositories;

import com.ivn.sfgrestdoctexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
