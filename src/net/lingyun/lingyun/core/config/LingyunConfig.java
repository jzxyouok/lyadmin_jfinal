package net.lingyun.lingyun.core.config;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;

public class LingyunConfig extends JFinalConfig {
	/**
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 * 
	 * 使用本方法启动过第一次以后，会在开发工具的 debug、run config 中自动生成
	 * 一条启动配置，可对该自动生成的配置再添加额外的配置项，例如 VM argument 可配置为：
	 * -XX:PermSize=64M -XX:MaxPermSize=256M
	 */
	public static void main(String[] args) {
		/**
		 * 特别注意：Eclipse 之下建议的启动方式
		 */
		JFinal.start("WebRoot", 80, "/", 5);

		/**
		 * 特别注意：IDEA 之下建议的启动方式，仅比 eclipse 之下少了最后一个参数
		 */
		// JFinal.start("WebRoot", 80, "/");
	}
	
	public void configConstant(Constants me) {
		//PropKit.use("/config.properties");
		me.setDevMode(true); // 开发模式
	}

	public void configRoute(Routes me) {
		me.setBaseViewPath("core/view"); // 设置模板根目录

		me.add("/", net.lingyun.lingyun.core.home.IndexController.class, "home/index");
		me.add("/admin/index", net.lingyun.lingyun.core.admin.IndexController.class, "admin/index");
		me.add("/admin/login", net.lingyun.lingyun.core.admin.LoginController.class, "admin/login");
	}

	public void configEngine(Engine me) {
		// 因为零云的模板是放置在src目录下的，所以会随着java的编译被拷贝到WebRoot/WEB-INF/classes下面
		// JFinal刚好支持将模板加载根目录设为classpath下面
		me.setBaseTemplatePath("net/lingyun/lingyun"); // 设定根目录
		me.setSourceFactory(new ClassPathSourceFactory()); // 设为classpath下面加载模板，实际最终模板根目录变为xxx/WebRoot/WEB-INF/classes/net/lingyun/lingyun/
		
		// 模板布局文件
		// 这是JFinal提供的类似于ThinkPHP中模板继承的一种前端组织规范
		me.addSharedFunction("core/view/admin/public/_layout.html"); // 后台布局文件
		me.addSharedFunction("core/view/home/public/_layout.html"); // 前台布局文件
	}

	public void configPlugin(Plugins me) {
//		loadPropertyFile("config.properties");
//		DruidPlugin dp = new DruidPlugin(getProperty("jdbcUrl"),  getProperty("user"), getProperty("password"));
//		me.add(dp);
//		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
//		me.add(arp);
		//arp.addMapping("user", User.class); 
	}

	public void configInterceptor(Interceptors me) {}

	public void configHandler(Handlers me) {}
}
