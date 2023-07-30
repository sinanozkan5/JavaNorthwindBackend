package kodlamaio.northwindBackend.business.abstracts;

import kodlamaio.northwindBackend.core.entities.User;
import kodlamaio.northwindBackend.core.utilities.results.DataResult;
import kodlamaio.northwindBackend.core.utilities.results.Result;

public interface UserService {
	
	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}