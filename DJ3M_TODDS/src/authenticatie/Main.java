package authenticatie;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		String password = "password";

		PasswordHandler handler = new PasswordHandler();
		byte[] salt = handler.generateSalt();
		byte [] encryptedpassword = handler.getEncryptedPassword(password, salt);
		Account test = new Account();
		test.setUsername("username");
		test.setPassword(encryptedpassword);
		test.setSalt(salt);
		
		System.out.print(handler.authenticate("password", encryptedpassword, salt));

	}

}
