package adapter.services.VICINITY_VAS_Adapter_Spring;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import adapter.services.VICINITY_VAS_Adapter_Spring.Requests.PropertyRequest;
import adapter.services.VICINITY_VAS_Adapter_Spring.Responses.GetObjectsResponse;
import adapter.services.VICINITY_VAS_Adapter_Spring.Requests.ActionRequest;
import adapter.services.VICINITY_VAS_Adapter_Spring.Responses.Response;

@Controller
public class VicinityVasAdapterSpringController {

	///////////////////////////////////////////// action
	///////////////////////////////////////////// /////////////////////////////////////////////////////

	/**
	 * @param oid:
	 *            the service id in the infrastructure (not the Vicinity oid)
	 * @param aid:
	 *            the service action name in the infrastructure (not the
	 *            Vicinity aid)
	 * @param request:
	 *            the request body. user-defined
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/actions/{aid}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Response generateResponseAction(@PathVariable("oid") String oid, @PathVariable("aid") String aid,
			@RequestBody ActionRequest request) throws Exception {
		System.out.println("Entered POST action");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to take an action with name: " + aid + " was made.");
		return response;
	}

	/**
	 * @param aid:
	 *            the service action name in the infrastructure (not the
	 *            Vicinity aid)
	 * @param oid:
	 *            the service id in the infrastructure (not the Vicinity oid)
	 * @param tid:
	 * 			  the task identifier returned from POST operation      
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/actions/{aid}/tasks/{tid}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Response generateResponseActionGT(@PathVariable("tid") String tid, @PathVariable("aid") String aid, @PathVariable("oid") String oid)
			throws Exception {
		System.out.println("Entered GET task of action");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to get the status of the action with name: " + aid + " and task id: " + tid +" was made.");
		return response;
	}
	
	/**
	 * @param aid:
	 *            the service action name in the infrastructure (not the
	 *            Vicinity aid)
	 * @param oid:
	 *            the service id in the infrastructure (not the Vicinity oid)
	 * @param tid:
	 * 			  the task identifier returned from POST operation              
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/actions/{aid}/tasks/{tid}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public Response generateResponseActionDT(@PathVariable("tid") String tid, @PathVariable("aid") String aid, @PathVariable("oid") String oid)
			throws Exception {
		System.out.println("Entered DELETE action task");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to delete the task with id: " + tid + " of the action with name: " + aid +" was made.");
		return response;
	}

	//////////////////////////////////////////// property
	//////////////////////////////////////////// ///////////////////////////////////////////////////////

	/**
	 * @param pid:
	 *            the service property name in the infrastructure (not the
	 *            Vicinity pid)
	 * @param oid:
	 *            the device/service id in the infrastructure (not the Vicinity
	 *            oid)
	 * @param tid:
	 * 			  the task identifier returned from POST operation             
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/properties/{pid}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Response generateResponseProperty(@PathVariable("pid") String pid, @PathVariable("oid") String oid)
			throws Exception {
		System.out.println("Entered GET property");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to get the property with name: " + pid + " was made.");
		return response;
	}

	/**
	 * @param pid:
	 *            the service property name in the infrastructure (not the
	 *            Vicinity pid)
	 * @param oid:
	 *            the device/service id in the infrastructure (not the Vicinity
	 *            oid)
	 * @param request:
	 *            it is user specific-here just an example
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/properties/{pid}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Response generateResponseProperty(@PathVariable("pid") String pid, @PathVariable("oid") String oid,
			@RequestBody PropertyRequest request) throws Exception {
		System.out.println("Entered PUT property");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to change the property with name: " + pid + " was made.");
		return response;
	}

	///////////////////////////////////// event
	///////////////////////////////////// ////////////////////////////////////////////////////////////////
	/**
	 * @param eid:
	 *            the service event name (similar to topic) (not the Vicinity
	 *            eid)
	 * @param oid:
	 *            the device/service id in the infrastructure (not the Vicinity
	 *            oid)
	 * @param request:
	 *            it is user specific-here just an example
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/objects/{oid}/events/{eid}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Response generateResponseEvent(@PathVariable("eid") String eid, @PathVariable("oid") String oid,
			@RequestBody PropertyRequest request) throws Exception {
		System.out.println("Entered PUT event");
		// Do something with the inputs..

		// Return the response
		Response response = new Response("A request to VAS with id: " + oid
				+ " to inform about the change of an event(topic) with name: " + eid + " was made.");
		return response;
	}

	////////////////////////////////////////// Thing Descriptions
	////////////////////////////////////////// ///////////////////////////////////////////////
	@RequestMapping(value = "/objects", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ArrayList<GetObjectsResponse> generateResponse() throws Exception {

		ArrayList<GetObjectsResponse> response = new ArrayList<GetObjectsResponse>();
		return response;
	}
}
