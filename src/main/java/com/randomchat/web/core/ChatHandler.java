package com.randomchat.web.core;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class ChatHandler extends TextWebSocketHandler {
    private static final Logger log = LogManager.getRootLogger();

    private List<WebSocketSession> users;

    public ChatHandler() {
        users = new ArrayList<WebSocketSession>();
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        users.add(webSocketSession);
        for(WebSocketSession ws : users) {
            ws.sendMessage(new TextMessage(webSocketSession.getId() + "님이 접속했습니다."));
        }
        log.fatal(webSocketSession.getId() + "님이 접속했습니다.");
        log.fatal("연결 IP : " + webSocketSession.getRemoteAddress().getHostName());
    }

    @Override
    protected void handleTextMessage(WebSocketSession webSocketSession, TextMessage textMessage) throws Exception {
        log.fatal(webSocketSession.getId() + "님의 메시지 : " + textMessage.getPayload());

        for(WebSocketSession ws : users) {
            ws.sendMessage(new TextMessage(webSocketSession.getId() + ": " + textMessage.getPayload()));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        users.remove(webSocketSession);
        for (WebSocketSession ws : users) {
            if (!webSocketSession.getId().equals(ws.getId())) {
                ws.sendMessage(new TextMessage(webSocketSession.getRemoteAddress().getHostName() + "퇴장했습니다."));
            }
        }
        log.fatal(webSocketSession.getId() + "님이 퇴장했습니다.");
    }
}