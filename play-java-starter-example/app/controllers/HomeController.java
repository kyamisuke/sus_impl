package controllers;

import play.mvc.*;

import views.html.*;
import views.html.section.*;
import views.html.section.grades.*;
import views.html.calendar.*;

import java.util.Map;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Welcome guys!"));
    }

    public Result login() {
        Map<String, String[]> form = request().body().asFormUrlEncoded();
        return ok(section.render());
    }

    public Result grade(){
        return ok(grades.render());
    }

    public Result calendar(){
        return ok(calendar.render());
    }

}
