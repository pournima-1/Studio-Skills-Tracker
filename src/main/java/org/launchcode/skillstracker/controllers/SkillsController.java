package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String helloForm()
    {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/table'>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn.Here is the list" +
                        "<ol><li>Java</li>" +
                        "<li>Javascript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</h2>" +
                        "</form>" +



                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>"+
                "<body>"+
                "<h2>"+ coder + "</h2>"+
                "<ol><li>"+language1+"</li>" +
                "<li>"+language2+"</li>" +
                "<li>"+language3+"</li></ol>"+
                "</body>"+
                "</html>";

    }
        @RequestMapping(value = "table", method = {RequestMethod.GET, RequestMethod.POST})
        @ResponseBody
        public String table (@RequestParam String coder, @RequestParam String language1, @RequestParam String
        language2, @RequestParam String language3){
            return "<html>" +
                    "<body>" +
                    "<h2>" + coder + "</h2>" +

                    "<style>" +
                    "table, th, td { border: 1px solid black; }" +
                    "</style>" +

                    "<table style=width:100%, border: 1px solid black;>" +
                    "  <tr>" +
                    "    <th> First favorite language </th>" +
                    "    <th> Second favorite language </th>" +
                    "    <th> Third favorite language </th>" +
                    "  </tr>" +
                    "  <tr style=text-align:center>" +
                    "    <td  >" + language1 + "</td>" +
                    "<td>" + language2 + "</td>" +
                    "    <td>" + language3 + "</td>" +
                    "  </tr>" +

                    "</table>" +


                    "</body>" +
                    "</html>";


    }

    @GetMapping("form")
    @ResponseBody
    public String selectFav()
    {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/table'>" +
                        "<h2>Name:</h2>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<h2>My favorite language:</h2>" +

                        "<select name=language1 id=language1>" +
                        "    <option value=Java>Java</option>" +
                        "    <option value=Javascript>Javascript</option>" +
                        "    <option value=Python>Python</option>" +
                        "  </select>" +

                        "<h2>My second favorite language:</h2>" +

                        "<select name=language2 id=language2>" +
                        "    <option value=Java>Java</option>" +
                        "    <option value=Javascript>Javascript</option>" +
                        "    <option value=Python>Python</option>" +
                        "  </select>" +

                        "<h2>My third favorite language:</h2>" +

                        "<select name=language3 id=language3>" +
                        "    <option value=Java>Java</option>" +
                        "    <option value=Javascript>Javascript</option>" +
                        "    <option value=Python>Python</option>" +
                        "  </select>" +
                        "<br><br>"+

                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
