package adapter.services;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Requests {

	
	
	public static class Input {

		private String parameterName;
		private String parameterValue;
		
		public Input() {
			
		}
		
		public Input(String parameterName, String parameterValue) {
			this.parameterName = parameterName;
			this.parameterValue = parameterValue;
		}

		@XmlElement(name = "parameterName")
		public String getparameterName() {
			return parameterName;
		}

		public void setparameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		@XmlElement (name = "parameterValue")
		public String getparameterValue() {
			return parameterValue;
		}

		public void setparameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

	}
	
	/**
	 * The class is just an example. The request for this VAS endpoint is user-specific.
	 *
	 */
	@XmlRootElement
	public static class ActionRequest {

		private ArrayList<Input> input = new ArrayList<Input>();

		public ActionRequest(ArrayList<Input> input) {
			this.input = input;
		}

		public ActionRequest() {
			// TODO Auto-generated constructor stub
		}

		@XmlElement(name = "input")
		public ArrayList<Input> getinput() {
			return input;
		}

		public void setinput(ArrayList<Input> input) {
			this.input = input;
		}

	}
	
	@XmlRootElement
	public static class PropertyRequest {
		private String value = "";

		public PropertyRequest() {
		}

		public PropertyRequest(String value) {
			this.value = value;
		}

		@XmlElement(name = "value")
		public String getvalue() {
			return value;
		}

		public void setvalue(String value) {
			this.value = value;
		}

	}
}
