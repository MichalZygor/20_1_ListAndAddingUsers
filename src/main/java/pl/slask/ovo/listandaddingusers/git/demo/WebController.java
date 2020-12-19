package pl.slask.ovo.listandaddingusers.git.demo;

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
            i++;
        }
        //return "users.html";
        return CodeSupport.getUserTableTopPart() + result + CodeSupport.getUserTableBottomPart();
    }


    @RequestMapping("/add")
    public String addUser(@RequestParam(name = "imie", defaultValue = "") String name,
                          @RequestParam(name = "nazwisko", required = false, defaultValue = "No-Name") String lastName,
                          @RequestParam(name = "wiek", required = false, defaultValue = "-1") Integer age) {

        if (name.length() < 2) {
            return "redirect:/err.html";
        } else {
            userRepository.add(new User(name, lastName, age));
            return "redirect:/success.html";
        }
    }
}
