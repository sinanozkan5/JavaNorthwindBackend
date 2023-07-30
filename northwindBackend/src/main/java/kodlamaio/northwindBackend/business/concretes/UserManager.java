package kodlamaio.northwindBackend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwindBackend.business.abstracts.UserService;
import kodlamaio.northwindBackend.core.dataAccess.UserDao;
import kodlamaio.northwindBackend.core.entities.User;
import kodlamaio.northwindBackend.core.utilities.results.DataResult;
import kodlamaio.northwindBackend.core.utilities.results.Result;
import kodlamaio.northwindBackend.core.utilities.results.SuccessDataResult;
import kodlamaio.northwindBackend.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email)
				,"Kullanıcı bulundu");
	}

}