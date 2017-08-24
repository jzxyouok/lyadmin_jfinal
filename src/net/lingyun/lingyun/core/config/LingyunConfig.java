package net.lingyun.lingyun.core.config;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class LingyunConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}
	public void configRoute(Routes me) {
		me.add("/index", net.lingyun.lingyun.core.home.IndexController.class);
		me.add("/admin/index", net.lingyun.lingyun.core.admin.IndexController.class);
		me.add("/admin/login", net.lingyun.lingyun.core.admin.LoginController.class);
	}
	public void configEngine(Engine me) {}
	public void configPlugin(Plugins me) {}
	public void configInterceptor(Interceptors me) {}
	public void configHandler(Handlers me) {}
}
