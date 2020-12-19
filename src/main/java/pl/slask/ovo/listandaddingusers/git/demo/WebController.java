package pl.slask.ovo.listandaddingusers.git.demo;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WebController {

    private UserRepository userRepository;

    public WebController(UserRepository userRepository) {
        this.userRepository = userRepository;
        userRepository.add(new User("Michał", "Nowak", 34));
        userRepository.add(new User("Rafał", "Owacki", 52));
        userRepository.add(new User("Anna", "Slimak", 18));
    }


    @ResponseBody
    @RequestMapping("/users")
    public String printUsers() {
        List<User> userList = userRepository.getAll();

        String result = "";
        int i = 1;
        for (User user1 : userList) {
            result += "        <tr>\n"
                + "            <th scope=\"row\">" + i + "</th>\n"
                + "            <td>" + user1.getName() + "</td>\n"
                + "            <td>" + user1.getLastName() + "</td>\n"
                + "            <td>" + user1.getAge() + "</td>\n"
                + "        </tr>\n";
        }
        //return "users.html";
        return CodeSupport.getUserTableTopPart() + result + CodeSupport.getUserTableBottomPart();
    }

    @ResponseBody
    @RequestMapping("/a")
    public String addUser(@RequestParam(name = "imie", required = false) String name,
                          @RequestParam(name = "nazwisko", required = false) String lastName,
                          @RequestParam(name = "wiek", required = false) Integer age) {
        // /add?imie=Daniel&nazwisko=Abacki&wiek=15
        return "cześć " + name + " " + lastName + ", masz lat " + age;
    }



}
