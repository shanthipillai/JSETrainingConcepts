package jse.training.cocepts.enumkey;

public class HttpStatusTest {
public static void main(String[] args) {
	HTTPStatus2  code=HTTPStatus2.StatusCode2XX;
	System.out.println( code.getStatusCode());
    ;
     
     
     
	HTTPStatus2[] values=HTTPStatus2.values();
	for(HTTPStatus2 status:values)
	{
		System.out.println(status+"="+status.getStatusCode());
	}
}
}
