package org.khasanof.internet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServerProxy implements Internet {
    private Server server;
    private static List<String> blockedServers;

    static {
        blockedServers = new ArrayList<>();
        blockedServers.add("leck.com");
        blockedServers.add("hi.uz");
    }

    @Override
    public void connectToServer(String serverName) throws Exception {
        checkServerIsBlocked(serverName);
        if (Objects.isNull(server)) {
            server = new Server();
        }
        server.connectToServer(serverName);
    }

    private void checkServerIsBlocked(String serverName) {
        for (String blockedServer : blockedServers) {
            if (blockedServer.equalsIgnoreCase(serverName)) {
                throw new RuntimeException("Blocked Server!");
            }
        }
    }
}
