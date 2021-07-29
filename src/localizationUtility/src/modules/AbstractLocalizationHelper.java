package localizationUtility.src.modules;

import javax.inject.Inject;

import localizationUtility.src.inter.ILocalizationManager;

public abstract class AbstractLocalizationHelper {
	
	
	@Inject
	private ILocalizationManager localizationManager;
	
	
	
	public ILocalizationManager getLocalizationManager() {
		return localizationManager;
	}

	public void setLocalizationManager(ILocalizationManager localizationManager) {
		this.localizationManager = localizationManager;
	}

	public String getString(String etiqueta) {
		return getLocalizationManager().getString(etiqueta);
	}
	
	

}
