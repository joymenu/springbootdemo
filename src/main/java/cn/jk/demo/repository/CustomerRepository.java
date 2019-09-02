package cn.jk.demo.repository;

import cn.jk.demo.domain.CustomerDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDO, Long> {
    List<CustomerDO> findByName(String name);
}
