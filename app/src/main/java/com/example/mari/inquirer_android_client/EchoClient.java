package com.example.mari.inquirer_android_client;

import android.content.Context;
import android.widget.Toast;

import de.tavendo.autobahn.WebSocketConnection;
import de.tavendo.autobahn.WebSocketHandler;

public class EchoClient extends WebSocketHandler {
    Context cont;
    WebSocketConnection s;

    public EchoClient(Context c,WebSocketConnection socket) {
        cont = c;
        s=socket;
    }

    @Override
    public void onOpen() {
        pri("CONNECTED");
        s.sendTextMessage("ANDROID CONNECTED");
    }

    @Override
    public void onTextMessage(String payload) {
        pri("ANSWER: "+payload);
    }

    @Override
    public void onClose(int code, String reason) {
        // Debug

    }

    public void pri(String s) {
    Toast toast = Toast.makeText(cont, s, Toast.LENGTH_SHORT);
    toast.show();
}
}
