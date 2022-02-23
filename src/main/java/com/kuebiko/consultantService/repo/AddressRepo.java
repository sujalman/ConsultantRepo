package com.kuebiko.consultantService.repo;

import com.kuebiko.consultantService.entity.AddressDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<AddressDto,Long> {
}
