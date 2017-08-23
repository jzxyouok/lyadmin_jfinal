package net.lingyun.lyadmin.home;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		renderText("Hello JFinal World.");
	}
}
