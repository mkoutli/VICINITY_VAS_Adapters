package adapter.services;
import adapter.services.Requests.ActionRequest;
import adapter.services.Requests.PropertyRequest;
import adapter.services.Responses.GetObjectsResponse;

import adapter.services.Responses.Response;


import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/objects")
 public class WebService {
	
	///////////////////////////////////////////// action /////////////////////////////////////////////////////
	
	/**
	 * @param oid: the service id in the infrastructure (not the Vicinity oid)
	 * @param aid: the service action name in the infrastructure (not the Vicinity aid)
	 * @param request: the request body. user-defined
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/{oid}/actions/{aid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateResponseAction(@PathParam("oid") String oid, @PathParam("aid") String aid, ActionRequest request) throws Exception {
		System.out.println("Entered POST action");
		// Do something with the inputs..
		
		//Return the response
        Response response = new Response("A request to VAS with id: " + oid + " to take an action with name: " + aid + " was made.");
        return response;
    }
	
	/**
	 * @param aid: the service action name in the infrastructure (not the Vicinity aid)
	 * @param oid: the service id in the infrastructure (not the Vicinity oid)
	 * @param tid:
	 * 			  the task identifier returned from POST operation 
	 * @return
	 * @throws Exception
	 */
	@GET
    @Path("/{oid}/actions/{aid}/tasks/{tid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateResponseAction(@PathParam("tid") String tid, @PathParam("aid") String aid, @PathParam("oid") String oid) throws Exception {
		System.out.println("Entered GET task of action");
		// Do something with the inputs..
		
		//Return the response
        Response response = new Response("A request to VAS with id: " + oid + " to get the status of the action with name: " + aid + " and task id: " + tid +" was made.");
        return response;
    }
	
	/**
	 * @param aid: the service action name in the infrastructure (not the Vicinity aid)
	 * @param oid: the service id in the infrastructure (not the Vicinity oid)
	 * @param tid:
	 * 			  the task identifier returned from POST operation 
	 * @return
	 * @throws Exception
	 */
	@DELETE
	@Path("/{oid}/actions/{aid}/tasks/{tid}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response generateResponseActionDT(@PathParam("tid") String tid, @PathParam("aid") String aid, @PathParam("oid") String oid)
			throws Exception {
		System.out.println("Entered DELETE action task");
		// Do something with the inputs..

		// Return the response
		Response response = new Response(
				"A request to VAS with id: " + oid + " to delete the task with id: " + tid + " of the action with name: " + aid +" was made.");
		return response;
	}
	
	//////////////////////////////////////////// property ///////////////////////////////////////////////////////
	
	/**
	 * @param pid: the service property name in the infrastructure (not the Vicinity pid)
	 * @param oid: the device/service id in the infrastructure (not the Vicinity oid)
	 * @return
	 * @throws Exception
	 */
	@GET
    @Path("/{oid}/properties/{pid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateResponseProperty(@PathParam("pid") String pid, @PathParam("oid") String oid) throws Exception {
		System.out.println("Entered GET property");
		// Do something with the inputs..
		
		//Return the response
        Response response = new Response("A request to VAS with id: " + oid + " to get the property with name: " + pid + " was made.");
        return response;
    }
	
	
	/**
	 * @param pid: the service property name in the infrastructure (not the Vicinity pid)
	 * @param oid: the device/service id in the infrastructure (not the Vicinity oid)
	 * @param request: it is user specific-here just an example
	 * @return
	 * @throws Exception
	 */
	@PUT
    @Path("/{oid}/properties/{pid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateResponseProperty(@PathParam("pid") String pid, @PathParam("oid") String oid, PropertyRequest request) throws Exception {
		System.out.println("Entered PUT property");
		// Do something with the inputs..
		
		//Return the response
        Response response = new Response("A request to VAS with id: " + oid + " to change the property with name: " + pid + " was made.");
        return response;
    }
	
	
	///////////////////////////////////// event ////////////////////////////////////////////////////////////////
	/**
	 * @param eid: the service event name (similar to topic) (not the Vicinity eid)
	 * @param oid: the device/service id in the infrastructure (not the Vicinity oid)
	 * @param request: it is user specific-here just an example
	 * @return
	 * @throws Exception
	 */
	@PUT
    @Path("/{oid}/events/{eid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateResponseEvent(@PathParam("eid") String eid, @PathParam("oid") String oid, PropertyRequest request) throws Exception {
		System.out.println("Entered PUT event");
		// Do something with the inputs..
		
		//Return the response
        Response response = new Response("A request to VAS with id: " + oid + " to inform about the change of an event(topic) with name: " + eid + " was made.");
        return response;
    }
	
	////////////////////////////////////////// Thing Descriptions ///////////////////////////////////////////////
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<GetObjectsResponse> generateResponse() throws Exception {
        
        ArrayList<GetObjectsResponse> response = new ArrayList<GetObjectsResponse>();
        return response;
    }
}
