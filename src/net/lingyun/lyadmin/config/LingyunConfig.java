package net.lingyun.lyadmin.config;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class LingyunConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}
	public void configRoute(Routes me) {
		me.add("/index", net.lingyun.lyadmin.home.IndexController.class);
		me.add("/admin/index", net.lingyun.lyadmin.admin.IndexController.class);
		me.add("/admin/login", net.lingyun.lyadmin.admin.LoginController.class);
	}
	public void configEngine(Engine me) {}
	public void configPlugin(Plugins me) {}
	public void configInterceptor(Interceptors me) {}
	public void configHandler(Handlers me) {}
}
