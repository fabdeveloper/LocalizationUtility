package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class LogBarLocalizationHelper extends AbstractLocalizationHelper {
	
	
	public String getStringLoginButtonText() {
		return getString("login_buttontext");
	}
	
	public String getStringLoginCreateAccount() {
		return getString("login_create_account");
	}
	
	public String getStringLoginForgotPassword() {
		return getString("login_forgot_your_password");
	}
	
	public String getStringLoginCloseSessionText(){
		return getString("logout_close_session_buttontext");
	}
	
	public String getStringLoginPedidoButtonText(){
		return getString("logout_pedido");
	}
	
	
	
	

}
