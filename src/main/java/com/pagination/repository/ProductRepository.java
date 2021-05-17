package com.pagination.repository;

import com.pagination.dto.ProductDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductDetails,Long> {

}
