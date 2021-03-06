package geym.akka.demo.hello;

import akka.actor.UntypedActor;

public class Greeter extends UntypedActor {

	public static enum Msg {
		GREET,DONE;
	}
	@Override
	public void onReceive(Object msg) throws Exception {
		// TODO Auto-generated method stub
        if (msg == Msg.GREET) {
			System.out.println("Hello World!");
			getSender().tell(Msg.DONE, getSelf());
		} else {
			unhandled(msg);
		}
	}

}
