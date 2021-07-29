package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class UserViewLocalizationHelper extends AbstractLocalizationHelper {
	
	
	public String getStringUserId() {
		return getString("user_management_id");
	}
	
	public String getStringUserName() {
		return getString("user_management_name");
	}
	
	public String getStringUserNameRequiredMsg() {
		return getString("user_management_name_required_msg");
	}
	
	public String getStringUserNick() {
		return getString("user_management_nick");
	}
	
	public String getStringUserNickRequiredMsg() {
		return getString("user_management_nick_required_msg");
	}
	
	public String getStringUserEmail() {
		return getString("user_management_email");
	}
	
	public String getStringUserEmailRequiredMsg() {
		return getString("user_management_email_required_msg");
	}
	
	public String getStringUserPassword() {
		return getString("user_management_password");
	}
	
	public String getStringUserPasswordRequiredMsg() {
		return getString("user_management_password_required_msg");
	}
	
	public String getStringUserAddress() {
		return getString("user_management_address");
	}
	
	public String getStringUserAddressRequiredMsg() {
		return getString("user_management_address_required_msg");
	}
	
	public String getStringUserTelephone() {
		return getString("user_management_telephone");
	}
	
	public String getStringUserTelephoneRequiredMsg() {
		return getString("user_management_telephone_required_msg");
	}
	
	public String getStringCrearUserButtonText() {
		return getString("user_management_buttontext_crear_user");
	}
	
	public String getStringActualizarUserButtonText() {
		return getString("user_management_buttontext_actualizar_user");
	}

}
