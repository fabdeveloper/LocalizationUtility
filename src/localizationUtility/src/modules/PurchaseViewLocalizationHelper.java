package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class PurchaseViewLocalizationHelper extends AbstractLocalizationHelper {
	
	
	
	public String getStringDireccionEnvio() {
		return getString("configview_delivery_direcciondeenvio");
	}
	
	public String getStringComentarios() {
		return getString("configview_delivery_comentarios");
	}
	
	public String getStringTipoEnvio() {
		return getString("configview_delivery_tipodeenvio");
	}
	
	public String getStringActualizarDatosEnvio() {
		return getString("configview_delivery_buttontext_update");
	}
	
	public String getStringUserName() {
		return getString("user_management_name");
	}
	
	public String getStringUserEmail() {
		return getString("user_management_email");
	}
	
	public String getStringPagarConStripe() {
		return getString("purchaseview_buttontext_pagarconStripe");
	}
	
	
	
	
	
	
	
	
	
	

}
