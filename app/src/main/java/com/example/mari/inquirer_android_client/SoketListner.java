package com.example.mari.inquirer_android_client;

import android.content.Context;
import android.widget.Toast;

import de.tavendo.autobahn.WebSocketConnection;
import de.tavendo.autobahn.WebSocketException;

public class SoketListner  {
    public static void con(Context c) {
         WebSocketConnection socket = new WebSocketConnection();

        try {
            socket.connect("ws://echo.websocket.org", new EchoClient(c,socket));

        } catch (WebSocketException wse) {
            Toast toast = Toast.makeText(c,
                    wse.toString(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }



}
