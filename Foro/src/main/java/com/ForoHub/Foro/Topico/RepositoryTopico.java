package com.ForoHub.Foro.Topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RepositoryTopico extends JpaRepository<Topico , Long> {


}
