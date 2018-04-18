package com.sysmgnt.code.customer;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

//@RepositoryRestResource(collectionResourceRel = "customercodes", path = "customercodes")
public interface CustomerCodeRepository extends JpaRepository<CustomerCode, Integer> {
    @RestResource(path="searchByCeo", rel="searchByCeo")
    Page<CustomerCode> findByCeo(@Param("ceo") String ceo , Pageable pageable);
//    @RestResource(path="searchByCeo", rel="searchByCeo")
//    List<CustomerCode> findByCeo(@Param("ceo") String ceo );
//    @RestResource(path="searchByCeo", rel="searchByCeo")
//    List<CustomerCode> findByCeo(@Param("ceo") String ceo );
}
