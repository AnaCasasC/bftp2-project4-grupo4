package org.factoriaf5.bftp2project4grupo4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuegoRepository extends JpaRepository<Juego, Long> {
    List<Juego> findJuegoByTitleContaining(String word);
    List<Juego> findJuegosByCategoryEquals(String category);
    List<Juego> findJuegoByPegiEquals(String pegi);
}