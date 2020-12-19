package pl.slask.ovo.listandaddingusers.git.demo;

public class CodeSupport {

    public static String getUserTableTopPart() {
        String userTableBottomPart = null;
        userTableBottomPart = "<!DOCTYPE html>\n" +
            "<html lang=\"pl\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
            "    <title>Lista użytkowników</title>\n" +
            "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
            "          integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n" +
            "    <style>\n" +
            "        .link-primary {\n" +
            "            text-decoration: none;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"container\">\n" +
            "    <p class=\"h3\">Lista użytkowników:</p>\n" +
            "    <div class=\"m-3\"></div>\n" +
            "    <table class=\"table table-striped table-hover table-light\">\n" +
            "        <thead>\n" +
            "        <tr>\n" +
            "            <th scope=\"col\">#</th>\n" +
            "            <th scope=\"col\">Imię</th>\n" +
            "            <th scope=\"col\">Nazwisko</th>\n" +
            "            <th scope=\"col\">Wiek</th>\n" +
            "        </tr>\n" +
            "        </thead>\n" +
            "        <tbody>";
        return userTableBottomPart;
    }

    public static String getUserTableBottomPart() {
        String userTableBottomPart = null;
        userTableBottomPart = "        </tbody>\n" +
            "    </table>\n" +
            "    <div class=\"m-3 text-center\"><a href=\"/\" class=\"link-primary\">Powrót do strony głównej</a></div>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
        return userTableBottomPart;
    }
}
