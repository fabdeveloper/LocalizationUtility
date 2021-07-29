package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import localizationUtility.src.inter.ILocalizationManager;


@Named
@Dependent
public class OrderLocalizationHelper extends AbstractLocalizationHelper {
	


	public String getStringOrderId() {
		return getString("purchasedetail_order_id");
	}
	
	public String getStringOrderConfirmationDate() {
		return getString("purchasedetail_order_confirmationdate");
	}
	
	public String getStringOrderStatus() {
		return getString("purchasedetail_order_status");
	}
	
	public String getStringUserName() {
		return getString("user_management_name");
	}
	
	public String getStringUserEmail() {
		return getString("user_management_email");
	}
	
	public String getStringUserNick() {
		return getString("user_management_nick");
	}
	
	public String getStringUserAddress() {
		return getString("user_management_address");
	}
	
	public String getStringDeliveryAddress() {
		return getString("configview_delivery_direcciondeenvio");
	}
	
	public String getStringDeliveryRemarks() {
		return getString("configview_delivery_comentarios");
	}
	
	public String getStringDeliveryType() {
		return getString("configview_delivery_tipodeenvio");
	}
	
	public String getStringDeliveryStatus() {
		return getString("purchasedetail_delivery_status");
	}
	
	public String getStringCartNumArticulos() {
		return getString("cartview_total_Numerodearticulos");
	}
	
	public String getStringCartPrice() {
		return getString("cartview_total_Preciototal");
	}
	
	public String getStringFindOrder() {
		return getString("purchasedetailview_buttontext_find_order");
	}
	
	public String getStringButtonTextCancelOrder() {
		return getString("purchasedetailview_buttontext_cancel_order");
	}
	
	public String getStringButtonTextModifyOrder() {
		return getString("purchasedetailview_buttontext_modify_order");
	}

}
