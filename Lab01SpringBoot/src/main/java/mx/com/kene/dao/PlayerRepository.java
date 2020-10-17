package mx.com.kene.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import mx.com.kene.domain.Player;

@RestResource(path = "players", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
