package week3_day1_assignments;

//Assignment on polymorphism
public class APIClient {

	public static void main(String[] args) {
		APIClient wcoAPIclient = new APIClient();
		wcoAPIclient.sendRequest("Single parameter : Endpoint");
		wcoAPIclient.sendRequest("Single parameter Endpoint","Request Body", true);

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Inside sendRequest() with three arguments Endpoint: "+endpoint +", REquest Body: "+requestBody+", REquestStatus: "+requestStatus);
	}
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Inside sendRequest() with only one argument Endpoint: "+endpoint);
	}

}
