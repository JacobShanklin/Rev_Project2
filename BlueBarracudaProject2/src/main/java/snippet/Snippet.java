package snippet;

public class Snippet {
	@PostMapping(value="/login.app")
		public @ResponseBody User login(@RequestParam("username") String username,@RequestParam("password") String password){
			
			User user =userRepo.selectByUsername(username);
			if(user == null) {
				return null;
			}
			
			return user;
		}
}

