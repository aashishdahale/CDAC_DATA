 package com.demo.service;

import com.demo.beans.Player;
import com.demo.beans.Team;

public interface TeamService {

	void createNewTeam();

	Team[] displayallteams();

	Player[] findSpecialityAllTeams(String sp);

	Player[] getBySpeciality(String tname, String sp);

	Team getByCaptain(String cname);

	Team getByCoach(String coach);

}
