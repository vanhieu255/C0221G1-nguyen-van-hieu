package com.codegym.model.repository;

import com.codegym.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);
    @Query(value="select * from product3 where concat(name_product,price) like :keySearch",nativeQuery= true)
    Page<Product> SearchProductByNameAndPrice(Pageable pageable , @Param("keySearch") String keySearch);

}
