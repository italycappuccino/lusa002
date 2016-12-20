package org.stone.mvc;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.stone.entity.WiselyMessage;
import org.stone.entity.WiselyResponse;

/**
 * Created by liulei on 12/13 0013.
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception{
        Thread.sleep(100);
        return new WiselyResponse("welcome, "+message.getName()+"!");
    }
}
