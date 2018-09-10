import java.util.Scanner;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstShiroClass {
	private static transient final Logger log = LoggerFactory.getLogger(FirstShiroClass.class);
	
	public static void main(String[] args) {
		log.info("Shiro first class test");
		
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		
		SecurityManager sm = factory.getInstance();
		SecurityUtils.setSecurityManager(sm);
		
		Subject currentUser = SecurityUtils.getSubject();
		
		Scanner in = new Scanner(System.in);
		
		if(!currentUser.isAuthenticated()) {
			System.out.println("Enter user name:");
			String user = in.nextLine();
			System.out.println("Enter password:");
			String pass = in.nextLine();
			
			UsernamePasswordToken token = new UsernamePasswordToken(user, pass);
			currentUser.login(token);
		}
	}
}
