package localizationUtility.src.impl;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import localizationUtility.src.inter.ILocalizationManager;




@SessionScoped
public class LocalizationManager implements ILocalizationManager, Serializable {

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

}
