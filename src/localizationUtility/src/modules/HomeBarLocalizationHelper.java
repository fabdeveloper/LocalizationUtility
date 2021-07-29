package localizationUtility.src.modules;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class HomeBarLocalizationHelper extends AbstractLocalizationHelper {
	
	
	
	
	public String getHomeButtonText(){
		return getString("searchbar_homebuttontext");
	}
	
	

}
