package org.egov.pgr.repository;

import org.egov.pgr.entity.ReceivingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
@Transactional(readOnly = true)
public interface ReceivingCenterRepository extends JpaRepository<ReceivingCenter, Long>{

}
