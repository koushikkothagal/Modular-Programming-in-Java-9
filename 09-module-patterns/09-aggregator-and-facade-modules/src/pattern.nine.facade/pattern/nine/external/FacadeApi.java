package pattern.nine.external;

import module.one.external.ApiOne;
import module.two.external.ApiTwo;
public class FacadeApi {

	ApiOne apiOne = new ApiOne();
	ApiTwo apiTwo = new ApiTwo();


	public void facadeMethod(String apiChoice) {

		if ("one".equals(apiChoice)) {
			apiOne.apiMethod();
		}
		else if ("two".equals(apiChoice)) {
			apiTwo.apiMethod();
		}

	}

}