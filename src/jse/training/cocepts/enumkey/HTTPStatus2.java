package jse.training.cocepts.enumkey;

public enum HTTPStatus2 {
//HttpStatus2 StatusCode4XX=new HttpStatus2(404);
	StatusCode4XX(404), 	
	StatusCode5XX(503), 	
	StatusCode2XX(200);
	int code;
	HTTPStatus2(int code)
	{
		this.code=code;
		System.out.println("HttpStatusCode Constructor Invoked");
	}
	
	public int getStatusCode()
	{
		return code;
	}
}
