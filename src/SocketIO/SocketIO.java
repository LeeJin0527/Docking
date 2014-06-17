package SocketIO;

import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.json.JsonObject;

import com.nhncorp.mods.socket.io.SocketIOServer;
import com.nhncorp.mods.socket.io.SocketIOSocket;
import com.nhncorp.mods.socket.io.impl.DefaultSocketIOServer;
import com.nhncorp.mods.socket.io.spring.DefaultEmbeddableVerticle;

public class SocketIO extends DefaultEmbeddableVerticle 
{
	private static 	SocketIOServer io = null;
	private	int		port;
	
	public int getPort() 
	{
		return port;
	}
	public void setPort(int port) 
	{
		this.port = port;
	}

	@Override
	public void start(Vertx vertx) 
	{
		System.out.println("TestSample start");

		// HttpServlet ����
		HttpServer server = vertx.createHttpServer();
		
		System.out.println("HttpServer create");

		io = new DefaultSocketIOServer(vertx, server);

		System.out.println("SocketIOServer create");
		
		// Connection �̺�Ʈ ����
		io.sockets().onConnection(new Handler<SocketIOSocket>() {

			public void handle(final SocketIOSocket socket) 
			{
				System.out.println("Connection handling");
				
				// Ư�� Ű ������ ��û�� ������ �̺�Ʈ ����
				socket.on("data", new Handler<JsonObject>() {

					public void handle(JsonObject event) {
						// ��� Ŭ���̾�Ʈ�� �޼��� ����
						io.sockets().emit("response", event.getString("data"));
					}
				});
			}
		});

		server.listen(port);
	}
}