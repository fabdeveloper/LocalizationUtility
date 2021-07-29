package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class OfertaViewLocalizationHelper extends AbstractLocalizationHelper {
	
	
	
	

	
	public String getStringAddToCart() {
		return getString("oferta_add_to_cart_buttontext");
	}
	
	public String getStringTextoetiquetadesplegable() {
		return getString("oferta_textoetiquetadesplegable_num_items");
	}
	
	public String getStringLoginadvicetext() {
		return getString("oferta_loginadvicetext");
	}
	
	public String getStringOfertaId() {
		return getString("ofertaviewaux_oferta_code");
	}
	
	public String getStringOfertaName() {
		return getString("ofertaviewaux_oferta_name");
	}
	
	public String getStringOfertaPrice() {
		return getString("ofertaviewaux_oferta_price");
	}
	
	public String getStringOfertaDescription() {
		return getString("ofertaviewaux_oferta_description");
	}
	
	public String getStringOfertaInfo() {
		return getString("ofertaviewaux_oferta_info");
	}
	

}
