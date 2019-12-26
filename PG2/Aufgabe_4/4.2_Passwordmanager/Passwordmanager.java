package passwordmanager;

public class PasswordManager {
	private String password = "pg2machtspass";
	public int failedCounter = 0;
	
	public int verifyPw(String PW) {
		if(failedCounter >= 3) {
			return -1;
		} else if(PW.equals(password)) {
			failedCounter = 0;
			return 1;
		} else {
			failedCounter++;
			return 0;
		}
	}
	
	public boolean changePw(String oldPW, String newPW) {
		if(password.equals(oldPW)) {
			password = newPW;
			failedCounter = 0;
			return true;
		} else {
			return false;
		}
	}
	
}
