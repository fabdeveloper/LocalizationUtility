package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import localizationUtility.src.inter.ILocalizationManager;

@Named
@Dependent
public class CartViewLocalizationHelper extends AbstractLocalizationHelper{


	
	public String getStringNumeroDeArticulos() {
		return getString("cartview_total_Numerodearticulos");
	}
	
	public String getStringPrecioTotal() {
		return getString("cartview_total_Preciototal");
	}
	
	public String getStringConfirmarCompra() {
		return getString("cartview_total_buttontext_Confirmarcompra");
	}
	
	public String getStringVaciarCarrito() {
		return getString("cartview_total_buttontext_Vaciarcarrito");
	}
	
	public String getStringComprarMas() {
		return getString("cartview_total_buttontext_Comprarmas");
	}
	
	

}
