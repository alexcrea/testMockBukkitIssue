package jacn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockbukkit.mockbukkit.MockBukkitExtension;
import org.mockbukkit.mockbukkit.MockBukkitInject;
import org.mockbukkit.mockbukkit.ServerMock;

@ExtendWith(MockBukkitExtension.class)
public class MainTest {

    @MockBukkitInject
    ServerMock server;

    @Test
    public void test(){
        server.addPlayer();
    }

}