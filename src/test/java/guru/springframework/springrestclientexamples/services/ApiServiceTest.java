package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceTest {
    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUsersOne() {
        List<User> users = apiService.getUsers(1);
        assertEquals(1, users.size());
    }

    @Test
    public void getUsersMany() {
        List<User> users = apiService.getUsers(3);
        assertEquals(1, users.size());
    }

    @Test
    public void getFluxUsersOne() {
        List<User> users = apiService.getUsersFlux(Mono.just(1)).collectList().block();
        assertEquals(1, users.size());
    }

    @Test
    public void getFluxUsersMany() {
        List<User> users = apiService.getUsersFlux(Mono.just(3)).collectList().block();
        assertEquals(1, users.size());
    }
}
