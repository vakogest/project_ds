package hua.gr.project_ds.Repositories;

import hua.gr.project_ds.Entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}