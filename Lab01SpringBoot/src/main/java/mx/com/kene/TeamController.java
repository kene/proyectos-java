package mx.com.kene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mx.com.kene.dao.TeamRepository;
import mx.com.kene.domain.Team;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams(){
	  	
	  	return teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamRepository.findById(id).get();
		
	}
	
}
