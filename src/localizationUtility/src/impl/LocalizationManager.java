package localizationUtility.src.impl;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import localizationUtility.src.inter.ILocalizationManager;




@SessionScoped
public class LocalizationManager implements ILocalizationManager, Serializable {


	private static final long serialVersionUID = 10101L;
	
	
	private Locale currentLocale;	
	private ResourceBundle props;
	private String propertiesPath;
	

	
	@PostConstruct
	public void init(){
		propertiesPath = "bundle.bundleprops";
		currentLocale = Locale.getDefault();
		props = ResourceBundle.getBundle(propertiesPath, currentLocale);
	}

	@Override
	public String getString(String prop) {
		return props.getString(prop);
	}
	
	
	
	
	
	// Getters and Setters

	public Locale getCurrentLocale() {
		return currentLocale;
	}

	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}

	public ResourceBundle getProps() {
		return props;
	}

	public void setProps(ResourceBundle props) {
		this.props = props;
	}

	public String getPropertiesPath() {
		return propertiesPath;
	}

	public void setPropertiesPath(String propertiesPath) {
		this.propertiesPath = propertiesPath;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
