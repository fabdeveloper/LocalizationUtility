package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class GeneralLocalizationHelper extends AbstractLocalizationHelper {
	
	
	// USER
	
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
	
	// ORDER
	
	
	public String getStringOrderId() {
		return getString("purchasedetail_order_id");
	}
	
	public String getStringOrderConfirmationDate() {
		return getString("purchasedetail_order_confirmationdate");
	}
	
	public String getStringOrderStatus() {
		return getString("purchasedetail_order_status");
	}

		
	public String getStringDeliveryAddress() {
		return getString("configview_delivery_direcciondeenvio");
	}
	
	public String getStringDeliveryRemarks() {
		return getString("configview_delivery_comentarios");
	}
	
//	public String getStringLastModificationDate() {
//		return getString("configview_delivery_lastmodificationdate");
//	}
	
	public String getStringDeliveryDetailsModificationDate() {
		return getString("deliverydetails_modificationdate");
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
	
	
	// CART
	
	
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
	
	
	
	// OFERTA
	
	
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
	
	
	// PURCHASE
	
	public String getStringDireccionEnvio() { // TODO : metodo duplicado
		return getString("configview_delivery_direcciondeenvio");
	}		
	public String getStringComentarios() { // TODO : metodo duplicado
		return getString("configview_delivery_comentarios");
	}
	
	public String getStringTipoEnvio() { // TODO : metodo duplicado
		return getString("configview_delivery_tipodeenvio");
	}
	
	public String getStringActualizarDatosEnvio() {
		return getString("configview_delivery_buttontext_update");
	}
	
	
	public String getStringPagarConStripe() {
		return getString("purchaseview_buttontext_pagarconStripe");
	}
	
	
	
	// LOGBAR
	
	
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
	
	
	
	// HOMEBAR
	
	
	public String getHomeButtonText(){
		return getString("searchbar_homebuttontext");
	}
	
	
	
	
	
	
	
	

}
